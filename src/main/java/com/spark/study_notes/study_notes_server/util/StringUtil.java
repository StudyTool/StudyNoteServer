package com.spark.study_notes.study_notes_server.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Allbts-IT on 4/03/2016.
 */
public class StringUtil {
    public static String mulitpleLine2OneLine(String str){
        String result = str.replaceAll("\\n\\r "," ");
        result = result.replaceAll("\\n "," ");
        result = result.replaceAll("\\n\\r"," ");
        result = result.replaceAll("\\n"," ");
        return result;
    }

    /**
     * Has not character or only contains empty spaces
     * @param text
     * @return
     */
    public static boolean isEmptyLine(String text) {
        return text.matches("^\\s*$");
    }

    /**
     * Extract the number and the rest of line
     * @param line
     * @return
     */
    public static TextAndInteger extractTextAndLastInteger(String line) {
        Pattern pattern = Pattern.compile("\\d+\\s*$");
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()){
            String numStr = line.substring(matcher.start());
            int num = Integer.parseInt(numStr.trim());
            String text = line.substring(0,matcher.start());
            return new TextAndInteger(text.trim(),num);
        }
        return null;
    }
}
