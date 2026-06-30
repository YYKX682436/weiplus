package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes5.dex */
public class p5 implements sw4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sd.b f182437a;

    public p5(com.tencent.mm.plugin.webview.luggage.jsapi.r5 r5Var, sd.b bVar) {
        this.f182437a = bVar;
    }

    @Override // sw4.e
    public void a(android.os.Bundle bundle) {
        org.json.JSONObject jSONObject;
        java.lang.String string = bundle.getString("event");
        java.lang.String string2 = bundle.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        sd.b bVar = this.f182437a;
        if (!(bVar.f406596a instanceof sd.a) || android.text.TextUtils.isEmpty(string)) {
            return;
        }
        try {
            jSONObject = new org.json.JSONObject(string2);
        } catch (java.lang.Exception unused) {
            jSONObject = new org.json.JSONObject();
        }
        ((sd.a) bVar.f406596a).getRuntime().b(string, jSONObject);
    }

    @Override // sw4.e
    public void f(android.os.Bundle bundle) {
        java.lang.String string = bundle.getString("err_msg");
        java.lang.String string2 = bundle.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(string);
        sd.b bVar = this.f182437a;
        if (!K0) {
            bVar.c(string, null);
            return;
        }
        if (string2 != null) {
            try {
                if (!string2.isEmpty()) {
                    bVar.e(new org.json.JSONObject(string2));
                }
            } catch (java.lang.Exception unused) {
                bVar.a();
                return;
            }
        }
        bVar.a();
    }
}
