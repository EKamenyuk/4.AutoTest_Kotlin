import org.junit.Test

import org.junit.Assert.*

class MainKtTest {


    @Test
    fun calcCommission_Type_1_1() {
        val type = TYPE_1;
        val amountOfPreviousPurchases = 123_000_00
        val amountTransfer = 250_00
        //val expectedResult = 23_00

        val result = calcCommission(type, amountOfPreviousPurchases, amountTransfer)

        assertEquals(3500, result)
    }
    @Test
    fun calcCommission_Type_1_2() {
        val type = TYPE_1;
        val amountOfPreviousPurchases = 0
        val amountTransfer = 0

        val result = calcCommission(type, amountOfPreviousPurchases, amountTransfer)

        assertEquals(2000, result)
    }
    @Test
    fun calcCommission_Type_2_1() {
        val type = TYPE_2;
        val amountOfPreviousPurchases = 80_000_00
        val amountTransfer = 100_00

        val result = calcCommission(type, amountOfPreviousPurchases, amountTransfer)

        assertEquals(2600, result)
    }
    @Test
    fun calcCommission_Type_2_0() {
        val type = TYPE_2;
        val amountOfPreviousPurchases = 0
        val amountTransfer = 0

        val result = calcCommission(type, amountOfPreviousPurchases, amountTransfer)

        assertEquals(2000, result)
    }
    @Test
    fun processingCalc_Type_3() {
        val type = TYPE_3;
        val amountPurchases = 80_000_00
        val amountTransfer = 100_00

        val result = calcCommission(type, amountPurchases, amountTransfer)

        assertEquals(3500, result)
    }
    @Test
    fun processingCalc_Type_3_0() {
        val type = TYPE_3;
        val amountPurchases = 0
        val amountTransfer = 100_00

        val result = calcCommission(type, amountPurchases, amountTransfer)

        assertEquals(3500, result)
    }
    @Test
    fun processingCalc_Type_3_3() {
        val type = TYPE_3;
        val amountPurchases = 180_000_00
        val amountTransfer = 300_100_00

        val result = calcCommission(type, amountPurchases, amountTransfer)

        assertEquals(225075, result)
    }
    @Test
    fun calcCommission_type_4() {
        val type = TYPE_4;
        val amountOfPreviousPurchases = 80_000_00
        val amountTransfer = 100_00

        val result = calcCommission(type, amountOfPreviousPurchases, amountTransfer)

        assertEquals(3500, result)
    }
    @Test
    fun calcCommission_type_4_0() {
        val type = TYPE_4;
        val amountOfPreviousPurchases = 0
        val amountTransfer = 100_00

        val result = calcCommission(type, amountOfPreviousPurchases, amountTransfer)

        assertEquals(3500, result)
    }
    @Test
    fun calcCommission_type_4_3() {
        val type = TYPE_4;
        val amountOfPreviousPurchases = 8_000_00
        val amountTransfer = 3_000_00

        val result = calcCommission(type, amountOfPreviousPurchases, amountTransfer)

        assertEquals(2250, result)
    }
    @Test
    fun calcCommission_type_5_1() {
        val type = TYPE_5;
        val amountOfPreviousPurchases = 80_000_00
        val amountTransfer = 100_00

        val result = calcCommission(type, amountOfPreviousPurchases, amountTransfer)

        assertEquals(0, result)
    }
    @Test
    fun calcCommission_type_5_0() {
        val type = TYPE_5;
        val amountOfPreviousPurchases = 0
        val amountTransfer = 100_00

        val result = calcCommission(type, amountOfPreviousPurchases, amountTransfer)

        assertEquals(0, result)
    }
    @Test
    fun calcCommission_Zero() {
        val type = "test";
        val amountOfPreviousPurchases = 180_000_00
        val amountTransfer = 500_00

        val result = calcCommission(type, amountOfPreviousPurchases, amountTransfer)

        assertEquals(0, result)
    }
    @Test
    fun calcCommission_Zero_0() {
        val type = "test";
        val amountOfPreviousPurchases = 0
        val amountTransfer = 0

        val result = calcCommission(type, amountOfPreviousPurchases, amountTransfer)

        assertEquals(0, result)
    }
}