package ejercicio_2_1
/*
EJERCICIO 2.1 PARTE A

Se requiere un programa que modele el concepto de una persona. Una persona
posee nombre, apellido, número de documento de identidad y año de
nacimiento. La clase debe tener un constructor que inicialice los valores de sus
respectivos atributos.

La clase debe incluir los siguientes métodos:

    * Definir un método que imprima en pantalla los valores de los atributos
      del objeto.

    * En un método main se deben crear dos personas y mostrar los valores
      de sus atributos en pantalla.

EJERCICIO 2.1 PARTE B

    * Agregar dos nuevos atributos a la clase Persona. Un atributo que
      represente el país de nacimiento de la persona (de tipo String) y
      otro que identifique el género de la persona, el cual debe representarse
      como un char con valores 'H' o 'M'.

    * Modificar el constructor de la clase Persona para que inicialice estos
      dos nuevos atributos.

    * Modificar el método imprimir de la clase Persona para que muestre
      en pantalla los valores de los nuevos atributos.
*/

fun main(){

    println("")
        var prs1 = Persona("Fernando", "Herrera", "H19981234", 1998,"México",'H')
            println(prs1.personaInfo())

    println("")
        var prs2 = Persona("Claudia", "Morales", "C19641234", 1964,"Polonia",'M')
            println(prs2.personaInfo())
}