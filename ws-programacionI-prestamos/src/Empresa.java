import javax.swing.*;

public class Empresa {
    public static void main(String[] args) {
        int contEmp = 0;
        int contCli = 0;
        int contPres = 0;
        int desicion;
        int desicionObj;

        Empleado[] empleados= new Empleado[3];
        Objeto[] objetos;
        objetos = new Objeto[3];
        Prestamo prestamos[];
        prestamos=new Prestamo[3];
        Cliente[] clientes;
        clientes=new Cliente[3];

        Objeto moto = new Objeto(001,"Moto Nmax",5,true,20000);
        objetos[0]=moto;
        Objeto carro = new Objeto(002,"Corvette",2,true,800000);
        objetos[1]=carro;
        Objeto bicicleta = new Objeto(003,"Bicicleta BMX",13,true,10000);
        objetos[2]=bicicleta;

        String menu = "Ingrese la opcion que desea \n " +
                "1 - Crear empleado \n " +
                "2 - Crear Clientes \n" +
                "3 - Consultar Objetos y remplazar \n" +
                "4 - Administrar Prestamos \n";
        String menuObj = "Ingrese la opcion que desea \n" +
                "1 - Consultar Objeto por codigo \n" +
                "2 - Consultar Objeto por nombre \n" +
                "3 - Consultar unidades prestadas \n" +
                "4 - Remplazar Objeto";
        String menuPres = "Ingrese la opcion que desea \n" +
                "1 - Crear un Prestamo \n" +
                "2 - Agregar objeto a un presta \n" +
                "3 - Consultar datos de un préstamo dado su código";


        do {
            desicion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (desicion) {
                case 1:
                    if (contEmp < 3) {
                        int code = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del empleado"));
                        String name = JOptionPane.showInputDialog("Ingrese el nombre");
                        String mail = JOptionPane.showInputDialog("Ingrese el correo");
                        int yearsOld = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los años de antiguedad"));
                        Empleado empleado = new Empleado(code, name, mail, yearsOld);
                        System.out.println("Usuario Creado");
                        System.out.println(empleado.getName());
                        empleados[contEmp] = empleado;
                        contEmp++;
                    }
                    break;
                case 2:
                    if (contCli < 3) {
                        String id = JOptionPane.showInputDialog("Ingrese el ID del cliente");
                        String idType = JOptionPane.showInputDialog("Ingrese el Tipo de ID del cliente");
                        String name = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
                        String gender = JOptionPane.showInputDialog("Ingrese el genero del cliente");
                        String city = JOptionPane.showInputDialog("Ingrese la ciudad del cliente");
                        Cliente cliente = new Cliente(id,idType,name,gender,city);
                        System.out.println(cliente.getName());
                        contCli++;
                    }break;
                case 3:
                    desicionObj = Integer.parseInt(JOptionPane.showInputDialog(menuObj));
                    switch (desicionObj){
                        case 1:
                            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de el Objeto"));
                            for(int i=0;i<3;i++){
                                if(codigo==objetos[i].getCode()){
                                    String ObjetoProp="1 - Codigo: "+objetos[i].getCode()+"\n" +
                                            "2 - Nombre: "+ objetos[i].getName()+"\n" +
                                            "3 - Unidades: "+objetos[i].getUnits()+"\n" +
                                            "4 - Estado: "+objetos[i].isStatus()+"\n" +
                                            "5 - Precio: "+objetos[i].getPrice();
                                    JOptionPane.showMessageDialog(null,ObjetoProp);
                                }
                            }break;
                        case 2:
                            String nombre =JOptionPane.showInputDialog("Ingrese el nombre de el Objeto");
                            if(prestamos[1]==null){
                                System.out.println("No hay prestamos");
                            }    else{
                                int cont = 0;
                                for (Prestamo prestamo : prestamos) {
                                    Detalle detalle[] = prestamo.getDetails();
                                    for (int j = 0; j < prestamo.getDetails().length; j++) {
                                        if (nombre.equals(detalle[j].getObjeto().getName())) {
                                            cont++;
                                            System.out.println(cont);
                                        }
                                    }
                                }
                                JOptionPane.showMessageDialog(null,"El objeto "+nombre+" ha sido prestado "+cont+" veces");
                            }break;
                        case 3:
                            if(prestamos[1]==null){
                                System.out.println("No hay prestamos");
                            }else {
                                int objetosUnits[] = new int [3];
                                for (Objeto objeto : objetos) {
                                    for (Prestamo prestamo : prestamos) {
                                        for (int j = 0; j < prestamo.getDetails().length; j++) {
                                            Detalle[] detalle = prestamo.getDetails();
                                            if (objeto.getName().equals(detalle[j].getObjeto().getName())) {
                                                objetosUnits[j] = detalle[j].getUnits();
                                            }
                                        }
                                    }
                                }
                                JOptionPane.showMessageDialog(null,"Objeto 1: "+objetosUnits[0]+"\n" +
                                        "Objeto 2: "+objetosUnits[1]+"\n" +
                                        "Objeto 3: "+objetosUnits[2]);
                            }break;
                        case 4:
                            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del objeto"));
                            if(num<=1 || num>3){
                                System.out.println("Numero incorrecto seleccione uno en el rango de 1 - 3");
                            }else{
                                int codeNew = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código nuevo"));
                                String nameNew = JOptionPane.showInputDialog("Ingrese el nuevo nombre");
                                int unitsNew = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las unidades nuevas"));
                                int dispNew = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si está disponible o 2 si no está disponible"));
                                boolean statusNew = dispNew == 1;
                                double priceNew = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio nuevo"));
                                objetos[num-1].setCode(codeNew);
                                objetos[num-1].setName(nameNew);
                                objetos[num-1].setUnits(unitsNew);
                                objetos[num-1].setStatus(statusNew);
                                objetos[num-1].setPrice(priceNew);
                                JOptionPane.showMessageDialog(null, "El objeto ha sido modificado");
                            }
                    }
                case 4:
                   int prestamoDes = Integer.parseInt(JOptionPane.showInputDialog(menuPres));
                    switch (prestamoDes){
                        case 1:
                        if(contPres<3){
                            int code = contPres+1;
                            int requestDays = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los dias que requiere"));
                            int daysPassed = (int)(Math.random()*requestDays);
                            int empleadoC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo codigo"));
                            int clienteId = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de el cliente"));
                            String ObjetoPres1 = JOptionPane.showInputDialog("1/2"+" Ingrese el nombre de el objeto que desea");
                            Objeto objeto1= new Objeto();
                            Objeto objeto2= new Objeto();
                            for (Objeto objeto : objetos){
                                if(ObjetoPres1.equals(objeto.getName())){
                                    System.out.println("Este objeto existe");
                                    objeto1=objeto;
                                }else{
                                    System.out.println("No se encontro este Objeto");
                                    ObjetoPres1 = "No";
                                }
                            }
                            int units1 =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese las unidades que desea"));
                            String ObjetoPres2 = JOptionPane.showInputDialog("2/2"+" Ingrese el nombre de el objeto que desea");
                            for (Objeto objeto : objetos){
                                if(ObjetoPres2.equals(objeto.getName())){
                                    System.out.println("Este objeto existe");
                                    objeto2=objeto;
                                }else{
                                    System.out.println("No se encontro este Objeto");
                                    ObjetoPres2 = "No";
                                }
                            }
                            int units2 =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese las unidades que desea"));
                            double loanValue;
                            if(ObjetoPres1.equals("No")||ObjetoPres2.equals("No")){
                                System.out.println("No es posible crear este prestamos ingrese datos validos");
                            }else{
                                loanValue = ((objeto1.getPrice()*units1)+(objeto2.getPrice()*units2)*requestDays);
                                Detalle details[]= new Detalle[2];
                                Detalle details1= new Detalle(objeto1,units1,objeto1.getPrice()*units1);
                                details[0]=details1;
                                Detalle details2= new Detalle(objeto2,units2,objeto2.getPrice()*units2);
                                details[1]=details2;
                                Prestamo prestamo = new Prestamo(code,requestDays,daysPassed,empleados[empleadoC-1],clientes[clienteId-1],loanValue,details);
                                prestamos[contPres]=prestamo;
                                contPres++;
                            }
                    }break;
                        case 2:
                            String objetoT = JOptionPane.showInputDialog("Ingrese el nombre de el objeto que desea añadir una nueva unidad");
                            int requestDays = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los dias que requiere"));
                            if(objetoT.equals(prestamos[])){

                            }else{
                                System.out.println("Este Objeto no existe");
                            }
                            for()
                            break;
                        case 3:
                            break;
                    }
            }

        } while (desicion != 0);

    }
}