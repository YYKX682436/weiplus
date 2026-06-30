package tz0;

/* loaded from: classes14.dex */
public abstract class a0 {
    public static final void a(yz5.p content, n0.o oVar, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(content, "content");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1209355651);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.e(content) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i18 & 11) == 2 && y0Var.v()) {
            y0Var.O();
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            n0.h3 h3Var = a0.v1.f319a;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            n0.n1.a(new n0.i3[]{h3Var.b(m0.x.a(false, 0.0f, rz0.a.b(com.tencent.mm.R.color.BW_0_Alpha_0_1, context), y0Var, 0, 3))}, u0.j.b(y0Var, 469869123, true, new tz0.y(content)), y0Var, 56);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new tz0.z(content, i17);
        }
    }
}
