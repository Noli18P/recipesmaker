fun main() {
    var response : String?

    do {
        menuPrincipal()
        response = readLine()
        when (response) {
            "1" -> {
                println("Hagamos una receta! ")
                makeRecipe()
            }
            "2" -> {
                showMyRecipes()
            }
            "3" -> {
                println("Adios")
                break
            }
            else -> {
                println("La opción agregada no existe")
                continue
            }
        }
    } while (response == null)
}

fun menuPrincipal() {
    val menu = """
        :: Bienvenido a Recipe Maker ::
        
         Selecciona la opción deseada
         1. Hacer una receta
         2. Ver mis recetas
         3. Salir
    """.trimIndent()

    println(menu)
}

fun showMyRecipes() {
    println("En construccón...")
    println("Eliga otra opción por favor")
    main()
}

fun makeRecipe() {
    val options = """
        ::Selecciona una opcion para agregar a tu receta::
        
        1. Agua
        2. Leche
        3. Carne
        4. Verduras
        5. Frutas
        6. Cereal
        7. Huevos
        8. Aceite
        9. Salir
    """.trimIndent()

    var response: String?
    do {
        println(options)
        response = readLine()

        when (response) {
            "1" -> {
                println("Agregando agua..")
            }
            "2" -> {
                println("Agregando leche..")
            }
            "3" -> {
                println("Agregando carne..")
            }
            "4" -> {
                println("Agregando verduras..")
            }
            "5" -> {
                println("Agregando fruta..")
            }
            "6" -> {
                println("Agregando cereal..")
            }
            "7" -> {
                println("Agregando huevo..")
            }
            "8" -> {
                println("Agregando aceite..")
            }
            "9" -> {
                println("Saliendo..\n")
                main()
            }
        }
    } while (response != "9")
}
