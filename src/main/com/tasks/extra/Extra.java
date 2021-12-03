package main.com.tasks.extra;

public class Extra {
    public boolean isInMassiv(char[] massiv, char sym){
        boolean bool = false;
        for (int i = 0; i < massiv.length; i++){
            if(massiv[i] == sym){
                bool = true;
                break;
            }
        }
        return bool;
    }
}
