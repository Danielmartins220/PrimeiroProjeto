fun main(){
    var num : Int
    print(" Digite um numero")
    num = readLine()!!.toInt()
    if ((num % 2) == 0 && num > 0){
        println( " O numero e par ")
        println( " O numero e positivo  ")
    }
    else if (num % 2!=0 && num < 0){
        println( " O numero e impar ")
        println( " O numero e negativo ")
    }

}