package codingAssignment;

import java.util.LinkedList;

public class PlayList {                                                      //Define a public class named PlayList.
	
	private LinkedList<String> songs;                                       // Declare instance variables for storing songs and capacity.
	private int capacity;

	public PlayList(int capacity) 
	{                                                                       // Define a constructor that takes an integer argument for capacity.
		this.songs = new LinkedList<String>();                             // Initialize the LinkedList to store songs
		this.capacity = capacity;                                         // Store the capacity provided as argument
	}

	public void playSong(String song)
	{                                                                   // Define a method to play a song.
		if (songs.contains(song)) 
		{                                                              // If the song is already in the PlayList, remove it to move to the top.
			songs.remove(song);   
		} 
		else if (songs.size() >= capacity) 
		{                                                            // If the PlayList is full, remove the least recently played song from the bottom
			songs.removeFirst();
		}
		songs.add(song);                                            // Add the new song to the top of the PlayList.
	}

	public void printPlaylist() 
	{                                                             // Define a method to print the current PlayList.
		System.out.println(songs.toString());
	}

	public static void main(String[] args) 
	{                                                                           // Define the main method to test the class
		PlayList playlist = new PlayList(3);                                    // Create a new PlayList object with a capacity of 3.
		
		System.out.print("The play list would look like -> ");                 // Play some songs and print the PlayList after each song.
		playlist.playSong("S1");
		playlist.playSong("S2");
		playlist.playSong("S3");
		playlist.printPlaylist();
		
		System.out.print("When S4 song is played -> ");
		playlist.playSong("S4");
		playlist.printPlaylist();
		
		System.out.print("When S2 song is played -> ");
		playlist.playSong("S2");
		playlist.printPlaylist();
		
		System.out.print("When S1 song is played -> ");
		playlist.playSong("S1");
		playlist.printPlaylist();
	}

}
	


