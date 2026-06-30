package g2;

/* loaded from: classes14.dex */
public abstract class r {
    public static java.lang.String a(int i17) {
        if (i17 == 0) {
            return "None";
        }
        if (i17 == 1) {
            return "Characters";
        }
        if (i17 == 2) {
            return "Words";
        }
        return i17 == 3 ? "Sentences" : "Invalid";
    }
}
