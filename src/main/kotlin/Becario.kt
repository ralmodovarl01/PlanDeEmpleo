class Becario : Trabajador {

    private var estudios :String

    constructor(nombre: String, apellido: String,estudios:String) : super(nombre, apellido){
        this.estudios=estudios
    }

    public fun getEstudios():String{
        return this.estudios
    }

    override fun calcularSalario(): Int {
        var unaMiseria = 100
        return unaMiseria
    }



    override fun toString(): String {
        return "${super.toString()} "
    }
}