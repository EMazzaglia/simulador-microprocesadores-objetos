package domain

import org.scalatest.freespec.AnyFreeSpec

class GuerrorTest extends AnyFreeSpec{
  "Un guerroro puede decirme su potencial ofensivo" in {
    val guerrero = new Guerrero(130)
    assert(guerrero.potencialOfensivo.equals(130))
  }

  "Por default un guerrero tiene 100 de potencial ofensivo" - {
    assert(new Guerrero().potencialOfensivo.equals(100))
  }

  "Un guerroro puede atacar a otro" in {
    val atila = new Guerrero(150)
    val muralla = new Muralla(10)

    atila.atacarA(muralla)
    assert(muralla.vida == 950)
  }
}
