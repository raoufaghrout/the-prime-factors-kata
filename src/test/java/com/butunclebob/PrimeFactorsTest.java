package com.butunclebob;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.butunclebob.PrimeFactors.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PrimeFactorsTest {

    @Test
    public void shouldGenerateForOne() {
        assertThat(generate(1), is(list()));
    }

    @Test
    public void shouldGenerateForTwo() {
        assertThat(generate(2), is(list(2)));
    }

    @Test
    public void shouldGenerateForThree() {
        assertThat(generate(3), is(list(3)));
    }

    @Test
    public void shouldGenerateForFour() {
        assertThat(generate(4), is(list(2, 2)));
    }

    @Test
    public void shouldGenerateForSix() {
        assertThat(generate(6), is(list(2, 3)));
    }

    @Test
    public void shouldGenerateFor8() {
        assertThat(generate(8), is(list(2, 2, 2)));
    }

    private List<Integer> list(int... ints) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i : ints)
            list.add(i);

        return list;
    }
}
