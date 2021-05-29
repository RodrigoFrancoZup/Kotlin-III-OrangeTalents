import br.com.rodrigo.bytebank.modelo.Endereco

fun main() {
    val endereco = Endereco()

    imprime(Unit)
    imprime(1)
    val teste: Any = imprime(1.0)
    imprime(endereco)
}

fun imprime(valor: Any) :Any{
    println(valor)
    return valor
}

