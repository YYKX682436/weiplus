package gx4;

/* loaded from: classes5.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBagBgView f277422d;

    public l(com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBagBgView webViewBagBgView) {
        this.f277422d = webViewBagBgView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBagBgView webViewBagBgView = this.f277422d;
        webViewBagBgView.f183993q = true;
        webViewBagBgView.invalidate();
    }
}
