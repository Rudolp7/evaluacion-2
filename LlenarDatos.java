public class LlenarDatos {
    
    public Card llenarDatos() {
        Card Card = new Card();
        Fecha fechaVencimiento = new fecha();
        Card.setNameCard("Rodolfo");
        Card.setNumberAccount("1630336F");
        Card.setNumberCard("123 456 789");
        fechaVencimiento.setMes(11);
        fechaVencimiento.setAnnio(18);
        Card.setFechaVencimiento(fechaVencimiento);
        
        return Card;
       
    }
    /*Creación y llenado de una Tarjeta de Crédito*/
 public CreditCard llenarDatoscredit(){
    CreditCard Card = new CreditCard();
    Fecha fechaVencimiento = new Fecha();
    Card.setNameCard("Rodolfo");
    Card.setNumberAccount("1630336f");
    Card.setNumberCard("123 456 789");
    fechaVencimiento.setMes(11);
    fechaVencimiento.setAnnio(18);
    Card.setFechaVencimiento(fechaVencimiento);
    
    Card.setCreditoMaximo(5000);
    Card.setDeuda(1500);
    
    return Card;
    }
    
    /*Creación y llenado de una Tarjeta de Débito*/
    public DebitCard llenarDatosDebit(){
    DebitCard tarjeta = new DebitCard();
    Fecha fechaVencimiento = new Fecha();
    Card.setNameCard("Rodolfo");
    Card.setNumberAccount("1630336f");
    Card.setNumberCard("123 456 789");
    fechaVencimiento.setMes(11);
    fechaVencimiento.setAnnio(18);
    Card.setFechaVencimiento(fechaVencimiento);
    
    Card.setSaldoActual(12000);
    
    return Card;
    }
}
