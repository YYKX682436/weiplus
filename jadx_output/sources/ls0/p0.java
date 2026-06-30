package ls0;

/* loaded from: classes10.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.r0 f320880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f320881e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(ls0.r0 r0Var, long j17) {
        super(0);
        this.f320880d = r0Var;
        this.f320881e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ls0.r0 r0Var = this.f320880d;
        ds0.d0 d0Var = r0Var.E;
        if (d0Var != null) {
            d0Var.n();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mix audio used ");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - this.f320881e);
        com.tencent.mars.xlog.Log.i(r0Var.f320916t, sb6.toString());
        hs0.a aVar = r0Var.I;
        if (aVar != null) {
            aVar.d();
        }
        r0Var.g(false);
        return jz5.f0.f302826a;
    }
}
