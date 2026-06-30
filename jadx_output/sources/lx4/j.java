package lx4;

/* loaded from: classes8.dex */
public final class j extends lx4.a {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserSettingDialogView f322137f;

    /* renamed from: g, reason: collision with root package name */
    public ix4.b f322138g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f322139h;

    /* renamed from: i, reason: collision with root package name */
    public int f322140i;

    public j(android.content.Context context) {
        super(context);
        this.f322140i = -1;
    }

    @Override // lx4.a
    public android.view.View D() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserSettingDialogView browserSettingDialogView = new com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserSettingDialogView(context, null);
        this.f322137f = browserSettingDialogView;
        browserSettingDialogView.f184016i = this;
        com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserSettingDialogView browserSettingDialogView2 = this.f322137f;
        if (browserSettingDialogView2 != null) {
            browserSettingDialogView2.setBrowserList(this.f322139h);
        }
        com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserSettingDialogView browserSettingDialogView3 = this.f322137f;
        if (browserSettingDialogView3 != null) {
            browserSettingDialogView3.setSelectedBrowser(this.f322140i);
        }
        com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserSettingDialogView browserSettingDialogView4 = this.f322137f;
        if (browserSettingDialogView4 != null) {
            browserSettingDialogView4.setBrowserSettingDialogClickListener(this.f322138g);
        }
        com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserSettingDialogView browserSettingDialogView5 = this.f322137f;
        kotlin.jvm.internal.o.d(browserSettingDialogView5);
        return browserSettingDialogView5;
    }
}
