var btn = document.querySelector("button");
btn.addEventListener("click", function() {
  var inputA = document.querySelector("#a");
  var inputB = document.querySelector("#b");
  if (inputA.value.trim() == "") {
    return;
  }
  if (inputB.value.trim() == "") {
    return;
  }
  var aVal = parseInt(inputA.value);
  var bVal = parseInt(inputB.value);
  var op=document.querySelector("#op");
  var index=op.options.selectedIndex;
  var option=op.options[index];
  //alert(option.value);  //弹窗

  var resultVal;
  switch (option.value) {
    case "+":
      resultVal = aVal + bVal;
      break;
    case "-":
      resultVal = aVal - bVal;
      break;
    case "*":
      resultVal = aVal * bVal;
      break;
    case "/":
      resultVal = aVal / bVal;
      break;
  }
  //var resultVal = aVal + bVal;

  var spanResult = document.querySelector("#result");
  spanResult.innerText = resultVal;
});