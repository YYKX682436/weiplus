package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class m5 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f185681a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.n5 f185682b;

    public m5(com.tencent.mm.plugin.webview.ui.tools.n5 n5Var, android.view.View view) {
        this.f185682b = n5Var;
        this.f185681a = view;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewLongClickHelper", "getWXLongPressImageEventConfig value %s", str);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.plugin.webview.ui.tools.n5 n5Var = this.f185682b;
        if (!K0) {
            try {
                boolean z17 = new org.json.JSONObject(u46.k.e(str)).optInt("forbidForward", 0) == 1;
                java.util.Map map = com.tencent.mm.plugin.webview.ui.tools.b5.f183928u;
                com.tencent.mm.plugin.webview.ui.tools.b5 b5Var = n5Var.f185857e;
                ((java.util.HashMap) map).put(b5Var.m(b5Var.f183941i), java.lang.Boolean.valueOf(z17));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebViewLongClickHelper", "reportOnLeave, ex = %s", e17.getMessage());
            }
        }
        com.tencent.mm.plugin.webview.ui.tools.b5.a(n5Var.f185857e, this.f185681a);
    }
}
