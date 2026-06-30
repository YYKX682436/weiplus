package wu;

/* loaded from: classes9.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu.b f449604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wu.p f449605e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(hu.b bVar, wu.p pVar) {
        super(1);
        this.f449604d = bVar;
        this.f449605e = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.ImageView it = (android.widget.ImageView) obj;
        kotlin.jvm.internal.o.g(it, "it");
        i95.m c17 = i95.n0.c(pt.l0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        pt.l0 l0Var = (pt.l0) c17;
        android.content.Context context = it.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        s15.h hVar = this.f449604d.f284997e;
        wu.p pVar = this.f449605e;
        zt.k kVar = new zt.k("RecordQuote", hVar, pVar.f449610e.j());
        kVar.f475547d = pVar.f449610e.f285004d;
        pt.l0.zg(l0Var, context, kVar, it, new gk0.k(i65.a.B(it.getContext()), i65.a.k(it.getContext())), null, 16, null);
        return jz5.f0.f302826a;
    }
}
