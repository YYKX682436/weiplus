package wu;

/* loaded from: classes9.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu.b f449548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wu.d f449549e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(hu.b bVar, wu.d dVar) {
        super(1);
        this.f449548d = bVar;
        this.f449549e = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.ImageView contentIv = (android.widget.ImageView) obj;
        kotlin.jvm.internal.o.g(contentIv, "contentIv");
        i95.m c17 = i95.n0.c(pt.l0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        pt.l0 l0Var = (pt.l0) c17;
        android.content.Context context = contentIv.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        s15.h hVar = this.f449548d.f284997e;
        wu.d dVar = this.f449549e;
        zt.k kVar = new zt.k("RecordDetailAppBrand", hVar, dVar.f449610e.j());
        kVar.f475547d = dVar.f449610e.f285004d;
        pt.l0.zg(l0Var, context, kVar, contentIv, new gk0.k(i65.a.B(contentIv.getContext()), i65.a.k(contentIv.getContext())), null, 16, null);
        return jz5.f0.f302826a;
    }
}
