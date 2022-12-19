import java.io.IOException;
import java.nio.file.Paths;


import com.mdsol.skyfire.CucumberTestGenerator;
import com.mdsol.skyfire.TestCoverageCriteria;

public class Main {

	public static void main(String[] args) {

	// String path = "./use/instatus/instatusV1.uml";
	String path = "./use/instatus/instatusV2.uml";
		
	try {
			CucumberTestGenerator.generateCucumberScenario (
					Paths.get (path),
					TestCoverageCriteria.NODECOVERAGE,
					"Instatus",
					Paths.get ("InstatusNodeV2.feature"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
			CucumberTestGenerator.generateCucumberScenario (
					Paths.get (path),
					TestCoverageCriteria.EDGECOVERAGE,
					"Instatus",
					Paths.get ("InstatusEdgeV2.feature"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
			CucumberTestGenerator.generateCucumberScenario (
					Paths.get (path),
					TestCoverageCriteria.EDGEPAIRCOVERAGE,
					"Instatus",
					Paths.get ("InstatusEdgePairV2.feature"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
			CucumberTestGenerator.generateCucumberScenario (
					Paths.get (path),
					TestCoverageCriteria.PRIMEPATHCOVERAGE,
					"Instatus",
					Paths.get ("InstatusPrimePathV2.feature"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
	/***
	// Criação do UML: Teste do caso de uso
		//RESTRIÇÕES DO USO DO UML:
		 *	1. Deve conter APENAS UMA ÚNICA maquina de estados (e um profile UML)
		 *  2. Funciona apenas para UML 4.0.0 (depreciado, deve ser configurado manualmente editando o .uml)
		 *  3. Máquina de estados deve conter estado inicial, transições e um estado terminal
		 *  4. Não aceita condições de guarda
		 */
			}

}
