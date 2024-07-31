package dev.nacho.imc.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorImcTest {
    
   CalculatorImc calculator; 
   Person person;

   @BeforeEach
   void setUp() {
    person = new Person(80.00, 1.70);
    calculator = new CalculatorImc(person);
   }

   @Test
   void testCalculatorImcHas2Fields() {
      assertEquals(2, calculator.getClass().getDeclaredFields().length);
}
   @Test
   void testCalculatorImcCanReturnPerson() {
       assertEquals(person, calculator.getPerson());
}
   @Test
   void testCalculatorImcCanReturnImc() {
       assertEquals(0.0, calculator.getImc());
}
   @Test
   void testCalculatorImcCanCalculatePersonImc() {
       calculator.calculate();
       assertEquals(27.68, calculator.getImc());
}

@Test
void testClassifyIMC() {
    calculator.calculate();
    String classify = calculator.classifyIMC();
    assertEquals("Overweight", classify);
}
}