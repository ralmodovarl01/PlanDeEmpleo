fun main() {
var trabajador = Fijo("Manolo","Gomez",1200)
var trabajador2 = Porhora("Concha","Velasco",8,9)
var trabajador3 = Acomision("Antonio","Laguna",8,8)
var trabajador4 = Becario("Francisco","Lopez","Ingeniero Informatico")
var salario : Int = 0
 var opcion : Int = 0

    do {
        println("¿Que quieres hacer?")
        println("\n")
        println("1.Calcular salario" +
                "\n" +
                "2.Ver salario" +
                "\n" +
                "3.Consultar datos" +
                "\n" +
                "4.salir")
        opcion= readln().toInt()

        if (opcion==1){
            println("¿Cuantas horas has trabajado?")
            salario= readln().toInt()
            println(trabajador.ingresarSueldo(salario))
            println(trabajador2.sueldoLaHora(salario))
            println(trabajador3.setVentas(salario))
            println(trabajador4.calcularSalario())
        }
        if (opcion==2){
            println("Aqui puede ver su salario")
            println(trabajador.getSueldo())
            println(trabajador2.sueldo())
            println(trabajador3.getVentas())
            println(trabajador4.)

        }
        if (opcion==3){
            println("Aqui tiene sus datos")
            println(trabajador)
            println(trabajador2)
            println(trabajador3)
            println(trabajador4)
        }

    }while (opcion!=4)
}