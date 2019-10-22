
   fun main(args: Array<String>){
      // var option:Int = 0
        var  ingredients= listOf<String>("Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceite")
       loop@ do{
       println("Selecciona la opción deseada")
       println("1.hacer una receta")
       println("2.Ver mis recetas")
       println("3.Salir")
       val option:String? = readLine()

           when(option){
                "1" -> println("HACER RECETA CON: ${ingredients}\n :::::::::")
                "2" -> println("VER RECETAS\n :::::::::")
                "3" -> break@loop
               else-> println("NO EXISTE ESA OPCIÓN")
           }
       }while(option!="3")
   }

