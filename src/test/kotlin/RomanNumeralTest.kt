import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class RomanNumeralTest : StringSpec({
    mapOf(
            1 to "I",
            2 to "II",
            3 to "III",
            4 to "IV",
            5 to "V",
            9 to "IX",
            10 to "X",
            11 to "XI",
            20 to "XX",
            21 to "XXI",
            50 to "L",
            100 to "C",
            500 to "D",
            1000 to "M"
    ).forEach(::testConversionToRomanNumeral)
})

private fun StringSpec.testConversionToRomanNumeral(
        numberToConvert: Int,
        romanNumeralExpected: String
) {
    "$numberToConvert is converted to $romanNumeralExpected" {
        numberToConvert shouldBeConvertedTo romanNumeralExpected
    }
}

private infix fun Int.shouldBeConvertedTo(romanNumeralExpected: String) {
    val result = RomanNumeral().convert(this)
    result shouldBe romanNumeralExpected
}
