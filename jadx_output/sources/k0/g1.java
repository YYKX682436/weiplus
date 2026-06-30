package k0;

/* loaded from: classes14.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p2.f f302915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f302916e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(p2.f fVar, n0.v2 v2Var) {
        super(1);
        this.f302915d = fVar;
        this.f302916e = v2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        z0.t tVar;
        yz5.a center = (yz5.a) obj;
        kotlin.jvm.internal.o.g(center, "center");
        z0.p pVar = z0.p.f468921d;
        a0.j2 style = a0.j2.f188d;
        k0.e1 e1Var = new k0.e1(center);
        k0.f1 f1Var = new k0.f1(this.f302915d, this.f302916e);
        y1.o0 o0Var = a0.i2.f177a;
        a0.x1 x1Var = a0.x1.f332d;
        kotlin.jvm.internal.o.g(style, "style");
        androidx.compose.ui.platform.e3 e3Var = androidx.compose.ui.platform.e3.f10553d;
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 28) {
            if (!(i17 >= 28)) {
                throw new java.lang.UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            }
            tVar = z0.m.b(pVar, null, new a0.h2(e1Var, x1Var, Float.NaN, f1Var, i17 == 28 ? a0.u2.f309a : a0.w2.f328a, style), 1, null);
        } else {
            tVar = pVar;
        }
        return androidx.compose.ui.platform.f3.a(pVar, e3Var, tVar);
    }
}
