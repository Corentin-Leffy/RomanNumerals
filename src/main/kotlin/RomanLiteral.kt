enum class RomanLiteral(val value: Int) {
    I(1),
    IV(4),
    V(5),
    IX(9),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);

    companion object {
        val literalsDescendingOrder
            get() = values()
                    .apply { reverse() }
    }
}