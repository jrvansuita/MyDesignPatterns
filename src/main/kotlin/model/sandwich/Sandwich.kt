package model.sandwich


class Sandwich(
    val bread: BreadTypes,
    var meat: MeatTypes? = null,
    var cheese: CheeseTypes? = null,
    var vegetables: MutableList<VegetablesTypes> = mutableListOf()
)

enum class BreadTypes {
    FlatBread, GlutenFree, HeartyMultigrain, ItalianHerbs
}

enum class MeatTypes {
    Fish, Steak, Chicken, Pepperoni, Turkey, Salami
}

enum class CheeseTypes {
    Parmesan, Provolone, Swiss, Mozzarella
}

enum class VegetablesTypes {
    Tomato, Olives, Lettuce, Onions, Avocado, Spinach, Cucumbers
}