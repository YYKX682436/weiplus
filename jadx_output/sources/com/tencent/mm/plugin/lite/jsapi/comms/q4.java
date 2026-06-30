package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public final class q4 {
    public q4(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.lite.jsapi.comms.r4 a(org.json.JSONObject json) {
        kotlin.jvm.internal.o.g(json, "json");
        org.json.JSONArray jSONArray = json.getJSONArray("fileList");
        kotlin.jvm.internal.o.f(jSONArray, "getJSONArray(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.Object obj = jSONArray.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
            java.lang.String string = jSONObject.getString("fileId");
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = jSONObject.getString("type");
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            arrayList.add(new com.tencent.mm.plugin.lite.jsapi.comms.s4(string, string2));
        }
        return new com.tencent.mm.plugin.lite.jsapi.comms.r4(arrayList);
    }
}
