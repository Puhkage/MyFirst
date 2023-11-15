open class Famili(val name: String, val age: Int) {
    open fun WhatsYourName() {
        println("Меня зовут")
    }
}
class Mother(name: String, age: Int, val position: String): Famili(name, age){
    override fun WhatsYourName(){
        print("Я Марина ")
    }
    fun Happi(){
        println("и я люблю отдыхать...")
    }
}class Father(name: String, age: Int, val position: String): Famili(name, age){
    override fun WhatsYourName() {
        print("Я Павел ")
    }
    fun Like(){
        println("и я люблю спать...")
    }
}
class Son(name: String, age: Int, val position: String): Famili(name,age){
    override fun WhatsYourName() {
        print("Я Коля ")
    }
    fun Hobby(){
        print("и я люблю играть в компьютер...")
    }
}
fun main(){
    val myMother = Mother("Марина", 37, "Замужем")
    val myFather = Father("Павел", 34, "Женат")
    val mySon = Son("Николай", 14, "Первый")
    myMother.WhatsYourName()
    myMother.Happi()
    myFather.WhatsYourName()
    myFather.Like()
    mySon.WhatsYourName()
    mySon.Hobby()
}