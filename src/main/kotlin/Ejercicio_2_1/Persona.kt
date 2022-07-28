package Ejercicio_2_1

class Persona(name:String,surename:String,id:String,year:Int) {

    var nombre:String = name
    var apellido:String = surename
    var idPersonal:String = id
    var edadNacimiento:Int = year

    fun personaInfo(){
        println("El nombre completo es: $nombre $apellido")
        println("El ID es: $idPersonal")
        println("El año de nacimiento es: $edadNacimiento")
    }
}