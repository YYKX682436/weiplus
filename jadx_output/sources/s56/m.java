package s56;

/* loaded from: classes16.dex */
public final class m implements p56.i {

    /* renamed from: d, reason: collision with root package name */
    public final p56.l f403223d;

    /* renamed from: e, reason: collision with root package name */
    public final r56.e f403224e;

    public m(p56.l lVar, r56.e eVar) {
        this.f403223d = lVar;
        this.f403224e = eVar;
    }

    @Override // r56.b
    public void call(java.lang.Object obj) {
        p56.r rVar = (p56.r) obj;
        s56.l lVar = new s56.l(rVar, this.f403224e);
        rVar.d(lVar);
        this.f403223d.h(lVar);
    }
}
