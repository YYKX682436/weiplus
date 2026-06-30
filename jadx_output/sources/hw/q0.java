package hw;

/* loaded from: classes7.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw.s0 f285422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.MBBuildConfig f285423e;

    public q0(hw.s0 s0Var, com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig) {
        this.f285422d = s0Var;
        this.f285423e = mBBuildConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = this.f285423e;
        hw.s0 s0Var = this.f285422d;
        s0Var.I1(mBBuildConfig);
        s0Var.start();
    }
}
