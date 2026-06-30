package com.tencent.mm.pluginsdk.model;

/* loaded from: classes11.dex */
public final class c0 implements l81.p0 {

    /* renamed from: e, reason: collision with root package name */
    public int f189246e;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f189245d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f189247f = "";

    @Override // l81.p0
    public java.lang.String a() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String str = this.f189245d;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            jSONObject.put("dataBuffer", str);
            jSONObject.put("enterScene", this.f189246e);
            jSONObject.put("bypass", this.f189247f);
            java.lang.String jSONObject2 = new org.json.JSONObject().put("bizFinderLiveInfo", jSONObject).toString();
            kotlin.jvm.internal.o.d(jSONObject2);
            return jSONObject2;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BizFinderLiveNativeExtraData", e17, "", new java.lang.Object[0]);
            return "{}";
        }
    }
}
