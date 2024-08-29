/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package isi.deso.tp_etapa1;

import java.util.ArrayList;
import java.util.List;

import isi.deso.tp_etapa1.model.Cliente;
import isi.deso.tp_etapa1.model.Coordenada;
import isi.deso.tp_etapa1.model.Vendedor;


public class Main {

    public static void main(String[] args) {

        List<Vendedor> listVendedores=crearVendedores(),filtro;
        List<Cliente> listClientes=crearClientes();

        double distanciaVendedorCliente=listVendedores.get(1).distancia(listClientes.get(1));

        System.out.print(distanciaVendedorCliente);

        filtro=filterVendedoresPorId(listVendedores,1);

        for(Vendedor f : filtro){
            System.out.print(" " + f.getNombre() + " ");
        }

        deleteVendedoresPorId(listVendedores,1);
        deleteVendedoresPorNombre(listVendedores,"Jose");

        for(Vendedor f : listVendedores){
            System.out.print(" " + f.getNombre() + " ");
        }
    }



    //Metodos que deberian ser definido dentro de un GestorVendedores

    public static List<Vendedor> crearVendedores(){
 
        Vendedor ven1 = new Vendedor(1,"Pepe", "San Luis 2200", new Coordenada(10,20));
        Vendedor ven2 = new Vendedor(2,"Juan", "San Justo 3200", new Coordenada(80,20));
        Vendedor ven3 = new Vendedor(3,"Luis", "Necochea 2200", new Coordenada(400,20));
 
        //Vendedor[] vendedores = {ven1,ven2,ven3};
        //create a list of Vendedores
        List<Vendedor> listVendedores = new ArrayList<>();
        listVendedores.add(ven1);
        listVendedores.add(ven2);
        listVendedores.add(ven3);
 
        return listVendedores;
    }

    //Filtro de vendedores
    
    //filtro por ID
    public static List<Vendedor> filterVendedoresPorId(List<Vendedor> vendedores, int filtroId){
        List<Vendedor> vendedoresAux = new ArrayList<>();

        for(Vendedor i: vendedores){
            if(i.getId()==filtroId){
                vendedoresAux.add(i);
            }
        }
        return vendedoresAux;
    }

    //filtro por Nombre
    public static List<Vendedor> filterVendedoresPorNombre(List<Vendedor> vendedores, String filtroId){
        List<Vendedor> vendedoresAux = new ArrayList<>();

        for(Vendedor i: vendedores){
            if(i.getNombre().equals(filtroId)){
                vendedoresAux.add(i);
            }
        }
        return vendedoresAux;
    }

    //Eliminacion de vendedores por parametro

    //Eliminacion de vendedores por ID
    public static void deleteVendedoresPorId(List<Vendedor> vendedores, int filtroId){
        vendedores.removeIf(vendedor -> vendedor.getId()==filtroId);
    }
    //Eliminacion de vendedores por Nombre
    public static void deleteVendedoresPorNombre(List<Vendedor> vendedores, String filtroString){
        vendedores.removeIf(vendedor -> vendedor.getNombre().equals(filtroString));
    }
    //Eliminacion de vendedores pasando la posicion del arreglo de vendedores que se quiere eliminar
    public static void deleteVendedoresPorPosicion(List<Vendedor> vendedores, int posicion){
        vendedores.remove(posicion);
    }

    //Metodos que deberian ser definido dentro de un GestorClientes

    public static List<Cliente> crearClientes(){
 
        //(int id, int cuit, String email, String direccion, Coordenada coordenada)

        Cliente c1 = new Cliente(1,"22433500130","lucca.s@gmail.com", "San Luis 2200", new Coordenada(109,20)); 
        Cliente c2 = new Cliente(2,"22343200340","juanatorres@gmail.com","Paraguay 29", new Coordenada(8,203));
        Cliente c3 = new Cliente(3,"20433590390", "pedritoPaso@hotmail.com","San martin 23", new Coordenada(40,2));
 
        List<Cliente> listClientes = new ArrayList<>();
        listClientes.add(c1);
        listClientes.add(c2);
        listClientes.add(c3);
 
        return listClientes;
    }





    //Filtro de clientes

    //filtro por ID
    public static List<Cliente> filterClientePorId(List<Cliente> clientes, int filtroId){
        List<Cliente> clientesAux = new ArrayList<>();

        for(Cliente i: clientes){
            if(i.getId()==filtroId){
                clientesAux.add(i);
            }
        }
        return clientesAux;
    }

    //filtro por nombre???? el cliente no tiene campo nombre

    //Eliminacion de vendedores por ID
    public static void deleteClientePorId(List<Cliente> clientes, int filtroId){
        clientes.removeIf(cliente -> cliente.getId()==filtroId);
    }

    //Eliminacion de vendedores por Nombre??????? no esta definido nombre en cliente

    //Eliminacion de vendedores pasando la posicion del arreglo de vendedores que se quiere eliminar
    public static void deleteClientePorPosicion(List<Cliente> clientes, int posicion){
        clientes.remove(posicion);
    }

}
