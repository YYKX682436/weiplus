package of2;

/* loaded from: classes10.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of2.m f345086d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(of2.m mVar) {
        super(1);
        this.f345086d = mVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        nf2.a mode = (nf2.a) obj;
        kotlin.jvm.internal.o.g(mode, "mode");
        of2.m mVar = this.f345086d;
        mVar.f345091J = mode;
        of2.g gVar = mVar.M;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
        ((nf2.g) mVar.I).a(mVar.f345091J, mVar.K);
        return jz5.f0.f302826a;
    }
}
