package padroescriacao.prototype;

public class Funcionario implements Cloneable {
    private int codigo;
    private String nome;
    private Departamento departamento;
    private String cargo;

    public Funcionario(int codigo, String nome, Departamento departamento, String cargo) {
        this.codigo = codigo;
        this.nome = nome;
        this.departamento = departamento;
        this.cargo = cargo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public Funcionario clone() throws CloneNotSupportedException {
        Funcionario funcionarioClone = (Funcionario) super.clone();
        funcionarioClone.departamento = (Departamento) funcionarioClone.departamento.clone();
        return funcionarioClone;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", departamento=" + departamento +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}