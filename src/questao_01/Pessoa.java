package questao_01;

import java.util.Calendar;
import java.util.Date;

public class Pessoa {

	private String nome;
	private Date dataNascimento;
	private double altura;

	public Pessoa() {
	}

	public Pessoa(String nome, Date dataNascimento, double altura) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dataNascimento=" + dataNascimento + ", altura=" + altura + "]";
	}

	public int calcularIdade() {

		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(getDataNascimento());
		Calendar diaAtual = Calendar.getInstance();

		int idade = diaAtual.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);

		return idade;
	}

}
