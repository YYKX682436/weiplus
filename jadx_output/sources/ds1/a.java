package ds1;

/* loaded from: classes7.dex */
public final class a extends lu4.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ds1.b context) {
        super("WxGameJsCoreNative", context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @android.webkit.JavascriptInterface
    public final void error(java.lang.String str) {
        ((ds1.e) ((ds1.b) this.f321430b)).getClass();
        if (str == null) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "[game-web-prefetch] js console error: %s", str);
    }

    @android.webkit.JavascriptInterface
    public final void log(java.lang.String str) {
        ((ds1.e) ((ds1.b) this.f321430b)).getClass();
        if (str == null) {
            return;
        }
        com.tencent.mars.xlog.Log.getLogLevel();
    }

    @android.webkit.JavascriptInterface
    public final void postMessage(java.lang.String str) {
        ((ds1.e) ((ds1.b) this.f321430b)).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "[game-web-prefetch] postMessage ignore msg: %s", str);
    }
}
