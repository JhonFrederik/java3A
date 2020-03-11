package tallerpracticojuego;

import java.util.Scanner;

public class TallerPracticoJuego {
    
    public static void main(String[] args) {
       Scanner datos;
        int jugadores=0,op=0,j1=0,j2=0,j3=0,j4=0,lanzar=0,i=0,dado1=0,dado2=0;
        datos = new Scanner(System.in);  
        System.out.println("CANTIDAD DE JUGADORES: ");
        System.out.println("minimo 2");
        System.out.println("maximo 4");
        jugadores = datos.nextInt();   
        System.out.println("");
        System.out.println("SELECIONE LA DIFICULTAD:"); 
        System.out.println("nivel basico     1");
        System.out.println("nivel intermedio 2");
        System.out.println("nivel avanzado   3");
        op = datos.nextInt();       
        if(jugadores>4 || jugadores<2){
            while(jugadores!=4 && jugadores!=2 && jugadores!=3){
               System.out.println("");
               System.out.println("-------- ERROR EN LA TANTIDAD DE JUGADORES --------");
               System.out.println("");
               System.out.println("SELECIONE LA CANTIDAD DE JUGADORES: ");
               System.out.println("minimo 2");
               System.out.println("maximo 4");
               jugadores = datos.nextInt();
            }    
        }
        if(op>3 || op<1){
            while(op!=3 && op!=2 && op!=1){
               System.out.println("");
               System.out.println("----------- ERROR EN LA DIFICULTAD -------- ");
               System.out.println("");
               System.out.println("SELECIONE LA DIFICULTAD:"); 
               System.out.println("nivel basico     1");
               System.out.println("nivel intermedio 2");
               System.out.println("nivel avanzado   ]");
               op = datos.nextInt();  
            }
        }
        if (jugadores>=2 && jugadores<=4){            
            System.out.println(""); 
            System.out.println("------INICIO CARRERA NUMERICA--------");
            System.out.println("");
            //INICIO LA PRIMERA OPCION
            if (jugadores==2 && op==1){               
                System.out.println("Nivel basico");
                System.out.println("Numero de jugadores: 2");               
                while(j1!=20 && j2!=20){                    
                    if(j1<14){                        
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 1 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR LOS DADOS");
                        lanzar = datos.nextInt();                        
                        for(i=1; i<=1; i++){
                            dado1 = (int) (Math.random()*6+1);
                            j1=j1+dado1;
                            dado2 = (int) (Math.random()*6+1); 
                            j1=j1+dado2;
                        }
                        System.out.println("dado 1 salio: "+dado1);
                        System.out.println("dado 2 salio: "+dado2);                         
                        if (dado1==dado2){
                            System.out.println("--- SALIO PAR ---");
                        }    
                        System.out.println("");
                        System.out.println("el jugador 1 esta en la picion: "+j1);                        
                    }else if(j1<20 && j1>=14){                       
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 1 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR EL DADO");
                        lanzar = datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){                            
                           dado1 = (int) (Math.random()*6+1);
                           System.out.println("el numero del dado es : "+dado1);                         
                            if(j1+dado1>20){                                
                                System.out.println("no se puede avansar con: "+dado1);
                            }else{                               
                                j1=j1+dado1;
                            }  
                        }
                        System.out.println("");
                        System.out.println("el jugador 1 esta en la picion: "+j1);   
                    }
                    if(j2<14){                       
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 2 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR LOS DADOS");
                        lanzar = datos.nextInt();                        
                        for(i=1; i<=1; i++){
                            dado1 = (int) (Math.random()*6+1);
                            j2=j2+dado1;
                            dado2 = (int) (Math.random()*6+1); 
                            j2=j2+dado2;
                        }
                        System.out.println("dado 1 salio: "+dado1);
                        System.out.println("dado 2 salio: "+dado2);                        
                        if (dado1==dado2){
                            System.out.println("--- SALIO PAR ---");
                        }    
                        System.out.println("");
                        System.out.println("el jugador 2 esta en la picion: "+j2);                       
                    }else if(j2<20 && j2>=14){                       
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 2 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR EL DADO");
                        lanzar = datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){                           
                           dado1 = (int) (Math.random()*6+1);
                           System.out.println("el numero del dado es : "+dado1);                          
                            if(j2+dado1>20){                               
                                System.out.println("no se puede avansar con: "+dado1);
                            }else{                               
                                j2=j2+dado1;
                            }  
                        }
                        System.out.println("");
                        System.out.println("el jugador 2 esta en la picion: "+j2);   
                    }    
                }    
            }else if(jugadores==3 && op==1){                   
                System.out.println("Nivel basico");
                System.out.println("Numero de jugadores: 3");               
                while(j1!=20 && j2!=20 && j3!=20){                  
                    if(j1<14){                        
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 1 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR LOS DADOS");
                        lanzar = datos.nextInt();                       
                        for(i=1; i<=1; i++){
                            dado1 = (int) (Math.random()*6+1);
                            j1=j1+dado1;
                            dado2 = (int) (Math.random()*6+1); 
                            j1=j1+dado2;
                        }
                        System.out.println("dado 1 salio: "+dado1);
                        System.out.println("dado 2 salio: "+dado2);                         
                        if (dado1==dado2){
                            System.out.println("--- SALIO PAR ---");
                        }    
                        System.out.println("");
                        System.out.println("el jugador 1 esta en la picion: "+j1);                      
                    }else if(j1<20 && j1>=14){                      
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 1 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR EL DADO");
                        lanzar = datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){                           
                           dado1 = (int) (Math.random()*6+1);
                           System.out.println("el numero del dado es : "+dado1);                          
                            if(j1+dado1>20){                     
                                System.out.println("no se puede avansar con: "+dado1);
                            }else{                              
                                j1=j1+dado1;
                            }  
                        }
                        System.out.println("");
                        System.out.println("el jugador 1 esta en la picion: "+j1);   
                    }
                    if(j2<14){                       
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 2 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR LOS DADOS");
                        lanzar = datos.nextInt();                        
                        for(i=1; i<=1; i++){
                            dado1 = (int) (Math.random()*6+1);
                            j2=j2+dado1;
                            dado2 = (int) (Math.random()*6+1); 
                            j2=j2+dado2;
                        }
                        System.out.println("dado 1 salio: "+dado1);
                        System.out.println("dado 2 salio: "+dado2);                      
                        if (dado1==dado2){
                            System.out.println("--- SALIO PAR ---");
                        }    
                        System.out.println("");
                        System.out.println("el jugador 2 esta en la picion: "+j2);                     
                    }else if(j2<20 && j2>=14){                   
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 2 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR EL DADO");
                        lanzar = datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){                           
                           dado1 = (int) (Math.random()*6+1);
                           System.out.println("el numero del dado es : "+dado1);                          
                            if(j2+dado1>20){                              
                                System.out.println("no se puede avansar con: "+dado1);
                            }else{                           
                                j2=j2+dado1;
                            }  
                        }
                        System.out.println("");
                        System.out.println("el jugador 2 esta en la picion: "+j2);   
                    }
                    if(j3<14){                        
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 3 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR LOS DADOS");
                        lanzar = datos.nextInt();                        
                        for(i=1; i<=1; i++){
                            dado1 = (int) (Math.random()*6+1);
                            j3=j3+dado1;
                            dado2 = (int) (Math.random()*6+1); 
                            j3=j3+dado2;
                        }
                        System.out.println("dado 1 salio: "+dado1);
                        System.out.println("dado 2 salio: "+dado2);                         
                        if (dado1==dado2){
                            System.out.println("--- SALIO PAR ---");
                        }    
                        System.out.println("");
                        System.out.println("el jugador 3 esta en la picion: "+j3);                       
                    }else if(j3<20 && j3>=14){                       
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 3 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR EL DADO");
                        lanzar = datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){                           
                           dado1 = (int) (Math.random()*6+1);
                           System.out.println("el numero del dado es : "+dado1);                           
                            if(j3+dado1>20){                               
                                System.out.println("no se puede avansar con: "+dado1);
                            }else{                                
                                j3=j3+dado1;
                            }  
                        }
                        System.out.println("");
                        System.out.println("el jugador 3 esta en la picion: "+j3);   
                    }
                }             
            }else if(jugadores==4 && op==1){              
                System.out.println("Nivel basico");
                System.out.println("Numero de jugadores: 4");              
                while(j1!=20 && j2!=20 && j3!=20 && j4!=20){                     
                    if(j1<14){                       
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 1 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR LOS DADOS");
                        lanzar = datos.nextInt();                       
                        for(i=1; i<=1; i++){
                            dado1 = (int) (Math.random()*6+1);
                            j1=j1+dado1;
                            dado2 = (int) (Math.random()*6+1); 
                            j1=j1+dado2;
                        }
                        System.out.println("dado 1 salio: "+dado1);
                        System.out.println("dado 2 salio: "+dado2);                        
                        if (dado1==dado2){
                            System.out.println("--- SALIO PAR ---");
                        }    
                        System.out.println("");
                        System.out.println("el jugador 1 esta en la picion: "+j1);                      
                    }else if(j1<20 && j1>=14){                       
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 1 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR EL DADO");
                        lanzar = datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){                           
                           dado1 = (int) (Math.random()*6+1);
                           System.out.println("el numero del dado es : "+dado1);                           
                            if(j1+dado1>20){                                
                                System.out.println("no se puede avansar con: "+dado1);
                            }else{                               
                                j1=j1+dado1;
                            }  
                        }
                        System.out.println("");
                        System.out.println("el jugador 1 esta en la picion: "+j1);   
                    }
                    if(j2<14){                       
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 2 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR LOS DADOS");
                        lanzar = datos.nextInt();                       
                        for(i=1; i<=1; i++){
                            dado1 = (int) (Math.random()*6+1);
                            j2=j2+dado1;
                            dado2 = (int) (Math.random()*6+1); 
                            j2=j2+dado2;
                        }
                        System.out.println("dado 1 salio: "+dado1);
                        System.out.println("dado 2 salio: "+dado2);                         
                        if (dado1==dado2){
                            System.out.println("--- SALIO PAR ---");
                        }    
                        System.out.println("");
                        System.out.println("el jugador 2 esta en la picion: "+j2);                       
                    }else if(j2<20 && j2>=14){                        
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 2 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR EL DADO");
                        lanzar = datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){                            
                           dado1 = (int) (Math.random()*6+1);
                           System.out.println("el numero del dado es : "+dado1);                          
                            if(j2+dado1>20){                               
                                System.out.println("no se puede avansar con: "+dado1);
                            }else{                               
                                j2=j2+dado1;
                            }  
                        }
                        System.out.println("");
                        System.out.println("el jugador 2 esta en la picion: "+j2);   
                    }
                    if(j3<14){                        
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 3 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR LOS DADOS");
                        lanzar = datos.nextInt();                       
                        for(i=1; i<=1; i++){
                            dado1 = (int) (Math.random()*6+1);
                            j3=j3+dado1;
                            dado2 = (int) (Math.random()*6+1); 
                            j3=j3+dado2;
                        }
                        System.out.println("dado 1 salio: "+dado1);
                        System.out.println("dado 2 salio: "+dado2);                        
                        if (dado1==dado2){
                            System.out.println("--- SALIO PAR ---");
                        }    
                        System.out.println("");
                        System.out.println("el jugador 3 esta en la picion: "+j3);                       
                    }else if(j3<20 && j3>=14){                      
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 3 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR EL DADO");
                        lanzar = datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){                          
                           dado1 = (int) (Math.random()*6+1);
                           System.out.println("el numero del dado es : "+dado1);                          
                            if(j3+dado1>20){                               
                                System.out.println("no se puede avansar con: "+dado1);
                            }else{                               
                                j3=j3+dado1;
                            }  
                        }
                        System.out.println("");
                        System.out.println("el jugador 3 esta en la picion: "+j3);   
                    }
                    if(j4<14){                        
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 4 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR LOS DADOS");
                        lanzar = datos.nextInt();                        
                        for(i=1; i<=1; i++){
                            dado1 = (int) (Math.random()*6+1);
                            j4=j4+dado1;
                            dado2 = (int) (Math.random()*6+1); 
                            j4=j4+dado2;
                        }
                        System.out.println("dado 1 salio: "+dado1);
                        System.out.println("dado 2 salio: "+dado2);                         
                        if (dado1==dado2){
                            System.out.println("--- SALIO PAR ---");
                        }    
                        System.out.println("");
                        System.out.println("el jugador 4 esta en la picion: "+j4);                       
                    }else if(j4<20 && j4>=14){                      
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 4 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR EL DADO");
                        lanzar = datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){                           
                           dado1 = (int) (Math.random()*6+1);
                           System.out.println("el numero del dado es : "+dado1);                          
                            if(j4+dado1>20){                                
                                System.out.println("no se puede avansar con: "+dado1);
                            }else{                               
                                j4=j4+dado1;
                            }  
                        }
                        System.out.println("");
                        System.out.println("el jugador 4 esta en la picion: "+j4);   
                    }
                }
            }else if(jugadores==2 && op==2){                
                System.out.println("Nivel intermedio");
                System.out.println("Numero de jugadores: 2");                
                while(j1!=30 && j2!=30){                    
                    if(j1<24){                       
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 1 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR LOS DADOS");
                        lanzar = datos.nextInt();                        
                        for(i=1; i<=1; i++){
                            dado1 = (int) (Math.random()*6+1);
                            j1=j1+dado1;
                            dado2 = (int) (Math.random()*6+1); 
                            j1=j1+dado2;
                        }
                        System.out.println("dado 1 salio: "+dado1);
                        System.out.println("dado 2 salio: "+dado2);                         
                        if (dado1==dado2){
                            System.out.println("--- SALIO PAR ---");
                        }    
                        System.out.println("");
                        System.out.println("el jugador 1 esta en la picion: "+j1);                       
                    }else if(j1<30 && j1>=24){                       
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 1 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR EL DADO");
                        lanzar = datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){                           
                           dado1 = (int) (Math.random()*6+1);
                           System.out.println("el numero del dado es : "+dado1);                           
                            if(j1+dado1>30){                                
                                System.out.println("no se puede avansar con: "+dado1);
                            }else{                                
                                j1=j1+dado1;
                            }  
                        }
                        System.out.println("");
                        System.out.println("el jugador 1 esta en la picion: "+j1);   
                    }
                    if(j2<24){                       
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 2 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR LOS DADOS");
                        lanzar = datos.nextInt();                        
                        for(i=1; i<=1; i++){
                            dado1 = (int) (Math.random()*6+1);
                            j2=j2+dado1;
                            dado2 = (int) (Math.random()*6+1); 
                            j2=j2+dado2;
                        }
                        System.out.println("dado 1 salio: "+dado1);
                        System.out.println("dado 2 salio: "+dado2);                         
                        if (dado1==dado2){
                            System.out.println("--- SALIO PAR ---");
                        }    
                        System.out.println("");
                        System.out.println("el jugador 2 esta en la picion: "+j2);                        
                    }else if(j2<30 && j2>=24){                        
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 2 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR EL DADO");
                        lanzar = datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){                           
                           dado1 = (int) (Math.random()*6+1);
                           System.out.println("el numero del dado es : "+dado1);                           
                            if(j2+dado1>30){                                
                                System.out.println("no se puede avansar con: "+dado1);
                            }else{                               
                                j2=j2+dado1;
                            }  
                        }
                        System.out.println("");
                        System.out.println("el jugador 2 esta en la picion: "+j2);   
                    }    
                }     
            }else if(jugadores==3 && op==2){              
                System.out.println("Nivel intermedio");
                System.out.println("Numero de jugadores: 3");              
                while(j1!=30 && j2!=30 && j3!=30){ 
                    if(j1<24){                       
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 1 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR LOS DADOS");
                        lanzar = datos.nextInt();                        
                        for(i=1; i<=1; i++){
                            dado1 = (int) (Math.random()*6+1);
                            j1=j1+dado1;
                            dado2 = (int) (Math.random()*6+1); 
                            j1=j1+dado2;
                        }
                        System.out.println("dado 1 salio: "+dado1);
                        System.out.println("dado 2 salio: "+dado2);                        
                        if (dado1==dado2){
                            System.out.println("--- SALIO PAR ---");
                        }    
                        System.out.println("");
                        System.out.println("el jugador 1 esta en la picion: "+j1);                      
                    }else if(j1<30 && j1>=24){                       
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 1 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR EL DADO");
                        lanzar = datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){                           
                           dado1 = (int) (Math.random()*6+1);
                           System.out.println("el numero del dado es : "+dado1);                          
                            if(j1+dado1>30){                                
                                System.out.println("no se puede avansar con: "+dado1);
                            }else{
                                
                                j1=j1+dado1;
                            }  
                        }
                        System.out.println("");
                        System.out.println("el jugador 1 esta en la picion: "+j1);   
                    }
                    if(j2<24){                       
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 2 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR LOS DADOS");
                        lanzar = datos.nextInt();                       
                        for(i=1; i<=1; i++){
                            dado1 = (int) (Math.random()*6+1);
                            j2=j2+dado1;
                            dado2 = (int) (Math.random()*6+1); 
                            j2=j2+dado2;
                        }
                        System.out.println("dado 1 salio: "+dado1);
                        System.out.println("dado 2 salio: "+dado2);                         
                        if (dado1==dado2){
                            System.out.println("--- SALIO PAR ---");
                        }    
                        System.out.println("");
                        System.out.println("el jugador 2 esta en la picion: "+j2);                       
                    }else if(j2<30 && j2>=24){                        
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 2 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR EL DADO");
                        lanzar = datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){                            
                           dado1 = (int) (Math.random()*6+1);
                           System.out.println("el numero del dado es : "+dado1);                          
                            if(j2+dado1>30){                               
                                System.out.println("no se puede avansar con: "+dado1);
                            }else{                                
                                j2=j2+dado1;
                            }  
                        }
                        System.out.println("");
                        System.out.println("el jugador 2 esta en la picion: "+j2);   
                    }
                    if(j3<24){                        
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 3 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR LOS DADOS");
                        lanzar = datos.nextInt();                        
                        for(i=1; i<=1; i++){
                            dado1 = (int) (Math.random()*6+1);
                            j3=j3+dado1;
                            dado2 = (int) (Math.random()*6+1); 
                            j3=j3+dado2;
                        }
                        System.out.println("dado 1 salio: "+dado1);
                        System.out.println("dado 2 salio: "+dado2);                        
                        if (dado1==dado2){
                            System.out.println("--- SALIO PAR ---");
                        }    
                        System.out.println("");
                        System.out.println("el jugador 3 esta en la picion: "+j3);                       
                    }else if(j3<30 && j3>=24){                        
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 3 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR EL DADO");
                        lanzar = datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){                            
                           dado1 = (int) (Math.random()*6+1);
                           System.out.println("el numero del dado es : "+dado1);                          
                            if(j3+dado1>30){                               
                                System.out.println("no se puede avansar con: "+dado1);
                            }else{                                
                                j3=j3+dado1;
                            }  
                        }
                        System.out.println("");
                        System.out.println("el jugador 3 esta en la picion: "+j3);   
                    }
                }    
            }else if(jugadores==4 && op==2){               
                System.out.println("Nivel intermedio");
                System.out.println("Numero de jugadores: 4");                
                while(j1!=30 && j2!=30 && j3!=30 && j4!=30){                     
                    if(j1<24){                       
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 1 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR LOS DADOS");
                        lanzar = datos.nextInt();                       
                        for(i=1; i<=1; i++){
                            dado1 = (int) (Math.random()*6+1);
                            j1=j1+dado1;
                            dado2 = (int) (Math.random()*6+1); 
                            j1=j1+dado2;
                        }
                        System.out.println("dado 1 salio: "+dado1);
                        System.out.println("dado 2 salio: "+dado2);                         
                        if (dado1==dado2){
                            System.out.println("--- SALIO PAR ---");
                        }    
                        System.out.println("");
                        System.out.println("el jugador 1 esta en la picion: "+j1);                        
                    }else if(j1<30 && j1>=24){                       
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 1 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR EL DADO");
                        lanzar = datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){                           
                           dado1 = (int) (Math.random()*6+1);
                           System.out.println("el numero del dado es : "+dado1);                           
                            if(j1+dado1>30){                                
                                System.out.println("no se puede avansar con: "+dado1);
                            }else{                                
                                j1=j1+dado1;
                            }  
                        }
                        System.out.println("");
                        System.out.println("el jugador 1 esta en la picion: "+j1);   
                    }
                    if(j2<24){                        
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 2 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR LOS DADOS");
                        lanzar = datos.nextInt();                        
                        for(i=1; i<=1; i++){
                            dado1 = (int) (Math.random()*6+1);
                            j2=j2+dado1;
                            dado2 = (int) (Math.random()*6+1); 
                            j2=j2+dado2;
                        }
                        System.out.println("dado 1 salio: "+dado1);
                        System.out.println("dado 2 salio: "+dado2);                         
                        if (dado1==dado2){
                            System.out.println("--- SALIO PAR ---");
                        }    
                        System.out.println("");
                        System.out.println("el jugador 2 esta en la picion: "+j2);                        
                    }else if(j2<30 && j2>=24){                        
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 2 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR EL DADO");
                        lanzar = datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){                           
                           dado1 = (int) (Math.random()*6+1);
                           System.out.println("el numero del dado es : "+dado1);                           
                            if(j2+dado1>30){                                
                                System.out.println("no se puede avansar con: "+dado1);
                            }else{                               
                                j2=j2+dado1;
                            }  
                        }
                        System.out.println("");
                        System.out.println("el jugador 2 esta en la picion: "+j2);   
                    }
                    if(j3<24){                        
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 3 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR LOS DADOS");
                        lanzar = datos.nextInt();                        
                        for(i=1; i<=1; i++){
                            dado1 = (int) (Math.random()*6+1);
                            j3=j3+dado1;
                            dado2 = (int) (Math.random()*6+1); 
                            j3=j3+dado2;
                        }
                        System.out.println("dado 1 salio: "+dado1);
                        System.out.println("dado 2 salio: "+dado2);                         
                        if (dado1==dado2){
                            System.out.println("--- SALIO PAR ---");
                        }    
                        System.out.println("");
                        System.out.println("el jugador 3 esta en la picion: "+j3);                        
                    }else if(j3<30 && j3>=24){                        
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 3 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR EL DADO");
                        lanzar = datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){                            
                           dado1 = (int) (Math.random()*6+1);
                           System.out.println("el numero del dado es : "+dado1);                           
                            if(j3+dado1>30){                                
                                System.out.println("no se puede avansar con: "+dado1);
                            }else{                                
                                j3=j3+dado1;
                            }  
                        }
                        System.out.println("");
                        System.out.println("el jugador 3 esta en la picion: "+j3);   
                    }
                    if(j4<24){                        
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 4 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR LOS DADOS");
                        lanzar = datos.nextInt();                   
                        for(i=1; i<=1; i++){
                            dado1 = (int) (Math.random()*6+1);
                            j4=j4+dado1;
                            dado2 = (int) (Math.random()*6+1); 
                            j4=j4+dado2;
                        }
                        System.out.println("dado 1 salio: "+dado1);
                        System.out.println("dado 2 salio: "+dado2);                         
                        if (dado1==dado2){
                            System.out.println("--- SALIO PAR ---");
                        }    
                        System.out.println("");
                        System.out.println("el jugador 4 esta en la picion: "+j4);                        
                    }else if(j4<30 && j4>=24){                        
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 4 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR EL DADO");
                        lanzar = datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){                            
                           dado1 = (int) (Math.random()*6+1);
                           System.out.println("el numero del dado es : "+dado1);                           
                            if(j4+dado1>30){                                
                                System.out.println("no se puede avansar con: "+dado1);
                            }else{                                
                                j4=j4+dado1;
                            }  
                        }
                        System.out.println("");
                        System.out.println("el jugador 4 esta en la picion: "+j4);   
                    }
                }     
            }else if(jugadores==2 && op==3){                
                System.out.println("Nivel avanzado");
                System.out.println("Numero de jugadores: 2");                
                while(j1!=50 && j2!=50){                   
                    if(j1<44){                      
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 1 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR LOS DADOS");
                        lanzar = datos.nextInt();                       
                        for(i=1; i<=1; i++){
                            dado1 = (int) (Math.random()*6+1);
                            j1=j1+dado1;
                            dado2 = (int) (Math.random()*6+1); 
                            j1=j1+dado2;
                        }
                        System.out.println("dado 1 salio: "+dado1);
                        System.out.println("dado 2 salio: "+dado2);                        
                        if (dado1==dado2){
                            System.out.println("--- SALIO PAR ---");
                        }    
                        System.out.println("");
                        System.out.println("el jugador 1 esta en la picion: "+j1);                        
                    }else if(j1<50 && j1>=44){                        
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 1 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR EL DADO");
                        lanzar = datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){                           
                           dado1 = (int) (Math.random()*6+1);
                           System.out.println("el numero del dado es : "+dado1);                         
                            if(j1+dado1>50){                                
                                System.out.println("no se puede avansar con: "+dado1);
                            }else{                                
                                j1=j1+dado1;
                            }  
                        }
                        System.out.println("");
                        System.out.println("el jugador 1 esta en la picion: "+j1);   
                    }
                    if(j2<44){                       
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 2 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR LOS DADOS");
                        lanzar = datos.nextInt();                       
                        for(i=1; i<=1; i++){
                            dado1 = (int) (Math.random()*6+1);
                            j2=j2+dado1;
                            dado2 = (int) (Math.random()*6+1); 
                            j2=j2+dado2;
                        }
                        System.out.println("dado 1 salio: "+dado1);
                        System.out.println("dado 2 salio: "+dado2);                        
                        if (dado1==dado2){
                            System.out.println("--- SALIO PAR ---");
                        }    
                        System.out.println("");
                        System.out.println("el jugador 2 esta en la picion: "+j2);                      
                    }else if(j2<50 && j2>=44){                        
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 2 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR EL DADO");
                        lanzar = datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){                          
                           dado1 = (int) (Math.random()*6+1);
                           System.out.println("el numero del dado es : "+dado1);                           
                            if(j2+dado1>50){                                
                                System.out.println("no se puede avansar con: "+dado1);
                            }else{                               
                                j2=j2+dado1;
                            }  
                        }
                        System.out.println("");
                        System.out.println("el jugador 2 esta en la picion: "+j2);   
                    }    
                }       
            }else if(jugadores==3 && op==3){               
                System.out.println("Nivel avanzado");
                System.out.println("Numero de jugadores: 3");               
                while(j1!=50 && j2!=50 && j3!=50){  
                    if(j1<44){                       
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 1 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR LOS DADOS");
                        lanzar = datos.nextInt();                       
                        for(i=1; i<=1; i++){
                            dado1 = (int) (Math.random()*6+1);
                            j1=j1+dado1;
                            dado2 = (int) (Math.random()*6+1); 
                            j1=j1+dado2;
                        }
                        System.out.println("dado 1 salio: "+dado1);
                        System.out.println("dado 2 salio: "+dado2);                       
                        if (dado1==dado2){
                            System.out.println("--- SALIO PAR ---");
                        }    
                        System.out.println("");
                        System.out.println("el jugador 1 esta en la picion: "+j1);                       
                    }else if(j1<50 && j1>=44){                       
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 1 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR EL DADO");
                        lanzar = datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){                           
                           dado1 = (int) (Math.random()*6+1);
                           System.out.println("el numero del dado es : "+dado1);                         
                            if(j1+dado1>50){                                
                                System.out.println("no se puede avansar con: "+dado1);
                            }else{                               
                                j1=j1+dado1;
                            }  
                        }
                        System.out.println("");
                        System.out.println("el jugador 1 esta en la picion: "+j1);   
                    }
                    if(j2<44){                       
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 2 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR LOS DADOS");
                        lanzar = datos.nextInt();                       
                        for(i=1; i<=1; i++){
                            dado1 = (int) (Math.random()*6+1);
                            j2=j2+dado1;
                            dado2 = (int) (Math.random()*6+1); 
                            j2=j2+dado2;
                        }
                        System.out.println("dado 1 salio: "+dado1);
                        System.out.println("dado 2 salio: "+dado2);                        
                        if (dado1==dado2){
                            System.out.println("--- SALIO PAR ---");
                        }    
                        System.out.println("");
                        System.out.println("el jugador 2 esta en la picion: "+j2);                      
                    }else if(j2<50 && j2>=44){                       
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 2 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR EL DADO");
                        lanzar = datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){                           
                           dado1 = (int) (Math.random()*6+1);
                           System.out.println("el numero del dado es : "+dado1);                         
                            if(j2+dado1>50){                                
                                System.out.println("no se puede avansar con: "+dado1);
                            }else{                                
                                j2=j2+dado1;
                            }  
                        }
                        System.out.println("");
                        System.out.println("el jugador 2 esta en la picion: "+j2);   
                    }
                    if(j3<44){                        
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 3 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR LOS DADOS");
                        lanzar = datos.nextInt();                       
                        for(i=1; i<=1; i++){
                            dado1 = (int) (Math.random()*6+1);
                            j3=j3+dado1;
                            dado2 = (int) (Math.random()*6+1); 
                            j3=j3+dado2;
                        }
                        System.out.println("dado 1 salio: "+dado1);
                        System.out.println("dado 2 salio: "+dado2);                        
                        if (dado1==dado2){
                            System.out.println("--- SALIO PAR ---");
                        }    
                        System.out.println("");
                        System.out.println("el jugador 3 esta en la picion: "+j3);                       
                    }else if(j3<50 && j3>=44){                       
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 3 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR EL DADO");
                        lanzar = datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){                            
                           dado1 = (int) (Math.random()*6+1);
                           System.out.println("el numero del dado es : "+dado1);                           
                            if(j3+dado1>50){                               
                                System.out.println("no se puede avansar con: "+dado1);
                            }else{                                
                                j3=j3+dado1;
                            }  
                        }
                        System.out.println("");
                        System.out.println("el jugador 3 esta en la picion: "+j3);   
                    }
                }              
            }else if(jugadores==4 && op==3){               
                System.out.println("Nivel avanzado");
                System.out.println("Numero de jugadores: 4");               
                while(j1!=50 && j2!=50 && j3!=50 && j4!=50){                     
                    if(j1<44){                       
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 1 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR LOS DADOS");
                        lanzar = datos.nextInt();                        
                        for(i=1; i<=1; i++){
                            dado1 = (int) (Math.random()*6+1);
                            j1=j1+dado1;
                            dado2 = (int) (Math.random()*6+1); 
                            j1=j1+dado2;
                        }
                        System.out.println("dado 1 salio: "+dado1);
                        System.out.println("dado 2 salio: "+dado2);                        
                        if (dado1==dado2){
                            System.out.println("--- SALIO PAR ---");
                        }    
                        System.out.println("");
                        System.out.println("el jugador 1 esta en la picion: "+j1);                       
                    }else if(j1<50 && j1>=44){                        
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 1 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR EL DADO");
                        lanzar = datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){                           
                           dado1 = (int) (Math.random()*6+1);
                           System.out.println("el numero del dado es : "+dado1);                       
                            if(j1+dado1>50){                                
                                System.out.println("no se puede avansar con: "+dado1);
                            }else{                               
                                j1=j1+dado1;
                            }  
                        }
                        System.out.println("");
                        System.out.println("el jugador 1 esta en la picion: "+j1);   
                    }
                    if(j2<44){                        
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 2 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR LOS DADOS");
                        lanzar = datos.nextInt();                      
                        for(i=1; i<=1; i++){
                            dado1 = (int) (Math.random()*6+1);
                            j2=j2+dado1;
                            dado2 = (int) (Math.random()*6+1); 
                            j2=j2+dado2;
                        }
                        System.out.println("dado 1 salio: "+dado1);
                        System.out.println("dado 2 salio: "+dado2);                        
                        if (dado1==dado2){
                            System.out.println("--- SALIO PAR ---");
                        }    
                        System.out.println("");
                        System.out.println("el jugador 2 esta en la picion: "+j2);                      
                    }else if(j2<50 && j2>=44){                      
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 2 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR EL DADO");
                        lanzar = datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){                           
                           dado1 = (int) (Math.random()*6+1);
                           System.out.println("el numero del dado es : "+dado1);                           
                            if(j2+dado1>50){                               
                                System.out.println("no se puede avansar con: "+dado1);
                            }else{                               
                                j2=j2+dado1;
                            }  
                        }
                        System.out.println("");
                        System.out.println("el jugador 2 esta en la picion: "+j2);   
                    }
                    if(j3<44){                        
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 3 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR LOS DADOS");
                        lanzar = datos.nextInt();                        
                        for(i=1; i<=1; i++){
                            dado1 = (int) (Math.random()*6+1);
                            j3=j3+dado1;
                            dado2 = (int) (Math.random()*6+1); 
                            j3=j3+dado2;
                        }
                        System.out.println("dado 1 salio: "+dado1);
                        System.out.println("dado 2 salio: "+dado2);                        
                        if (dado1==dado2){
                            System.out.println("--- SALIO PAR ---");
                        }    
                        System.out.println("");
                        System.out.println("el jugador 3 esta en la picion: "+j3);                       
                    }else if(j3<50 && j3>=44){                       
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 3 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR EL DADO");
                        lanzar = datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){                           
                           dado1 = (int) (Math.random()*6+1);
                           System.out.println("el numero del dado es : "+dado1);                           
                            if(j3+dado1>50){                               
                                System.out.println("no se puede avansar con: "+dado1);
                            }else{   
                                j3=j3+dado1;
                            }  
                        }
                        System.out.println("");
                        System.out.println("el jugador 3 esta en la picion: "+j3);   
                    }
                    if(j4<44){                       
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 4 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR LOS DADOS");
                        lanzar = datos.nextInt();                       
                        for(i=1; i<=1; i++){
                            dado1 = (int) (Math.random()*6+1);
                            j4=j4+dado1;
                            dado2 = (int) (Math.random()*6+1); 
                            j4=j4+dado2;
                        }
                        System.out.println("dado 1 salio: "+dado1);
                        System.out.println("dado 2 salio: "+dado2);                         
                        if (dado1==dado2){
                            System.out.println("--- SALIO PAR ---");
                        }    
                        System.out.println("");
                        System.out.println("el jugador 4 esta en la picion: "+j4);  
                    }else if(j4<50 && j4>=44){  
                        System.out.println("");
                        System.out.println("---------------- JUGADOR 4 ---------------");
                        System.out.println(""); 
                        System.out.println("PRESIONE 1 PARA LANZAR EL DADO");
                        lanzar = datos.nextInt();
                        System.out.println(""); 
                        for(i=1; i<=1; i++){   
                           dado1 = (int) (Math.random()*6+1);
                           System.out.println("el numero del dado es : "+dado1);
                           
                            if(j4+dado1>50){
                                
                                System.out.println("no se puede avansar con: "+dado1);
                            }else{
                                
                                j4=j4+dado1;
                            }  
                        }
                        System.out.println("");
                        System.out.println("el jugador 4 esta en la picion: "+j4);   
                    }
                } 
            }       
        }
        if (j1==20 || j1==30 || j1==50){
            System.out.println("");
            System.out.println("EL JUGADOR 1 GANO EL JUEGO");
            System.out.println("");
					
        }else if(j2==20 || j2==30 || j2==50){
            System.out.println("");   
            System.out.println("EL JUGADOR 2 GANO EL JUEGO");
            System.out.println("");
        }else if(j3==20 || j3==30 || j3==50){
            System.out.println("");
            System.out.println("EL JUGADOR 3 GANO EL JUEGO");
            System.out.println("");
        }else if(j4==20 || j4==30 || j4==50){
            System.out.println("");
            System.out.println("EL JUGADOR 4 GANO EL JUEGO");
            System.out.println("");
        }
    }
}
  
