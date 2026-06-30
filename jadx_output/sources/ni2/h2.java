package ni2;

/* loaded from: classes10.dex */
public final class h2 implements pj2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ni2.k2 f337326a;

    public h2(ni2.k2 k2Var) {
        this.f337326a = k2Var;
    }

    @Override // pj2.b
    public kotlinx.coroutines.y0 a() {
        return this.f337326a.f337361c.a();
    }

    @Override // pj2.b
    public int b() {
        xh2.i iVar;
        xh2.a aVar = this.f337326a.f337362d;
        if (aVar == null || (iVar = aVar.f454521b) == null) {
            return 0;
        }
        return iVar.f454553e;
    }
}
