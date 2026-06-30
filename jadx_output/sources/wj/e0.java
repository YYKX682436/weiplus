package wj;

/* loaded from: classes3.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f446397e;

    public e0(java.lang.String str, java.lang.Runnable runnable) {
        this.f446396d = str;
        this.f446397e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "innerPullAds, delay pull ads task evaluate, posId: " + this.f446396d);
        this.f446397e.run();
    }
}
