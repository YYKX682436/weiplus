package l0;

/* loaded from: classes5.dex */
public abstract class t0 {
    public static final void a(yz5.p content, n0.o oVar, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(content, "content");
        java.lang.Object obj = n0.e1.f333492a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-1322912246);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.e(content) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i18 & 11) == 2 && y0Var.v()) {
            y0Var.O();
        } else {
            content.invoke(y0Var, java.lang.Integer.valueOf(i18 & 14));
        }
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f333608d = new l0.s0(content, i17);
    }
}
