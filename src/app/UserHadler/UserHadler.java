package app.UserHadler;

import app.Output.Output;
import app.User.User;

import java.util.List;
import java.util.function.Consumer;

public class UserHadler {

    public void handleData(List<User> list, Consumer<User> consumer) {
        for (User user : list) {
            consumer.accept(user);
        }
    }
    public Consumer<User> getConsumer(){
        return user ->
                new Output().getOutput(user.toString());
    }
}
