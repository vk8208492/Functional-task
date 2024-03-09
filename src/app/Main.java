package app;

import app.UserHadler.UserHadler;
import app.UserProvider.UserProvider;


public class Main {

    public static void main(String[] args){

        UserHadler handler = new UserHadler();
        handler.handleData(
                new UserProvider().getData(),
                handler.getConsumer()
        );
    }
}
