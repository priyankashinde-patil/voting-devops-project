package com.devops.voting;

public class App {
    static int votes = 0;

    public static void main(String[] args) {
        System.out.println("Online Voting Application");
        castVote();
        showResult();
    }

    public static void castVote() {
        votes++;
        System.out.println("Vote Casted Successfully");
    }

    public static void showResult() {
        System.out.println("Total Votes: " + votes);
    }
}
