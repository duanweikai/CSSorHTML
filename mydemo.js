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

/*
// 数据类型
var i = 1;
var n = 1.0;
var n2 = .1;
var s1 = '字符串1';
var s2 = "字符串2";
console.log(s2.length);

var a = [1, 1.1, "字符串", [1, 2, 3]];   // 数值（顺序表）
a.push(1);
a.push(2);
a.push('hello', 'world', 1, 2, 3);
var last = a.pop();  // 尾删
console.log(a.length);
for (var index in a) {
  console.log(index);
  console.log(a[index]);
}

var kv = {
  name: 'peixinchen',
  age: 18,
  gender: "男",
};
console.clear();
console.log(kv.name);
console.log(kv["name"]);

for (var key in kv) {
  console.log(key);
  console.log(kv[key]);
}
*/

/*
class Person {
  constructor(name, age, gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  grow() {
    this.age += 1;
  }

  get姓() {
    return this.name.substr(0, 1);
  }
}
var person = new Person("陈沛鑫", 18, "男");
 */

var person = {
  name: "陈沛鑫",
  age: 18,
  gender: "男",
  grow: function() {
    this.age += 1;
  },
  get姓: function() {
    return this.name.substr(0, 1);
  }
};
var student={
  name:"dwk",
  age:20,
  grow: function () {
    this.age += 1;
    return this.name.charAt(0);
  },
  style: function () {
    return "your";

  }


}

console.log(student.name);
console.log(student.age);

student.grow()
console.log(student.grow());
console.log(student.age);
console.log(student.style())


console.log(person.name);
console.log(person.age);
console.log(person.gender);
person.grow();
console.log(person.name);
console.log(person.age);
console.log(person.gender);
console.log(person.get姓());