package com.tencent.mm.plugin.lite.api;

/* loaded from: classes14.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public jd.c f143440a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ipcinvoker.r f143441b = null;

    public void a(java.lang.String str) {
        jd.c cVar = this.f143440a;
        if (cVar != null) {
            cVar.c(str, null, false);
            return;
        }
        com.tencent.mm.plugin.lite.api.IPCCallbackData iPCCallbackData = new com.tencent.mm.plugin.lite.api.IPCCallbackData();
        iPCCallbackData.f143406d = false;
        iPCCallbackData.f143407e = false;
        iPCCallbackData.f143408f = str;
        this.f143441b.a(iPCCallbackData);
    }

    public void b(java.util.Map map) {
        c(new org.json.JSONObject(map), false);
    }

    public void c(org.json.JSONObject jSONObject, boolean z17) {
        jd.c cVar = this.f143440a;
        if (cVar != null) {
            cVar.f(jSONObject, z17);
            return;
        }
        com.tencent.mm.plugin.lite.api.IPCCallbackData iPCCallbackData = new com.tencent.mm.plugin.lite.api.IPCCallbackData();
        iPCCallbackData.f143406d = true;
        iPCCallbackData.f143407e = z17;
        if (jSONObject != null) {
            iPCCallbackData.f143409g = jSONObject.toString();
        }
        this.f143441b.a(iPCCallbackData);
    }

    public void d(boolean z17) {
        c(new org.json.JSONObject(), z17);
    }
}
