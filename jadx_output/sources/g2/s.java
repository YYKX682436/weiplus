package g2;

/* loaded from: classes14.dex */
public abstract class s {
    public static java.lang.String a(int i17) {
        if (i17 == 1) {
            return "Text";
        }
        if (i17 == 2) {
            return "Ascii";
        }
        if (i17 == 3) {
            return "Number";
        }
        if (i17 == 4) {
            return "Phone";
        }
        if (i17 == 5) {
            return "Uri";
        }
        if (i17 == 6) {
            return "Email";
        }
        if (i17 == 7) {
            return "Password";
        }
        if (i17 == 8) {
            return "NumberPassword";
        }
        return i17 == 9 ? "Decimal" : "Invalid";
    }
}
