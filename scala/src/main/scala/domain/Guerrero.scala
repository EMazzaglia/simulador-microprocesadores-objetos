package domain

class Guerrero(var potencialOfensivo: Int = 100, var potencialDefensivo: Int = 20, var vida: Int = 100){

  def atacarA(defensor: Defensor): Unit = {
    defensor.vida -= this.potencialOfensivo - defensor.potencialDefensivo
  }
}
