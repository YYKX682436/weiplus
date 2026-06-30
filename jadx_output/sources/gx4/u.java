package gx4;

/* loaded from: classes8.dex */
public class u implements java.lang.Runnable {
    public u(gx4.w wVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBag webViewBag = gx4.t.INSTANCE.f277443d;
        if (webViewBag == null) {
            return;
        }
        webViewBag.setVisibility(8);
    }
}
