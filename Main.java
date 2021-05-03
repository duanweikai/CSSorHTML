
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] a = new int[n];
            for(int i = 0;i < n;i++){
                a[i] = scanner.nextInt();
            }
            Arrays.sort(a);                  //a升序排列
            System.out.println(find(a, 0, 0, 1));
        }
    }

    private static int find(int[] a,int index,long sum,long multi){
        int count = 0;
        for(int i = index;i < a.length;i++){
            sum += a[i];
            multi *= a[i];

            if(sum > multi){
                count = count + 1 + find(a, i+1, sum, multi);
            }
            else if (a[i] == 1) {
                //处理待判断的序列第一个数为1的时候，
                //那个1虽然不满足和大于积，但是要保留，继续往下考虑
                count = count + find(a, i+1, sum, multi);
            }
            else {
                break;
            }
            sum -= a[i];        //sum和multi在下一循环中还会用到
            multi /= a[i];
            for(;i < a.length-1 && a[i] == a[i+1];i++){
                //    i++;            //拥有相同号码的球是无区别的，因此跳过
            }
        }
        return count;
    }
}




//
//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        while (scanner.hasNext()) {
//            int year = scanner.nextInt();
//            int month = scanner.nextInt();
//            int day = scanner.nextInt();
//            System.out.println(getOutDay(year, month, day));
//        }
//    }
//    private static int getOutDay(int year, int month, int day) {
//        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
//        int sum=0;
//        if(month<=0||month>12){
//            return -1;
//        }
//        if(year%400==0||(year%4==0&&year%100!=0)){
//            days[1]=29;
//        }
//        for(int i=0;i<month-1;i++){
//            sum=sum+days[i];
//        }
//        return sum+day;
//    }
//}




//广度优先遍历
//
//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        Scanner input=new Scanner(System.in);
//        while(input.hasNext()){
//            int N=input.nextInt();
//            int M=input.nextInt();
//            HashMap<Integer, Integer> list=new HashMap<>();
//            LinkedList<Integer> queue=new LinkedList<>();
//            list.put(N, 0);   //当前所在位置，0步
//            queue.add(N);
//            while(!queue.isEmpty()){
//                int num=queue.remove();
//                if(num==M){        //满足条件时，输出
//                    System.out.println(list.get(num));
//                    return ;
//                }
//                if(num>M)     //石板超过目标时不考虑
//                    continue;
//                HashSet<Integer> arr=new HashSet<>();   //存储当前石板的所有约数
//                yueShu(num, arr);                //找约数
//                for(int elem: arr){
//                    if(!list.containsKey(num+elem)){     //记录下一次起跳时的石板
//                        list.put(num+elem, list.get(num)+1);
//                        queue.add(num+elem);
//                    }
//                }
//            }
//            System.out.println(-1);
//        }
//    }
//    public static void yueShu(int num, HashSet<Integer> arr){    //约数计算
//        for(int i=2; i<=Math.sqrt(num); i++){
//            if(num%i==0){
//                arr.add(i);
//                arr.add(num/i);
//            }
//        }
//    }
//}



//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        int m=scanner.nextInt();
//        int cur=n;
//        int count=0;
//        while(cur!=m){
//            if(cur+cur/2<=m){
//                cur+=cur/2;
//                count++;
//            }
//            else{
//                count++;
//                cur=m;
//            }
//        }
//        System.out.println(count);
//    }
//}





//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> stringArrayList = new ArrayList<>();
//        String string = "";
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            string = scanner.nextLine();
//            boolean flag = false;
//            StringBuilder stringBuilder = new StringBuilder();
//            for (int i = 0; i < string.length(); i++) {
//                if (string.charAt(i) == ' ' && !flag) {
//                    stringArrayList.add(stringBuilder.toString());
//                    stringBuilder.delete(0, stringBuilder.length());
//                } else if (string.charAt(i) == '\"' && !flag) {
//                    flag = true;
//                } else if (string.charAt(i) == '\"' && flag) {
//                    flag = false;
//                    i++;
//                    stringArrayList.add(stringBuilder.toString());
//                    stringBuilder.delete(0, stringBuilder.length());
//                }
//                else if(i==string.length()-1){
//                    stringBuilder.append(string.charAt(i));
//                    stringArrayList.add(stringBuilder.toString());
//                    stringBuilder.delete(0,stringBuilder.length());
//
//                }
//                    else {
//                    stringBuilder.append(string.charAt(i));
//                }
//            }
//            System.out.println(stringArrayList.size());
//            for (String s : stringArrayList) {
//                System.out.println(s);
//            }
//
//
//        }
//    }
//}
