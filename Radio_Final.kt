val opcionMenu=0
val Radio = 0
val volumen1 = 0
val Estacion = 0

fun main(args: Array<String>){
    println("----------------------------------------------")
    println("Bienvenido a un radio!!")
    println("----------------------------------------------")
    println("Ingrese su nombre aqui>>:")
    val stringInput = readLine()!!
    println("Bienvenido: $stringInput")
    println("Que desea hacer?")
    println("----------------------------------------------")
    println("Tenemos las siguientes opciones a realizar....")
    println("----------------------------------------------")

    fun meun(args: Array<String>){
        println("Seleccione una opcion>>:")
        println("\t1 - Encender")
        println("\t2 - Subir Volumen")
        println("\t3 - Bajar Volumen")
        println("\t4 - Subir de Estacion")
        println("\t5 - Bajar de Estacion")
        println("\t6 - Apagar")
        println("\t7 - Cambiar de FM a AM")
        println("\t8 - Cambiar de AM a FM")
        println("\t9 - Salir")
    }

        while(opcionMenu == 0){
            println("----------------------------------------------")
            println("Ingrese un valor>>:")
            val opcionMenu = readLine()!!

            if (opcionMenu == "1") {
                println("----------------------------------------------")
                val Radio1 = readLine()
                println("El radio se ha encendido: $Radio " + 1 )

            }
            if (opcionMenu == "2") {
                println("Cuanto de volumen desea subir?")
                val voluuumen = readLine()
                println("EL volumen subira: $voluuumen + $volumen1")
                println("EL volumen ha subido!!!")
            }
            if (opcionMenu == "3"){
                println("Cuanto volmen desea bajar?")
                val voluumen = readLine()
                println("El volumen bajara: $voluumen - $volumen1")
                println("El volumen ha bajado!!!")
            }
            if (opcionMenu == "4"){
                val Estacion1 = readLine()
                println("La estacion subira: $Estacion + $Estacion1")
                println("La estacion ha subido!!")
            }
            if (opcionMenu == "5"){
                val Estacion2 = readLine()
                println("La estacion bajara: $Estacion - $Estacion2")
                println("La estacion ha bajado!!")
            }
            if (opcionMenu == "6"){
                val radio2 = readLine()
                val resta = 1
                println("El radio se ha apagado: $Radio - $resta")
            }
            if (opcionMenu =="7"){
                println("Desea cambiar a AM")
                val Estacion1 = readLine()
                println("A elegido: $Estacion1")
                if (Estacion1 == "si") {
                    println("Ha cambiado a AM")
                }
            }
            if (opcionMenu == "8"){
                println("Desea cambiar a FM")
                val Estacion2 = readLine()
                println("A elegido: $Estacion2")
                if (Estacion2 == "si") {
                    println("Ha cambiado a FM")
                }
            }
            if (opcionMenu == "9") {
                println("Vuelva pronto!!!")
            }
            }
        }