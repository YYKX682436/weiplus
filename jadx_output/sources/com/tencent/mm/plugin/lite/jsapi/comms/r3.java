package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class r3 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("LiteAppJsApiOpenBizTimelinePublish", "invoke " + jSONObject.toString());
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            jSONArray = jSONObject.getJSONArray("localIds");
            if (!jSONObject.has("mpPublishAction")) {
                jSONObject.put("mpPublishAction", 2);
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiOpenBizTimelinePublish", e17, "getJSONArray fail", new java.lang.Object[0]);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray == null) {
            com.tencent.mars.xlog.Log.i("LiteAppJsApiOpenBizTimelinePublish", "localIds is null");
        } else {
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                arrayList.add(new com.tencent.pigeon.biz_base.PersonalCenterJumpPhotoInfo(((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str, this.f143442e.f299024a, jSONArray.optString(i17)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null));
            }
        }
        ((ox.o) ((tk.q) i95.n0.c(tk.q.class))).Di(c(), jSONObject, arrayList, new com.tencent.mm.plugin.lite.jsapi.comms.q3(this));
    }
}
