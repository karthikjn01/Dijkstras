data class Edge(val a: String, val b: String, val weight:Float){
    fun getN(n1:String):String{
        return if(n1==a){a}else{b}
    }

    fun other(n1:String):String{
        return if(n1!=a){a}else{b}
    }
}