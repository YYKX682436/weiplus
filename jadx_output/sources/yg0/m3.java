package yg0;

/* loaded from: classes8.dex */
public final class m3 implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public static final yg0.m3 f462218d = new yg0.m3();

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "preloadIdleHandler: will preload WebView");
        if (((su4.f1) i95.n0.c(su4.f1.class)) != null && com.tencent.mm.pluginsdk.model.g4.c()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchLiteAppJsApiFeatureService", "try preload wearch webView for scene: 123");
            ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
            if (su4.r2.h(false) != 0) {
                su4.r2.p(0L, false, true, 1);
            } else {
                su4.r2.o();
            }
        }
        return false;
    }
}
