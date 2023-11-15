import kotlin.test.assertEquals

class FamiliTest {

    @org.junit.Test
    fun TestMotherData() {
        val myMother = Mother("Марина", 37, "Замужем")
        assertEquals("Марина", myMother.name)
        assertEquals(37, myMother.age)
        assertEquals("Замужем", myMother.position)
    }
}