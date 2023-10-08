fun main(){
    var dirtyLevel = 20
    val waterFilter: (Int) -> Int = {dirty -> dirty / 2}
    println(waterFilter(dirtyLevel))

    fun updateDirty(dirty : Int, operation: (Int) -> Int){
        operation(dirty);
    }

     updateDirty(40, waterFilter);

    //
    fun increase(start : Int) = start + 1
    println(updateDirty(14, ::increase))
}