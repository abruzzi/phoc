/**
 * define some basic functions used in calculator
 */
var PI = Math.PI;
var E = Math.E;

function sqrt(x){
	return Math.sqrt(x);
}

function sin(x){
	return Math.sin(x);
}

function cos(x){
	return Math.cos(x);
}

function sum(){
    var result = 0;
    for(var i = 0, len = arguments.length; i < len; i++){
       var current = arguments[i];
       if(isNaN(current)){
           throw new Error("not a number exception");
       }else{
           result += current;
       }
    }

    return result;
}

