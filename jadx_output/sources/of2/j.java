package of2;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of2.m f345088d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(of2.m mVar) {
        super(1);
        this.f345088d = mVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        nf2.l1 style = (nf2.l1) obj;
        kotlin.jvm.internal.o.g(style, "style");
        of2.m mVar = this.f345088d;
        mVar.K = style;
        of2.d dVar = mVar.N;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
        ((nf2.g) mVar.I).a(mVar.f345091J, mVar.K);
        return jz5.f0.f302826a;
    }
}
