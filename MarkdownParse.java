//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
//change change I saw you chang in the house of flies
//it's like you never
//had any lies
//ahhhhh ah ahhhhh ah ahhhhhh ahhhh ah  ahhahhh

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        while(currentIndex < markdown.length()) {
            int beginLink = markdown.indexOf("https", currentIndex);
            if (beginLink == -1){
                break;
            }
            int nextLink = markdown.indexOf("https", beginLink);
            int endLink;
            if (nextLink == -1){
                String tempString = markdown.substring(beginLink);
                if (tempString.indexOf(".com") != -1){
                    endLink = markdown.indexOf(".com",beginLink);
                }
                else if (tempString.indexOf(".edu") != -1){
                    endLink = markdown.indexOf(".edu",beginLink);
                }
                else if (tempString.indexOf(".gov") != -1){
                    endLink = markdown.indexOf(".gov",beginLink);
                }
                else if (tempString.indexOf(".org") != -1){
                    endLink = markdown.indexOf(".org",beginLink);
                }
                else if (tempString.indexOf(".co") != -1){
                    endLink = markdown.indexOf(".co",beginLink);
                }
                else if (tempString.indexOf(".html") != -1){
                    endLink = markdown.indexOf(".html",beginLink);
                }
                else if (tempString.indexOf(".java") != -1){
                    endLink = markdown.indexOf(".java",beginLink);
                }
                else{
                    endLink = markdown.indexOf(".",beginLink);
                }
            }
            else{
                String tempString = markdown.substring(beginLink, nextLink);
                if (tempString.indexOf(".com") != -1){
                    endLink = markdown.indexOf(".com",beginLink);
                }
                else if (tempString.indexOf(".edu") != -1){
                    endLink = markdown.indexOf(".edu",beginLink);
                }
                else if (tempString.indexOf(".gov") != -1){
                    endLink = markdown.indexOf(".gov",beginLink);
                }
                else if (tempString.indexOf(".org") != -1){
                    endLink = markdown.indexOf(".org",beginLink);
                }
                else if (tempString.indexOf(".co") != -1){
                    endLink = markdown.indexOf(".co",beginLink);
                }
                else{
                    endLink = -markdown.indexOf(".",beginLink);
                }
            }
            if (endLink == -1){
                break;
            }
            toReturn.add(markdown.substring(beginLink, endLink));
            if (currentIndex == 0 || currentIndex == -1){
                break;
            }
        }
        return toReturn;
    }


    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
	    System.out.println(links);
    }
}
