/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personamysql;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonaMySQL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sucursal suc = new Sucursal();
        Persona p = new Persona();

        ConeccionBD bd = new ConeccionBD();
        Empleado em = new Empleado();

//        Revista rev = new Revista();
//
        System.out.println("Que operación desea realizar:" + "\n 1. Ingresar registros a la tabla" + "\n 2. Mostrar Los registros de la tabla" + "\n 3. Buscar un registro por su nombre");
        System.out.println("Escoja la tabla que ingresará los datos ");
        int es = sc.nextInt();

        switch (es) {
            case 1:

                while (true) {
                    System.out.println("Ingrese el ID de la sucursal:");
                    int idSuc;
                    suc.setIdSucursal(idSuc = sc.nextInt());
                    System.out.println("Ingrese la direccion de la sucursal:");
                    String dir = sc.next();
                    suc.setDireccion(dir);
                    System.out.println("Ingrese el telefono de la sucursal");
                    String tel = sc.next();
                    suc.setTelefono(tel);

                    bd.guardarSucursal(suc);

                    System.out.println("Desea ingresar una nueva sucursal?");
                    String res = sc.next();
                    if (res.equalsIgnoreCase("no")) {
                        break;
                    }
                }
                break;
            case 2:
                ArrayList<Sucursal> list = new ArrayList<Sucursal>();
                list = bd.leerSucursalBd();
                for (Sucursal sucu : list) {
                    System.out.println("" + sucu.imprimir());
                }
                break;
            case 3:
                System.out.println("cual es el nombre de la persona q desea buscar:");
                p.setNombre(sc.next());
                bd.buscarPersona(p);

                break;

            default:
                System.out.println("No existe ninguna tabla con ese nombre");

//            case "Empleado":
//
//                while (true) {
//                    System.out.println("Ingrese el DNI del empleado:");
//                        String dniemp;
//                        em.setDni(dniemp = sc.next());
//                    System.out.println("Ingrese el nombre del empleado");
//                        String nomem;
//                        em.setNombre(nomem = sc.next());
//                    System.out.println("Ingrese la direcion del empleado");
//                        String Direm;
//                        em.setDireccion(Direm = sc.next());
//                    System.out.println("Ingrese el telefono del empleado");
//                        String telem;
//                        em.setTelefono(telem = sc.next());
//                    System.out.println("Ingrese la id de la Sucursal en la que tabaja");
//                        String idsuc;
//                        em.setIdSuc(idsuc = sc.next());
//
//                        
//
//                    System.out.println("Desea ingresar un nuevo empleado?");
//                    String res = sc.next();
//                    if (res.equalsIgnoreCase("no")) {
//                        break;
//                    }
//                }
//                break;
//
//            case "Revista":
//                
//                while (true) {
//                    System.out.println("Ingrese el Nro de Registro de la revista");
//                        int nrgtro;
//                        rev.setNroRegistro(nrgtro = sc.nextInt());
//                    System.out.println("Ingrese el título de la revista");
//                        String titurev;
//                        rev.setTitulo(titurev = sc.next());
//                    System.out.println("Ingrese la periodicidad del revista");
//                        String perrev;
//                        rev.setPeriodicidad(perrev = sc.next());
//                    System.out.println("Ingrese el tipo de revista");
//                        String tirev;
//                        rev.setTipo(tirev = sc.next());
//                    System.out.println("Ingrese el id de la sucursal a la que pertenence la revista");
//                        int idsuc;
//                        rev.setIdsuc(idsuc=sc.nextInt());
//                        
//                        revista.add(rev);
//                    
//                    System.out.println("Desea ingresar una nueva revista?");
//                    String res = sc.next();
//                    if (res.equalsIgnoreCase("no")) {
//                        break;
//                    }
//                    
//                }
//                break;
//            case "Periodista":
//                Periodista per = new Periodista();
//                while (true) {
//                    System.out.println("Ingrese el DNI del periodista");
//                        int dnipe;
//                        per.setDniPeriodista(dnipe = sc.nextInt());
//                    System.out.println("Ingrese el nombre del periodista");
//                        String nomper;
//                    per.setNombre(nomper = sc.next());
//                    System.out.println("Ingrese la especialidad del periodista");
//                        String perpe;
//                        per.setEspecialidad(perpe = sc.next());
//                    System.out.println("Ingrese el telefono del periodista");
//                        String telpe;
//                        per.setTelefono(telpe = sc.next());
//                    System.out.println("Ingrese la direccion dimiciliaria del periodista");
//                        String dirpe;
//                        per.setDireccion(dirpe = sc.next());
//                        
//                        periodista.add(per);
//
//                    System.out.println("Desea ingresar un nuevo periodista?");
//                    String res = sc.next();
//                    if (res.equalsIgnoreCase("no")) {
//                        break;
//                    }
//                }
//                break;
//
//            case "NumRevista":
//                NumRevista nur = new NumRevista();
//                while (true) {
//                    System.out.println("Ingrese el numero de revista");
//                        int revn;
//                        nur.setNumero(revn = sc.nextInt());
//                    System.out.println("Ingrese el numero de paginas de la revista");
//                        int numpag;
//                        nur.setNumpaginas(numpag = sc.nextInt());
//                    System.out.println("Ingrese el mumero de cantidades vendidas");
//                        int numcan;
//                        nur.setCantvendidas(numcan = sc.nextInt());
//                    System.out.println("Ingrese la fecha de publicacion de la revista");
//                        String fecha;
//                        nur.setFecha(fecha = sc.next());
//                        
//                        numrevista.add(nur);
//
//                    System.out.println("Desea ingresar un nuevo periodista?");
//                    String res = sc.next();
//                    if (res.equalsIgnoreCase("no")) {
//                        break;
//                    }
//                }
//                break;
//            default:
//                System.out.println("No existe nunguna tabla con ese nombre");
//        }
//        bd.guardarSucursal(suc);
//        bd.guardarEmpleado(em);
//        bd.guardarRevista(rev);
        }
    }
}
