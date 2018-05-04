package lab2_kennethnuñez;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_KennethNuñez {
static Scanner read = new Scanner(System.in);
static ArrayList Examenes = new ArrayList();
static ArrayList Clases = new ArrayList();
static ArrayList Preguntas = new ArrayList();
static boolean start;
static ArrayList Studs = new ArrayList();
static ArrayList<ArrayList<String>> myList = new ArrayList<ArrayList<String>>();
static ArrayList<ArrayList<String>> Students = new ArrayList<ArrayList<String>>();
static boolean Login = false;
static boolean TestsMade = false; 
    public static void main(String[] args) {
       // ArrayList<ArrayList<String>> myList = new ArrayList<ArrayList<String>>();
        //ArrayList<ArrayList<String>> myList = new ArrayList<ArrayList<String>>();
        System.out.println("Bienvenido al laboratorio de Kenneth Nuñez");
        char resp = 'S';
        while(resp == 's'|| resp == 'S'){
            System.out.println("1. Administracion. ");
            System.out.println("2. Crear Cuenta. ");
            System.out.println("3. Log In. ");
            System.out.println("Ingrese su opcion: ");
            
            int option = read.nextInt();  
            switch (option){
                case 1:
                       System.out.println("");
                       char resp2 = 's';
                       while (resp2 == 'S'||resp2 == 's'){
                       System.out.println("1. Crear Examen ");
                       System.out.println("2. Revisar Examen ");
                       System.out.println("3. Ver notas. ");
                       System.out.println("4. Modificar Notas. ");
                       System.out.println("Ingrese su opcion:");
                       int option2 = read.nextInt();
                       switch (option2){
                           case 1:
                                    TestsMade = true;
                                    System.out.println("Ha seleccionado Crear Examen. ");
                                    System.out.println("Ingrese de que clase es el examen: ");
                                    String Class = read.next();
                                    if(Clases.contains(Class)){
                                        System.out.println("Ya existe un examen de ese tipo. ");
                                    } else{
                                       Clases.add(Class);
                                       String pregunta = "";
                                       String respuesta = "";
                                       char resp3 = 'S';
                                       while(resp3 =='S'||resp3 == 's'){
                                           System.out.println("Ingrese la pregunta.");
                                           read.nextLine();
                                           pregunta += read.nextLine();
                                           pregunta += " ;";
                                           System.out.println("Ingrese la respuesta. ");
                                           respuesta += read.nextLine();
                                           respuesta += "\n,";
                                           System.out.println("Desea agregar otra pregunta? [S/N]");
                                           resp3 = read.next().charAt(0);
                                       }
                                       String[] Pregunta = pregunta.split(";");
                                       String[] Respuesta = respuesta.split(",");
                                       ArrayList<String> ToExam = new ArrayList<String>();
                                       int checker = 1;
                                       int i=0;
                                       Preguntas.add(Class);
                                       for(int j = 0; j < Pregunta.length; j++){
                                           Preguntas.add(Pregunta[j]);
                                       }
                                       for(int k = 0; k < Respuesta.length; k++){
                                           ToExam.add(Pregunta[i]);
                                           
                                           ToExam.add(Respuesta[i]);
                                           i++;

                                       }
                                       myList.add(ToExam);
                                    }
                                    break;
                           case 2:  
                                    boolean start = false;
                                    if(start == true){
                                        
                                    } else{
                                        System.out.println("Ningun estudiante inicio sesion. ");
                                    }
                                    break;
                           default:
                                    System.out.println("Opcion Invalida. ");
                                    break;
                       }
                           System.out.println("Desea salir de este menu ? [S/N]");
                           resp = read.next().charAt(0);
                       }
                       break;
                case 2:
                        ArrayList info = new ArrayList();
                        info.clear();
                        System.out.println("");
                        System.out.println("Has seleccionado Crear Cuenta. ");
                        System.out.println("Ingresa el nombre de usuario");
                        String User = read.next();
                        if(Studs.contains(User)==false){
                        System.out.println("Ingrese Su numero de cuenta.");
                        String Cuenta = read.next();
                        System.out.println("Ingrese su fecha de nacimiento. ");
                        String birth = read.nextLine();
                        String old = read.nextLine();
                        String Grades = "0";
                        info.add(User);
                        info.add(Cuenta);
                        info.add(birth);
                        info.add(old);
                        info.add(Grades);
                        Students.add(info);
                        } else {
                            System.out.println("Usuario Ya existe. Ingrese otro.");
                        }
                       break;
                case 3:
                       if(Login == true){
                           System.out.println("Ya inicio sesion");
                       } else {
                       System.out.println("Ha seleccionado Log In");
                       System.out.println("Ingrese su nombre");
                       String toTest = read.next();
                       if(Studs.contains(toTest)){
                           System.out.println("Ingrese su contraseña: ");
                           String pass = read.next();
                           for(int i = 0; i < Students.size(); i++){
                              ArrayList Grabber = Students.get(i);
                              if(Grabber.contains(toTest)&&Grabber.contains(pass)){
                                  System.out.println("Ha iniciado sesion. ");
                                  Login = true;
                              }
                           }
                       }
                       if(Login == true){
                           System.out.println("");
                           System.out.println("1. Desea Ver Datos: ");
                           System.out.println("2. Modificar Datos: ");
                           System.out.println("3. Realizar Examenes: ");
                           System.out.println("4. Ver Notas: ");
                           System.out.println("Ingrese su opcion: ");
                           int option3 = read.nextInt();
                           switch(option3){
                               case 1:
                                   break;
                               case 2:
                                   break;
                               case 3:
                                   if (TestsMade == true){
                                       System.out.println("Ingrese que examen desea hacer: ");
                                       
                                   } else{
                                       System.out.println("Lo sentimos su Maestro no ha hecho ningun examen. ");
                                   }
                                   System.out.println("Elija el examen que hara: ");
                                   break;
                               case 4:
                                   break;
                               default:
                                   System.out.println(" INCORRECTO. ");
                                   break;
                           }
                       }
                       }
                       break;
                default:
                        System.out.println("Opcion Invalida. ");
                        break;
            }
            System.out.println("(S == MENU INICIAL)( N == Terminanr Programa. ) [S/N]");
            resp = read.next().charAt(0);
        }
    }
    static void Print(String[] x){
        for(int i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }
    }
    
    
    
}
