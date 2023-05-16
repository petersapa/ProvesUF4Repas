public class Persona {
    // Atributs privats de l'objecte (no són estàtics)
    String nom;
    int edat;
    String email;

    // Constructor
    public Persona(String _nom) {
        set(_nom, 0, "");
    }

    // Constructor
    public Persona(String _nom, int _edat) {
        set(_nom, _edat, "");
    }

    // Constructor
    public Persona(String _nom, int _edat, String _email) {
        set(_nom, _edat, _email);
    }

    private void set(String _nom, int _edat, String _email) {
        // TODO: verificar datos !!!!
        nom = _nom;
        edat = _edat;
        email = _email;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + "\nEdat: " + edat;
    }

}

class TestPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona("P");
        Persona p2 = new Persona("P", 5);
        Persona p3 = new Persona("P", 5, "ñlkajsdfljf@ñljsdfkj");
        System.out.println(p3);
    }
}