import org.jetbrains.annotations.Mutable

class Utils(val edges: MutableList<Edge>, nodes: MutableList<Node>){
    init {
        var root = getNode("a")
        if(root==-1){
            root = 0
        }
        nodes[root].num = 0f
        nodes[root].from = null
    }
    fun getEdgesFromNode(search:String):MutableList<Edge>{
        val ret:MutableList<Edge> = mutableListOf()
        for (edge in edges) {
            if(edge.a==search||edge.b==search){
                ret.add(edge)
            }
        }
        return ret
    }

    fun getNode(search:String): Int {
        for (i in 0 until nodes.size){
            val node = nodes[i]
            if(node.name==search){
                return i
            }
        }
        return -1
    }


    fun findSmallest():Node{
        var smallestNode = Node("SOMETHING",num = 10000f)
        for (node in nodes) {
            if(node.num<smallestNode.num && !node.set){
                smallestNode = node
            }
        }
        return smallestNode
    }

    fun findPath(n:String){ //node to be found
        var currentNode:Node = nodes[getNode("a")]

        while(true){
            if(nodes.none { node -> !node.set}){
                break
            }
            currentNode = findSmallest()
            nodes[getNode(currentNode.name)].set = true
            reachNodes(currentNode.name)
        }
        currentNode = nodes[getNode(n)]
        val ret = mutableListOf(currentNode.name)
        while(currentNode.name!="a"){
            for (edge in getEdgesFromNode(currentNode.name)) {
                val node = nodes[getNode(edge.other(currentNode.name))]
                if(currentNode.num-edge.weight==node.num){
                    ret.add("-"+edge.weight+"-")
                    ret.add(node.name)
                    currentNode = node
                }
            }
        }
        ret.reverse()
        println(ret)
//        for (node in nodes) {
//            println(node)
//        }
    }

    fun reachNodes(n:String){
        for (edge in getEdgesFromNode(n)) {
            val index = getNode(edge.other(n))
            if(index!=-1){
                nodes[index].assign((nodes[getNode(edge.getN(n))].num+edge.weight), n)
            }
        }
    }

}
