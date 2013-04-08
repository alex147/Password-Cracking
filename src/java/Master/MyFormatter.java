package Master;

import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

/**
 * A custom formatter that shows date, time and the cracked password.
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
