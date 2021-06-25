package com.sample.controller;

import com.sample.model.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @RequestMapping(value="/{college}/{dept}/{userid}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    User getUser(@RequestParam(value = "firstName", defaultValue = "vamshi") String firstname,
                 @RequestParam(value = "lastName", defaultValue = "krishna") String lastname){
        User user = new User();
        user.setFirstName(firstname+"NewName");
        user.setLastName(lastname);

        return user;

    }

    @RequestMapping(value="/user", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    User getPostUser(@RequestBody User user){
        User newUser = new User();
        newUser.setFirstName(user.getFirstName()+"NewName");
        newUser.setLastName(user.getLastName());
        //make a post /put call with rest template

        return newUser;

    }


}
