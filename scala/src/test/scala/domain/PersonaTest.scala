package domain

import org.scalatest.freespec.AnyFreeSpec

class PersonaTest extends AnyFreeSpec {
  "Una persona" - {
    "cuando cumple anios la edad deberia aumentar en uno" in {
      val pepe = new Persona(17,"Pepe")
      pepe.cumpliAnio
      assert(pepe.edad == 18)
    }
    "cuando le preguntan su nombre, les responde hola soy y su nombre" in {
      val pepe = new Persona(17,"Pepe")
      assert(pepe.nombre == "Pepe")
    }
  }
}
