fun main() {
    countChar()

}
fun countChar(){
    print ("tfytftff")
    val testStr = readln()
    var count = 1
    var itogStr = ""
    var currentChar = testStr[0]
    for (item in testStr.substring(1)) {
        if (currentChar == item) {
            count++
        } else {
            if (count > 1) {
                itogStr += "$currentChar$count"
            } else {
                itogStr += currentChar
            }
            count = 1
            currentChar = item
        }
    }
    if (count > 1){
        itogStr += "$currentChar$count"
    }   else{
    itogStr+= currentChar
    }
        println(itogStr)


}