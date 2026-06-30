package com.tencent.mm.plugin.lite.api;

/* loaded from: classes14.dex */
public class n implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.api.p f143439d;

    public n(com.tencent.mm.plugin.lite.api.p pVar) {
        this.f143439d = pVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.lite.api.IPCCallbackData iPCCallbackData = (com.tencent.mm.plugin.lite.api.IPCCallbackData) obj;
        boolean z17 = iPCCallbackData.f143406d;
        org.json.JSONObject jSONObject = null;
        com.tencent.mm.plugin.lite.api.p pVar = this.f143439d;
        if (!z17) {
            pVar.f143442e.c(iPCCallbackData.f143408f, null, iPCCallbackData.f143407e);
            return;
        }
        jd.c cVar = pVar.f143442e;
        if (iPCCallbackData.f143409g != null) {
            try {
                jSONObject = new org.json.JSONObject(iPCCallbackData.f143409g);
            } catch (org.json.JSONException unused) {
            }
        }
        cVar.f(jSONObject, iPCCallbackData.f143407e);
    }
}
