fun main(){
    var num1 : Double
    var num2 : Double
    var area : Double

    print(" Digite a base do triangulo: ")
    num1 = readLine()!!.toDouble()
    print(" Digite a altura do triangulo: ")
    num2 = readLine()!!.toDouble()

    if (num1 >0 && num2 > 0){
        area = (num1 * num2) / 2
        print(" A area deste triangulo e: $area")

    }
    else{
        print(" calculo impossivel de ser realizado!")
    }


}