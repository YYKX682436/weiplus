package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class y2 extends kotlinx.coroutines.w2 {

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.c3 f310702h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.z2 f310703i;

    /* renamed from: m, reason: collision with root package name */
    public final kotlinx.coroutines.x f310704m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Object f310705n;

    public y2(kotlinx.coroutines.c3 c3Var, kotlinx.coroutines.z2 z2Var, kotlinx.coroutines.x xVar, java.lang.Object obj) {
        this.f310702h = c3Var;
        this.f310703i = z2Var;
        this.f310704m = xVar;
        this.f310705n = obj;
    }

    @Override // yz5.l
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        u((java.lang.Throwable) obj);
        return jz5.f0.f302826a;
    }

    @Override // kotlinx.coroutines.g0
    public void u(java.lang.Throwable th6) {
        kotlinx.coroutines.c3 c3Var = this.f310702h;
        kotlinx.coroutines.x X = c3Var.X(this.f310704m);
        kotlinx.coroutines.z2 z2Var = this.f310703i;
        java.lang.Object obj = this.f310705n;
        if (X == null || !c3Var.g0(z2Var, X, obj)) {
            c3Var.u(c3Var.I(z2Var, obj));
        }
    }
}
