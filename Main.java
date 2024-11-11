// import java.util.ArrayList;
// import java.util.List;

public class Main {
    public static void main(String[] args){
        Network network = new Network();

        User alice = network.addUser("Alice");
        User bob = network.addUser("Bob");
        User bo = network.addUser("Bo");

        alice.addPost("Hello, this is Alice first post!");
        bob.addPost("Hello everyone, Bob is here!");

        network.addPost(alice.getPosts().get(0));
        network.addPost(bob.getPosts().get(0));

        alice.likePost(bob.getPosts().get(0));
        bo.likePost(bob.getPosts().get(0));

        // Bob likes Alice's post
        bob.likePost(alice.getPosts().get(0));

        network.showAllPosts();
    }
}
