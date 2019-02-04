class Utils(val edges:MutableList<Edge>){
    fun getEdgesFromNode(search:Node):MutableList<Edge>{
        val ret:MutableList<Edge> = mutableListOf()
        for (edge in edges) {
            if(edge.a.name==search.name||edge.b.name==search.name){
                ret.add(edge)
            }
        }
        return ret
    }

    fun findSmallest():Node{
        var smallest:Float = 1000f
        var smallestNode:Node = Node("")
        for (edge in edges) {
            if(smallest>edge.small().num){
                smallest = edge.small().num
                smallestNode = edge.small()
            }
        }

        return smallestNode
    }

    fun findPath(n1:Node, n2:Node){
        getEdgesFromNode(n1).get(n1)
    }
}