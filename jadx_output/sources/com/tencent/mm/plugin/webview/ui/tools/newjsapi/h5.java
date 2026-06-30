package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class h5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f186229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186230e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186231f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186232g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(boolean z17, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, nw4.k kVar, nw4.y2 y2Var) {
        super(0);
        this.f186229d = z17;
        this.f186230e = webViewUI;
        this.f186231f = kVar;
        this.f186232g = y2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show ting entry ");
        boolean z17 = this.f186229d;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", sb6.toString());
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186230e;
        if (z17) {
            com.tencent.mm.plugin.webview.modeltools.l1 l1Var = webViewUI.B2;
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI2 = l1Var.f183317a;
            kotlin.jvm.internal.o.e(webViewUI2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            if (webViewUI2.getController().E(101) == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewTingEntryHelper", "menuInfo == null, can add!");
                l1Var.f183317a.addIconOptionMenu(101, com.tencent.mm.R.string.n3h, com.tencent.mm.R.raw.webview_ting_entry, false, true, new com.tencent.mm.plugin.webview.modeltools.k1(l1Var));
            }
            webViewUI2.getController().L0(false, 101, true);
        } else {
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI3 = webViewUI.B2.f183317a;
            kotlin.jvm.internal.o.e(webViewUI3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            if (webViewUI3.getController().E(101) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewTingEntryHelper", "menuInfo == null, can remove!");
                webViewUI3.removeOptionMenu(101);
            }
        }
        nw4.g gVar = this.f186231f.f340863d;
        nw4.y2 y2Var = this.f186232g;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
        return jz5.f0.f302826a;
    }
}
