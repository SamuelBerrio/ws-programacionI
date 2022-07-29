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
                            for(int i=0;i<4;i++){
                                if(codigo==objetos[i].getCode()){
                                    String ObjetoProp="1 - Codigo: "+objetos[i].getCode()+"\n" +
                                            "2 - Nombre: "+ objetos[i].getName()+"\n" +
                                            "3 - Unidades: "+objetos[i].getUnits()+"\n" +
                                            "4 - Estado: "+objetos[i].isStatus()+"\n" +
                                            "5 - Precio: "+objetos[i].getPrice();
                                }
                            }break;
                        case 2:
                            String nombre =JOptionPane.showInputDialog("Ingrese el codigo de el Objeto");

                            for (int i=0; i<prestamos.length; i++){
                                Detalle detalle[]= prestamos[i].getDetails();
                                for (int j=0; j<prestamos[i].getDetails().length; j++)
                                {
                                    detalle[j].getObjeto().
                                }
                            }
                            for(int i=0;i<4;i++){
                                if(nombre.equals(objetos[i].getName())){
                                    for(int j=0;j<4;j++){
                                        if(nombre.equals(prestamos[i].getDetails().g)){

                                        }
                                    }
                                    String ObjetoProp="Esta incluido en "+.
                                }
                            }break;
                    }
            }

        } while (desicion != 0);

    }
}