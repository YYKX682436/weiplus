package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes7.dex */
public class d3 implements ft.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.h3 f143549a;

    public d3(com.tencent.mm.plugin.lite.jsapi.comms.h3 h3Var) {
        this.f143549a = h3Var;
    }

    @Override // ft.p4
    public void a(java.lang.String str, java.lang.String str2) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("target");
            java.lang.String string = jSONObject2.getString("type");
            jd.c cVar = this.f143549a.f143442e;
            long j17 = cVar.f299024a;
            long j18 = cVar.f299026c;
            if (!string.equals(ya.b.SOURCE) && string.equals("liteapp")) {
                java.lang.String[] split = jSONObject2.optString(dm.i4.COL_ID).split("_");
                if (split.length == 2) {
                    j17 = java.lang.Long.parseLong(split[0]);
                    j18 = java.lang.Long.parseLong(split[1]);
                }
            }
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("type", "waapp");
            jSONObject3.put(dm.i4.COL_ID, str);
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            jSONObject4.put(ya.b.SOURCE, jSONObject3);
            jSONObject4.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject.getJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA));
            com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEvent(j17, j18, "app.postmessage", jSONObject4);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiLaunchMiniProgram", e17.toString());
        }
    }
}
