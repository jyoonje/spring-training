package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloLombok {
    private String name;

    public static void main(String[] args) {
        HelloLombok h = new HelloLombok();
        h.setName("asd");

    }
}
