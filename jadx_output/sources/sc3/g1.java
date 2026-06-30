package sc3;

/* loaded from: classes7.dex */
public final class g1 implements cl.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f406449b;

    public g1(sc3.k1 k1Var, long j17) {
        this.f406448a = k1Var;
        this.f406449b = j17;
    }

    @Override // cl.j1
    public final void a(java.lang.String str, cl.k1 k1Var) {
        sc3.k1 k1Var2 = this.f406448a;
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = k1Var2.f406482n;
        if (mBBuildConfig == null) {
            kotlin.jvm.internal.o.o("config");
            throw null;
        }
        if (mBBuildConfig.f147819f.length() > 0) {
            je3.k kVar = je3.k.f299298e;
            com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig2 = k1Var2.f406482n;
            if (mBBuildConfig2 == null) {
                kotlin.jvm.internal.o.o("config");
                throw null;
            }
            java.lang.String str2 = mBBuildConfig2.f147819f;
            java.lang.String str3 = k1Var2.D;
            com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene iMagicBrushMonitor$TimeCostScene = com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene.MAIN;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            je3.i.M2(kVar, str2, str3, iMagicBrushMonitor$TimeCostScene, android.os.SystemClock.elapsedRealtime() - this.f406449b, null, 0.0f, 48, null);
        }
        k1Var2.Y0();
    }
}
