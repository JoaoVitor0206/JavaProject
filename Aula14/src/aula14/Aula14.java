package aula14;
public class Aula14 {
    public static void main(String[] args) {
      Video v[] = new Video[3];
      v[0] = new Video("Aula Java #01");
      v[1] = new Video("Aula HTML5,CSS3");
      v[2] = new Video("Gameplay de Warzone");
      
      Aluno a[] = new Aluno[2];
      a[0] = new Aluno("Joao", 18, "M", "JV");
      a[1] = new Aluno("Maria", 20, "F", "Duda");
      
      Visualizacao vis[] = new Visualizacao[5];  
      vis[0] = new Visualizacao(a[0], v[1]);
      vis[0].avaliar();
      System.out.println(vis[0].toString());
      
      vis[1] = new Visualizacao(a[0], v[1]);
      vis[0].avaliar(87.0f);
      System.out.println(vis[1].toString());
      
      /*System.out.println("VIDEOS\n-------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nALUNOS\n---------------------");
        System.out.println(a[0].toString());
        System.out.println(a[1].toString());*/
    } 
}
