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
    println("En construccion, selecciona otra opcion")
    main()
}

fun makeRecipe() {
    val ingOne = "agua"
    val ingTwo = "leche"
    val ingThr = "carne"
    val ingFou = "verduras"
    val ingFiv = "frutas"
    val ingSix = "cereal"
    val ingSev = "huevos"
    val ingEig = "aceite"
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
    var recipe = arrayOf<String>()
    var response: String?

    do {
        println(options)
        response = readLine()

        when (response) {
            "1" -> {
                println("Agregando $ingOne..")
                recipe = recipe.plus(ingOne)
            }
            "2" -> {
                println("Agregando $ingTwo..")
                recipe = recipe.plus(ingTwo)
            }
            "3" -> {
                println("Agregando $ingThr..")
                recipe = recipe.plus(ingThr)
            }
            "4" -> {
                println("Agregando $ingFou..")
                recipe = recipe.plus(ingFou)
            }
            "5" -> {
                println("Agregando $ingFiv..")
                recipe = recipe.plus(ingFiv)
            }
            "6" -> {
                println("Agregando $ingSix..")
                recipe = recipe.plus(ingSix)
            }
            "7" -> {
                println("Agregando $ingSev..")
                recipe = recipe.plus(ingSev)
            }
            "8" -> {
                println("Agregando $ingEig..")
                recipe = recipe.plus(ingEig)
            }
            "9" -> {
                println("Esta es tu receta")
                for (ing in recipe) {
                    println("Ingrediente: $ing")
                }
                println("Saliendo..\n")
                main()
            }
        }
    } while (response != "9")
}
