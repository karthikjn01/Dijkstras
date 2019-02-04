val edges = mutableListOf<Edge>()
val nodes = mutableListOf<Node>()
fun main(args: Array<String>) {

    nodes.add(Node("a"))
    nodes.add(Node("b"))
    nodes.add(Node("c"))
    nodes.add(Node("d"))
    nodes.add(Node("e"))
    nodes.add(Node("f"))

    edges.add(Edge("a","b",1f))
    edges.add(Edge("b","c",1f))
    edges.add(Edge("c","d",1f))
    edges.add(Edge("d","e",1f))
    edges.add(Edge("e","a",1f))
    edges.add(Edge("c","f",2f))
    edges.add(Edge("d","f",1f))


    val utils = Utils(edges, nodes)

//    println(utils.findSmallest().toString())
    utils.findPath("f")

}