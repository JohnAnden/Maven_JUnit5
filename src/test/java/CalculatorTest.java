import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void initialize(TestInfo info) {
        System.out.println("Initialize Test Data for " + info.getDisplayName());
    }
    @AfterEach
    void cleanUp(TestInfo info) {
        System.out.println("Clean up Test Data for " + info.getDisplayName());
    }

    @Test
    @DisplayName("2 + 1 = 3")
    void addsTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(3,calculator.add(2,1), "2 + 1 should equal 3");
    }
    @Test
    @DisplayName("2 - 1 = 1")
    void subtractsTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.substract(2, 1), "2-1 should equal 1");
    }
    @Test
    @DisplayName("2 * 3 = 6")
    void multipliesTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 6), "2 * 3 should equal 6");
    }
    @Test
    @DisplayName("5 % 2 = 1")
    void modulusTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals( 1, calculator.modulus( 5, 2),"5 modulus 2 should equal 1");
    }
}