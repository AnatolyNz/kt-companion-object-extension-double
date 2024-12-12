package mate.academy

val Double.Companion.printClassName: () -> Unit
    get() = {
        print("Class name: ${this::class.qualifiedName}\n")
    }

fun main() {
    Double.Companion.printClassName()
}
