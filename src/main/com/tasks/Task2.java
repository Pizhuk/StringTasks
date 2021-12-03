package main.com.tasks;

public class Task2 {
    public String pushIntToString(int integer){
        return integer+"";
    }

    public String pushDoubleToString(double d){
        return d+"";
    }

    public int countOfSymbol(String str, char sym){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == sym){
                count++;
            }
        }
        return count;
    }

    public int pushStringToInt(String str){
        boolean bool = false;
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='0' || str.charAt(i)=='1' || str.charAt(i)=='2' || str.charAt(i)=='3'
                    || str.charAt(i)=='4' || str.charAt(i)=='5' || str.charAt(i)=='6' || str.charAt(i)=='7'
                    || str.charAt(i)=='8' || str.charAt(i)=='9' || (str.charAt(i)=='-'&& str.length()>1 && countOfSymbol(str, '-') == 1)) {
                bool = true;
            }
            else {
                bool = false;
                break;
            }
        }
        int i;
        if (bool){
            i = Integer.parseInt(str);
        }
        else{
            i = 0;
        }
        return i;
    }

    public double pushStringToDouble(String str){
        boolean bool = false;
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='0' || str.charAt(i)=='1' || str.charAt(i)=='2' || str.charAt(i)=='3'
                    || str.charAt(i)=='4' || str.charAt(i)=='5' || str.charAt(i)=='6' || str.charAt(i)=='7'
                    || str.charAt(i)=='8' || str.charAt(i)=='9' || (str.charAt(i)=='-'&& str.length()>1 && countOfSymbol(str, '-') == 1 ||
                    (str.charAt(i)=='.' && str.length()>1 && countOfSymbol(str, '.') == 1))) {
                bool = true;
            }
            else {
                bool = false;
                break;
            }
        }
        double d;
        if (bool){
            d = Double.parseDouble(str);
        }
        else{
            d = 0;
        }
        return d;
    }

}
