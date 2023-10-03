public class TestePokemon {

    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();
        Pokemon bulbasauro = pokedex.criaPokemon ("bulba", "Bulbasauro", 100 ) ;
        System.out.println(pokedex.pokemonInfo(bulbasauro));
        pokedex.atacaPokemon (bulbasauro);
        System.out.println(pokedex.pokemonInfo(bulbasauro));
    }
}
