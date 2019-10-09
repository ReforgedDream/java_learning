public class BrokenRecurrentClass {

    public BrokenRecurrentClass() {

    }

    public void BrokenMethod(Object obj) {

        BrokenRecurrentClass a;

        a = (BrokenRecurrentClass) obj;

        a.BrokenMethod(a);
    }


}
