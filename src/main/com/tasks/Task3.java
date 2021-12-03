package main.com.tasks;

import main.com.tasks.extra.Extra;

import java.util.Arrays;


public class Task3 {
    public int getSmallestLengthOfWord(String str){
        str = str.replace(",", "");
        str = str.replace(".", "");
        if (str.replace(" ", "").isEmpty()){
            return 0;
        }
        else {
            String[] strArr = str.split(" ");

            int count = strArr[0].length();
            for ( String partOfStr : strArr){
                if (count >= partOfStr.length()){
                    count = partOfStr.length();
                }
            }
            return count;
        }
    }

    public String[] replaceBy$(String[] str, int lengthOfWords){

        for (int i = 0; i < str.length; i++){
            if (str[i].length() == lengthOfWords){
                if(str[i].length() <= 3){
                    str[i] = "$$$";
                }
                else {
                    str[i] = str[i].substring(0, str[i].length()-3);
                    str[i] = str[i] + "$$$";
                }

            }
        }

        return str;

    }


    public String pushSpaceIntoStr(String str){
        String space = " ";
        if(str.charAt(str.length()-1) == '.' || str.charAt(str.length()-1) == ',' ||
                str.charAt(str.length()-1) == '!' ||str.charAt(str.length()-1) == '?' ||
                str.charAt(str.length()-1) == ':' ||str.charAt(str.length()-1) == ';'){
            str = str + space;
        }

        int count = 0;

        for (int i = 0; i < str.length(); i++){
            if((str.charAt(i) == '.' || str.charAt(i) == ','
                    || str.charAt(i) == '!'|| str.charAt(i) == '?'
                    || str.charAt(i) == ':'|| str.charAt(i) == ';') && str.charAt(i+1) != ' '){
                count++;
            }
        }

        int[] massiv = new int[count];

        int j = 0;
        for (int i = 0; i < str.length(); i++){
            if((str.charAt(i) == '.' || str.charAt(i) == ','
                    || str.charAt(i) == '!'|| str.charAt(i) == '?'
                    || str.charAt(i) == ':'|| str.charAt(i) == ';') && str.charAt(i+1) != ' '){
                massiv[j] = i;
                j++;
            }
        }


        int count1 = 1;
        for (int i = 0; i < count; i++){
            str = str.substring(0, massiv[i]+count1) + space + str.substring(massiv[i]+count1);
            count1++;
        }

        return str;
    }




    public String getOnlyOneSuchASym(String str){
        Extra extra = new Extra();
        int count = 0;
        char[] massiv = new char[str.length()];
        int j = 0;
        for (int i = 0; i < str.length(); i++){
            if (extra.isInMassiv(massiv, str.charAt(i))){
                continue;
            }
            massiv[j] = str.charAt(i);
            j++;
        }

        str = "";
        for(int i = 0; i < j; i++){
            str = str + massiv[i];
        }
        return str;
    }

    public int getAmountOfWords(String str){
        int amount = 0;
        String[] massiv = str.split(" ");
        for (int i = 0; i < massiv.length; i++) {
            if(!massiv[i].isEmpty()){
                amount++;
            }
        }
        return amount;
    }

    public String deletePartOfStr(String str, int position, int length){
        if(str.isEmpty()){
            str = "";
        }
        else if(str.length() - position <= length){
            str = str.substring(0, position) ;
        }
        else {
            str = str.substring(0, position) + str.substring(position+length);
        }

        return str;
    }

    public String reverseStr(String str){
        String returnStr = "";
        for (int i = str.length()-1; i >= 0; i--){
            returnStr += str.charAt(i);
        }
        return returnStr;
    }

    public String deleteLastWord(String str){
        if (str.isEmpty()){
            return str;
        }
        else {
            int secondPosition = 0;
            for(int i = str.length()-1; i>=0; i--){
                if(str.charAt(i) != ' '){
                    secondPosition = i;
                    break;
                }
            }

            int firstPosition = 0;
            for (int i = secondPosition; i>=0; i--){
                if(str.charAt(i) == ' '){
                    firstPosition = i;
                    break;
                }
            }
            str = str.substring(0, firstPosition);
            str = str.trim();

            return str;
        }
    }
}
