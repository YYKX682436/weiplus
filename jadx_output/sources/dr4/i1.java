package dr4;

/* loaded from: classes14.dex */
public final class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.p1 f242649d;

    public i1(dr4.p1 p1Var) {
        this.f242649d = p1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr4.c0 c0Var;
        dr4.p1 p1Var = this.f242649d;
        boolean z17 = true;
        if (p1Var.f242707f) {
            wo.e eVar = wo.v1.f447822b;
            if (eVar.f447660e != 1 && eVar.f447661f != 1) {
                return;
            }
        }
        xq4.a aVar = p1Var.f242704c;
        if (kotlin.jvm.internal.o.b(aVar != null ? java.lang.Boolean.valueOf(((zq4.b) aVar).f475050j) : null, java.lang.Boolean.TRUE)) {
            return;
        }
        xq4.a aVar2 = p1Var.f242704c;
        if (aVar2 != null) {
            if (!(aVar2 != null ? ((zq4.b) aVar2).f475041a : true)) {
                z17 = false;
            }
        }
        dr4.x1 x1Var = p1Var.f242708g;
        if (x1Var == null || (c0Var = x1Var.f242762b) == null) {
            return;
        }
        dr4.p1.a(p1Var, c0Var, z17);
    }
}
