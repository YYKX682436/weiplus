package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public final class k5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Collection f143636a;

    public k5(java.util.Collection fileList) {
        kotlin.jvm.internal.o.g(fileList, "fileList");
        this.f143636a = fileList;
    }

    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (com.tencent.mm.plugin.lite.jsapi.comms.l5 l5Var : this.f143636a) {
            l5Var.getClass();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("status", l5Var.f143657a.f247610d);
            java.lang.String str = l5Var.f143658b;
            if (str != null) {
                jSONObject2.put("fileId", str);
            }
            java.lang.Integer num = l5Var.f143659c;
            if (num != null) {
                jSONObject2.put("progress", num.intValue());
            }
            java.lang.String str2 = l5Var.f143660d;
            if (str2 != null) {
                jSONObject2.put("errMsg", str2);
            }
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("fileList", jSONArray);
        return jSONObject;
    }
}
