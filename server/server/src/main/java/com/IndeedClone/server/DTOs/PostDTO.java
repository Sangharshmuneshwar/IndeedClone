package com.IndeedClone.server.DTOs;


import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostDTO {


    String profile;
   String type;
    String description;
    String experience;
     String[] technology;
     String salary;

}
