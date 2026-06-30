package hw;

/* loaded from: classes7.dex */
public final class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw.a1 f285449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.MBBuildConfig f285450e;

    public y0(hw.a1 a1Var, com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig) {
        this.f285449d = a1Var;
        this.f285450e = mBBuildConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = this.f285450e;
        hw.a1 a1Var = this.f285449d;
        a1Var.I1(mBBuildConfig);
        a1Var.start();
    }
}
