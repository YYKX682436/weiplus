package com.tencent.mm.plugin.lite.api;

/* loaded from: classes.dex */
public abstract class p extends jd.b implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: e, reason: collision with root package name */
    public jd.c f143442e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.lite.api.o f143443f = null;

    @Override // jd.b
    public void b(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (z() != 1 || com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.plugin.lite.api.o oVar = new com.tencent.mm.plugin.lite.api.o();
            this.f143443f = oVar;
            oVar.f143440a = this.f143442e;
            a(str, jSONObject, z17);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", str);
        bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject.toString());
        bundle.putBoolean("isFromView", z17);
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, getClass(), new com.tencent.mm.plugin.lite.api.n(this));
    }

    public android.content.Context c() {
        jd.c cVar = this.f143442e;
        if (cVar == null) {
            return com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        java.lang.Object uICallback = com.tencent.mm.plugin.lite.LiteAppCenter.getUICallback(cVar.f299024a);
        if (uICallback != null) {
            if (uICallback instanceof android.app.Activity) {
                return (android.content.Context) uICallback;
            }
            if (uICallback instanceof androidx.fragment.app.Fragment) {
                return ((androidx.fragment.app.Fragment) uICallback).getActivity();
            }
            if (uICallback instanceof android.view.View) {
                return ((android.view.View) uICallback).getContext();
            }
            if (uICallback instanceof com.tencent.liteapp.WxaLiteAppWidgetAdapter) {
                return ((com.tencent.liteapp.WxaLiteAppWidgetAdapter) uICallback).f45975q;
            }
        }
        android.content.Context jsApiContextForAppId = com.tencent.mm.plugin.lite.LiteAppCenter.getJsApiContextForAppId(this.f143442e.f299025b);
        return jsApiContextForAppId != null ? jsApiContextForAppId : com.tencent.mm.sdk.platformtools.x2.f193071a;
    }

    public void d(int i17) {
    }

    public void e(int i17, int i18, android.content.Intent intent) {
    }

    public void f(int i17, int i18, android.content.Intent intent) {
    }

    public void g(int i17, int i18, android.content.Intent intent) {
    }

    public void h(int i17, int i18, android.content.Intent intent) {
    }

    public void i(java.lang.String str, int i17) {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.tencent.mm.plugin.lite.api.o oVar = new com.tencent.mm.plugin.lite.api.o();
        this.f143443f = oVar;
        oVar.f143441b = rVar;
        try {
            a(bundle.getString("appId"), new org.json.JSONObject(bundle.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA)), bundle.getBoolean("isFromView"));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApi", e17, "", new java.lang.Object[0]);
        }
    }

    public void j(int i17, int i18, android.content.Intent intent) {
    }

    public void k(int i17, int i18, android.content.Intent intent) {
    }

    public void l(int i17, int i18, android.content.Intent intent) {
    }

    public void m(int i17, int i18, android.content.Intent intent) {
    }

    public void n(int i17, int i18, android.content.Intent intent) {
    }

    public void o(int i17, int i18, android.content.Intent intent) {
    }

    public void p(int i17, int i18, android.content.Intent intent) {
    }

    public void q(int i17, int i18, android.content.Intent intent) {
    }

    public void r(boolean z17) {
    }

    public void s(boolean z17) {
    }

    public void t() {
    }

    public void u(int i17, int i18, android.content.Intent intent) {
    }

    public void v(int i17, int i18, android.content.Intent intent) {
    }

    public void w(int i17, int i18, android.content.Intent intent) {
    }

    public void x(int i17, int i18, android.content.Intent intent) {
    }

    public void y(int i17, int i18, android.content.Intent intent) {
    }

    public int z() {
        return 0;
    }
}
