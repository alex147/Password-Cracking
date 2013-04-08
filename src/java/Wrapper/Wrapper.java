/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Wrapper;

import Master.*;
import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author Admin
 */
@WebService(serviceName = "Wrapper")
public class Wrapper {

    private static int usersNumber = 4;
    private Master master = Master.getInstance();
    private PassFileOpener passFileOpener = PassFileOpener.getInstance();
    private static final Logger logger = Logger.getLogger("DPCLogger");
    private static int timesCalled = 0;

    @WebMethod(operationName = "getDictionaryPart")
    public List<String> getDictionaryPart() throws IOException {
        return master.getDictionary(usersNumber);
    }

    @WebMethod(operationName = "getPasswordFile")
    public List<String> getPasswordFile() throws IOException {
        return passFileOpener.getPassFile();
    }

    @WebMethod(operationName = "sendCracked")
    public void sendCracked(List<String> list) throws IOException {
        if (timesCalled == 0) {
            setLogger();
            timesCalled++;
        }
        for (int i = 0; i < list.size(); i++) {
            logger.info(list.get(i));
        }
    }

    private void setLogger() throws IOException {
        FileHandler handler = new FileHandler("C:\\DPC_Log.txt", true);
        handler.setFormatter(new MyFormatter());
        logger.addHandler(handler);
    }
}
