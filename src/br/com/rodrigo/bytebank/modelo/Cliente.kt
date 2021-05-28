package br.com.rodrigo.bytebank.modelo

class Cliente(
    var nome: String,
    val cpf: String,
    val endereco: Endereco,
    private val senha: Int
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }

}