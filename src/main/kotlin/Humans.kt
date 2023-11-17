class Human(private var name: String, private var age: Int){
    //method for GET value of name
    fun getName(): String{
        return name
    }
    //method for SET value of name
    fun setName(newName: String){
        name = newName
    }
    //method for GET value of age
    fun getAge():Int{
        return age
    }
    //method for SET value of age
    fun setAge(newAge:Int){
        if (newAge >= 0) {
            age = newAge
        }
        else{
            println("Значение возраста не может быть отрицательным")
        }
    }
    fun LetMeSeeName(){
        println("Имя: $name, Возраст: $age")
    }
}
fun main(){
    // definition of class Human
    val human = Human("Павел",34)
    //using Get methods
    human.LetMeSeeName()
    println("Поменяли имя на: ${human.getName()}")
    println("Поменяли возраст на: ${human.getAge()}")
    //using Set methods
    human.setName("Ян")
    human.setAge(-96666)
    human.LetMeSeeName()

}

