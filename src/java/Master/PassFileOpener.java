package Master;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PassFileOpener {

    private static PassFileOpener passFileOpener = new PassFileOpener();

    public static PassFileOpener getInstance() {
        if (passFileOpener == null) {
            passFileOpener = new PassFileOpener();
        }
        return passFileOpener;
    }

    public List<String> getPassFile() throws IOException{
        List<String> passList = new LinkedList<>();
        try (FileReader fileReader = new FileReader("C:\\passwords.txt")) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while(true){
                line = bufferedReader.readLine();
                if(line == null){
                    break;
                }
                else{
                    passList.add(line);
                }
            }
        }
        return passList;
    }
}
