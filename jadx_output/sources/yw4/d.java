package yw4;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f466951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yw4.i f466952b;

    public d(java.lang.String str, yw4.i iVar) {
        this.f466951a = str;
        this.f466952b = iVar;
    }

    @android.webkit.JavascriptInterface
    public final void forceH5(java.lang.String url) {
        yw4.i iVar = this.f466952b;
        iVar.z();
        iVar.c().f181921c0 = true;
        iVar.c().M();
        if (url == null || r26.n0.N(url)) {
            iVar.c().J0();
            return;
        }
        com.tencent.mm.plugin.webview.core.r0 c17 = iVar.c();
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mars.xlog.Log.i(c17.T(), "reload for:".concat(url));
        c17.f181916a.loadUrl(url);
        c17.f181921c0 = true;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getLocalData(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        try {
            nu4.k kVar = nu4.b0.f340241J;
            return nu4.b0.L.s(this.f466951a + '-' + key, "");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebPrefetcherInterceptor", e17, "getLocalData:".concat(key), new java.lang.Object[0]);
            return null;
        }
    }

    @android.webkit.JavascriptInterface
    public final void setLocalData(java.lang.String key, java.lang.String data) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(data, "data");
        try {
            nu4.k kVar = nu4.b0.f340241J;
            ((com.tencent.mm.sdk.platformtools.o4) nu4.b0.L.i()).D(this.f466951a + '-' + key, data);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebPrefetcherInterceptor", e17, "setLocalData:" + key + ", " + data, new java.lang.Object[0]);
        }
    }
}
