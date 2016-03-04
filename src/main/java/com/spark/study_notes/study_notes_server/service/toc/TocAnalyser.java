package com.spark.study_notes.study_notes_server.service.toc;

import com.spark.study_notes.study_notes_server.toc.Section;

import java.util.List;

/**
 * Created by Allbts-IT on 4/03/2016.
 */
public interface TocAnalyser {
    /**
     * convert text to TOC Structure
     * @param text
     * @return
     */
    List<Section> text2TOC(String text);
}
