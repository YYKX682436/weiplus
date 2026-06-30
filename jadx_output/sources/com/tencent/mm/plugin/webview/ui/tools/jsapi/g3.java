package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class g3 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185128c;

    public g3(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, java.lang.String str, nw4.y2 y2Var) {
        this.f185128c = c1Var;
        this.f185126a = str;
        this.f185127b = y2Var;
    }

    @Override // q80.f0
    public void fail() {
        int parseColor;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185128c;
        c1Var.getClass();
        java.lang.String str = this.f185126a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "doOpenGameUrlWithExtraWebView, url is null");
            c1Var.i5(c1Var.f184976e, "openGameUrlWithExtraWebView:fail", null);
            return;
        }
        java.lang.String str2 = (java.lang.String) c1Var.f184976e.f340790a.get("statusBarColor");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            parseColor = 0;
        } else {
            try {
                parseColor = android.graphics.Color.parseColor(str2);
            } catch (java.lang.IllegalArgumentException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "doOpenGameUrlWithExtraWebView: " + e17.getMessage());
                c1Var.i5(c1Var.f184976e, "openGameUrlWithExtraWebView:fail_invalid_color", null);
                return;
            }
        }
        java.lang.String str3 = (java.lang.String) c1Var.f184976e.f340790a.get("statusBarStyle");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("customize_status_bar_color", parseColor);
        intent.putExtra("status_bar_style", str3);
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "doOpenGameUrlWithExtraWebView, time: " + java.lang.System.currentTimeMillis());
        intent.putExtra("start_time", java.lang.System.currentTimeMillis());
        intent.putExtra("start_activity_time", java.lang.System.currentTimeMillis());
        com.tencent.mm.plugin.webview.ui.tools.a1.e(intent.getExtras(), "webview", ".ui.tools.WebViewUI", c1Var.f184998y, new com.tencent.mm.plugin.webview.ui.tools.jsapi.h3(c1Var, intent));
        c1Var.i5(c1Var.f184976e, "openGameUrlWithExtraWebView:ok", null);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "doOpenGameUrlWithExtraWebView openInLiteApp success.");
        java.lang.Object obj = com.tencent.mm.plugin.wepkg.utils.n.f188501a;
        java.lang.String a17 = kh0.i.a(this.f185126a);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(a17);
            com.tencent.mm.plugin.wepkg.version.f.a(linkedList, 4);
        }
        this.f185128c.i5(this.f185127b, "openGameUrlWithExtraWebView:ok", null);
    }
}
