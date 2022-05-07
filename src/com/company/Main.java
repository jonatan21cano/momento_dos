package com.company;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Admin> adminAL = new ArrayList<Admin>();
        List<Accountant> AccountantAL= new ArrayList<>();
        List<Watchman> WatchmanAL = new ArrayList ();
        List<CleaningStaff> CleaningStaffAL = new ArrayList();

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while(!salir){

            System.out.println("1. agregar admin");
            System.out.println("2. agregar CleaningStaff");
            System.out.println("3. agregar Accountant");
            System.out.println("4. Agregar Watchman");
            System.out.println("5. ver admin");
            System.out.println("6. ver CleaningStaff");
            System.out.println("7. ver Accountant");
            System.out.println("8. ver Watchman");
            System.out.println("9. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("ingresa el nomrbe");
                    String name = sn.nextLine();
                    System.out.println("ingresa la identificacion");
                    String id = sn.nextLine();
                    System.out.println("ingresa la edad");
                    int age =sn.nextInt();
                    System.out.println("ingresa el leader");
                    String leader = sn.nextLine();
                    System.out.println("ingresa el parking");
                    String parking = sn.nextLine();

                    Admin admin= new Admin(name, id, age, leader, parking);
                    adminAL.add(admin);
                    break;
                case 2:
                    System.out.println("ingresa el nomrbe");
                    name = sn.nextLine();
                    System.out.println("ingresa la identificacion");
                    id = sn.nextLine();
                    System.out.println("ingresa la edad");
                    age =sn.nextInt();
                    System.out.println("ingresa el dayoff");
                    String dayOff = sn.nextLine();
                    CleaningStaff cs= new CleaningStaff(name, id, age, dayOff);
                    CleaningStaffAL.add(cs);
                    break;
                case 3:
                    System.out.println("ingresa el nomrbe");
                    name = sn.nextLine();
                    System.out.println("ingresa la identificacion");
                    id = sn.nextLine();
                    System.out.println("ingresa la edad");
                    age =sn.nextInt();
                    System.out.println("ingresa el leader");
                    leader = sn.nextLine();
                    System.out.println("ingresa el parking");
                    parking = sn.nextLine();

                    Accountant ac = new Accountant(name, id, age, leader, parking);
                    AccountantAL.add(ac);
                    break;
                case 4:
                    System.out.println("ingresa el nomrbe");
                    name = sn.nextLine();
                    System.out.println("ingresa la identificacion");
                    id = sn.nextLine();
                    System.out.println("ingresa la edad");
                    age =sn.nextInt();
                    System.out.println("ingresa el weapon");
                    String weapon = sn.nextLine();
                    System.out.println("ingresa el workday");
                    String workday = sn.nextLine();
                    Watchman wm = new Watchman(name, id, age, weapon, workday);
                    WatchmanAL.add(wm);
                    break;
                case 5:
                    for(Admin p in adminAL) {
                    int i=1;
                    System.out.println("admin #" + i);
                    System.out.println(p.getName());
                    System.out.println(p.getIdentification());
                    System.out.println(p.getAge());
                    System.out.println(p.getLeader());
                    System.out.println(p.getParking());
                    i++;
                }
                break;
                case 6:
                    for(CleaningStaff p in CleaningStaffAL) {
                    int i=1;
                    System.out.println("CleaningStaff #" + i);
                    System.out.println(p.getName());
                    System.out.println(p.getIdentification());
                    System.out.println(p.getAge());
                    System.out.println(p.getDayOff());
                    i++;
                }
                break;
                case 7:
                    for(Accountant p in AccountantAL) {
                    int i=1;
                    System.out.println("Accountant #" + i);
                    System.out.println(p.getName());
                    System.out.println(p.getIdentification());
                    System.out.println(p.getAge());
                    System.out.println(p.getLeader());
                    System.out.println(p.getParking());
                    i++;
                }
                break;
                case 8:
                    for(Watchman p in WatchmanAL) {
                    int i=1;
                    System.out.println("Watchman #" + i);
                    System.out.println(p.getName());
                    System.out.println(p.getIdentification());
                    System.out.println(p.getAge());
                    System.out.println(p.getWeapon());
                    System.out.println(p.getWorkday());
                    i++;
                }
                break;
                case 9:
                    salir=true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 9");
            }

        }

    }


}
