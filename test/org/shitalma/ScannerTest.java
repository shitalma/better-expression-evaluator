package org.shitalma;

import junit.framework.TestCase;
import org.junit.Test;

public class ScannerTest extends TestCase {
    @Test
    public void testWhichGivesNextCharacterFromString() throws Exception {
        Scanner sc = new Scanner("sham");
        assertEquals('s',sc.next());
        assertEquals('h',sc.next());
        assertEquals('a',sc.next());
        assertEquals('m',sc.next());
    }

    @Test
    public void testWhichTrimBlankSpaceFromFrontOfTheString() throws Exception {
        Scanner sc = new Scanner(" g");
        assertEquals('g',sc.next());
    }

    @Test
    public void testWhichTrimBlankSpaceBetweenTheString() throws Exception {
        Scanner sc = new Scanner("g n");
        assertEquals('g',sc.next());
        assertEquals('n',sc.next());
    }

    @Test
    public void testWhichTrimMultipleBlankSpaceBetweenTheString() throws Exception {
        Scanner sc = new Scanner("g                  n");
        assertEquals('g',sc.next());
        assertEquals('n',sc.next());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testWhichTellsNextCharacterIsPresentInString() throws Exception {
        Scanner sc = new Scanner("a");
        boolean wanted = true;
        assertEquals(wanted,sc.hasNext());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testWhichTellsNextCharacterIsNotPresentInString() throws Exception {
        Scanner sc = new Scanner("");
        boolean wanted = false;
        assertEquals(wanted,sc.hasNext());
    }
}
