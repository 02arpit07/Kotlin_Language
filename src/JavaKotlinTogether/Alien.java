package JavaKotlinTogether;

public class Alien {
    String name="";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/*
When we convert above java file to kotlin->

package JavaKotlinTogether

class Alien {
    var name: String? = null

}

 */
