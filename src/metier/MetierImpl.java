package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao idao; //couplage faible
    @Override
    public double calcule() {
        double temper= idao.getData();
        double res=temper*564/Math.cos(temper*Math.PI);
        return res;
    }
    /*
       Injecter  dans la varieble idao un objet d'un classe
       qui implemente l'interface IDao
    */
    public void setIdao(IDao idao) {
        this.idao = idao;
    }
}
