package InfoAlunos;

public class Aluno {
	public String RA;
	public String Nome;
	public int turma;

	private double NA1;
	private double NA2;
	public double NA3;
	public double NA4;
	
	public Aluno(double na1, double na2) {
		NA1 = na1;
		NA2 = na2;
	}
	
	public void Media() {
		double media = (NA1 + NA2 + NA3 + NA4) / 4;
		System.out.println("Sua média é: " + media + ".");
	}
}
