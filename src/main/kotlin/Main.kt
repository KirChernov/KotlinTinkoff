fun main() {

    val Euro = Currency(90, "Moex", "Euro")
    val Gazprom = Equity(283, "Moex", "Gazprom")

    Euro.info()
    Euro.purchase()
    Gazprom.purchase()
    Gazprom.depositMoney()
    val EqBuy = Buy(Euro, Gazprom, 15)
    EqBuy.buy()
}