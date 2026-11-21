package padroescriacao.prototype;

public class Departamento implements Cloneable {
    private String nome;
    private Integer andar;

    public Departamento(String nome, Integer andar) {
        super();
        this.nome = nome;
        this.andar = andar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAndar() {
        return andar;
    }

    public void setAndar(Integer andar) {
        this.andar = andar;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nome='" + nome + '\'' +
                ", andar=" + andar +
                '}';
    }
}