/*
console.log("Hello World");
var a = 10;
var b = 5;
var c = a + b;
console.log(c);

function add(x, y) {
  return x + y;
}

var func = add;

var f = function (m, n) {
  return m * n;
}

console.log(add(7, 10));
console.log(func(7, 20));
console.log(f(3, 7));
 */

// // 数据类型
// var i = 1;
// var n = 1.0;
// var n2 = .1;
// var s1 = '字符串1';
// var s2 = "字符串2";
// console.log(s2.length);
//
// var a = [1, 1.1, "字符串", [1, 2, 3]];   // 数值（顺序表）
// a.push(1);
// a.push(2);
// a.push('hello', 'world', 1, 2, 3);
// var last = a.pop();  // 尾删
// console.log(a.length);
// for (var index in a) {
//   console.log(index);
//   console.log(a[index]);
// }
//
// var kv = {
//   name: 'peixinchen',
//   age: 18,
//   gender: "男",
// };
// console.clear();
// console.log(kv.name);
// console.log(kv["name"]);
//
// for (var key in kv) {
//   console.log(key);
//   console.log(kv[key]);
// }


// var h1=document.querySelector("h1");
// h1.innerText="后天就放假了";


var btn=document.querySelector("button");
btn.onclick=function () {
  alert("哈哈");
}
btn.addEventListener("click",function () {
  alert("哈哈")
})
  // btn.addEventListener("click",function () {
  //   alert("呵呵")
  // })