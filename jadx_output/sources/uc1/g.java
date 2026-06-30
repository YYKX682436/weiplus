package uc1;

/* loaded from: classes13.dex */
public class g extends uc1.b {
    public static final int CTRL_INDEX = 140;
    public static final java.lang.String NAME = "addMapControls";

    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddMapControls", "data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        jSONObject.toString();
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddMapControls", "mapView is null, return");
            lVar.a(i17, o("fail:mapview is null"));
            return;
        }
        try {
            if (jSONObject.has("controls")) {
                vc1.p1 p1Var = (vc1.p1) E;
                ik1.h0.b(new vc1.l(p1Var));
                org.json.JSONArray jSONArray = new org.json.JSONArray(jSONObject.optString("controls"));
                for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                    org.json.JSONObject jSONObject2 = (org.json.JSONObject) jSONArray.get(i18);
                    vc1.r1 r1Var = new vc1.r1();
                    r1Var.f435156e = ((o91.e) lVar.q(o91.e.class)).T0(lVar, jSONObject2.optString("iconPath"));
                    r1Var.f435157f = jSONObject2.optBoolean("clickable");
                    r1Var.f435158g = jSONObject2.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                    org.json.JSONObject jSONObject3 = jSONObject2.getJSONObject("position");
                    int j17 = ik1.w.j(jSONObject3, "left", 0);
                    int j18 = ik1.w.j(jSONObject3, "top", 0);
                    r1Var.f435152a = j17;
                    r1Var.f435153b = j18;
                    if (jSONObject3.has("width")) {
                        r1Var.f435154c = ik1.w.j(jSONObject3, "width", 0);
                    }
                    if (jSONObject3.has("height")) {
                        r1Var.f435155d = ik1.w.j(jSONObject3, "height", 0);
                    }
                    if (jSONObject2.optBoolean("clickable")) {
                        p1Var.k(r1Var, new uc1.e(this, vc1.e3.c(jSONObject), lVar), (o91.d) lVar.q(o91.d.class));
                    } else {
                        p1Var.k(r1Var, null, (o91.d) lVar.q(o91.d.class));
                    }
                }
            }
            C(lVar, i17, o("ok"), true, ((vc1.p1) E) instanceof dg1.h);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddMapControls", "parse controls error, exception : %s", e17);
            C(lVar, i17, o("fail:internal error"), false, ((vc1.p1) E) instanceof dg1.h);
        }
    }
}
