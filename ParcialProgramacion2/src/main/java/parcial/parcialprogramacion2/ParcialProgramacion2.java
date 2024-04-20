
package parcial.parcialprogramacion2;

import java.util.*;
public class ParcialProgramacion2 {
    private static ArrayList<Vehiculo> registro = new ArrayList<Vehiculo>();
    private static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList reg2 = new ArrayList<>();
        
        
        Vehiculo ve1 = new Vehiculo("Camión",20);
        registro.add(ve1);
        
        
        int quest=0;
        reg2.add(ve1);
        
        
        String type = "";
        int carga=0;
        int q2 = 0;
        String cond = "";
        int cc=0;
        
        
        while(quest != 6){
            int n_registro = 1;
            int a = 0;
            System.out.println("¿Qué desea realizar?");
            System.out.println("(1)Mirar_Registro (2)Registrar_Vehiculo (3)Modificar_Registro (4)Ingresar/Retirar_Paquete (5)Proceso_Paquete (6)Cerrar_Programa");
            quest = scn.nextInt();
            System.out.println("");
            switch(quest){
            case 1 -> {
                System.out.println("El registro de Vehículos es: ");
                for (Vehiculo ve: registro) {
                    System.out.println("No.Registro: "+n_registro+" Tipo:"+ve.tipo+" Capacidad:"+ve.c_carga+" Carga:"+ve.carga+" Conductor:"+ve.conductor);
                    n_registro ++;
                }   
                System.out.println("");
            }
            case 2 -> {
                System.out.println("Ingrese el tipo de Vehículo: ");
                type = scn.next();
                System.out.println("Ingrese la capacidad de carga:");
                cc =scn.nextInt();
                System.out.println("Ingrese la carga (Si no tiene agregue 0)");
                carga =scn.nextInt();
                System.out.println("¿Conductor Disponible? (1)Sí (2)No ");
                q2 = scn.nextInt();
                if(q2 == 1){
                    System.out.println("Ingrese el conductor asignado: ");
                    cond = scn.next();
                }
                else{
                    System.out.println("De acuerdo, registro agregado sin informaciòn del conductor");
                }
                Vehiculo v = new Vehiculo(type,cc,carga,cond);
                registro.add(v);
                System.out.println("De acuerdo, registro agregado");
                System.out.println("");
            }
            case 3 -> {
                System.out.println("¿Cuál No.Registro quiere modificar?");
                int n = scn.nextInt();
                for(Vehiculo ve : registro){
                    a ++;
                    if(a == n){
                        System.out.println("Vehículo: "+"No.Registro:"+n+" Tipo:"+ve.tipo+" Capacidad:"+ve.c_carga+" Carga:"+ve.carga+" Conductor:"+ve.conductor);
                        System.out.println("Nombre Conductor: ");
                        cond = scn.next();
                        ve.setConductor(cond);
                    }
                }
            }
            case 4 -> {
                System.out.println("¿Cuál No.Registro quiere ingresar/retirar?");
                int n = scn.nextInt();
                for(Vehiculo ve : registro){
                    a ++;
                    if(a == n){
                        System.out.println("Vehìculo: "+"No.Registro:"+n+" Tipo:"+ve.tipo+" Capacidad:"+ve.c_carga+" Carga:"+ve.carga+" Conductor:"+ve.conductor);
                        System.out.println("(1)Ingresar (2)Retirar");
                        q2 = scn.nextInt();
                        
                        if (q2 == 1){
                            System.out.println("¿Cuánta carga va a ingresar?");
                            int c = scn.nextInt();
                            ve.ingresarPaquete(c);
                        }else if(q2 == 2){
                            System.out.println("¿Cuánta carga va a retirar?");
                            int c = scn.nextInt();
                            ve.retirarPaquete(c);
                        }
                        System.out.println("");
                        
                    
                    }
                        
                }
                
            }
            case 5 ->{
                for(Vehiculo ve: registro){
                    if (ve.isPaquete() == true){
                        System.out.println("Vehìculo: "+"No.Registro:"+n_registro+ " Paquete entregado.");
                    }
                    else{
                        System.out.println("Vehìculo: "+"No.Registro:"+n_registro+ " Sin entregar.");
                    }
                }
                
            }
            
            }
        }
    }
}

