package Arrays;

import java.awt.image.BufferStrategy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by anzo0316 on 9/9/2016.
 */
public class MailExchange {

    String inputString;

    public MailExchange( String inputString){

        this.inputString = inputString;
    }

    public void setInputString( String inputString){
        this.inputString = inputString;
    }

    public String getInputString (){
        return inputString;
    }


    public String mailConvert() throws IOException {



     //   BufferedReader set = new BufferedReader(new InputStreamReader(System.in));

      //  inputString = set.readLine();
        String result = inputString.replace("@", "[at]").replace(".", "[dot]");
        return result;

    }
}
