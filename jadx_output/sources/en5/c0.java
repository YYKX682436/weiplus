package en5;

/* loaded from: classes14.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aq.d f255369d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(aq.d dVar) {
        super(3);
        this.f255369d = dVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        e0.g stickyHeader = (e0.g) obj;
        n0.o oVar = (n0.o) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(stickyHeader, "$this$stickyHeader");
        if ((intValue & 81) == 16) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj4 = n0.e1.f333492a;
        java.lang.String str = this.f255369d.f12849a;
        long z17 = ((p2.f) ((n0.y0) oVar).i(androidx.compose.ui.platform.m2.f10646e)).z(i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479850gz)));
        int i17 = aq.o.f12920a ? com.tencent.mm.R.color.FG_0 : com.tencent.mm.R.color.BW_100_Alpha_0_8;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        long b17 = rz0.a.b(i17, context);
        int i18 = z0.t.f468922q1;
        float f17 = 8;
        float f18 = ((float) 0.75d) * f17;
        tz0.x.b(str, d0.a2.j(z0.p.f468921d, ((float) 1.5d) * f17, f18, 0.0f, f18, 4, null), b17, z17, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, oVar, 48, 0, 65520);
        return jz5.f0.f302826a;
    }
}
