package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class i5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f186249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186250e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186251f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186252g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(boolean z17, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, nw4.k kVar, nw4.y2 y2Var) {
        super(0);
        this.f186249d = z17;
        this.f186250e = webViewUI;
        this.f186251f = kVar;
        this.f186252g = y2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switch publishImageEntry Button to ");
        boolean z17 = this.f186249d;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", sb6.toString());
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186250e;
        if (z17) {
            com.tencent.mm.plugin.webview.modeltools.z0 z0Var = webViewUI.D2;
            if (z0Var != null) {
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI2 = z0Var.f183376a;
                kotlin.jvm.internal.o.e(webViewUI2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                com.tencent.mm.ui.ga controller = webViewUI2.getController();
                if ((controller != null ? controller.E(102) : null) == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPublishImageEntryHelper", "addIconOptionMenu");
                    z0Var.f183376a.addIconOptionMenu(102, ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ui() ? com.tencent.mm.R.string.pgw : com.tencent.mm.R.string.ooj, com.tencent.mm.R.raw.picture_pencil_regular, false, true, new com.tencent.mm.plugin.webview.modeltools.y0(z0Var));
                }
                com.tencent.mm.ui.ga controller2 = webViewUI2.getController();
                if (controller2 != null) {
                    controller2.L0(false, 102, true);
                }
            }
        } else {
            com.tencent.mm.plugin.webview.modeltools.z0 z0Var2 = webViewUI.D2;
            if (z0Var2 != null) {
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI3 = z0Var2.f183376a;
                kotlin.jvm.internal.o.e(webViewUI3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                com.tencent.mm.ui.ga controller3 = webViewUI3.getController();
                if ((controller3 != null ? controller3.E(102) : null) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPublishImageEntryHelper", "removeOptionMenu invoke");
                    webViewUI3.removeOptionMenu(102);
                }
            }
        }
        nw4.g gVar = this.f186251f.f340863d;
        nw4.y2 y2Var = this.f186252g;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
        return jz5.f0.f302826a;
    }
}
