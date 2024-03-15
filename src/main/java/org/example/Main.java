package org.example;

import static spark.Spark.get;
import static spark.Spark.post;

public class Main {
    public static void main(String[] args) {

        post("/register", (req, res)->"Registered");

        post("/login", (req,res)->{
            return "Logged in";
        });
    }
}