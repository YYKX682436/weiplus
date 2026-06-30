package yg0;

@j95.b
/* loaded from: classes8.dex */
public final class u3 extends i95.w implements zg0.c3 {
    public void Ai(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        synchronized (com.tencent.mm.plugin.webview.util.WebViewControllerPreloadMrg.f187731a) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.webview.util.WebViewControllerPreloadMrg.f187732b;
            com.tencent.mm.plugin.webview.core.r0 r0Var = (com.tencent.mm.plugin.webview.core.r0) concurrentHashMap.get(url);
            if (r0Var == null) {
                return;
            }
            if (r0Var.M) {
                if (!r0Var.K) {
                    r0Var.f181916a.destroy();
                    r0Var.D0();
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewControllerPreloadMrg", "destroy ".concat(url));
                }
                com.tencent.mm.plugin.webview.util.WebViewControllerPreloadMrg.f187733c.remove(url);
                concurrentHashMap.remove(url);
            }
        }
    }

    public void wi() {
        com.tencent.mm.plugin.webview.util.WebViewControllerPreloadMrg.f187731a.b();
    }
}
