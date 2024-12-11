package org.exemplo.curso1.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    void TesteClasse() {
        Jogador jogador = new Jogador("John Byava", 1, "Guerreiro", 10, 100, 50);

        // parametros sendo passados
        jogador.setClasse("Guerreiro");
        // parametros esperados
        assertEquals("Mago", jogador.getClasse(), "Classe de personagem não correspondente");
    }

    @Test
    public void TesteInvalido() {
       // teste de valores
        Jogador jogador = new Jogador("Assassin", 1, "Ladino", 10, 10, 50);

        jogador.setP_vida(-10);
        assertTrue(jogador.getP_vida() > 0, "A vida do jogador tem que ser maior que zero.");
    }
    @Test
    public void TestaClasseNecromancer() {
        Jogador jogador = new Jogador("Morgana", 2, "Necromancer", 15, -50, 100);

        // verifica se a classe é ou não necromancer
        if ("Necromancer".equals(jogador.getClasse())) {
            assertTrue(jogador.getP_vida() < 0, "Necromancers podem ter vida negativa.");
        } else {
            fail("Apenas a classe Necromancer pode ter vida negativa.");
        }
    }
    @Test
    public void TestaVidaTank() {
        Jogador jogador = new Jogador("Venom", 1, "Tank", 10, 150, 50);
        jogador.setP_vida(100);
        if ("Tank".equals(jogador.getClasse())) {
            assertTrue(jogador.getP_vida() > 80, "Vida do Tank tem que ser alta (maior que 80)" );
        } else {
            fail("Tanks devem ter vida alta.");
        }
    }
    @Test
    public void TestaVidaJogador() {
        // vida invalida
        Jogador jogador = new Jogador("Platao", 1, "Guerreiro", 10, 10, 50);

        jogador.setP_vida(10);
        assertTrue(jogador.getP_vida() > 0, "A vida do jogador deve ser maior que zero.");
    }

    @Test
    public void TestaQuantidadeManaIgual() {
        Jogador jogador1 = new Jogador("Arthur", 1, "Necromancer", 10, 10, 50);
        Jogador jogador2 = new Jogador("Cicero", 1, "Flamenguista", 15, 20, 50);
        Jogador jogador3 = new Jogador("Morgana", 2, "Guerreiro", 15, 100, 200);
        // verifica mana do jogador 1 e 2
        assertSame(jogador1.getP_mana(), jogador2.getP_mana(), "Valor de mana deve ser igual.");
        // Verifica se jogador1 e jogador3 não referenciam o mesmo objeto
        assertNotSame(jogador1.getNome(), jogador3.getNome(), "Os nomes não podem ser iguais");
    }
    @Test
    public void TestaManaMago() {
        Jogador jogador = new Jogador("Patolino", 1, "Mago", 10, 10, 110);
        jogador.setP_mana(100);
        // Verificando se o valor de P_vida foi atualizado corretamente
        assertEquals(100, jogador.getP_mana(), "A mana do mago deve ser alta (100)");
    }
}


