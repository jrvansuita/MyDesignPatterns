
# My Most Used Design Patterns 



*Will keep updated as I can [🔗](https://www.raywenderlich.com/18409174-common-design-patterns-and-app-architectures-for-android)*

### Creational Patterns

Helps creates an instance of complex objects. Also provides default or commonly used instances creations.

- [Builder](src/main/kotlin/patterns/creational/Builder.kt)
```kotlin
//The builder pattern consists on creating an easy builder interface to create complex objects on demand.
val sandwich = SandwichBuilder.Builder(BreadTypes.FlatBread)
    .setCheese(CheeseTypes.Parmesan)
    .setMeat(MeatTypes.Turkey)
    .addVegetables(VegetablesTypes.Lettuce, VegetablesTypes.Onions)
    .build()

// You can either provide commonly used builders, witch gives you ready-to-use object instances
val traditionalSandwich = SandwichBuilder.traditional()
val healthySandwich = SandwichBuilder.superHealthy()
```

- [Dependency Injection](src/main/kotlin/patterns/creational/DependencyInjection.kt)

```kotlin
//The Dependency Injection pattern consists on providing as constructor parameter all required objects needed to correctly instantiate
//Use interfaces methods to execute tasks like rolling the dice, as declared in @models.dice.DiceContract and implemented here.
class DiceRoller(private val dice: DiceContract) : DiceRollerContract {
    override fun execute() = dice.roll()
}

class Dice(private val sizes: Int = 6) : DiceContract {
    override fun roll() = (1..sizes).random()
}

//Call like this
DiceRoller(Dice(6)).execute()
```
- Singleton
- Factory

### Structural Patterns

- Adapter
- Facade
- Decorator
- Composite
- Behavioral Patterns

### Behavioral Patterns

- Command
- Observer
- Strategy
- State


