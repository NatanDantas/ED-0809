import java.util.ArrayList;

public class ListaCompra {
    private ArrayList<Compra> oLista;

    /* Construtor vazio para instanciar a lista */
    public ListaCompra() {
        oLista = new ArrayList<Compra>();
    }

    /* Método para Inserir Item */
    public void inserirItem(Compra oC) {
        oLista.add(oC);
    }

    /* Percorre e Imprime os valores da lista */
    public void mostrarLista() {
        for (int i = 0; i < oLista.size(); i++) {
            oLista.get(i).imprimir();
        }

        /*
         * for(Compra i : oLista) {
         * i.imprimir();
         * }
         */

    }

    /* Percorre a lista e procura por um item(posição) especifica */
    public int pesquisarItem(int item) {
        int pos = -1;

        for (int i = 0; i < oLista.size(); i++) {
            if (oLista.get(i).getItem() == item) {
                pos = i;
                break;
            }
        }

        return pos;

    }

    /* Remove o item especificado da lista */
    public void removerItem(int item) {
        oLista.remove(pesquisarItem(item));
    }

    /*
     * Percorre a lista, multiplica a quantidade pelo valor, e soma todos no final
     */
    public double computarLista() {
        double comp = 0;
        double soma = 0;
        for (int i = 0; i < oLista.size(); i++) {

            comp = oLista.get(i).getQtd() * oLista.get(i).getPreco() + comp;
            // soma =
        }

        return comp;
    }

    public void mostrarUnicoItem(int item) {
        oLista.get(pesquisarItem(item)).imprimir();
    }
}