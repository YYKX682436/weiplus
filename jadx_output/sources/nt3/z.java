package nt3;

/* loaded from: classes10.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt3.a0 f339816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f339817e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(nt3.a0 a0Var, long j17) {
        super(0);
        this.f339816d = a0Var;
        this.f339817e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nt3.a0 a0Var = this.f339816d;
        ds0.d0 d0Var = a0Var.f339729t;
        if (d0Var != null) {
            d0Var.n();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mix audio used ");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - this.f339817e);
        com.tencent.mars.xlog.Log.i(a0Var.f339722m, sb6.toString());
        hs0.a aVar = a0Var.f339731v;
        if (aVar != null) {
            aVar.d();
        }
        a0Var.g(false);
        return jz5.f0.f302826a;
    }
}
