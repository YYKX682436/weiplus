package wu;

/* loaded from: classes9.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu.b f449639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wu.y1 f449640e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(hu.b bVar, wu.y1 y1Var) {
        super(2);
        this.f449639d = bVar;
        this.f449640e = y1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.widget.ImageView contentIv = (android.widget.ImageView) obj;
        kotlin.jvm.internal.o.g(contentIv, "contentIv");
        pt.l0 l0Var = (pt.l0) i95.n0.c(pt.l0.class);
        android.content.Context context = contentIv.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        s15.h hVar = this.f449639d.f284997e;
        wu.y1 y1Var = this.f449640e;
        zt.k kVar = new zt.k("RecordDetailVideo", hVar, y1Var.f449610e.j());
        kVar.f475547d = y1Var.f449610e.f285004d;
        ((ot.w) l0Var).Zi(context, kVar, contentIv, new gk0.k(i65.a.B(contentIv.getContext()), i65.a.k(contentIv.getContext())), new wu.v1((yz5.a) obj2));
        return jz5.f0.f302826a;
    }
}
