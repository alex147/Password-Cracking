package Master;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Master {
    Master master = new Master();
    public Master getInstance(){
        if(master==null){
            master = new Master();
        }
        return master;
    }
}
