package com.butunclebob;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.butunclebob.PrimeFactors.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PrimeFactorsTest {

    @Test
    public void shouldGenerateOne() {
        assertThat(generate(1), is(list()));
    }

    @Test
    public void shouldGenerateTwo() {
        assertThat(generate(2), is(list(2)));
    }

    @Test
    public void shouldGenerateThree() {
        assertThat(generate(3), is(list(3)));
    }

    private List<Integer> list(int... ints) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i : ints)
            list.add(i);

        return list;
    }
}
