package io.github.olyutorskii.ghpkgmvnsmpl;

import org.junit.Test;

import static org.junit.Assert.*;

public class DerivedSampleTest {

    /**
     * Test of toString method, of class DerivedSample.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        DerivedSample instance = new DerivedSample();
        String result = instance.toString();
        assertEquals("BaseSample:DerivedSample", result);
        return;
    }

}
