package Classes;

public class Aluno {
	
	private String nome;	
	private String situacao;
	private double media;
	private double notas;
	private double total;
				
	public Aluno(String nome, String situacao, double media, double notas, double total) {
		this.nome = nome;
		this.situacao = situacao;
		this.media = media;
		this.notas = notas;
		this.total = total;	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public double getNotas() {
		return notas;
	}

	public void setNotas(double notas) {
		this.notas = notas;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public void calculaMedia() {
		
	}
				
				
}
	

