package org.shitalma;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    public void parsingString(){
        final Pattern pattern = Pattern.compile("[-\\d+]");
        final Pattern pattern1 = Pattern.compile("/-?\\d+/");
        final Matcher matcher = pattern1.matcher("-3+-2*7+8******-8");
        while (matcher.find())
           System.out.println(Integer.parseInt(matcher.group()));
    }
}
