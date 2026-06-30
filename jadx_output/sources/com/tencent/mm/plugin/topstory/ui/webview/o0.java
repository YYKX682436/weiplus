package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes7.dex */
public class o0 implements zq1.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f175242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.webview.l f175243b;

    public o0(com.tencent.mm.plugin.topstory.ui.webview.l lVar, java.lang.String str) {
        this.f175243b = lVar;
        this.f175242a = str;
    }

    @Override // zq1.g0
    public boolean a(com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo) {
        return false;
    }

    @Override // zq1.g0
    public void b(com.tencent.mm.plugin.brandservice.api.TransferResultInfo transferResultInfo) {
        r45.z24 z24Var = transferResultInfo.f93928f;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "TopStoryTransferRequestResultCallback.onResult errCode: %s errMsg: %s, response: %s", java.lang.Integer.valueOf(transferResultInfo.f93926d), transferResultInfo.f93927e, z24Var);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ((js1.m) ((zq1.f0) gm0.j1.s(zq1.f0.class))).getClass();
        jSONObject.put("h5auth", transferResultInfo.f93929g ? 1 : 0);
        jSONObject.put("retry", transferResultInfo.f93930h ? 1 : 0);
        try {
            jSONObject.put("objectid", this.f175242a);
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mm.plugin.topstory.ui.webview.l lVar = this.f175243b;
        try {
            if (z24Var == null) {
                com.tencent.mm.plugin.topstory.ui.webview.b.a(lVar, "onExtTransferReady", lVar.f().toString());
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(z24Var.f391636f)) {
                jSONObject.put("result", "");
            } else {
                jSONObject.put("result", z24Var.f391636f);
            }
            java.util.LinkedList linkedList = z24Var.f391637g;
            if (linkedList != null && linkedList.size() > 0) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                java.util.Iterator it = z24Var.f391637g.iterator();
                while (it.hasNext()) {
                    r45.cw3 cw3Var = (r45.cw3) it.next();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(cw3Var.f371860d)) {
                        try {
                            jSONObject2.put(cw3Var.f371860d, cw3Var.f371861e);
                        } catch (org.json.JSONException unused2) {
                        }
                    }
                }
                jSONObject.put("header", jSONObject2);
            }
            jSONObject.put("ret", z24Var.f391634d);
            com.tencent.mm.plugin.topstory.ui.webview.b.a(lVar, "onExtTransferReady", jSONObject.toString());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "onResult", new java.lang.Object[0]);
            com.tencent.mm.plugin.topstory.ui.webview.b.a(lVar, "onExtTransferReady", lVar.f().toString());
        }
    }
}
