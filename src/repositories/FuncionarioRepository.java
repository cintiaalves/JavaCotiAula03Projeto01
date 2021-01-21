package repositories;

import java.io.FileWriter;

import entities.Funcionario;
import interfaces.IFuncionarioRepository;

public class FuncionarioRepository implements IFuncionarioRepository {

	@Override
	public void exportar(Funcionario funcionario) throws Exception {
		// TODO Auto-generated method stub
		
		FileWriter filewriter = new FileWriter("c:\\temp\\funcionarios.txt", true);
		
		filewriter.write("\nId do funcionário..: " + funcionario.getIdFuncionario());
		filewriter.write("\nNome.....: " + funcionario.getNome());
		filewriter.write("\nCPF...: " + funcionario.getCpf());
		filewriter.write("\n");
		
		filewriter.flush();
		filewriter.close();
		
		
	}

	
	
}
