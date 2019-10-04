fun main() {
    println(fibonacci().take(10).toList()) // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
    println(fibonacci(100).toList()) // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]
}

fun fibonacci(): Sequence<Int> {
    // fibonacci terms
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, ...
    return generateSequence(Pair(0, 1), { Pair(it.second, it.first + it.second) }).map { it.first }
}

fun fibonacci(maxNumber: Int): Sequence<Int> {
    return generateSequence(Pair(0, 1), { if (it.second < maxNumber) Pair(it.second, it.first + it.second) else null })
        .map { it.first }
}
