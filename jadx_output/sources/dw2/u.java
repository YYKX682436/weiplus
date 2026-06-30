package dw2;

/* loaded from: classes2.dex */
public final class u implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager f244166d;

    public u(com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager finderVideoAutoPlayManager) {
        this.f244166d = finderVideoAutoPlayManager;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = it.what;
        com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager finderVideoAutoPlayManager = this.f244166d;
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("Finder.VideoAutoPlayManager", "data change to check play...");
            finderVideoAutoPlayManager.I0(finderVideoAutoPlayManager.f130775h, false);
        } else if (i17 == 2) {
            java.lang.Object obj = it.obj;
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
            long longValue = ((java.lang.Long) obj).longValue();
            finderVideoAutoPlayManager.getClass();
            if (longValue == com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager.f130773z) {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            } else {
                com.tencent.mars.xlog.Log.i("Finder.VideoAutoPlayManager", "feedId:" + longValue + " no eqauls current center feed");
            }
        }
        return true;
    }
}
