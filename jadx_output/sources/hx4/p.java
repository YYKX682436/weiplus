package hx4;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final jx4.a f285682a;

    /* renamed from: b, reason: collision with root package name */
    public long f285683b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f285684c;

    /* renamed from: d, reason: collision with root package name */
    public int f285685d;

    /* renamed from: e, reason: collision with root package name */
    public int f285686e;

    /* renamed from: f, reason: collision with root package name */
    public lx4.j f285687f;

    /* renamed from: g, reason: collision with root package name */
    public final hx4.d f285688g;

    /* renamed from: h, reason: collision with root package name */
    public final hx4.g f285689h;

    public p(jx4.a uiModel) {
        kotlin.jvm.internal.o.g(uiModel, "uiModel");
        this.f285682a = uiModel;
        this.f285684c = new java.util.ArrayList();
        this.f285686e = -1;
        this.f285688g = new hx4.d(this);
        this.f285689h = new hx4.g(this);
    }

    public static final void a(hx4.p pVar, int i17) {
        pVar.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("show_webview_menu", i17 != 5);
        pVar.b(0, intent);
        hx4.s.a(pVar.f285683b, i17, pVar.f285685d);
    }

    public final void b(int i17, android.content.Intent intent) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Boolean.valueOf(intent == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.BrowserChooseController", "finishUI resultCode: %d, data == null: %b", objArr);
        com.tencent.mm.plugin.webview.ui.tools.browser.BrowserChooseUI browserChooseUI = (com.tencent.mm.plugin.webview.ui.tools.browser.BrowserChooseUI) this.f285682a;
        browserChooseUI.setResult(i17, intent);
        browserChooseUI.finish();
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BrowserChooseController", "showBrowserChooseDialog");
        com.tencent.mm.plugin.webview.ui.tools.browser.BrowserChooseUI browserChooseUI = (com.tencent.mm.plugin.webview.ui.tools.browser.BrowserChooseUI) this.f285682a;
        lx4.b bVar = new lx4.b(browserChooseUI.getContext());
        bVar.setOnKeyListener(new hx4.i(bVar, this));
        bVar.setOnCancelListener(new hx4.j(this));
        bVar.f322116h = this.f285688g;
        java.util.List list = this.f285684c;
        kotlin.jvm.internal.o.g(list, "list");
        bVar.f322114f = list;
        android.content.Intent intent = (android.content.Intent) browserChooseUI.getIntent().getParcelableExtra("targetintent");
        bVar.f322117i = intent != null ? intent.getBooleanExtra("show_browser_setting_entry", false) : false;
        browserChooseUI.getClass();
        bVar.show();
    }
}
