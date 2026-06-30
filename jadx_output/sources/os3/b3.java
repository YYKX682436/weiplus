package os3;

/* loaded from: classes8.dex */
public class b3 extends com.tencent.xweb.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.MailWebViewUI f348042a;

    public b3(com.tencent.mm.plugin.qqmail.ui.MailWebViewUI mailWebViewUI) {
        this.f348042a = mailWebViewUI;
    }

    @Override // com.tencent.xweb.h1
    public boolean B(com.tencent.xweb.WebView webView, java.lang.String str) {
        if (str.startsWith("weixin://private/getcontentwidth/")) {
            com.tencent.mm.plugin.qqmail.ui.MailWebViewUI.T6(this.f348042a, str);
            return true;
        }
        webView.loadUrl(str);
        return true;
    }

    @Override // com.tencent.xweb.h1
    public void n(com.tencent.xweb.WebView webView, java.lang.String str) {
        ((yg0.s4) ((zg0.q3) i95.n0.c(zg0.q3.class))).getClass();
        com.tencent.mm.pluginsdk.ui.tools.e9.i(webView, "weixin://private/getcontentwidth/", "document.getElementsByTagName('html')[0].scrollWidth;", true);
    }

    @Override // com.tencent.xweb.h1
    public void v(com.tencent.xweb.WebView webView, float f17, float f18) {
        this.f348042a.f154909d.getSettings().F(android.webkit.WebSettings.LayoutAlgorithm.NORMAL);
    }
}
