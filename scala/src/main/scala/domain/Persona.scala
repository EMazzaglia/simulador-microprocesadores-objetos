package domain

class Persona(var edad:Int, var nombre:String) {
  def cumpliAnio:Unit = {
    edad += 1
  }

  def decirNombre:String = {
    nombre
  }
}
