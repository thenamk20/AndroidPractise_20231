package Week3

abstract class AquariumFish {
    abstract val color: String
}

interface FishColor {
    val color: String
}

object GoldColor : FishColor {
    override var color = "gold"
}

class Shark: FishColor, FishAction {
    override val color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus(fishColor: FishColor = GoldColor):  FishAction by PrintingFishAction("eat algae"), FishColor by GoldColor

interface FishAction  {
    fun eat()
}
class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}
