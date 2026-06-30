package pw4;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.xweb.WebView f358709a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f358710b = false;

    @android.webkit.JavascriptInterface
    public boolean _customEnterFullscreen(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CustomFullscreenApi", "_customEnterFullscreen %b", java.lang.Boolean.valueOf(z17));
        return a(z17);
    }

    public boolean a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CustomFullscreenApi", "setCustomEnterFullscreen %b", java.lang.Boolean.valueOf(z17));
        com.tencent.xweb.WebView webView = this.f358709a;
        if (webView == null || !webView.isXWalkKernel()) {
            return false;
        }
        if (!((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(this.f358709a.getUrl())) {
            return false;
        }
        this.f358709a.S(z17);
        this.f358710b = z17;
        return true;
    }
}
