import net.lsferreira.school.trabalholaboratorial.aulas.Aula;
import net.lsferreira.school.trabalholaboratorial.aulas.gestor.GestorSemanaAulas;

public class Main {

    public Main() {
        System.out.println();
        for (Aula aula : GestorSemanaAulas.INSTANCIA.getAulas()) {
            System.out.println(aula);
            System.out.println("\n----------------------------------------\n");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
