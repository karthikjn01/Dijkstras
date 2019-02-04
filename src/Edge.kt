data class Edge(val a :Node,val b:Node,val weight:Int){
    fun small():Node{
        return if(a.num<b.num){
            a
        }else{
            b
        }
    }

    fun get(n1:Node):Node{
        return if(n1.name==a.name){a}else{b}
    }

    fun other(n1:Node):Node{
        return if(n1.name!=a.name){a}else{b}
    }

}