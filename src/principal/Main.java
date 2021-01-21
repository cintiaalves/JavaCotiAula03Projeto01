package principal;

import java.util.ArrayList;
import java.util.List;

import entities.Empresa;
import entities.Funcionario;
import interfaces.IEmpresaRepository;
import repositories.EmpresaRepository;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario funcionario1 = new Funcionario(1, "Leo", "123.456.789-00");
		Funcionario funcionario2 = new Funcionario(2, "Bia", "121.356.789-45");
		Funcionario funcionario3 = new Funcionario(3, "Ana", "098.123.456-11");
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		funcionarios.add(funcionario1);
		funcionarios.add(funcionario2);
		funcionarios.add(funcionario3);
		
		Empresa empresa = new Empresa(1, "COTI Informatica", "42.142.654/0001-08", funcionarios);
		
		IEmpresaRepository empresaRepository = new EmpresaRepository();
		
		try {
			empresaRepository.exportar(empresa);
			
			System.out.println("\nDados gravados com sucesso");
		}
		catch(Exception e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
		}
		
	}

}
