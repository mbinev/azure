package app.mongoazure.reposiotries;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<app.mongoazure.reposiotries.User, String> {
    //
}