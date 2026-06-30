package kz0;

/* loaded from: classes14.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final kz0.b f313659d = new kz0.b();

    public b() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj3 = n0.e1.f333492a;
        int i17 = z0.t.f468922q1;
        z0.t e17 = d0.a3.e(z0.p.f468921d, 0.0f, 1, null);
        e1.q qVar = e1.r.f246285a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        e1.y yVar = new e1.y(rz0.a.b(com.tencent.mm.R.color.a9e, context));
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        d0.y.a(a0.b.a(e17, e1.q.a(qVar, kz5.c0.i(yVar, new e1.y(rz0.a.b(com.tencent.mm.R.color.BW_0_Alpha_0_5, context2))), 0.0f, 0.0f, 0, 14, null), null, 0.0f, 6, null), oVar, 0);
        return jz5.f0.f302826a;
    }
}
