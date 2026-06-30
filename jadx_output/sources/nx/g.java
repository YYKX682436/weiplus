package nx;

/* loaded from: classes8.dex */
public class g extends com.tencent.mm.sdk.event.n {
    public g() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        long j17 = ((com.tencent.mm.autogen.events.DestroyPreloadedWebViewEvent) iEvent).f54089g.f6217a;
        ls1.j0 j0Var = ls1.j0.f320995a;
        synchronized (ls1.j0.class) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = ls1.j0.f320997c;
            com.tencent.mars.xlog.Log.i("MicroMsg.Preload.TmplWebViewManager", "MultiWebView-Trace destroy " + concurrentHashMap.size() + " webView for MpStartedWebView");
            java.util.Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                ls1.e0 e0Var = (ls1.e0) ((java.util.Map.Entry) it.next()).getValue();
                e0Var.getClass();
                pm0.v.X(new com.tencent.mm.plugin.webview.core.w(e0Var));
            }
            ls1.j0.f320997c.clear();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = ls1.j0.f320996b;
            com.tencent.mars.xlog.Log.i("MicroMsg.Preload.TmplWebViewManager", "MultiWebView-Trace destroy " + concurrentHashMap2.size() + " webView for MpCachedWebView");
            java.util.Iterator it6 = concurrentHashMap2.entrySet().iterator();
            while (it6.hasNext()) {
                ls1.e0 e0Var2 = (ls1.e0) ((java.util.Map.Entry) it6.next()).getValue();
                e0Var2.getClass();
                pm0.v.X(new com.tencent.mm.plugin.webview.core.w(e0Var2));
            }
            ls1.j0.f320996b.clear();
        }
        return false;
    }
}
