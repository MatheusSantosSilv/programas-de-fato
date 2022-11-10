import java.util.*;

 class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner in = new Scanner(System.in);
    int min = 8, resposta;
    String senha;
    
    
    do {      
      System.out.println("Digite uma senha válida, com 8 caracteres ou mais.");
      senha = in.next();
      
      if (senha.length() < min) {
        System.out.println("A senha deve conter 8 caracteres ou mais!");
      }else {
          System.out.println("Senha válida.");
          
          do {
            System.out.println("Deseja confirmar esta senha?");
            System.out.println("1 para SIM, 2 para NÃO");
            resposta = in.nextInt();
             
             if (resposta == 2){
               System.out.println("Digite uma nova senha com 8 caracteres ou mais.");
               senha = in.next();
               do {
                 senha = in.next();
                 if (senha.length() < min){
                   System.out.println("A senha deve conter 8 caracteres ou mais");
                 }else {
                    System.out.println("Senha válida.");
                 }
               }while(senha.length()<min);
               
              }else if (resposta == 1) {
               System.out.println("Senha confirmada com sucesso!");
               
              }else if (resposta != 1 && resposta !=2){
               do{
                 System.out.println("Opção indisponível");
                 System.out.println("Deseja confirmar esta senha?");
                 System.out.println("1 para SIM, 2 para NÃO");
                 resposta = in.nextInt();
               }while (resposta != 1 && resposta !=2);
             }
          
         }while (resposta == 2 );
      }  

    }while (senha.length() < min);
    }
  }
  