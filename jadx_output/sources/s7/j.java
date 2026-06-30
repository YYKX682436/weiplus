package s7;

/* loaded from: classes16.dex */
public class j implements s7.i {

    /* renamed from: a, reason: collision with root package name */
    public final int f403684a;

    /* renamed from: b, reason: collision with root package name */
    public final int f403685b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f403686c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f403687d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f403688e;

    public j(int i17, int i18, boolean z17, boolean z18, java.lang.String str) {
        this.f403684a = i17;
        this.f403685b = i18;
        this.f403686c = z17;
        this.f403687d = z18;
        this.f403688e = str;
    }

    @Override // s7.i
    public boolean a(s7.s sVar, s7.y1 y1Var) {
        int i17;
        int i18;
        boolean z17 = this.f403687d;
        java.lang.String str = this.f403688e;
        if (z17 && str == null) {
            str = y1Var.n();
        }
        s7.w1 w1Var = y1Var.f403586b;
        if (w1Var != null) {
            java.util.Iterator it = w1Var.c().iterator();
            i17 = 0;
            i18 = 0;
            while (it.hasNext()) {
                s7.y1 y1Var2 = (s7.y1) ((s7.a2) it.next());
                if (y1Var2 == y1Var) {
                    i17 = i18;
                }
                if (str == null || y1Var2.n().equals(str)) {
                    i18++;
                }
            }
        } else {
            i17 = 0;
            i18 = 1;
        }
        int i19 = this.f403686c ? i17 + 1 : i18 - i17;
        int i27 = this.f403684a;
        int i28 = this.f403685b;
        if (i27 == 0) {
            return i19 == i28;
        }
        if ((i19 - i28) % i27 == 0) {
            return java.lang.Integer.signum(i19 - i28) == 0 || java.lang.Integer.signum(i19 - i28) == java.lang.Integer.signum(i27);
        }
        return false;
    }

    public java.lang.String toString() {
        java.lang.String str = this.f403686c ? "" : "last-";
        boolean z17 = this.f403687d;
        int i17 = this.f403685b;
        int i18 = this.f403684a;
        return z17 ? java.lang.String.format("nth-%schild(%dn%+d of type <%s>)", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), this.f403688e) : java.lang.String.format("nth-%schild(%dn%+d)", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
    }
}
