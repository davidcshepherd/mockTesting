package delft;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyClassForTesting {


    BufferedReader br;


    public MyClassForTesting(){
        br =  new BufferedReader(new InputStreamReader(System.in)); //Here you declare your BufferedReader object and instance it.
    }

    public MyClassForTesting(BufferedReader b){
        br = b;
    }

    public int getInput(){
        String myInt = getMyInt();
        int intValue = Integer.parseInt(myInt);
        return intValue;
    }

    private String getMyInt() {
        String myInt = "";
        try {
            myInt = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return myInt;
    }

}
