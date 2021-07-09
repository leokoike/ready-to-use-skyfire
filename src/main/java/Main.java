import java.io.IOException;
import java.nio.file.Paths;


import com.mdsol.skyfire.CucumberTestGenerator;
import com.mdsol.skyfire.TestCoverageCriteria;

public class Main {

	public static void main(String[] args) {

	String path = "./use/dataTypes/DataTypes.uml";
		
	try {
			CucumberTestGenerator.generateCucumberScenario (
					Paths.get (path),
					TestCoverageCriteria.NODECOVERAGE,
					"Elevator",
					Paths.get ("ElevatorNode.feature"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
			CucumberTestGenerator.generateCucumberScenario (
					Paths.get (path),
					TestCoverageCriteria.EDGECOVERAGE,
					"Elevator",
					Paths.get ("ElevatorEdge.feature"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
			CucumberTestGenerator.generateCucumberScenario (
					Paths.get (path),
					TestCoverageCriteria.EDGEPAIRCOVERAGE,
					"Elevator",
					Paths.get ("ElevatorEdgePair.feature"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
			CucumberTestGenerator.generateCucumberScenario (
					Paths.get (path),
					TestCoverageCriteria.PRIMEPATHCOVERAGE,
					"Elevator",
					Paths.get ("ElevatorPrimePath.feature"));
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
