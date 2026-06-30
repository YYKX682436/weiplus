package dr4;

/* loaded from: classes14.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.p1 f242652d;

    public j1(dr4.p1 p1Var) {
        this.f242652d = p1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr4.x1 x1Var;
        dr4.c0 c0Var;
        dr4.p1 p1Var = this.f242652d;
        xq4.a aVar = p1Var.f242704c;
        if (aVar == null || (x1Var = p1Var.f242708g) == null || (c0Var = x1Var.f242762b) == null) {
            return;
        }
        dr4.p1.a(p1Var, c0Var, aVar != null ? ((zq4.b) aVar).f475041a : true);
    }
}
