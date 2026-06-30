package wu;

/* loaded from: classes9.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu.b f449538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wu.b f449539e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(hu.b bVar, wu.b bVar2) {
        super(1);
        this.f449538d = bVar;
        this.f449539e = bVar2;
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
        s15.h hVar = this.f449538d.f284997e;
        wu.b bVar = this.f449539e;
        zt.k kVar = new zt.k("RecordDetailAppBrandFakeNative", hVar, bVar.f449610e.j());
        kVar.f475547d = bVar.f449610e.f285004d;
        pt.l0.zg(l0Var, context, kVar, contentIv, new gk0.k(i65.a.B(contentIv.getContext()), i65.a.k(contentIv.getContext())), null, 16, null);
        return jz5.f0.f302826a;
    }
}
