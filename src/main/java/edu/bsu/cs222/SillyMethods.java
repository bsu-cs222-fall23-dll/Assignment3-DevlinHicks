package edu.bsu.cs222;

public class SillyMethods {

    public boolean didGuess42(int i) {
        if (i == 42) {
            return true;
        } else {
            return false;
        }

    }

    public String countTo(int i)
    {
        StringBuilder results = new StringBuilder();
        for (int count=0;count<=i;count++){
            results.append(count);
            if (count<i){
                results.append(" ");
            }
        }
        return results.toString();
    }
}


