class TestaIdade {
   public static void main(String[ ] args){ // Havia um " ; " ao invés de uma chave
      int idade = 20; // Tipo incompatível de dados  (string)
      System.out.println(idade);
      int idadenova;
      idadenova = idade + 1;
      System.out.println(idadenova); // Faltava " ; " e deveria ser a variável 'idadenova'
   }
}