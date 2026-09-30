package dados;

import java.util.ArrayList;
import java.util.List;

public class Tutor extends Pessoa {

    private List<Animal> animais;

    public Tutor(String nome, long cpf, String telefone) {
        super(nome, cpf, telefone);
        this.animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void removerAnimal(Animal animal) {
        animais.remove(animal);
    }

    public float calcularGastoAnimais() {
        float total = 0;

        for (Animal animal : animais) {
            total += animal.calcularAtendimentos();
        }

        return total;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}