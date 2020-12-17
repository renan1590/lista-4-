package bkb;

public class projet {
	private float altura;
	private float raio;
	private int tinta;
	
	public projet(){
	
	}
	
	public projet(float altura, float raio , int tinta) {
		setAltura(altura);
		setRaio(raio);
		setTinta(tinta);
	}
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getRaio() {
		return raio;
	}
	public void setRaio(float raio) {
		this.raio = raio;
	}
	public int getTinta() {
		return tinta;
	}
	public void setTinta(int tinta) {
		this.tinta = tinta;
	}
	
	public double quadrado() {
		return (altura * altura ) + (raio * raio);
		
	}
	
	public double hipotenusa( ) {
		return Math.sqrt(quadrado());
		
	}
	
	public double chao() {
		return 3.14 * (raio * raio); 
	}
	
	public double lateral( ) {
		return 3.14 * raio * hipotenusa();
	}
    
    
	public double cone( ) {
		return 3.14 * raio * (raio + hipotenusa());

	}
	
	public double rendimento() {
		return  cone() * 3.45;
	}
	 
	public double lata() {
		return rendimento() / 18 ; 
	}
    
	public double latav( ) {
		return Math.ceil(lata()); 
	}
	
	public double valor() {
        if(tinta == 1) {
            return latav() * 238.90;
        }else if(tinta == 2) {
            return latav() * 467.98;
        }else {
            return latav()* 758.34;
        }
        
    
	
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("projet [altura=");
		builder.append(altura);
		builder.append(", raio=");
		builder.append(raio);
		builder.append(", tinta=");
		builder.append(tinta);
		builder.append(", getAltura()=");
		builder.append(getAltura());
		builder.append(", getRaio()=");
		builder.append(getRaio());
		builder.append(", getTinta()=");
		builder.append(getTinta());
		builder.append(", quadrado()=");
		builder.append(quadrado());
		builder.append(", hipotenusa()=");
		builder.append(hipotenusa());
		builder.append(", chao()=");
		builder.append(chao());
		builder.append(", lateral()=");
		builder.append(lateral());
		builder.append(", cone()=");
		builder.append(cone());
		builder.append(", rendimento()=");
		builder.append(rendimento());
		builder.append(", lata()=");
		builder.append(lata());
		builder.append(", latav()=");
		builder.append(latav());
		builder.append(", valor()=");
		builder.append(valor());
		builder.append("]");
		return builder.toString();
	}
	
}

