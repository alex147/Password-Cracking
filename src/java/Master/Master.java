package Master;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Reads dictionary files and divides it into pieces.
 * 
 * @author Admin
 */
public class Master {
    private static BufferedReader bufferedReader = null;
    private static int timesCalled = 0;
    private static int linesNumber = 311141;
    private static Master master = new Master();
    
    /**
     * 
     * @return A new instance of master 
     */
    public static Master getInstance() {
        if (master == null) {
            master = new Master();
        }
        return master;
    }
    /**
     * Divides the dictionary into pieces.
     * 
     * @param usersNumber Number of clients
     * @return A pieces from the dictionary
     * @throws IOException 
     */
    public List<String> getDictionary(int usersNumber) throws IOException {
        List<String> dictionaryList = new LinkedList<>();
        timesCalled++;
        if (timesCalled == 1) {
            openDictionaryFile();
        } else {
            bufferedReader.reset();
        }
        String line;
        for (int i = 0; i < (linesNumber / usersNumber) / 500; i++) {
            line = bufferedReader.readLine();
            if (line == null) {
                break;
            } else {
                dictionaryList.add(line);
            }
            bufferedReader.mark(1);
        }
        return dictionaryList;
    }
    /**
     * Opens up a dictionary file.
     * 
     * @throws IOException 
     */
    private void openDictionaryFile() throws IOException {
        FileReader fileReader = new FileReader("C:\\webster-dictionary.txt");
        bufferedReader = new BufferedReader(fileReader);
    }
}
