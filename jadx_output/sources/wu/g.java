package wu;

/* loaded from: classes9.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu.b f449576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wu.k f449577e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(hu.b bVar, wu.k kVar) {
        super(1);
        this.f449576d = bVar;
        this.f449577e = kVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.ImageView thumb = (android.widget.ImageView) obj;
        kotlin.jvm.internal.o.g(thumb, "thumb");
        i95.m c17 = i95.n0.c(pt.l0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.content.Context context = thumb.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        zt.k kVar = new zt.k("RecordDetailUrl", this.f449576d.f284997e, this.f449577e.f449610e.j());
        kVar.f475548e = false;
        pt.l0.zg((pt.l0) c17, context, kVar, thumb, new gk0.k(i65.a.B(thumb.getContext()), i65.a.k(thumb.getContext())), null, 16, null);
        return jz5.f0.f302826a;
    }
}
