package s7;

/* loaded from: classes16.dex */
public class o implements s7.i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f403748a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f403749b;

    public o(boolean z17, java.lang.String str) {
        this.f403748a = z17;
        this.f403749b = str;
    }

    @Override // s7.i
    public boolean a(s7.s sVar, s7.y1 y1Var) {
        int i17;
        boolean z17 = this.f403748a;
        java.lang.String str = this.f403749b;
        if (z17 && str == null) {
            str = y1Var.n();
        }
        s7.w1 w1Var = y1Var.f403586b;
        if (w1Var != null) {
            java.util.Iterator it = w1Var.c().iterator();
            i17 = 0;
            while (it.hasNext()) {
                s7.y1 y1Var2 = (s7.y1) ((s7.a2) it.next());
                if (str == null || y1Var2.n().equals(str)) {
                    i17++;
                }
            }
        } else {
            i17 = 1;
        }
        return i17 == 1;
    }

    public java.lang.String toString() {
        return this.f403748a ? java.lang.String.format("only-of-type <%s>", this.f403749b) : java.lang.String.format("only-child", new java.lang.Object[0]);
    }
}
