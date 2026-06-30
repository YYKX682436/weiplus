package rc3;

/* loaded from: classes7.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f394073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.MBBuildConfig f394074e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(rc3.w0 w0Var, com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig) {
        super(0);
        this.f394073d = w0Var;
        this.f394074e = mBBuildConfig;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rc3.w0 w0Var = this.f394073d;
        boolean a17 = bf3.h0.a(w0Var.f394099t, 1);
        java.lang.String str = w0Var.f394105z;
        if (a17) {
            com.tencent.mars.xlog.Log.w(str, "setup in wrong status " + w0Var.f394099t + " , discard event");
        } else {
            je3.o oVar = w0Var.f394103x;
            if (oVar != null) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                oVar.f299308d = elapsedRealtime;
                je3.i.M2(je3.k.f299298e, oVar.f299306b, oVar.f299305a, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene.BIND_SERVICE, elapsedRealtime - oVar.f299307c, null, 0.0f, 48, null);
            }
            je3.o oVar2 = w0Var.f394103x;
            if (oVar2 != null) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                oVar2.f299309e = android.os.SystemClock.elapsedRealtime();
            }
            w0Var.f394101v = true;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setup, has service?");
            sb6.append(w0Var.A != null);
            com.tencent.mm.sdk.platformtools.Log.c(str, sb6.toString(), new java.lang.Object[0]);
            qc3.f fVar = w0Var.A;
            if (fVar != null) {
                fVar.w3(this.f394074e);
            }
        }
        return jz5.f0.f302826a;
    }
}
