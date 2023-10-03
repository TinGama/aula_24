public class Pokedex implements PokemonInterface {
    @Override
    public Pokemon criaPokemon(String nome, String tipo, int saude) {
        return new Pokemon(nome, tipo, saude);
    }

    @Override
    public void atacaPokemon(Pokemon pokemon) {

        int dano = 10;
        int saudeAtual = pokemon.getSaude();

        if (saudeAtual > dano) {
            pokemon.setSaude(saudeAtual - dano);
            System.out.println("Ataque bem-sucedido! " + pokemon.getNome() + " perdeu " + dano + " pontos de saúde.");
        } else {
            System.out.println(pokemon.getNome() + " desmaiou!");
            pokemon.setSaude(0);
        }
    }

    @Override
    public String pokemonInfo(Pokemon pokemon) {
       
        return "Nome: " + pokemon.getNome() + ", Tipo: " + pokemon.getTipo() + ", Saúde: " + pokemon.getSaude();
    }
}




