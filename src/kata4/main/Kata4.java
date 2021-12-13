
package kata4.main;

import java.io.FileNotFoundException;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {
    

    public static void main(String[] args) throws FileNotFoundException {
        String nameFile = new String("email.txt");
        input(nameFile);
    }
    
    public static void input(String nameFile) throws FileNotFoundException{
        process(MailListReader.read(nameFile));
    }
    
    public static void process(List<Mail> mailList){
        output(MailHistogramBuilder.build(mailList));
    }
    
    public static void output(Histogram<String> histogram){
        new HistogramDisplay(histogram).execute();
    }
    
    
}
