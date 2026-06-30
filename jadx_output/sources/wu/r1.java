package wu;

/* loaded from: classes9.dex */
public final class r1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu.b f449619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wu.u1 f449620e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(hu.b bVar, wu.u1 u1Var) {
        super(1);
        this.f449619d = bVar;
        this.f449620e = u1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.ImageView it = (android.widget.ImageView) obj;
        kotlin.jvm.internal.o.g(it, "it");
        i95.m c17 = i95.n0.c(pt.l0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.content.Context context = it.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        zt.k kVar = new zt.k("RecordDetailUrl", this.f449619d.f284997e, this.f449620e.f449610e.j());
        kVar.f475548e = false;
        pt.l0.zg((pt.l0) c17, context, kVar, it, new gk0.k(i65.a.B(it.getContext()), i65.a.k(it.getContext())), null, 16, null);
        return jz5.f0.f302826a;
    }
}
