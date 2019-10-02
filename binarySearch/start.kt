package start_kotlin
fun main(){

    val name = "Kotlin-everywhere dan hacktoberfest"
    val location = "Mataram"
    val list = mutableListOf('a', 'b', 'c', 'd', 'e','f','g','h','i',
        'j','k','l','m','n','o','p','q','r','s',
        't','u','v','w','x','y','z')
    val a = list.binarySearch('c')
    val b = list.binarySearch('g')
    val c = list.binarySearch('f')
    println("Event = $name")
    println("Lokasi = $location")
    println("Tanggal = $a$b,$c,${list.binarySearch('u')}${list.binarySearch('t')}") // 3


}