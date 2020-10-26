package InfoAlunos;

public class Main {
public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno(9,6.7);
		aluno.NA3 = 7;
		aluno.NA4 = 8.5;
		aluno.RA= "404320";
		aluno.Nome = "Eduarda O Filadelfo";
			
		
		System.out.println("Aluno: " + aluno.Nome + ", RA do aluno é: " + aluno.RA + ".");
		
		aluno.Media();


	}

}



