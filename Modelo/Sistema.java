package Modelo;
import java.util.ArrayList;
public class Sistema {
    private ArrayList<ArrayList<Integer>> cuentas = new ArrayList<ArrayList<Integer>>();


    private Sistema(ArrayList<ArrayList<Integer>> cuentas) {
    }
    public ArrayList<ArrayList<Integer>> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<ArrayList<Integer>> cuentas) {
        this.cuentas = cuentas;
    }
}
