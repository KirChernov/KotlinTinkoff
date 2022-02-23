class Buying (val currencyBuy : Currency,
              val equityBuy : Equity,
              val number: Int) {
    var sum = 0
    fun buy(){
        sum = number * currencyBuy.price
        println ("Purchased $number ${currencyBuy.name} for the amount of: $sum")
        equityBuy.depositMoney()
    }
}