fun fibonacci(n: Int): Int {
    return if (n <= 1) n
    else fibonacci(n - 1) + fibonacci(n - 2)
}
fun main() {
    print("Digite o termo que deseja saber: ")
    val n = readln().toInt()
    val resultado = fibonacci(n)

    println("O ${n}º termo da sequência de Fibonacci é $resultado")
}


