package patterns.creational

import model.sandwich.*

class SandwichBuilder private constructor() {

    companion object {
        fun builder(bread: BreadTypes): Builder {
            return Builder(bread)
        }

        fun traditional(): Sandwich {
            return Builder(BreadTypes.FlatBread)
                .setCheese(CheeseTypes.Mozzarella)
                .setMeat(MeatTypes.Chicken)
                .addVegetables(VegetablesTypes.Lettuce, VegetablesTypes.Tomato, VegetablesTypes.Cucumbers)
                .build()
        }

        fun superHealthy(): Sandwich {
            return Builder(BreadTypes.GlutenFree)
                .setMeat(MeatTypes.Fish)
                .addVegetables(
                    VegetablesTypes.Lettuce
                )
                .build()
        }
    }


    class Builder(bread: BreadTypes) {

        private var sandwich = Sandwich(bread)

        fun setMeat(meat: MeatTypes): Builder {
            sandwich.meat = meat
            return this
        }

        fun setCheese(cheese: CheeseTypes): Builder {
            sandwich.cheese = cheese
            return this
        }

        fun addVegetables(vararg vegetables: VegetablesTypes): Builder {
            sandwich.vegetables.addAll(vegetables.toList())
            return this
        }

        fun build() = sandwich
    }

}