package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Collection f143647a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f143648b;

    public l(java.util.Collection fileList, boolean z17) {
        kotlin.jvm.internal.o.g(fileList, "fileList");
        this.f143647a = fileList;
        this.f143648b = z17;
    }

    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (com.tencent.mm.plugin.lite.jsapi.comms.m mVar : this.f143647a) {
            mVar.getClass();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("status", mVar.f143670a.f247610d);
            java.lang.String str = mVar.f143671b;
            if (str != null) {
                jSONObject2.put("fileId", str);
            }
            java.lang.Integer num = mVar.f143672c;
            if (num != null) {
                jSONObject2.put("progress", num.intValue());
            }
            java.lang.String str2 = mVar.f143673d;
            if (str2 != null) {
                jSONObject2.put("errMsg", str2);
            }
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("fileList", jSONArray);
        jSONObject.put("complete", this.f143648b);
        return jSONObject;
    }
}
