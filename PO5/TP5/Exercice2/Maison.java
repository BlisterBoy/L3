class Maison extends Batiment{
	private int nbPieces;
	private int surfaceJardin;
	private Personne locataire;
	
	public Maison(String adresse, int surfaceH, int surfaceJ, int nbPieces, Personne proprietaire, Personne l){
		super(adresse, surfaceH, proprietaire);
		this.nbPieces = surfaceJ;
		this.surfaceJardin = surfaceJ;
	}
	
	public String toString(){
		return (super.toString() + "\nNombre de Pieces : " + nbPieces + "\nSurface du Jardin :" + surfaceJardin);
	}
	
	public int getSurgaceJardin(){
		return this.surfaceJardin;
	}
	
	public double impot(){
		return (0.56 * this.getSurfaceHabitable() + 1.5 * surfaceJardin);
	}
	
	public Personne getLocataire(){
		return locataire;
	}
}