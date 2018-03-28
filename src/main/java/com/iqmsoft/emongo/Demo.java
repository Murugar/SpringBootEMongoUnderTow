package com.iqmsoft.emongo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "demos")
public class Demo {
    @Id
    private Long id;
    private String name;

    @Override
    public String toString() {
        return "(@" + Integer.toHexString(System.identityHashCode(this)) + ") Demo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
