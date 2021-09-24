package in.starfour.movietime;

public class Main {

	public static void main(String[] args) {
		
		
		MovieShoot ms = new MovieShoot();
		Hero tomc =  new RealHero();
		ms.shootMusicSeq(tomc);
		
		//why
		Hero fakeHero = new StuntDouble();
		ms.fightSeq(fakeHero);
		
		
		
	}
}
