package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes12.dex */
public class i6 implements sw4.h {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.luggage.jsapi.f6 f182347a = new com.tencent.mm.plugin.webview.luggage.jsapi.h6(this);

    /* renamed from: b, reason: collision with root package name */
    public sw4.e f182348b;

    @Override // sw4.h
    public void a(android.content.Context context, android.os.Bundle bundle, sw4.e eVar) {
        this.f182348b = eVar;
        java.lang.String string = bundle.getString("local_id");
        java.lang.String string2 = bundle.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID);
        boolean z17 = bundle.getBoolean("show_progress_tips");
        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem b17 = com.tencent.mm.plugin.webview.modeltools.z.Zi().b(string);
        if (b17 == null) {
            eVar.f(null);
            return;
        }
        int i17 = b17.f182742n;
        com.tencent.mm.plugin.webview.luggage.jsapi.f6 f6Var = this.f182347a;
        if (i17 == 1) {
            com.tencent.mm.plugin.webview.luggage.jsapi.l6.a(context, b17, string2, string, 20301, 202, 2, z17, f6Var);
        } else if (i17 != 4) {
            com.tencent.mm.plugin.webview.luggage.jsapi.l6.b(context, string2, string, 20302, 202, 2, z17, f6Var);
        } else {
            com.tencent.mm.plugin.webview.luggage.jsapi.l6.b(context, string2, string, 20302, 202, 2, z17, f6Var);
        }
    }
}
