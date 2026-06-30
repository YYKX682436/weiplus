package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public class u0 implements i11.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.x0 f182470f;

    public u0(com.tencent.mm.plugin.webview.luggage.jsapi.x0 x0Var, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var, java.lang.String str) {
        this.f182470f = x0Var;
        this.f182468d = q5Var;
        this.f182469e = str;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        return false;
    }

    @Override // i11.d
    public boolean w6(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19, android.os.Bundle bundle) {
        i11.d dVar;
        if (!z17) {
            this.f182470f.g(this.f182468d, "location_error");
            return true;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("longitude", f17);
            jSONObject.put("latitude", f18);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_NETWORK_SPEED, d17);
            jSONObject.put("accuracy", d18);
            jSONObject.put("type", this.f182469e);
            if (bundle != null) {
                jSONObject.put("indoor_building_id", bundle.getString("indoor_building_id"));
                jSONObject.put("indoor_building_floor", bundle.getString("indoor_building_floor"));
                jSONObject.put("indoor_building_type", bundle.getInt("indoor_building_type"));
            }
        } catch (org.json.JSONException unused) {
        }
        com.tencent.mm.plugin.webview.luggage.jsapi.x0 x0Var = this.f182470f;
        com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f182468d;
        synchronized (x0Var) {
            x0Var.f182503e.unregisterReceiver(x0Var.f182511p);
            i11.e eVar = x0Var.f182507i;
            if (eVar != null && (dVar = x0Var.f182508m) != null) {
                ((i11.h) eVar).m(dVar);
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var = x0Var.f182509n;
            if (n3Var != null) {
                n3Var.removeCallbacksAndMessages(null);
            }
            x0Var.f182508m = null;
            if (!x0Var.f182506h) {
                x0Var.f182506h = true;
                q5Var.a(null, jSONObject);
            }
        }
        return false;
    }
}
