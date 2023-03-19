class Porhora : Trabajador {

    private var hora : Int
    private var sueldoHora : Int

    constructor(hora: Int, sueldo: Int) : super() {
        this.hora = hora
        this.sueldoHora = sueldo
    }

    constructor(nombre: String, apellido: String, hora: Int, sueldo: Int) : super(nombre, apellido) {
        this.hora = hora
        this.sueldoHora = sueldo
    }

    public fun horaTrabajada(t:Int){
        this.hora+=t
    }


    public fun sueldoLaHora(s:Int){
        this.hora+s
    }

    public fun sueldo():Int{
        return this.sueldoHora
    }

    override fun calcularSalario(): Int {
       var salario : Int
       salario=this.hora*this.sueldoHora
        return salario
    }

    override fun toString(): String {
        return "${super.toString()} horas trabajadas ${hora} salario ${sueldoHora}"
    }
}