package p61;

/* loaded from: classes8.dex */
public class i extends com.tencent.xweb.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI f352286a;

    public i(com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI bindGoogleContactUI) {
        this.f352286a = bindGoogleContactUI;
    }

    @Override // com.tencent.xweb.h1
    public boolean B(com.tencent.xweb.WebView webView, java.lang.String str) {
        if (!str.toLowerCase().startsWith("weixin://private/googlegetcode")) {
            return this instanceof j82.h;
        }
        int i17 = com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI.f72928s;
        com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI bindGoogleContactUI = this.f352286a;
        bindGoogleContactUI.getClass();
        java.lang.String substring = str.substring(30);
        bindGoogleContactUI.X6();
        new p61.q(bindGoogleContactUI, substring).execute(new java.lang.Void[0]);
        return true;
    }

    @Override // com.tencent.xweb.h1
    public void n(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI bindGoogleContactUI = this.f352286a;
        com.tencent.mm.ui.widget.MMWebView mMWebView = bindGoogleContactUI.f72930e;
        if (mMWebView != null && mMWebView.getVisibility() != 0) {
            bindGoogleContactUI.f72930e.setVisibility(0);
            android.widget.TextView textView = bindGoogleContactUI.f72931f;
            if (textView != null) {
                textView.setVisibility(4);
            }
        }
        bindGoogleContactUI.U6();
        if (webView != null) {
            java.lang.String title = webView.getTitle();
            if (android.text.TextUtils.isEmpty(title)) {
                return;
            }
            if (!title.toLowerCase().contains(ya.b.SUCCESS)) {
                if (title.toLowerCase().contains("error")) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.GoogleContact.BindGoogleContactUI", "failed." + title.substring(title.indexOf("=")));
                    return;
                }
                return;
            }
            com.tencent.mm.ui.widget.MMWebView mMWebView2 = bindGoogleContactUI.f72930e;
            if (mMWebView2 != null) {
                mMWebView2.setVisibility(4);
            }
            zg0.q3 q3Var = (zg0.q3) i95.n0.c(zg0.q3.class);
            com.tencent.mm.ui.widget.MMWebView mMWebView3 = bindGoogleContactUI.f72930e;
            ((yg0.s4) q3Var).getClass();
            com.tencent.mm.pluginsdk.ui.tools.e9.i(mMWebView3, "weixin://private/googlegetcode", "document.getElementById('code').value", true);
        }
    }
}
