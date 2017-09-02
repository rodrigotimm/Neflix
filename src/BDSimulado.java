import java.util.ArrayList;

public class BDSimulado {
	//Atributos
	private ArrayList<Filme>filmes; 
	private ArrayList<Usuario>usuarios;
	
	//Metodo construtor
	public BDSimulado() {
		//Instanciar o atributo filmes
		this.filmes = new ArrayList<Filme>();
		
		//Instaciar objetos da classe Filme
	    Filme f1= new Filme ("Hitch","Will Smith", 2003,"Comédia Romantica");
	    Filme f2= new Filme ("Eu Sou A Lenda","Will Smith", 2008,"Suspense");
	    Filme f3= new Filme ("Jeepers Creepers","Rodrigo Timm", 1995,"Terror");
	    Filme f4= new Filme ("Sempre Ao Seu Lado","Carlos Castro", 2013,"Drama");
	    Filme f5= new Filme ("Avatar","James Cameron", 2010,"Aventura");
	    Filme f6= new Filme ("It","Layo Mello", 1968,"Terror");
	    
	    
	    //Colocar os Filmes na Lista
	    this.filmes.add(f1);
	    this.filmes.add(f2);
	    this.filmes.add(f3);
	    this.filmes.add(f4);
	    this.filmes.add(f5);
	    this.filmes.add(f6);
	    
	    //Instaciar o atributo usuarios 
	    this.usuarios = new ArrayList<Usuario>();
	    
	    //Intanciar objeto da classe usuario
	    Usuario u1 = new Usuario ("Thiago","Masculino",23);
	    Usuario u2 = new Usuario ("Rafael","Masculino",25);
	    Usuario u3 = new Usuario ("Ricardo","Masculino",26);
	    Usuario u4 = new Usuario ("Lara","Feminino",18);
	    Usuario u5 = new Usuario ("Marta","Feminino",30);
	  	Usuario u6 = new Usuario ("Thiago","Masculino",22);
	  	
	  	//Colocar os usuarios na Lista
	  	this.usuarios.add(u2);
		this.usuarios.add(u3);
		this.usuarios.add(u4);
		this.usuarios.add(u5);
		this.usuarios.add(u6);
		
	}

	public ArrayList<Filme> getFilmes() {
		return filmes;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	//Metodo que retorna a lista de filmes de um ano informado
	public ArrayList<Filme>getFilmesPorAno(int ano){
		ArrayList<Filme>resultado = new ArrayList<Filme>();
		
		//Percorrer a lista de filmes 
		for (int i = 0; i < this.filmes.size(); i++) {
			//Verificar se o filme é do ano informado
			if (this.filmes.get(i).getAnoLancamento()==ano) {
				resultado.add(this.filmes.get(i));
				
			}
			
		}
		return resultado;
	}
      //Metodo que retorna a lista de filmes de um diretor informado
	public ArrayList<Filme>getFilmesPorDiretor(String diretor){
		ArrayList<Filme>resultado = new ArrayList<Filme>();
		
       //Percorrer a LISTA DE FILMES
		for (int i = 0; i < this.filmes.size(); i++) {
			if (this.filmes.get(i).getDiretor().equals(diretor)){
				resultado.add(this.filmes.get(i));
				
			}
			
		}
		return resultado;
	}
}
