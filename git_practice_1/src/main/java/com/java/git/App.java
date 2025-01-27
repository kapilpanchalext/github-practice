package com.java.git;

public class App {
    public static void main(String[] args) {
        System.out.println("Github Commit 1");
        System.out.println("Github Commit 2");
        System.err.println("Git Branch - newImage");
<<<<<<< Upstream, based on branch 'newImage' of ssh://git@github.com/kapilpanchalext/github-practice.git
        System.err.println("Git newImage - Logic Changed");
        
        System.err.println("Rebase - newImage");
=======
        System.err.println("Github Branch - bugFix");
        System.err.println("Created one more bugfix");
>>>>>>> 946f5a7 [bugfix] added logic
    }
}
