package repositories;

import java.io.FileWriter;

import entities.Empresa;
import entities.Funcionario;
import interfaces.IEmpresaRepository;

public class EmpresaRepository implements IEmpresaRepository {

	@Override
	public void exportar(Empresa empresa) throws Exception {
		// TODO Auto-generated method stub
		
		FileWriter filewriter = new FileWriter("c:\\temp\\empresas.txt", true);
		
		filewriter.write("\nId da Empresa....: " + empresa.getIdEmpresa());
		filewriter.write("\nRazão Social....: " + empresa.getRazaoSocial());
		filewriter.write("\nCNPJ.....: " + empresa.getCnpj());
		
		filewriter.write("\n");
		
		for(Funcionario funcionario: empresa.getFuncionarios()) {
			
			filewriter.write("\n\tId do funcionario....: " + funcionario.getIdFuncionario());
			filewriter.write("\n\tNome....: " + funcionario.getNome());
			filewriter.write("\n\tCPF....: " + funcionario.getCpf());
			
		
		}
		
		filewriter.write("\n");
		
		filewriter.flush();
		filewriter.close();
		
		
	}
	
	

}
