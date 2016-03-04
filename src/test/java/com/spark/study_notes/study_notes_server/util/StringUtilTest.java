package com.spark.study_notes.study_notes_server.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Allbts-IT on 4/03/2016.
 */
public class StringUtilTest {

    @Test
    public void testMulitpleLine2OneLine() throws Exception {
        String text = "a\n" +
                " b\n" +
                "c";
        String line = StringUtil.mulitpleLine2OneLine(text);
        assertEquals("a b c",line);
    }

    @Test
    public void testIsEmptyLine() throws Exception {
        assertTrue(StringUtil.isEmptyLine(""));
        assertTrue(StringUtil.isEmptyLine("   "));
    }

    @Test
    public void testExtractTextAndLastInteger() throws Exception {
        String text = "Taking a fresh look at Spring 2 ";
        TextAndInteger textAndInteger = StringUtil.extractTextAndLastInteger(text);
        assertNotNull(textAndInteger);
        assertEquals(2,textAndInteger.getIntNum());
        assertEquals("Taking a fresh look at Spring",textAndInteger.getText());
    }
}