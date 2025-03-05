class MotorinoImm extends Motorino {
      public MotorinoImm(String colore, String tipo, double velocità, boolean antifurto, double MaxVelocità, ) {
         super(colore, tipo, velocità, antifurto);
        this.MaxVelocità = MaxVelocità;
        this.targa = targa;
    }
   
    public void setTarga(String targa) {
        this.targa = targa;
    }        


    }
    @Override
    public String toString() {
        return 

    }
}