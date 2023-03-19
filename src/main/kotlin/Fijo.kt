class Fijo : Trabajador {

    private var sueldo : Int

    constructor(sueldo: Int) : super() {
        this.sueldo = sueldo
    }

    constructor(nombre: String, apellido: String, sueldo: Int) : super(nombre, apellido) {
        this.sueldo = sueldo
    }

    public fun ingresarSueldo (s:Int){
        this.sueldo+=s
    }

    public fun getSueldo():Int{
       return this.sueldo
    }

    override fun calcularSalario(): Int {
        var fijo = 1200
        this.sueldo=fijo
        return this.sueldo
    }

    override fun toString(): String {
        return "${super.toString()} sueldo ${sueldo}"
    }
}