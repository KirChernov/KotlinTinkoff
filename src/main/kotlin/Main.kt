fun main() {

    val euro = Currency(90, "Moex", "Euro")
    val gazprom = Equity(283, "Moex", "Gazprom")

    euro.getInfo()
    euro.purchase()
    gazprom.purchase()
    gazprom.depositMoney()
    euro.check()
    val eqBuying = Buying(euro, gazprom, 15)
    eqBuying.buy()

    val list = listOf(euro, gazprom)

    list.forEach {
        it.purchase()
    }
}