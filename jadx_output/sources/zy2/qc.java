package zy2;

/* loaded from: classes10.dex */
public abstract class qc {
    public static final boolean a(r45.xs4 xs4Var) {
        if (xs4Var == null) {
            return true;
        }
        java.lang.String string = xs4Var.getString(0);
        if (string == null || string.length() == 0) {
            java.lang.String string2 = xs4Var.getString(1);
            if (string2 == null || string2.length() == 0) {
                java.lang.String string3 = xs4Var.getString(4);
                if (string3 == null || string3.length() == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
