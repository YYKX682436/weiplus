package ne;

/* loaded from: classes7.dex */
public abstract class s {
    static {
        new ne.r(null);
    }

    public static final boolean a(int i17, int i18) {
        if (i17 > 0) {
            int i19 = i17 & 1;
            int i27 = (i17 >> i18) & 1;
            if (i19 == 1 && i27 == 1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(int i17, int i18) {
        if (i17 <= 0) {
            return false;
        }
        return (i17 & 1) == 1 && ((i17 >> i18) & 1) == 1;
    }
}
