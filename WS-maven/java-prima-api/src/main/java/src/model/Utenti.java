package src.model;

public class Utenti {
	
	private long id;
	private String nome;
	private String cognome;
	private String email;
	
	public Utenti(long id, String nome, String cognome, String email) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
