package org.anzo.test;

import org.anzo.FibRec;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by anzo0316 on 9/13/2016.
 */
public class FibRecTest {
    FibRec rec;

    @Before
    public void test() {
        rec = new FibRec();
    }

    @Test

    public void test2() {

        assertThat(rec.fibRec(2), is(1));
    }

    @Test

    public void test3() {

        assertThat(rec.fibRec(3), is(2));
    }

    @Test

    public void test4() {

        assertThat(rec.fibRec(4), is(3));
    }

    @Test

    public void test5() {

        assertThat(rec.fibRec(5), is(5));
    }
    @Test

    public void test11() {

        assertThat(rec.fibRec(11), is(89));
    }
}
