package m2;

/* loaded from: classes14.dex */
public abstract class d0 {
    public static final void a(m2.a0 compositionDataRecord, yz5.p content, n0.o oVar, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(compositionDataRecord, "compositionDataRecord");
        kotlin.jvm.internal.o.g(content, "content");
        java.lang.Object obj = n0.e1.f333492a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-913922352);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.e(compositionDataRecord) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 112) == 0) {
            i18 |= y0Var.e(content) ? 32 : 16;
        }
        if ((i18 & 91) == 18 && y0Var.v()) {
            y0Var.O();
        } else {
            y0Var.f333776q = true;
            java.util.Set set = ((m2.b0) compositionDataRecord).f322903a;
            set.add(y0Var.f333763d);
            n0.n1.a(new n0.i3[]{androidx.compose.ui.platform.h3.f10577a.b(java.lang.Boolean.TRUE), y0.d.f458489a.b(set)}, content, y0Var, (i18 & 112) | 8);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f333608d = new m2.c0(compositionDataRecord, content, i17);
    }
}
