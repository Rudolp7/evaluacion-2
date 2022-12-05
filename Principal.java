public class Principal {
    public static void main(String[] args) {
        manejoDebitCard();
        manejarcreditCard();
        }
        
        public static void manejoDebitCard(){
        
        LlenarDatos llenar = new LlenarDatos();
        DebitCard tarjeta = new DebitCard();
        
        tarjeta = llenar.llenarDatosDebit();
        OperacionesCard operaciones = new OperacionesCard();
        operaciones.imprimirDatos(tarjeta);
        
        
        
        }
        
        public static void manejarcreditCard(){
        
        LlenarDatos llenar = new LlenarDatos();
        Card card = new creditCard();
        
        card = llenar.llenarDatoscredit();
        OperacionesCard operaciones = new OperacionesCard();
        operaciones.imprimirDatos(card );
        }
       
}
