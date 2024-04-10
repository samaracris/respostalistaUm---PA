public class Produto { 
	private String nome;
	private Double preço;
	private int quantidade;
	
	// Construtor com todos os parâmetros
	 public Produto(String nome, Double preço, int quantidade) {
		 this.nome = nome;
		 this.preço = preço;
		 this.quantidade = quantidade;
	 }
	 // Metodos get e set para cada atributo
	 public String getNome() {
		 return nome;
	 }
	 public void setNome(String nome) {
		 this.nome = nome;
	 }
	 public Double getPreço() {
		 return preço
	 }
	 public void setPreço(Double preço) {
		 this.preço = preço;
	 }
	 public int getQuantidade() {
		 return quantidade;
	 }
	 public void setQuantidade(int quantidade) {
		 this.quantidade = quantidade;
	 } 
	 // Metodo calcularTotal que retorna o total (preço * quantidade)
	 public double calcularTotal() {
		 return preço * quantidade;
	 }
