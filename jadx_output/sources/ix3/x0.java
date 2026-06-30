package ix3;

/* loaded from: classes.dex */
public final class x0 implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        r45.dp5 dp5Var = (r45.dp5) obj;
        r45.dp5 dp5Var2 = (r45.dp5) obj2;
        if (dp5Var == null || dp5Var2 == null) {
            return 0;
        }
        int i17 = kotlin.jvm.internal.o.i(dp5Var.getInteger(11), dp5Var2.getInteger(11));
        if (i17 != 0) {
            return i17;
        }
        java.lang.String string = dp5Var.getString(1);
        java.lang.String string2 = dp5Var2.getString(1);
        if (string == null || string2 == null) {
            return 0;
        }
        return string.compareTo(string2);
    }
}
