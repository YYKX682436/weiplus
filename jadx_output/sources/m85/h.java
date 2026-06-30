package m85;

/* loaded from: classes14.dex */
public abstract class h {
    public static final void a(yz5.p content, n0.o oVar, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(content, "content");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(419765489);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.e(content) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i18 & 11) == 2 && y0Var.v()) {
            y0Var.O();
        } else {
            java.lang.Object obj = n0.e1.f333492a;
            l0.i iVar = (l0.i) y0Var.i(l0.k.f314314a);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            l0.r0.a(l0.i.a(iVar, 0L, 0L, 0L, 0L, 0L, rz0.a.b(com.tencent.mm.R.color.f478491c, context), 0L, 0L, 0L, 0L, 0L, 0L, false, 8159, null), null, null, content, y0Var, (i18 << 9) & 7168, 6);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new m85.g(content, i17);
        }
    }
}
