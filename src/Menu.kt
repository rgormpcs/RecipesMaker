import kotlin.Array as Array1
import kotlin.String as String1

fun main(args: Array1<String1>){
      // var option:Int = 0
        var  ingredients= listOf<String1>("Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceite")
        var recipies= arrayOf("pastel","sopa","encebollado")

       loop@ do{
       println("Selecciona la opción deseada")
       println("1.hacer una receta")
       println("2.Ver mis recetas")
       println("3.Salir")
       val option: String1? = readLine()

           when(option){
                "1" -> println("HACER RECETA CON: ${ingredients}\n :::::::::")
                "2" -> {
                    println("VER RECETAS\n :::::::::")
                    seeRecipe(recipies)
                }
                "3" -> break@loop
               else-> println("NO EXISTE ESA OPCIÓN")
           }
       }while(option!="3")


   }
   fun seeRecipe(recipies: kotlin.Array<kotlin.String>) {
       println(">>>>><<<<<")
       for (recipe in recipies){
           println("Receta:"+ recipe)
       }
       println(">>>>><<<<<")
       println()
   }
