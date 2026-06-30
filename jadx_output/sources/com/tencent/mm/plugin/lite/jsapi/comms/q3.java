package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class q3 implements tk.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.r3 f143724a;

    public q3(com.tencent.mm.plugin.lite.jsapi.comms.r3 r3Var) {
        this.f143724a = r3Var;
    }

    @Override // tk.p
    public void a(boolean z17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("LiteAppJsApiOpenBizTimelinePublish", "Success: " + z17 + ", Error: " + str);
        com.tencent.mm.plugin.lite.jsapi.comms.r3 r3Var = this.f143724a;
        if (!z17) {
            jd.c cVar = r3Var.f143442e;
            if (str == null) {
                str = "";
            }
            cVar.b(str);
            return;
        }
        if (jSONObject != null) {
            if (str != null) {
                try {
                    jSONObject.put("errorMessage", str);
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiOpenBizTimelinePublish", e17, "", new java.lang.Object[0]);
                }
            }
            r3Var.f143442e.f(jSONObject, false);
            return;
        }
        jd.c cVar2 = r3Var.f143442e;
        if (str == null) {
            str = "";
        }
        cVar2.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("msg", str);
        cVar2.e(hashMap);
    }
}
