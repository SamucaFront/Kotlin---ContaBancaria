class ContaBancaria {

    var saldo: Double = 0.0
    lateinit var titular: String

    fun depositar(valor: Double) {
        saldo += valor
    }

    fun sacar(valor: Double) {
        saldo -= valor
    }

    fun buscarSaldo(): Double {
        return saldo
    }
}

fun main() {

    val conta = ContaBancaria()

    conta.titular = "Ronaldo Fenômeno"

    conta.depositar(1200.0)
    conta.sacar(500.0)

    println("O saldo de ${conta.titular} é de R$${conta.buscarSaldo()}")
}