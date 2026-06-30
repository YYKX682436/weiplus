package hq0;

/* loaded from: classes7.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq0.b0 f283075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f283076e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(hq0.b0 b0Var, boolean z17) {
        super(0);
        this.f283075d = b0Var;
        this.f283076e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        hq0.b0 b0Var = this.f283075d;
        if (b0Var.f282995g == null) {
            com.tencent.mars.xlog.Log.i(b0Var.f282971y, "startImpl but magicBrush null");
            b0Var.Q1();
        }
        b0Var.I = this.f283076e;
        b0Var.H = true;
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = new com.tencent.mm.plugin.magicbrush.MBBuildConfig(null, null, null, null, false, false, false, null, false, null, 1023, null);
        mBBuildConfig.f147834x = b0Var;
        mBBuildConfig.f147821h = z65.c.a();
        mBBuildConfig.a(b0Var.T);
        java.util.HashSet hashSet = b0Var.f282970x.f293637d;
        if (hashSet != null) {
            com.tencent.mm.plugin.magicbrush.y4.a(mBBuildConfig, hashSet);
        }
        b0Var.I1(mBBuildConfig);
        b0Var.start();
        return jz5.f0.f302826a;
    }
}
