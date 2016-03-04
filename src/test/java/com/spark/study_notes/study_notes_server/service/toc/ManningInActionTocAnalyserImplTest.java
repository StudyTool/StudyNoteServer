package com.spark.study_notes.study_notes_server.service.toc;

import com.spark.study_notes.study_notes_server.toc.Section;
import junit.framework.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Allbts-IT on 4/03/2016.
 */
public class ManningInActionTocAnalyserImplTest {

    @Test
    public void testText2TOC() throws Exception {
        ManningInActionTocAnalyserImpl tocAnalyser = new ManningInActionTocAnalyserImpl();
        String text="1.1 Spring rebooted 2\n" +
                "Taking a fresh look at Spring 2 ■ Examining Spring Boot\n" +
                "essentials 4 ■ What Spring Boot isn’t 7\n" +
                "1.2 Getting started with Spring Boot 8\n" +
                "Installing the Spring Boot CLI 8 ■ Initializing a Spring Boot\n" +
                "project with Spring Initializr 12\n" +
                "1.3 Summary 22";
        List<Section> topSections = tocAnalyser.text2TOC(text);
        Section topSection0 = topSections.get(0);
        assertEquals("Spring rebooted",topSection0.getTitle());
        assertEquals(3,topSection0.getSections().size());
        Assert.assertEquals(3,topSections.size());
    }
}