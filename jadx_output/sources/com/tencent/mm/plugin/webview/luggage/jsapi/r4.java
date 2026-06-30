package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes5.dex */
public class r4 implements sw4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sd.b f182450a;

    public r4(com.tencent.mm.plugin.webview.luggage.jsapi.j4 j4Var, sd.b bVar) {
        this.f182450a = bVar;
    }

    @Override // sw4.e
    public void a(android.os.Bundle bundle) {
        org.json.JSONObject jSONObject;
        java.lang.String string = bundle.getString("event");
        java.lang.String string2 = bundle.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        sd.b bVar = this.f182450a;
        if (bVar.f406596a == null || android.text.TextUtils.isEmpty(string)) {
            return;
        }
        try {
            jSONObject = new org.json.JSONObject(string2);
        } catch (org.json.JSONException unused) {
            jSONObject = new org.json.JSONObject();
        }
        ((sd.a) bVar.f406596a).getRuntime().b(string, jSONObject);
    }

    @Override // sw4.e
    public void f(android.os.Bundle bundle) {
        this.f182450a.c(bundle.getString("err_msg", ""), null);
    }
}
