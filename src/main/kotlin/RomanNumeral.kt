class RomanNumeral {
    fun convert(number: Int): String {
        val result = ResultBuilder(number)
        RomanLiteral
                .literalsDescendingOrder
                .forEach { result.compute(it) }
        return result.format()
    }
}

