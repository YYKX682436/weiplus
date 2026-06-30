package fn5;

/* loaded from: classes14.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f264755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f264757f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f264758g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f264759h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(yz5.a aVar, java.lang.String str, int i17, java.util.ArrayList arrayList, yz5.l lVar) {
        super(2);
        this.f264755d = aVar;
        this.f264756e = str;
        this.f264757f = i17;
        this.f264758g = arrayList;
        this.f264759h = lVar;
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
        z0.p pVar = z0.p.f468921d;
        int i18 = aq.o.f12920a ? com.tencent.mm.R.color.f478489a : com.tencent.mm.R.color.f478512u;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        l0.a2.a(a0.b.c(pVar, rz0.a.b(i18, context), null, 2, null), null, 0L, 0L, null, 0.0f, u0.j.b(oVar, -207716989, true, new fn5.q(this.f264755d, this.f264756e, this.f264757f, this.f264758g, this.f264759h)), oVar, 1572864, 62);
        return jz5.f0.f302826a;
    }
}
