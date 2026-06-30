package df2;

/* loaded from: classes11.dex */
public final class i2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.k2 f230378d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(df2.k2 k2Var) {
        super(0);
        this.f230378d = k2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        df2.k2 k2Var = this.f230378d;
        if (!k2Var.a7()) {
            com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "startMediaBrowserIfNeeded - Skip start, switch is closed");
        } else if (!dk2.ef.f233384g) {
            android.support.v4.media.m mVar = k2Var.f230544m;
            if (mVar != null && ((android.support.v4.media.g) mVar.f8937a).f8927b.isConnected()) {
                com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "connectMediaBrowser - Already connected, skip");
            } else if (k2Var.f230546o) {
                com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "connectMediaBrowser - Connecting in progress, skip");
            } else {
                k2Var.f230546o = true;
                com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "connectMediaBrowser - Creating MediaBrowser");
                android.support.v4.media.m mVar2 = new android.support.v4.media.m(com.tencent.mm.sdk.platformtools.x2.f193071a, new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.finder.media.FinderLiveMediaBrowserService.class), new df2.f2(k2Var), null);
                k2Var.f230544m = mVar2;
                ((android.support.v4.media.g) mVar2.f8937a).f8927b.connect();
            }
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "startMediaBrowserIfNeeded - Skip start, current user not supported");
        }
        return jz5.f0.f302826a;
    }
}
