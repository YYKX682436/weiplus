package su4;

/* loaded from: classes8.dex */
public class w2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ su4.d3 f413131e;

    public w2(su4.d3 d3Var, java.lang.String str) {
        this.f413131e = d3Var;
        this.f413130d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        su4.d3 d3Var = this.f413131e;
        int i18 = d3Var.f412859b;
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i18)};
        java.lang.String str = d3Var.f412858a;
        com.tencent.mars.xlog.Log.i(str, "real start preloadWebView cached webview preloadBiz %d", objArr);
        d3Var.f412862e = java.lang.System.currentTimeMillis();
        com.tencent.mm.ui.widget.MMWebView a17 = al5.l2.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mars.xlog.Log.i(str, "Create MMWebView %s", a17.getCurrentInstanceWebCoreType());
        a17.setPreload(true);
        a17.setRandomStr(com.tencent.mm.sdk.platformtools.t8.Y(16));
        a17.getSettings().E(true);
        a17.getSettings().z(true);
        a17.getSettings().r(false);
        a17.getSettings().P(true);
        a17.getSettings().G(true);
        a17.getSettings().M(false);
        a17.getSettings().L(false);
        a17.getSettings().C(true);
        a17.getSettings().D(true);
        a17.getSettings().J(0);
        a17.getSettings().l(10485760L);
        a17.getSettings().m(a17.getContext().getDir("webviewcache", 0).getAbsolutePath());
        a17.getSettings().k(true);
        a17.getSettings().t(true);
        a17.getSettings().u(lp0.b.X() + "databases/");
        com.tencent.xweb.d.g().d(true);
        com.tencent.xweb.d.g().f(a17, true);
        zg0.q3 q3Var = (zg0.q3) i95.n0.c(zg0.q3.class);
        android.content.Context context = a17.getContext();
        java.lang.String g17 = a17.getSettings().g();
        ((yg0.s4) q3Var).getClass();
        a17.getSettings().Q(com.tencent.mm.pluginsdk.ui.tools.e9.b(context, g17));
        nw4.p2 p2Var = new nw4.p2();
        a17.addJavascriptInterface(p2Var, "__wx");
        java.lang.String str2 = this.f413130d;
        a17.loadUrl(str2);
        android.net.Uri parse = android.net.Uri.parse(str2);
        java.lang.String queryParameter = parse.getQueryParameter(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
        java.lang.String queryParameter2 = parse.getQueryParameter("subSessionId");
        try {
            i17 = java.lang.Integer.valueOf(parse.getQueryParameter(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)).intValue();
        } catch (java.lang.Exception unused) {
            i17 = 0;
        }
        a17.setWebViewClient(new su4.x2(d3Var, a17, new su4.e3(a17, queryParameter, queryParameter2, p2Var, i17)));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15005, java.lang.Integer.valueOf(i18), 1, 0);
    }
}
