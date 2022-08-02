import javax.swing.*;

public class Empresa {
    public static void main(String[] args) {
        int contEmp = 0;
        int contCli = 0;
        int desicion;
        int desicionObj;

        Empleado[] empleados;
        empleados = new Empleado[3];
        Objeto[] objetos;
        objetos = new Objeto[3];
        Prestamo prestamos[];
        prestamos=new Prestamo[3];

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


        do {
            desicion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (desicion) {
                case 1:
                    if (contEmp < 4) {
                        int code = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del empleado"));
                        String name = JOptionPane.showInputDialog("Ingrese el nombre");
                        String mail = JOptionPane.showInputDialog("Ingrese el correo");
                        int yearsOld = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los años de antiguedad"));
                        Empleado empleado = new Empleado(code, name, mail, yearsOld);
                        System.out.println("Usuario Creado");
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
            }

        } while (desicion != 0);

    }
}