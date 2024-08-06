def printNumbers(num){
    if(num ==1){
        num;
    }else{
        printNumbers(num-1)
    }
}
println(printNumbers(100));