package padroes.memento3;

import java.util.ArrayList;
import padroes.memento3.business.MementoProduto;

public class Zelador {

    protected static ArrayList<MementoProduto> estados = new ArrayList<MementoProduto>();
    private static ArrayList<MementoProduto> estadoRefaz = new ArrayList<MementoProduto>();
    private static Zelador zelador;

    public static Zelador getZelador() {
        if (zelador == null) {
            zelador = new Zelador();
        }
        return zelador;
    }

    public static void adicionarMemento(MementoProduto memento) {
        estados.add(memento);
    }

    public static void addMementoRefaz(MementoProduto memento) {
        estadoRefaz.add(memento);
    }

    public static MementoProduto getUltimoEstadoRefaz() {
        if (estadoRefaz.size() <= 0) {
            throw new RuntimeException("Não há estados salvos");
        }
        MementoProduto estadoSalvo = estadoRefaz.get(estadoRefaz.size() - 1);
        estadoRefaz.remove(estadoRefaz.size() - 1);
        return estadoSalvo;
    }

    public static MementoProduto getUltimoEstadoSalvo() {
        if (estados.size() <= 0) {
            throw new RuntimeException("Não há estados salvos");
        }
        MementoProduto estadoSalvo = estados.get(estados.size() - 1);

        estados.remove(estados.size() - 1);
        return estadoSalvo;
    }
}
