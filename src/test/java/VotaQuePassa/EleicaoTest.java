package VotaQuePassa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EleicaoTest {

    Eleicao eleicaoAutarquica;
    Eleicao eleicaoAssociacaoEstudantes;

    Candidato aut1;
    Candidato aut2;
    Candidato aut3;
    Candidato aut4;

    Candidato ass1;
    Candidato ass2;
    Candidato ass3;
    Candidato ass4;

    Eleitor[] eleitores;

    @BeforeEach
    void setUp() {

// **** FAZER TESTS PARA OS GETTERS TODOS DO PROJETO! *****
// 1º Adicionar Eleição | 2º Adicionar Candidatos | 3º Adicionar Eleitores | 4º Adicionar Votos

        // Criar eleições
         eleicaoAutarquica = new Eleicao("Eleicoes Autarquicas 2025", 18);
         eleicaoAssociacaoEstudantes = new Eleicao("Associacao de Estudantes - Secundaria Freixo de Espada a Cinta", 14);

        // Candidatos para a eleição autárquica
         aut1 = new Candidato("Joana Almeida", 42, "Trofa");
         aut2 = new Candidato("Ricardo Meireles", 50, "Maia");
         aut3 = new Candidato("Cristiano Ronaldo", 38, "Porto");
         aut4 = new Candidato("Joaquim Alberto", 45, "Gaia");

        // Candidatos para a associação de estudantes
         ass1 = new Candidato("Mariana Costa", 17, "Trofa");
         ass2 = new Candidato("Luis Pereira", 16, "Trofa");
         ass3 = new Candidato("Sofia Matos", 18, "Santo Tirso");
         ass4 = new Candidato("Bruno Gomes", 15, "Maia");

        // Criar 20 eleitores Manualmente

        eleitores = new Eleitor[] {
                new Eleitor("Ana Rocha", "E001", 17, "ana@mail.com", "911000001"),
                new Eleitor("João Santos", "E002", 20, "joao@mail.com", "911000002"),
                new Eleitor("Carla Mendes", "E003", 15, "carla@mail.com", "911000003"),
                new Eleitor("Tiago Lopes", "E004", 18, "tiago@mail.com", "911000004"),
                new Eleitor("Rita Faria", "E005", 16, "rita@mail.com", "911000005"),
                new Eleitor("Miguel Almeida", "E006", 14, "miguel@mail.com", "911000006"),
                new Eleitor("Inês Pires", "E007", 22, "ines@mail.com", "911000007"),
                new Eleitor("Bruno Carvalho", "E008", 19, "bruno@mail.com", "911000008"),
                new Eleitor("Filipa Sousa", "E009", 17, "filipa@mail.com", "911000009"),
                new Eleitor("Pedro Costa", "E010", 21, "pedro@mail.com", "911000010"),
                new Eleitor("Joana Ribeiro", "E011", 18, "joana@mail.com", "911000011"),
                new Eleitor("André Moreira", "E012", 15, "andre@mail.com", "911000012"),
                new Eleitor("Lara Fernandes", "E013", 16, "lara@mail.com", "911000013"),
                new Eleitor("Diogo Silva", "E014", 20, "diogo@mail.com", "911000014"),
                new Eleitor("Marta Tavares", "E015", 19, "marta@mail.com", "911000015"),
                new Eleitor("Gonçalo Pinto", "E016", 14, "goncalo@mail.com", "911000016"),
                new Eleitor("Vera Matos", "E017", 15, "vera@mail.com", "911000017"),
                new Eleitor("Rui Teixeira", "E018", 17, "rui@mail.com", "911000018"),
                new Eleitor("Cátia Lima", "E019", 18, "catia@mail.com", "911000019"),
                new Eleitor("Fernando Simões", "E020", 23, "fernando@mail.com", "911000020")
        };

    }

    @Test
    void testAdicionarCandidato() {

    }

    @Test
    void votar() {
    }

    @Test
    void contarVotos() {
    }

    @Test
    void obterVencedor() {
    }

    @Test
    void getNome() {
    }

    @Test
    void getIdadeMinima() {
    }

    @Test
    void getCandidatos() {
    }

    @Test
    void getVotos() {
    }
}