package dev.nacho.imc.models;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {
    Person person;

    @BeforeEach
    void setUp() {
        person = new Person(0, 0);
    }

    @Test 
    void testPersonHas1Field() {
        assertThat(person.getClass().getDeclaredFields().length, is(value1));
    }

    @Test 
   void testName() {
     assertThat(person.getWeight(), is(value80.00));
}
}
