package org.exemplo.curso1.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HabilidadesTest {

    @Test
    public void TestaValorMana() {
        Habilidades habilidade = new Habilidades(1, "Cura", 50, 0);
        // parametros atuais
        habilidade.setMana(40); // valor de mana imcompativel
        // parametros esperados
        assertEquals(40, habilidade.getMana());

    }
    @Test
    public void TestaValorNulo() {
    Habilidades habilidade = new Habilidades(1, "teste", 20 , 120);

    // verifica se os campos nao estao nulos

    assertNotNull(habilidade.getNome(), "O nome da habilidade não deve ser nulo.");
}

    @Test
    public void TestaManaMaior() {
    Habilidades habilidade = new Habilidades(1, "Bola de Fogo", 0, 100);
    // custo mano maior que 0

    assertTrue(habilidade.getMana() > 0, "Os pontos de mana devem ser maiores que zero.");
}

    @Test
    public void TestaDanoNegativo() {
    Habilidades habilidade = new Habilidades(1, "Explosion", -20, -100); // teste de condição
    // cria nova habilidade e ela deve atender aos conditions do assertFalse
    // valor da mana não pode ser negativo
    assertFalse(habilidade.getDano() < 0, "Os pontos de dano não podem ser negativos.");
}
    @Test
    public void TestaHabilidadeRoubada() {
        Habilidades habilidade = new Habilidades(1, "Void", 50, 200);
        assertTrue(habilidade.getDano() < 300, "Habilidade muito roubada, dano não permitido.");
    }
}