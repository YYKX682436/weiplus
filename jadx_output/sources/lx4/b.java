package lx4;

/* loaded from: classes8.dex */
public final class b extends lx4.a {

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f322114f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserChooseDialogView f322115g;

    /* renamed from: h, reason: collision with root package name */
    public ix4.a f322116h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f322117i;

    @Override // lx4.a
    public android.view.View D() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserChooseDialogView browserChooseDialogView = new com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserChooseDialogView(context, null);
        this.f322115g = browserChooseDialogView;
        browserChooseDialogView.f184007m = this;
        com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserChooseDialogView browserChooseDialogView2 = this.f322115g;
        if (browserChooseDialogView2 != null) {
            browserChooseDialogView2.setBrowserClickListener(this.f322116h);
        }
        com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserChooseDialogView browserChooseDialogView3 = this.f322115g;
        if (browserChooseDialogView3 != null) {
            browserChooseDialogView3.setBrowserList(this.f322114f);
        }
        com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserChooseDialogView browserChooseDialogView4 = this.f322115g;
        if (browserChooseDialogView4 != null) {
            browserChooseDialogView4.setShowBrowserSettingEntry(this.f322117i);
        }
        com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserChooseDialogView browserChooseDialogView5 = this.f322115g;
        kotlin.jvm.internal.o.d(browserChooseDialogView5);
        return browserChooseDialogView5;
    }
}
