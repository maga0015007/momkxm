//5.1
let a = prompt ('Введите значение');
let num = +a;
if (a == "") {
  console.log('Упс, кажется, вы ошиблись')
} else if (num != num){
  console.log('Упс, кажется, вы ошиблись')
} else if (num % 2 == 0) {
  console.log('четное')
} else {
  console.log('нечотное')
}

//5.2
let x = ''
if (Number(x)){
  console.log("x-число")
} else if (String(x)){
  console.log("x-строка")
} else if (Boolean(x)){
  console.log("x-логический тип")
} else {
  console.log("Тип x не определён")
}

//5.3
let str = "Hello";
console.log(str.split("").reverse().join(""));

//5.4
console.log(Math.floor(Math.random() * 100) + 1);

//5.5
let arr = [1, 2, 3, 4];
let result = arr.map(function(item, index, array) {
  return item + 0
});
console.log(arr.length)
console.log(result)

//5.6
const arr = [8, 4, "", 34];
let result = true
for (let i = 0; i < arr.length - 1; i++) {
  if (typeof arr[i] != typeof arr[i + 1]) {
    result = false
  }
}
console.log(result)

//5.7
let arr = [1, 7, 3, 9, 10, 2, 4, 5, 4, 8, "", NaN, undefined, "String"];
  let result2 = 0;
  let result1 = 0;
  let result = 0;
  for (let i = 0; i < arr.length; i++) {
    if (typeof arr[i] === "number") {
      if (arr[i] % 2 === 0) {
        result2 += 1;
      } else if (arr[i] % 2 !== 0) {
        result1 += 1;
      } else {
        result += 0;
      }
    } else {
      result += 1;
    }
  }
console.log(`Количество четных элементов: ${result2}`);
console.log(`Количество нечетных элементов: ${result1}`);
console.log(`Количество остальных элементов: ${result}`);

//5.8
let fruits = new Map([
  ["5", "green"],
  ["6", "red"],
  ["7",  "blue"]
]);
for (let elem of fruits) { 
   console.log(elem); 
}
