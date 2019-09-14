package io.github.olyutorskii.ghpkgmvnsmpl;

import org.junit.Test;

import static org.junit.Assert.*;

public class BaseSampleTest {

    /**
     * Test of toString method, of class BaseSample.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BaseSample instance = new BaseSample();
        String result = instance.toString();
        assertEquals("BaseSample", result);
        return;
    }

}
