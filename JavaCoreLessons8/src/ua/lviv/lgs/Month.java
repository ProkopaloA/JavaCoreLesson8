package ua.lviv.lgs;

public enum Month {
	JANUARY(31, Seasons.WINTER), 
	FEBRUARY(28, Seasons.WINTER), 
	MARCH(31, Seasons.SPRING), 
	APRIL(30, Seasons.SPRING),
	MAY(31, Seasons.SPRING), 
	JUNE(30, Seasons.SUMMER), 
	JULY(31, Seasons.SUMMER), 
	AUGUST(31, Seasons.SUMMER),
	SEPTEMBRE(30, Seasons.AUTUMN), 
	OCTOBRE(31, Seasons.AUTUMN), 
	NOVEMBER(30, Seasons.AUTUMN),
	DECEMBER(31, Seasons.WINTER);

	int numberOfDays;
	Seasons seasons;

	Month(int numberOfDays){
		this.numberOfDays=numberOfDays;
	}

	Month( Seasons seasons){			
			this.seasons=seasons;
	}

	Month(int numberOfDays, Seasons seasons) {
		this.numberOfDays = numberOfDays;
		this.seasons = seasons;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public Seasons getSeasons() {
		return seasons;
	}

}
