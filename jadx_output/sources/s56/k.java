package s56;

/* loaded from: classes16.dex */
public final class k implements p56.i {

    /* renamed from: d, reason: collision with root package name */
    public final p56.i f403218d;

    /* renamed from: e, reason: collision with root package name */
    public final p56.j f403219e;

    public k(p56.i iVar, p56.j jVar) {
        this.f403218d = iVar;
        this.f403219e = jVar;
    }

    @Override // r56.b
    public void call(java.lang.Object obj) {
        p56.r rVar = (p56.r) obj;
        try {
            p56.j jVar = this.f403219e;
            r56.e eVar = x56.m.f452138k;
            if (eVar != null) {
                jVar = (p56.j) ((x56.l) eVar).call(jVar);
            }
            p56.r rVar2 = (p56.r) jVar.call(rVar);
            try {
                rVar2.e();
                this.f403218d.call(rVar2);
            } catch (java.lang.Throwable th6) {
                q56.f.b(th6);
                rVar2.onError(th6);
            }
        } catch (java.lang.Throwable th7) {
            q56.f.b(th7);
            rVar.onError(th7);
        }
    }
}
