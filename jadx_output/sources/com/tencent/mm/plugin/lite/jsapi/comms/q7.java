package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public class q7 implements w65.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.r7 f143756d;

    public q7(com.tencent.mm.plugin.lite.jsapi.comms.r7 r7Var) {
        this.f143756d = r7Var;
    }

    @Override // w65.o
    public void P2(w65.p pVar) {
        com.tencent.mm.plugin.lite.jsapi.comms.r7 r7Var = this.f143756d;
        if (java.util.Objects.equals(r7Var.f143769g, pVar.f443363b.id())) {
            java.lang.String str = r7Var.f299023d;
            java.lang.Float valueOf = java.lang.Float.valueOf(pVar.f443365d);
            w65.q qVar = pVar.f443362a;
            com.tencent.mars.xlog.Log.i("MicroMsg.StartDownloadChatFile", "apiName: %s, onWeTaskEvent %s, %s", str, qVar, valueOf);
            int ordinal = qVar.ordinal();
            if (ordinal == 2) {
                try {
                    int i17 = (int) pVar.f443365d;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("complete", false);
                    jSONObject.put("progress", i17);
                    r7Var.f143442e.f(jSONObject, true);
                    return;
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.StartDownloadChatFile", "%s json exception: %s", r7Var.f299023d, e17.toString());
                    r7Var.f143442e.b("download progress json exception");
                    return;
                }
            }
            if (ordinal == 4) {
                try {
                    try {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        if (pVar.f443364c >= 0) {
                            jSONObject2.put("complete", true);
                        } else {
                            jSONObject2.put("pause", true);
                        }
                        r7Var.f143442e.f(jSONObject2, false);
                    } catch (org.json.JSONException e18) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.StartDownloadChatFile", "%s json exception: %s", r7Var.f299023d, e18.toString());
                        r7Var.f143442e.b("download succeed json exception");
                    }
                    return;
                } finally {
                }
            }
            if (ordinal == 5 || ordinal == 6) {
                try {
                    try {
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        jSONObject3.put("pause", true);
                        r7Var.f143442e.f(jSONObject3, false);
                    } catch (org.json.JSONException e19) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.StartDownloadChatFile", "%s json exception: %s", r7Var.f299023d, e19.toString());
                        r7Var.f143442e.b("download paused json exception");
                    }
                } finally {
                }
            }
        }
    }
}
