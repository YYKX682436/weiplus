package sx4;

/* loaded from: classes8.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f413637a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI f413638b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMWebView f413639c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f413640d;

    /* renamed from: e, reason: collision with root package name */
    public final sx4.s0 f413641e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.stub.v0 f413642f;

    /* renamed from: g, reason: collision with root package name */
    public nw4.n f413643g;

    /* renamed from: h, reason: collision with root package name */
    public final kh0.h f413644h;

    /* renamed from: i, reason: collision with root package name */
    public sx4.p f413645i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f413646j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.game.report.api.GameWebPerformanceInfo f413647k;

    /* renamed from: l, reason: collision with root package name */
    public final sx4.d0 f413648l;

    /* renamed from: m, reason: collision with root package name */
    public long f413649m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f413650n;

    /* renamed from: o, reason: collision with root package name */
    public final sx4.v f413651o = new sx4.g(this);

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.widget.x3 f413652p = new sx4.n(this);

    public q(com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI gameWebViewUI, android.view.ViewGroup viewGroup, java.lang.String str) {
        com.tencent.mm.game.report.api.GameWebPerformanceInfo a17 = com.tencent.mm.game.report.api.GameWebPerformanceInfo.a(str);
        this.f413647k = a17;
        a17.f68174d = str;
        a17.f68175e = (gameWebViewUI.hashCode() & Integer.MAX_VALUE) + "_" + (str.hashCode() & Integer.MAX_VALUE);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        a17.f68185r = gameWebViewUI.getIntent().getLongExtra("start_time", currentTimeMillis);
        a17.f68187t = gameWebViewUI.getIntent().getLongExtra("start_activity_time", currentTimeMillis);
        a17.f68192y = currentTimeMillis;
        a17.A = currentTimeMillis;
        sx4.d0 a18 = sx4.d0.a(str);
        this.f413648l = a18;
        a18.f413583b = java.lang.System.currentTimeMillis();
        this.f413637a = gameWebViewUI;
        this.f413638b = gameWebViewUI;
        this.f413640d = viewGroup;
        com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi a19 = com.tencent.mm.plugin.webview.ui.tools.widget.p4.a(gameWebViewUI);
        a19.setBackgroundResource(android.R.color.transparent);
        a19.setBackgroundColor(0);
        a19.setVisibility(4);
        sx4.p pVar = new sx4.p(this, a19);
        this.f413645i = pVar;
        a19.setWebViewClient(pVar);
        a19.setWebChromeClient(new sx4.o(this, a19));
        com.tencent.mars.xlog.Log.i("MicroMsg.GameFloatWebView", "createFloatWebView, webview: %d, floatWebViewClient: %d", java.lang.Integer.valueOf(a19.hashCode()), java.lang.Integer.valueOf(this.f413645i.hashCode()));
        a19.getSettings().E(true);
        a19.getSettings().z(true);
        a19.getSettings().r(false);
        a19.getSettings().P(true);
        a19.getSettings().G(true);
        a19.getSettings().M(false);
        a19.getSettings().L(false);
        a19.getSettings().C(true);
        a19.getSettings().D(true);
        a19.getSettings().J(0);
        a19.getSettings().l(10485760L);
        a19.getSettings().m(gameWebViewUI.getDir("webviewcache", 0).getAbsolutePath());
        a19.getSettings().k(true);
        a19.getSettings().t(true);
        a19.getSettings().u(lp0.b.X() + "databases/");
        com.tencent.xweb.d.g().d(true);
        com.tencent.xweb.d.g().f(a19, true);
        this.f413639c = a19;
        this.f413641e = new sx4.s0(gameWebViewUI.getIntent());
        ((jh0.v) ((kh0.g) i95.n0.c(kh0.g.class))).getClass();
        vz4.x xVar = new vz4.x();
        this.f413644h = xVar;
        xVar.f441764l = new sx4.h(this);
        a17.B = java.lang.System.currentTimeMillis();
        a18.f413584c = java.lang.System.currentTimeMillis();
    }

    public void a() {
        if (this.f413650n) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameFloatWebView", "onDestroy");
        this.f413650n = true;
        this.f413651o.f413666f.a();
        ((vz4.x) this.f413644h).g(true);
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f413639c;
        if (mMWebView != null) {
            mMWebView.setWebViewClient(null);
            mMWebView.setWebChromeClient(null);
        }
        com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo = this.f413647k;
        gameWebPerformanceInfo.I += java.lang.System.currentTimeMillis() - this.f413649m;
        gameWebPerformanceInfo.f68173J = java.lang.System.currentTimeMillis();
        jj0.a.a().e(gameWebPerformanceInfo);
    }
}
