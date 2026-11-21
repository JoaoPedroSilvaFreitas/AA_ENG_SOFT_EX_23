package padroescriacao.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Funcionario funcionario = new Funcionario(123, "Funcionario Original", new Departamento("TI", 1), "Desenvolvedor");

        Funcionario funcionarioClone = funcionario.clone();
        funcionarioClone.setCodigo(456);
        funcionarioClone.setNome("Funcionario Clonado");
        funcionarioClone.getDepartamento().setAndar(2);

        assertEquals("Funcionario{codigo=123, nome='Funcionario Original', departamento=Departamento{nome='TI', andar=1}, cargo='Desenvolvedor'}", funcionario.toString());
        assertEquals("Funcionario{codigo=456, nome='Funcionario Clonado', departamento=Departamento{nome='TI', andar=2}, cargo='Desenvolvedor'}", funcionarioClone.toString());
    }
}