package patterns.creational

import models.dice.DiceContract
import models.dice.DiceRollerContract

class DiceRoller(private val dice: DiceContract) : DiceRollerContract {

    override fun execute(): Int {
        return dice.roll()
    }
}

class Dice(private val sizes: Int = 6) : DiceContract {

    override fun roll() = (1..sizes).random()

}