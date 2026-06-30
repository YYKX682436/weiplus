package s56;

/* loaded from: classes16.dex */
public final class v implements p56.j {

    /* renamed from: a, reason: collision with root package name */
    public final p56.q f403252a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f403253b;

    /* renamed from: c, reason: collision with root package name */
    public final int f403254c;

    public v(p56.q qVar, boolean z17, int i17) {
        this.f403252a = qVar;
        this.f403253b = z17;
        this.f403254c = i17 <= 0 ? u56.l.f424833e : i17;
    }

    @Override // r56.e
    public java.lang.Object call(java.lang.Object obj) {
        p56.r rVar = (p56.r) obj;
        p56.q qVar = this.f403252a;
        if ((qVar instanceof t56.v) || (qVar instanceof t56.q0)) {
            return rVar;
        }
        s56.u uVar = new s56.u(qVar, rVar, this.f403253b, this.f403254c);
        s56.t tVar = new s56.t(uVar);
        p56.r rVar2 = uVar.f403241h;
        rVar2.g(tVar);
        rVar2.d(uVar.f403242i);
        rVar2.d(uVar);
        return uVar;
    }
}
