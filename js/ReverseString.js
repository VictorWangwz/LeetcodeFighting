var reverseString = function(s) {
    // s = s.split("").reverse().join("");
    s = [...s].reverse().join('');
    return s;

}

let s = "good";
let rst = reverseString(s);
console.log(rst);