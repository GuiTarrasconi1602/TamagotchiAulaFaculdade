public class Tamagotchi{
    private String nome;
    private int idade;
    private int peso;
    private boolean morto;
    int cont = 0;

    //CONSTRUTOR:
    public Tamagotchi(String nome,int idade, int peso, boolean morto){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.morto = morto;
    }

    
    //GETTERS --> pegar/obter o valor dos atributos
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public int getPeso(){
        return peso;
    }
    public boolean getMorto(){
        return morto;
    }
    //SETTERS --> alterar o valor dos atributos
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    public void setMorto(boolean morto){
        this.morto = morto;
    }

    //VONTADES DO TAMAGOTCHI:
    //Sentiu sono:
    public void sentiuSono(){
        System.out.println("→ O(a) "+nome+" sentiu sono!"+"\n"+"Digite o número da opção que você deseja realizar:");
        System.out.println("1- Dormir"+"\n"+"2- Permanecer acordado");
    }
    //Sentiu fome:
    public void sentiuFome(){
        System.out.println("→ O(a) "+nome+" está com fome!"+"\n"+"Digite o número da opção que você deseja realizar:");
        System.out.println("1- Comer Muito"+"\n"+"2- Comer Pouco"+"\n"+"3- Não comer");
    }
    //Entediado:
    public void entediado(){
        System.out.println("→ O(a) "+nome+" ficando entediado! =("+"\n"+"Digite o número da opção que você deseja realizar:");
        System.out.println("1- Correr 10 minutos"+"\n"+"2- Andar 10 minutos");
    }
    
    //TODAS AS AÇÕES QUE O USUÁRIO PODE ESCOLHER
    //Ações relacionadas a sono:
    public void dormir(){
        idade = idade + 1;
        System.out.println("\n"+"ZZzzZZzzZZ...");
        System.out.println("● Idade + 1");
    }
    public void acordado(){
        if(cont != 4){
            cont++;
            if(cont == 1)
                System.out.println("\n"+nome+" ficou acordado "+cont+" vez!");
            else
                System.out.println("\n"+nome+" ficou acordado "+cont+" vezes!");
        }else{
            dormir();
            cont = 0;
            System.out.println("\n"+nome+" ficou acordado 5 vezes seguidas e por "+"\n"+"isso não aguentou e caiu no sono!");
            System.out.println("● Idade + 1");
        }
    }
    //Ações relacionadas a alimentação:
    public void comerPouco(){
        peso = peso + 1;
        System.out.println("\n"+nome+" comeu um sanduíche!");
        System.out.println("● Peso + 1");
        }
    public void comerMuito(){
        peso = peso + 5;
        idade = idade + 1;
        System.out.println("\n"+nome+" comeu demais e acabou dormindo!");
        System.out.println("● Idade + 1"+"\n"+"● Peso + 5");
    }
    public void naoComer(){
        peso = peso - 2;
        System.out.println("\n"+nome+": "+"'Humm queria tanto aquele sanduíche...'");
        System.out.println("● Peso -2");
    }
    //Ações relacionadas a tédio:
    public void caminhar(){
        peso = peso - 1;
        System.out.println("\n"+nome+" caminhou um pouco e emagreceu, mas sentiu fome!");
        System.out.println("● Peso -1");
        }
    public void correr(){
        peso = peso + 1;
        idade = idade +1;
        System.out.println("\n"+nome+" correu bastante e perdeu 4 kilos, mas quando"+"\n"+"voltou para casa comeu muito e caiu no sono!");
        System.out.println("● Idade + 1"+"\n"+"● Peso + 1");
    }
    
    // Retorno para o usuário:
    //Imprimir informações do tamagotchi para o usuário (método toString): 
    public String toString(){
        String retorno = "▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬"+"\n";
        retorno += "▌Informações do(a) "+nome+":▐"+"\n";
        retorno += "● Idade: "+idade+"\n";
        retorno += "● Peso: "+peso+"\n";
        retorno += "\n"+"⚠ AVISOS: ⚠"+"\n";
        retorno += avisoPeso()+"\n";
        retorno += avisoIdade()+"\n";
        retorno += "▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬";
    
        return retorno;
    }
    public void imprimeInformacoes(){
        System.out.println(toString());
        }

    //AVISOS SOBRE A SAÚDE DO TAMAGOTCHI
    //Avisos importante para usúario sobre o peso do seu tamagotchi:
    public String avisoPeso(){
        if(peso > 15 && peso < 20)
            return "● Tome cuidado, "+nome+" está com ficando obeso!"+"\n"+"(Dica: faça uma dieta ou pratique exercícios!)";
            //Aviso sobrepeso
        else if(peso <= 5)
            return "● Preste atenção, "+nome+" está com o peso muito baixo!"+"\n"+"(Alimente mais o seu Tamagotchi!)";
            //Aviso peso muito baixo
        else
            return "● O peso está saudável!";
            //Peso saudável
    }
    
    //Avisos importante para usúario sobre a idade do seu tamagotchi:
    //Mostra quais são as faixas etárias que o seu tamagotchi atingiu.
    public String avisoIdade(){
        //0-4 anos = Criança
        if(idade == 5)
            return "● Parabéns! "+nome+" superou a infância e agora é um adolescênte chato!";
        //5-7 anos = Adolescente
        else if(idade == 8)
            return "● Graças a Deus! A adolescência passou! "+nome+"agora é um adulto(a)!";
        //8-11 anos = Adulto
        else if(idade == 12)
            return "● A terceira idade chegou! "+nome+" agora é um idoso!";
        //12-15 anos = Idoso
        else
            return "";
    }

    
    //LÍMITES DA VIDA DE UM TAMAGOTCHI:
    //Testa se o tamagotchi atingiu algum dos limítes que causam sua morte:
    public void testaMorte(){
        if(peso > 20){
            //Morte por excesso de peso
            morto = true;
            System.out.println(nome+" encheu demais o bucho e explodiu!");
            System.out.println(nome+" viveu "+idade+" dias!");
            System.out.println("RIP "+nome+"!");
        }else if(peso <= 0){
            //Morte por desnutrição
            System.out.println("Você não alimentou "+nome+" por muito tempo e ele emagreceu até desaparecer!");
            System.out.println(nome+" viveu "+idade+" dias!");
            System.out.println("RIP "+nome+"!");
            morto = true;
        }
        else if(idade >= 15){
            //Morte por velhice
            System.out.println(nome+" Viveu intensamente os seus 15 dias, e morreu de velhice!");
            System.out.println("RIP "+nome+"!");
            morto = true;
        }
        else{
            morto = false;
        }
    }
}