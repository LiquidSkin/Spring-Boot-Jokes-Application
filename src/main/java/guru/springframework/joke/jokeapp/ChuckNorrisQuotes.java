package guru.springframework.joke.jokeapp;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class ChuckNorrisQuotes {
	private List<String> quotes;

	public void chuckNorrisQuotes()
	{
		quotes = new ArrayList<>(123);
		quotes.add("A sample quote");
		quotes.add("Chuck Norris is badass");
		quotes.add("We are the champions");
	}
	public String getRandomQuote()
	{
		return quotes.get(ThreadLocalRandom.current().nextInt(1,quotes.size()));
	}


}
