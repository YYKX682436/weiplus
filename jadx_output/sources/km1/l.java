package km1;

/* loaded from: classes7.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km1.s f309013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f309014e;

    public l(km1.s sVar, yz5.l lVar) {
        this.f309013d = sVar;
        this.f309014e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i(this.f309013d.f309029f, "setupWebGLEnv, done");
        this.f309014e.invoke(java.lang.Boolean.TRUE);
    }
}
