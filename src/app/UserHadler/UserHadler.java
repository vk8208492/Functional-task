package app.UserHadler;

import app.Output.OutPut;
import app.entity.User;

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
                new OutPut().getOutput(user.toString());
    }
}
