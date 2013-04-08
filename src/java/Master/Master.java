package Master;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Master {

    private static BufferedReader bufferedReader = null;
    private static int timesCalled = 0;
    private static int linesNumber = 311141;
    private static Master master = new Master();

    public static Master getInstance() {
        if (master == null) {
            master = new Master();
        }
        return master;
    }

    public List<String> getDictionary(int usersNumber) throws IOException {
        List<String> dictionaryList = new LinkedList<>();
        timesCalled++;
        if (timesCalled == 1) {
            try(FileReader fileReader = new FileReader("C:\\webster-dictionary.txt")){
                bufferedReader = new BufferedReader(fileReader);
            }
//            openDictionaryFile();
        }
//        else {
//            bufferedReader.reset();
//        }
        String line;
        for (int i = 0; i < linesNumber / usersNumber; i++) {
            line = bufferedReader.readLine();
            if (line == null) {
                break;
            } else {
                dictionaryList.add(line);
            }
//            bufferedReader.mark(1);
        }
        return dictionaryList;
    }
//    private void openDictionaryFile() throws IOException {
//        FileReader fileReader;
//        try{
//            fileReader = new FileReader("C:\\webster-dictionary.txt");
//            bufferedReader = new BufferedReader(fileReader);
//        }catch (IOException exception){
//            System.err.println(exception.getMessage());
//        }
//    }
}
