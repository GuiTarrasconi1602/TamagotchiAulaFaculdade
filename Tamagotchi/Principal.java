public class Principal{
    public static void main(String[] args){
        String nome = Teclado.leString("Digite o nome que você quer dar para o seu Tamagotchi:");
        Tamagotchi t = new Tamagotchi(nome, 0, 1, false);
        
        //Primeiro laço infinito que funciona enquanto o método getMorto for falso
        while (true){
            if(t.getMorto() == false){
                t.imprimeInformacoes();
                double aleatorio = Math.random();
                //Caso o aleatório caia no primeiro terço, o Tamagotchi sente sono!
                if(aleatorio < 0.3333333333333333){
                    t.sentiuSono();
                    /*Loop infinito que é quabrado caso seja escolhido uma das opções válidas
                    for escolhida, caso contrário imprime o erro e pede para o usuário
                    digitar novamente*/
                    while(true){
                        int op = Teclado.leInt();
                        if(op == 1){
                            t.dormir();
                            break;
                        }
                        else if(op == 2){
                            t.acordado();
                            break;
                        }
                        else{
                            System.out.println("ERRO: OPÇÃO INVÁLIDA!");
                            System.out.println("Digite uma opção válida: ");
                        }
                    }
                    }  
                //Caso o aleatório caia no segundo terço, o Tamagotchi sente fome!
                else if(aleatorio < 0.6666666666666666){
                    t.sentiuFome();
                    /*Loop infinito que é quabrado caso seja escolhido uma das opções válidas
                    for escolhida, caso contrário imprime o erro e pede para o usuário
                    digitar novamente*/
                    while(true){
                        int op = Teclado.leInt();
                        if(op == 1){
                            t.comerMuito();
                            break;
                        }
                        else if(op == 2){
                            t.comerPouco();
                            break;
                        }
                        else if(op == 3){
                            t.naoComer();
                            break;
                        }
                        else{
                            System.out.println("ERRO: OPÇÃO INVÁLIDA");
                            System.out.println("Digite uma opção válida: ");
                        }
                    }
                }
                //Caso o aleatório caia no terceiro terço, o Tamagotchi se sente entediado!                
                else{
                    t.entediado();
                    /*Loop infinito que é quabrado caso seja escolhido uma das opções válidas
                    for escolhida, caso contrário imprime o erro e pede para o usuário
                    digitar novamente*/
                        while(true){
                        int op = Teclado.leInt();
                        if(op == 1){
                            t.correr();
                            break;
                        }
                        else if(op == 2){
                            t.caminhar();
                            t.sentiuFome();
                            /*Loop infinito que é quabrado caso seja escolhido uma das opções 
                            válidas for escolhida, caso contrário imprime o erro e pede para 
                            o usuário digitar novamente*/
                            while(true){
                                int op1 = Teclado.leInt();
                                if(op1 == 1){
                                    t.comerMuito();
                                    break;
                                }
                                else if(op1 == 2){
                                    t.comerPouco();
                                    break;
                                }
                                else if(op1 == 3){
                                    t.naoComer();
                                    break;
                                }
                                else{
                                    System.out.println("OPCAO INVALIDA");
                                    System.out.println("Digite uma opção válida: ");
                                }
                            }
                            break;
                        }
                        else{
                            System.out.println("ERRO: OPÇÃO INVÁLIDA");
                            System.out.println("Digite uma opção válida: ");
                        }
                    }
                }
                }
            else
                break;
            //Avisos importantes
            t.avisoPeso();
            t.avisoIdade();
            /*Caso um dos limítes da vida sejam atingidos, imprime a causa da morte 
            e muda o método getMorto para true                                   */
            t.testaMorte();
        }
    }
}