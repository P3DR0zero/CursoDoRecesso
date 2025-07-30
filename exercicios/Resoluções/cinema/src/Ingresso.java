// abstract é uma classe que não pode ser instanciada, ou seja, não pode ser usada para criar objetos diretamente.
// Ela é usada para ser herdada por outras classes como nesse exemplo.
// Leia os comentários e finalize o código.

abstract class  Ingresso {
    private double valor;
    private String filme;
    private boolean dub;
    private boolean  leg;

    public Ingresso(double valor, String filme, boolean dub, boolean leg) {
        this.valor = valor;
        this.filme = filme;
        this.dub = dub;
        this.leg = leg;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public boolean isDub() {
        return dub;
    }

    public void setDub(boolean dub) {
        this.dub = dub;
    }

    public boolean isLeg() {
        return leg;
    }

    public void setLeg(boolean leg) {
        this.leg = leg;
    }
}
