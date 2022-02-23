
class Currency (override val price: Int,
                override val market: String,
                override val name: String, ) : StockMarket {

    private var availability = true

    fun check(){
        if (availability == true){
            println ("Currency is available")
        }
    }

    override fun purchase(){
        super.getInfo()
        println("Currency $name is ready for purchase by price $price" )
    }
}