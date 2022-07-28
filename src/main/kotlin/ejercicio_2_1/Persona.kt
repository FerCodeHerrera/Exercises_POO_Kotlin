package ejercicio_2_1

class Persona(name: String, surename: String, id: String, year: Int, country: String, gen: Char) {

    //Variables de la parte A
    var nombre:String = name
    var apellido:String = surename
    var idPersonal:String = id
    var edadNacimiento:Int = year

    //Variables de la parte B
    var paisNacimiento:String = country
    var genero:Char = gen

    //Métodos
    fun personaInfo(){
        //Parte A
        println("El nombre completo es: $nombre $apellido")
        println("El ID es: $idPersonal")
        println("El año de nacimiento es: $edadNacimiento")
        //Parte B
        println("El país de nacimiento es : $paisNacimiento")
        println("El género es: $genero")
    }
}