import org.junit.Test

import org.junit.Assert.*

class MainKtTest {


    @Test
    fun calcCommission() {
        val type = TYPE_1;
        val amountOfPreviousPurchases = 123_000_00
        val amountTransfer = 250_00
        //val expectedResult = 23_00

        val result = calcCommission(type, amountOfPreviousPurchases, amountTransfer)

        assertEquals(3500, result)
    }
    @Test
    fun calcCommission_2() {
        val type = TYPE_1;
        val amountOfPreviousPurchases = 150_000_00
        val amountTransfer = 1500_00

        val result = calcCommission(type, amountOfPreviousPurchases, amountTransfer)

        assertEquals(11000, result)
    }
    @Test
    fun calcCommission_3() {
        val type = TYPE_2;
        val amountOfPreviousPurchases = 80_000_00
        val amountTransfer = 100_00

        val result = calcCommission(type, amountOfPreviousPurchases, amountTransfer)

        assertEquals(3500, result)
    }
    @Test
    fun processingCalc() {
        val type = TYPE_3;
        val amountPurchases = 80_000_00
        val amountTransfer = 100_00

        val result = calcCommission(type, amountPurchases, amountTransfer)

        assertEquals(3500, result)
    }
}