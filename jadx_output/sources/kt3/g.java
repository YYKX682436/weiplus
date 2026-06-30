package kt3;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kt3.l f311984d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(kt3.l lVar) {
        super(1);
        this.f311984d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        kt3.l lVar = this.f311984d;
        if (booleanValue) {
            lVar.z();
            if (st3.t.f412601e) {
                at0.n nVar = lVar.f311996p;
                kotlin.jvm.internal.o.d(nVar);
                st3.t.a(nVar.f13594b.v(true));
            }
        } else {
            bi3.f fVar = lVar.f312001u;
            if (fVar != null) {
                fVar.a();
            }
        }
        return jz5.f0.f302826a;
    }
}
