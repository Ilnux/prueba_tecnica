import org.example.fibonacci
import kotlin.test.Test

class MainKtTest{


    @Test
    fun testSecuenciaFibonacci(){
//     0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
        val posicion8 = 13
        kotlin.test.assertEquals(posicion8, fibonacci(8))
    }

}