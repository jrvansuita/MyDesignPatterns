
# My Most Used Design Patterns


will keep updated as I can *

### Creational Patterns

Helps me create an instance of complex objects.

- Builder
- Dependency Injection
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


```

//--- Builder ---//

    //The builder pattern consists on creating an easy builder interface to create complex objects on demand.
    val sandwich = SandwichBuilder.Builder(BreadTypes.FlatBread)
        .setCheese(CheeseTypes.Parmesan)
        .setMeat(MeatTypes.Turkey)
        .addVegetables(VegetablesTypes.Lettuce, VegetablesTypes.Onions)
        .build()

    // You can either provide commonly used builders witch gives you ready-to-use object instances
    val traditionalSandwich = SandwichBuilder.traditional()
    val healthySandwich = SandwichBuilder.superHealthy()


    //--- Dependency Injection ---//

    //The Dependency Injection pattern consists on providing as constructor parameter all required objects needed to correctly instantiate
    //Use interfaces methods to execute tasks like rolling the dice, as declared in @models.dice.DiceContract and implemented in @Dice
    DiceRoller(Dice(6)).execute()
```
