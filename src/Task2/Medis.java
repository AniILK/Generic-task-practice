package Task2;

abstract class Medis {

    public void turi() {
        System.out.println(getClass().getSimpleName() + " " + getType());
    }

     abstract String getType();
}
