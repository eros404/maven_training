package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {

    static Sample sample = new Sample();

    @Test
    void easy_addition() {
        int a = 10;
        int b = 7;
        int result = sample.op(Sample.Operation.ADD, a, b);
        Assertions.assertThat(result).as("addition of " + a + " and " + b).isEqualTo(17);
    }

    @Test
    void easy_multiplication() {
        int a = 2;
        int b = 3;
        int result = sample.op(Sample.Operation.MULT, a, b);
        Assertions.assertThat(result).as("multiplication of " + a + " and " + b).isEqualTo(6);
    }

    @Test
    void fact_error() {
        int a = -2;
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> sample.fact(a));
    }

    @Test
    void easy_fact() {
        int a = 3;
        int result = sample.fact(a);
        Assertions.assertThat(result).as("factor of " + a).isEqualTo(6);
    }
}
