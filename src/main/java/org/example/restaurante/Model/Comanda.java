package org.example.restaurante.Model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor; // Adicionado
import lombok.AllArgsConstructor; // Adicionado
import lombok.Data; // Adicionado

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comanda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mesa;
    private String tipoConsumo;
    private String status;
    private String observacao;

    private LocalDateTime data;
    private LocalDateTime dataFechamento;

    @OneToMany(mappedBy = "comanda", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<ItemComanda> itens;

}