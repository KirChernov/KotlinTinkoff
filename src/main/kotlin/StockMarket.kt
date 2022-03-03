
interface StockMarket {

    val market : String
    val name : String
    val price : Int

    fun purchase(){
    }

    fun getInfo(){
        println ("$market Stock market is opened \n")
    }
}
