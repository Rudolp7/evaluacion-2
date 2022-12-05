public class Card{

    private String nameCard;
    private Fecha fechaVencimiento;
    private String numberCard;
    private String numberAccount;

    public String getNameCard() {
        return nameCard;
        }
        public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
        }
        public Fecha getFechaVencimiento() {
        return fechaVencimiento;
        }
        public void setFechaVencimiento(Fecha fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
        }
        public String getNumberCard() {
        return numberCard;
        }
        public void setNumberCard(String numberCard) {
        this.numberCard =numberCard;
        }
        public String getNumeroCuenta() {
        return numberAccount;
        }
        public void setNumeroCuenta(String numeroCuenta) {
        this.numberAccount = numeroCuenta;
        }
        
        public String toString(){
        String mensaje = "";
        mensaje = "Titular: " + this.nameCard + "\n"+
       "Número de tarjeta: " + this.numberCard + "\n"+
       "Número de cuenta: " + this.numberAccount + "\n"+
       "Fecha de vencimiento: " + fechaVencimiento.getMes() +
       "/" + fechaVencimiento.getAnnio();
        
        return mensaje;
        
        }
    
   

}