public class Meia extends Ingresso{

    public Meia(double valor, String filme, boolean dub, boolean leg) {
        super(valor, filme, dub, leg);
    }
   //@Override é usado para sobrescrever o método da classe Ingresso e dividir por 2.
    @Override
    public double getValor() {
        
        return super.getValor()/2;
        
    }

}
