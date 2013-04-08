/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Wrapper;

import Master.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Admin
 */
@WebService(serviceName = "Wrapper")
public class Wrapper {

    private static int usersNumber = 4;
    private Master master = Master.getInstance();

    @WebMethod(operationName = "getDictionaryPart")
    public List<String> getDictionaryPart() throws IOException{
        return master.getDictionary(usersNumber);
    }

    @WebMethod(operationName = "getPasswordFile")
    public List<String> getPasswordFile() {
        return new ArrayList<String>();
    }

    @WebMethod(operationName = "sendCracked")
    public void sendCracked(List<String> list) {
    }
}
