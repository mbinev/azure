package app.mongoazure;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import app.mongoazure.reposiotries.User;

public class UserTest {

    @Test
    public void nameTest() {
        User u = new User();
        u.setName("asd");
        assertThat(u.getName()).isEqualTo("asd");
    }
}
