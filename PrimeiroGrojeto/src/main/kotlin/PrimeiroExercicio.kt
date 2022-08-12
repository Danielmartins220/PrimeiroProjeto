fun main() {
    var p : Int
    var e : Int
    var m = 0

    print("Digite o peso dos tomates: ")
    p = readLine()!!.toInt()

    e =  p - 50

    if (e > 0){
        m = 4 * e
    } else {
        e = 0
    }

    println("Peso: $p kg")
    println("Excesso: $e kg")
    println("Multa: $m R$")

}