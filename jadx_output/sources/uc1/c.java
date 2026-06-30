package uc1;

/* loaded from: classes13.dex */
public class c extends uc1.b {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "addMapArc";

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // uc1.b, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        int i18;
        org.json.JSONObject jSONObject2;
        org.json.JSONObject jSONObject3;
        org.json.JSONObject optJSONObject;
        double optDouble;
        double optDouble2;
        int parseColor;
        uc1.c cVar = this;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar2 = lVar;
        int i19 = i17;
        super.A(lVar, jSONObject, i17);
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddMapArc", "data is null");
            lVar2.a(i19, cVar.o("fail:invalid data"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddMapArc", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddMapArc", "mapView is null, return");
            lVar2.a(i19, cVar.o("fail:mapview is null"));
            return;
        }
        if (!jSONObject.has(dm.i4.COL_ID) || !jSONObject.has("start") || !jSONObject.has("end")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddMapArc", "id or start or end point is empty");
            lVar2.a(i19, cVar.o("fail:invalid data"));
            return;
        }
        try {
            i18 = jSONObject.getInt(dm.i4.COL_ID);
            jSONObject2 = jSONObject.getJSONObject("start");
            jSONObject3 = jSONObject.getJSONObject("end");
            optJSONObject = jSONObject.optJSONObject(com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.STAGE_PASS);
            str2 = "fail:invalid data";
            try {
                optDouble = jSONObject.optDouble("angle", 0.0d);
                try {
                    optDouble2 = jSONObject.optDouble("width", 0.0d);
                    try {
                        parseColor = ik1.w.l(jSONObject.optString("color", ""));
                    } catch (java.lang.Exception unused) {
                        parseColor = android.graphics.Color.parseColor("#000000");
                    }
                } catch (java.lang.Exception e17) {
                    e = e17;
                }
            } catch (java.lang.Exception e18) {
                e = e18;
            }
        } catch (java.lang.Exception e19) {
            e = e19;
            str = "";
            str2 = "fail:invalid data";
            str3 = "MicroMsg.JsApiAddMapArc";
        }
        try {
            str = "";
            try {
                if (!((vc1.p1) E).q(i18, new vc1.y1(jSONObject2.optDouble("latitude", 0.0d), jSONObject2.optDouble("longitude", 0.0d)), new vc1.y1(jSONObject3.optDouble("latitude", 0.0d), jSONObject3.optDouble("longitude", 0.0d)), optJSONObject != null ? new vc1.y1(optJSONObject.optDouble("latitude", 0.0d), optJSONObject.optDouble("longitude", 0.0d)) : null, (float) optDouble, (float) optDouble2, parseColor)) {
                    cVar = this;
                    lVar2 = lVar;
                    i19 = i17;
                    str3 = "MicroMsg.JsApiAddMapArc";
                    try {
                        com.tencent.mars.xlog.Log.e(str3, "add fail");
                        lVar2.a(i19, cVar.o("fail:addMapArc is invalid"));
                        return;
                    } catch (java.lang.Exception e27) {
                        e = e27;
                        com.tencent.mars.xlog.Log.printErrStackTrace(str3, e, str, new java.lang.Object[0]);
                        com.tencent.mars.xlog.Log.e(str3, "handle data has exception");
                        lVar2.a(i19, cVar.o(str2));
                    }
                }
                cVar = this;
                try {
                    lVar2 = lVar;
                    i19 = i17;
                } catch (java.lang.Exception e28) {
                    e = e28;
                    lVar2 = lVar;
                    i19 = i17;
                    str3 = "MicroMsg.JsApiAddMapArc";
                    com.tencent.mars.xlog.Log.printErrStackTrace(str3, e, str, new java.lang.Object[0]);
                    com.tencent.mars.xlog.Log.e(str3, "handle data has exception");
                    lVar2.a(i19, cVar.o(str2));
                }
                try {
                    lVar2.a(i19, cVar.o("ok"));
                } catch (java.lang.Exception e29) {
                    e = e29;
                    str3 = "MicroMsg.JsApiAddMapArc";
                    com.tencent.mars.xlog.Log.printErrStackTrace(str3, e, str, new java.lang.Object[0]);
                    com.tencent.mars.xlog.Log.e(str3, "handle data has exception");
                    lVar2.a(i19, cVar.o(str2));
                }
            } catch (java.lang.Exception e37) {
                e = e37;
                cVar = this;
            }
        } catch (java.lang.Exception e38) {
            e = e38;
            cVar = this;
            lVar2 = lVar;
            i19 = i17;
            str = "";
            str3 = "MicroMsg.JsApiAddMapArc";
            com.tencent.mars.xlog.Log.printErrStackTrace(str3, e, str, new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e(str3, "handle data has exception");
            lVar2.a(i19, cVar.o(str2));
        }
    }
}
