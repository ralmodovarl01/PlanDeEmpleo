abstract class Trabajador {

    private var nombre : String
    private var apellido : String

    constructor(){
        this.nombre=""
        this.apellido=""
    }

    constructor(nombre: String, apellido: String) {
        this.nombre = nombre
        this.apellido = apellido
    }

    fun getNombre():String{
        return this.nombre
    }

    fun setNombre(n:String){
        this.nombre=n
    }

    fun getApellido():String{
        return this.nombre
    }

    fun setApellido(n:String){
        this.apellido=n
    }

    abstract fun calcularSalario():Int

    override fun toString(): String {
        return "Nombre ${nombre} Apellido ${apellido}"
    }
}