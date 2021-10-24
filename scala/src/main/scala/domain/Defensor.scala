package domain

abstract class Defensor {
  def potencialDefensivo: Int
  def recibirDanio(ataque: Int): Unit
  var vida = 100
}
