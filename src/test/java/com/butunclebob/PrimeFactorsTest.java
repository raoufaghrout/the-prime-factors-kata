package com.butunclebob;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PrimeFactorsTest {

    @Test
    public void shouldGenerateOne() {
        assertThat(PrimeFactors.generate(1), is(list()));
    }

    private List<Integer> list() {
        return new ArrayList<Integer>();
    }
}
