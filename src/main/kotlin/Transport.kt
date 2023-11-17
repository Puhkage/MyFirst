abstract class Transport(val name:String) {
    abstract fun start()
    abstract fun stop()
}
class Car(name:String): Transport(name){
    override fun start() {
        println("$name: Включить 1ю передачу")
    }
    override fun stop() {
        println("$name: Дернул ручник")
    }
}
class Airplane(name:String):Transport(name){
    override fun start() {
        println("$name: Тяга на 10%")
    }
    override fun stop() {
        println("$name: Успешное приземление")
    }
}
fun main(){
    val car = Car("Lamborgini")
    val airplane = Airplane("SuperGet")
    car.start()
    car.stop()
    airplane.start()
    airplane.stop()
}