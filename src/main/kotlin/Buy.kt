class Buy (val CurrencyBuy : Currency, val EquityBuy : Equity, val Number: Int) {
    var sum = 0
    fun buy(){
        sum = Number * CurrencyBuy.price
        println ("Purchased $Number ${CurrencyBuy.name} for the amount of: $sum")
        EquityBuy.depositMoney()
    }
}