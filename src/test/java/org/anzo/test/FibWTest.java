package org.anzo.test;

import org.anzo.FibRec;
import org.anzo.FibWhile;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by anzo0316 on 9/13/2016.
 */
public class FibWTest {

    FibWhile fw;

    @Before
    public void test() {
        fw = new FibWhile();
    }

    @Test

    public void test2() {

        assertThat(fw.fibWhile(2), is(1));
    }

    @Test

    public void test3() {

        assertThat(fw.fibWhile(3), is(2));
    }

    @Test

    public void test4() {

        assertThat(fw.fibWhile(4), is(3));
    }

    @Test

    public void test5() {

        assertThat(fw.fibWhile(5), is(5));
    }

    @Test

    public void test11() {

        assertThat(fw.fibWhile(11), is(89));
    }
}
