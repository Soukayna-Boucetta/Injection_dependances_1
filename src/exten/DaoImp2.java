package exten;

import dao.IDao;

public class DaoImp2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Verssion capteure");
        double temper=6000;
        return temper;
    }
}
