package cx;

/* loaded from: classes7.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cx.p1 f224447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.MBBuildConfig f224448e;

    public n1(cx.p1 p1Var, com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig) {
        this.f224447d = p1Var;
        this.f224448e = mBBuildConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = this.f224448e;
        cx.p1 p1Var = this.f224447d;
        p1Var.I1(mBBuildConfig);
        p1Var.start();
    }
}
