package ro5;

/* loaded from: classes14.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f398228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f398229e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f398230f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(yz5.l lVar, ro5.m1 m1Var, int i17) {
        super(2);
        this.f398228d = lVar;
        this.f398229e = m1Var;
        this.f398230f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        int intValue = ((java.lang.Number) obj).intValue();
        so5.b bVar = (so5.b) this.f398228d.invoke(java.lang.Long.valueOf(((java.lang.Number) obj2).longValue()));
        ro5.m1 m1Var = this.f398229e;
        ro5.d0 d0Var = m1Var.f398246h;
        if (d0Var != null) {
            ((ro5.n) d0Var).a(this.f398230f, bVar.f410792a.getWidth(), bVar.f410792a.getHeight(), bVar.f410794c, bVar.f410795d);
        }
        dp5.d dVar = ((yo5.e) m1Var.f398242d.f455798i.getValue()).f464365n;
        if (dVar != null) {
            z17 = ro5.m1.a(m1Var, this.f398230f, dVar, new ro5.j0(bVar, m1Var, intValue));
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
