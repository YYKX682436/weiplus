package ey4;

/* loaded from: classes8.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyPanel f257606d;

    public a0(com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyPanel webViewSmileyPanel) {
        this.f257606d = webViewSmileyPanel;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyPanel webViewSmileyPanel = this.f257606d;
        webViewSmileyPanel.onPageSelected(webViewSmileyPanel.f187325i.getCurrentItem());
    }
}
