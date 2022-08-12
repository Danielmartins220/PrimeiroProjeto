fun main(){
    var c : Double
    var n : Double
    var e : Double
    var salario : Double
    var hex : Double

    print("Digite as horas trabalhadas ")
    n = readLine()!!.toDouble()

    if(n > 50){
        e = n - 50
        hex = e * 20
        salario = (50 * 10).toDouble()

        print(" Salario Total e Excedente $salario , $hex ")
    }
    else {
        e = 0.0
        salario = n * 10
        print(" Excedente trabalhado  $salario , $e")
    }


}