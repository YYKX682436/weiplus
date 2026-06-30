package t56;

/* loaded from: classes16.dex */
public class e0 implements p56.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t56.k0 f415870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t56.f0 f415871e;

    public e0(t56.f0 f0Var, t56.k0 k0Var) {
        this.f415871e = f0Var;
        this.f415870d = k0Var;
    }

    @Override // r56.b
    public void call(java.lang.Object obj) {
        p56.s sVar;
        p56.d dVar = (p56.d) ((p56.g) obj);
        a66.e eVar = dVar.f352091a;
        t56.k0 k0Var = this.f415870d;
        eVar.a(k0Var);
        p56.p pVar = this.f415871e.f415873a;
        int i17 = t56.k0.f415897d;
        p56.s sVar2 = (p56.s) k0Var.get();
        p56.s sVar3 = t56.l0.f415898h;
        if (sVar2 != a66.g.f1801a && sVar2 == (sVar = t56.l0.f415898h)) {
            p56.s a17 = k0Var.a(pVar);
            if (!k0Var.compareAndSet(sVar, a17)) {
                a17.c();
            }
        }
        dVar.f352091a.c();
    }
}
