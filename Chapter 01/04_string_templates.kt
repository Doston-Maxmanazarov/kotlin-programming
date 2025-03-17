fun main() {
    val name = "Developer"
    val age = 24

    println("$name is $age years old") // Developer is 24 years old
    println("$name is ${age + 1} years old") // Developer is 24 years old

    // Or you can use it like the following Java string template,
    // but this method is not recommended.

    println(name + " is " + age + " years old") // Developer is 24 years old
    println(name + " is " + (age + 1) + " years old") // Developer is 24 years old
}