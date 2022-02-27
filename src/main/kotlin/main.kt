

fun main() {
    val sumBuy = 2000_00
    val discount1 = 100_00
    val discount2 = 0.05
    val melDiscount = 0.01
    val melody = true

    if (sumBuy < 100000 && melody == false) {
        println("Скидка не применяется, ваша сумма - $sumBuy")
    } else if (sumBuy < 100000 && melody == true) {
        val melResult = sumBuy - sumBuy * melDiscount
        println("после применения скидки в 1% - $melResult.")
    }
    if (sumBuy in 100001..999999 && melody == false) {
        val result = sumBuy - discount1
        println("после применения скидки в 100р - $result.")
    } else if (sumBuy in 100001..999999 && melody == true) {
        val result = sumBuy - discount1
        println("после применения скидки в 100р - $result.")
        val melResult = result - result * melDiscount
        println("после применения скидки в 1% - $melResult.")
    }
    if (sumBuy > 10000_00 && melody == false) {
        val result: Double = sumBuy - sumBuy * discount2
        println("после применения 5% скидки - $result.")
    } else if (sumBuy > 10000_00 && melody == true) {
        val result: Double = sumBuy - sumBuy * discount2
        println("после применения 5% скидки - $result.")
        val melResult = result - result * melDiscount
        println("после применения скидки в 1% - $melResult.")
    }
}