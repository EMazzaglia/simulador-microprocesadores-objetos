package domain

class Muralla(val altura: Int = 100) extends Defensor {
  override def potencialDefensivo: Int = altura * 10
  vida = 1000

  override def recibirDanio(ataque: Int): Unit = {
    vida -= ataque
  }
}
