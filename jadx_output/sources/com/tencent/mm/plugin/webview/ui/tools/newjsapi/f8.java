package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class f8 implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.newjsapi.g8 f186086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f186087b;

    public f8(com.tencent.mm.plugin.webview.ui.tools.newjsapi.g8 g8Var, com.tencent.mm.ipcinvoker.r rVar) {
        this.f186086a = g8Var;
        this.f186087b = rVar;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenFinderView", "onCallback callbackReportReadInfo");
        this.f186086a.getClass();
        jz5.f0 f0Var = null;
        jz5.l lVar = obj instanceof jz5.l ? (jz5.l) obj : null;
        if (lVar != null) {
            java.lang.Object obj2 = lVar.f302833d;
            java.lang.Integer num = obj2 instanceof java.lang.Integer ? (java.lang.Integer) obj2 : null;
            int intValue = num != null ? num.intValue() : 0;
            java.lang.Object obj3 = lVar.f302834e;
            java.lang.String str = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
            if (str == null) {
                str = "";
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("retCode", intValue);
                jSONObject.put("feed_read_info", str);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiOpenFinderView", e17, "openFinderView exception", new java.lang.Object[0]);
            }
            com.tencent.mm.ipcinvoker.r rVar = this.f186087b;
            if (rVar != null) {
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString(jSONObject.toString()));
                f0Var = jz5.f0.f302826a;
            }
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenFinderView", "callbackReportReadInfo null");
        }
    }
}
