package com.spark.study_notes.study_notes_server.toc;

import java.util.ArrayList;

/**
 * Created by Allbts-IT on 4/03/2016.
 */
public class Section {
    private String title;

    //This is the page number on toc
    private int pageNumber;

    private ArrayList<Section> sections = new ArrayList<Section>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public ArrayList<Section> getSections() {
        return sections;
    }

    public void setSections(ArrayList<Section> sections) {
        this.sections = sections;
    }
}
