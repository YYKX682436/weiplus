package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class d1 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f182296d;

    public d1(com.tencent.mm.plugin.webview.luggage.jsapi.f1 f1Var, sd.b bVar) {
        this.f182296d = bVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        sd.b bVar = this.f182296d;
        if (iPCString == null || com.tencent.mm.sdk.platformtools.t8.K0(iPCString.f68406d)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetLocalImgData", "path is null");
            bVar.c("fail", null);
            return;
        }
        try {
            java.lang.String str = iPCString.f68406d;
            if (str != null) {
                java.lang.String a17 = fy4.f.f267261a.a(str, 0);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("localData", a17);
                    bVar.e(jSONObject);
                    return;
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetLocalImgData", e17.getMessage());
        }
        bVar.c("fail", null);
    }
}
