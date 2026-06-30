package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes8.dex */
public class g7 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        try {
            java.lang.String string = jSONObject.has("url") ? jSONObject.getString("url") : null;
            if (string == null) {
                string = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).uj(str);
            }
            if (string != null && !string.isEmpty()) {
                com.tencent.mm.plugin.lite.storage.f v17 = com.tencent.mm.plugin.lite.logic.g1.s().v(string);
                if (v17 == null) {
                    this.f143443f.a("auth info is not existed");
                    return;
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(v17.field_headerMap);
                java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                java.util.HashMap hashMap = new java.util.HashMap();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    hashMap.put(next, jSONObject2.getString(next));
                }
                org.json.JSONObject jSONObject3 = new org.json.JSONObject(v17.field_paramMap);
                java.util.Iterator<java.lang.String> keys2 = jSONObject3.keys();
                java.util.HashMap hashMap2 = new java.util.HashMap();
                while (keys2.hasNext()) {
                    java.lang.String next2 = keys2.next();
                    hashMap2.put(next2, jSONObject3.getString(next2));
                }
                com.tencent.mm.plugin.lite.LiteAppCenter.setAuthInfo(str, v17.field_param, hashMap, hashMap2, z17);
                jSONObject3.put(dm.i4.COL_UPDATETIME, v17.field_updateTime);
                this.f143443f.c(jSONObject3, false);
                return;
            }
            com.tencent.mars.xlog.Log.w("LiteAppJsApiSession", "get authurl fail");
            this.f143443f.a("get authUrl fail, please make sure config authUrl in config file");
        } catch (java.lang.Exception unused) {
            this.f143443f.a("exception");
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 0;
    }
}
