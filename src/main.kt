val edges = mutableListOf<Edge>()
fun main(args: Array<String>) {
    edges.add(Edge(Node("a"),Node("b"),1))
    edges.add(Edge(Node("b"),Node("c"),1))
    edges.add(Edge(Node("a"),Node("c"),1))

    val utils = Utils(edges)

    println(utils.getEdgesFromNode(Node("c")))





}