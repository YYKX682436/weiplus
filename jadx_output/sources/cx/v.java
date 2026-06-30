package cx;

/* loaded from: classes7.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cx.x f224474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.MBBuildConfig f224475e;

    public v(cx.x xVar, com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig) {
        this.f224474d = xVar;
        this.f224475e = mBBuildConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = this.f224475e;
        cx.x xVar = this.f224474d;
        xVar.I1(mBBuildConfig);
        xVar.start();
    }
}
