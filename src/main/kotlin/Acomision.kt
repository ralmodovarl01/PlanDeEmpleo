class Acomision : Trabajador {

    private var ventas : Int
    private var porcentaje : Int

    constructor(ventas: Int, porcentaje: Int) : super() {
        this.ventas = ventas
        this.porcentaje = porcentaje
    }

    constructor(nombre: String, apellido: String, ventas: Int, porcentaje: Int) : super(nombre, apellido) {
        this.ventas = ventas
        this.porcentaje = porcentaje
    }

    public fun getVentas():Int{
        return this.ventas
    }

    public fun setVentas(v:Int){
        this.ventas=v
    }

    public fun getPorcentaje():Int{
        return this.porcentaje
    }
    public fun setPorcentaje(p:Int){
        this.porcentaje=p
    }

    override fun calcularSalario(): Int {
        var comision : Int
        comision=this.ventas*this.porcentaje
        return comision
    }

    override fun toString(): String {
        return "${super.toString()} ventas ${ventas} Porcentaje ${porcentaje}"
    }
}