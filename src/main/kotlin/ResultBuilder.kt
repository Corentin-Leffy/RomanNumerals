class ResultBuilder(var rest: Int) {
    private val result = StringBuffer()

    fun compute(romanLiteral: RomanLiteral) {
        while (rest >= romanLiteral.value) {
            result.append(romanLiteral)
            rest -= romanLiteral.value
        }
    }

    fun format(): String = result.toString()
}