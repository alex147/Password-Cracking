/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Master;

import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

/**
 *
 * @author Admin
 */
public class MyFormatter extends Formatter{

    @Override
    public String format(LogRecord lr) {
        Date date = new Date();
        return  date + "\n" + lr.getMessage() + "\n";
    }
}
