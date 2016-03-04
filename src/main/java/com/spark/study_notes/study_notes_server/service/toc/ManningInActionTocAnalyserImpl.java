package com.spark.study_notes.study_notes_server.service.toc;

import com.spark.study_notes.study_notes_server.toc.Section;
import com.spark.study_notes.study_notes_server.util.StringUtil;
import com.spark.study_notes.study_notes_server.util.TextAndInteger;
import org.apache.log4j.Logger;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Allbts-IT on 4/03/2016.
 */
public class ManningInActionTocAnalyserImpl implements TocAnalyser {
    private static final Logger LOGGER = Logger.getLogger(ManningInActionTocAnalyserImpl.class);
    @Override
    public List<Section> text2TOC(String text) {
        List<Section> topSections = new LinkedList<Section>();
        String line = StringUtil.mulitpleLine2OneLine(text);
        String level2Lines[] = line.split("\\d+\\.+\\d+\\s+");
        int i = 0;
        for (String level2Line : level2Lines) {
            LOGGER.debug(level2Line);
            //The empty line should be ignored, because the first first line before the number is empty line
            if (!StringUtil.isEmptyLine(level2Line)){
                Section topSection = new Section();
                topSections.add(topSection);
                //the first line
                if (i++ == 0){
                    //get the page num
                    //the rest is the title
                    TextAndInteger textAndInteger = StringUtil.extractTextAndLastInteger(level2Line);
                    topSection.setPageNumber(textAndInteger.getIntNum());
                    topSection.setTitle(textAndInteger.getText());
                    //ToDo:analyse the third-level sections
//                    Spring rebooted 2 Taking a fresh look at Spring 2 ■ Examining Spring Boot essentials 4 ■ What Spring Boot isn’t
//
//                    1.seperate by ■
//                    trim each line
//                    if lines.size()>1
//                    The analyse from line 1.
//                    find all the numbers N in the first line
//                    find the subset each one <= the the page number of the second line
//                    select the first num in the subset
//                    use it as the page number of the section
//                    use it as the sperator
//                    insert the first section
                }
            }
        }
        return topSections;
    }
}
