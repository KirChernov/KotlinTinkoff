
class Equity (override val price: Int,
              override val market: String,
              override val name: String, ) : StockMarket{

    private var balance = 10000
    override fun purchase(){
        println("Equity $name is ready for purchase by price $price" )
    }

    fun depositMoney()
    {
        balance += 100
        println ("balance updated: $balance")
    }
}