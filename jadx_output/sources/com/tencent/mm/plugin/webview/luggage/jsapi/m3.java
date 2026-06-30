package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class m3 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "reportIDKey";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
        org.json.JSONArray optJSONArray = bVar.f406597b.f344506c.optJSONArray("idKeyDataInfo");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiReportIDKey", "idkey data is null");
            bVar.c("invaild_parms", null);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
            com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
            iDKey.SetID(com.tencent.mm.sdk.platformtools.t8.P(optJSONObject.optString(dm.i4.COL_ID), 0));
            iDKey.SetKey(com.tencent.mm.sdk.platformtools.t8.P(optJSONObject.optString("key"), 0));
            iDKey.SetValue(com.tencent.mm.sdk.platformtools.t8.P(optJSONObject.optString("value"), 0));
            arrayList.add(iDKey);
        }
        if (arrayList.size() > 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList, true, false);
        }
        bVar.a();
    }
}
