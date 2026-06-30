package wu;

/* loaded from: classes9.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu.b f449585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wu.k f449586e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(hu.b bVar, wu.k kVar) {
        super(2);
        this.f449585d = bVar;
        this.f449586e = kVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.widget.ImageView thumb = (android.widget.ImageView) obj;
        yz5.l successCallback = (yz5.l) obj2;
        kotlin.jvm.internal.o.g(thumb, "thumb");
        kotlin.jvm.internal.o.g(successCallback, "successCallback");
        pt.l0 l0Var = (pt.l0) i95.n0.c(pt.l0.class);
        android.content.Context context = thumb.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        zt.k kVar = new zt.k("RecordDetailUrl", this.f449585d.f284997e, this.f449586e.f449610e.j());
        kVar.f475548e = false;
        ((ot.w) l0Var).Zi(context, kVar, thumb, new gk0.k(i65.a.B(thumb.getContext()), i65.a.k(thumb.getContext())), new wu.h(successCallback));
        return jz5.f0.f302826a;
    }
}
