package it.epicode.demo.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Table {
    private int number;
    private int maxCovers;
    private State state;
    
    public enum State {
        FREE,
        OCCUPIED
    }
}