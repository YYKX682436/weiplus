package vd1;

/* loaded from: classes.dex */
public class q extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 64;
    private static final java.lang.String NAME = "reportIDKey";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("dataArray");
        if (optJSONArray == null) {
            lVar.a(i17, o("fail"));
            return;
        }
        for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
            try {
                org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i18);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(jSONObject2.optInt(dm.i4.COL_ID), jSONObject2.optInt("key"), jSONObject2.optInt("value"), false);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiReportIDKey", "parse json failed : %s", e17.getMessage());
            }
        }
        lVar.a(i17, o("ok"));
    }
}
