import org.example.ConversionTemperatura
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class ConversionTemperaturaTest {
    @Test
    fun testCelsiusToFarenheit() {
        assertEquals(46.4, ConversionTemperatura.celsiusToFarenheit(8.0))
    }

    @Test
    fun testfarenheitToCelsius() {
        assertEquals(8.0, ConversionTemperatura.farenheitToCelsius(46.4))
    }
}