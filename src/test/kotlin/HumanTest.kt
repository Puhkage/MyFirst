import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
class HumanTest {
    @Test
    fun testHuman() {
        val human = Human("Павел", 34) // проверка создания класса
        assertEquals("Павел", human.getName())
        assertEquals(34, human.getAge()) // проверка входных данных Имени и возраста
        human.setName("Вася")
        human.setAge(8666) // проверка изменения имени и возраста
        assertEquals("Вася", human.getName())
        assertEquals(8666, human.getAge())
    }
}