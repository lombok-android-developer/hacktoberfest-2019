fun main() {
    println(fibonacci().take(10).toList())
    println(fibonacci(100).toList())
}

fun fibonacci(): Sequence<Int> {
    return generateSequence(Pair(0, 1), { Pair(it.second, it.first + it.second) }).map { it.first }
}

fun fibonacci(maxNumber: Int): Sequence<Int> {
    return generateSequence(Pair(0, 1), { if (it.second < maxNumber) Pair(it.second, it.first + it.second) else null })
        .map { it.first }
}