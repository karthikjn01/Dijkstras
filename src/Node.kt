data class Node(val name:String, var num:Float = 9999f, var from:String? = null, var set:Boolean = false){
    fun assign(value: Float, from:String){
        if(num>value){
            this.num = value
            this.from = from
        }
    }
}