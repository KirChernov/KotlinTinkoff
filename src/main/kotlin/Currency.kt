
class Currency (override val price: Int,
                override val market: String,
                override val name: String, ) : StockMarket {

    override fun purchase(){
        super.info()
        println("Currency $name is ready for purchase by price $price" )
    }
}