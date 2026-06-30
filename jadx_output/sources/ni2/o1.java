package ni2;

/* loaded from: classes10.dex */
public final class o1 implements pj2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ni2.r1 f337395a;

    public o1(ni2.r1 r1Var) {
        this.f337395a = r1Var;
    }

    @Override // pj2.b
    public kotlinx.coroutines.y0 a() {
        return this.f337395a.f337453c.a();
    }

    @Override // pj2.b
    public int b() {
        xh2.i iVar;
        xh2.a aVar = this.f337395a.f337454d;
        if (aVar == null || (iVar = aVar.f454521b) == null) {
            return 0;
        }
        return iVar.f454553e;
    }
}
