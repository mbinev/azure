package app.mongoazure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import app.mongoazure.reposiotries.User;

@RestController
public class MongoConnector {

    @Autowired
    MongoTemplate mongoTemplate;

    @GetMapping
    private void test() {
        User user = new User();
        user.setName("Albert");
        mongoTemplate.save(user, "user");
    }
}
