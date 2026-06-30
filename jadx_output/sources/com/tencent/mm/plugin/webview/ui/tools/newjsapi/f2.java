package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/f2;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiGetNewLifeContact$NewLifeGetNewLifeContactData;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
final class f2 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.lang.String str;
        boolean z17;
        try {
            str = ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a);
            z17 = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiGetNewLifeContact", e17, "OpenNewLifeViewTask exception", new java.lang.Object[0]);
            str = "";
            z17 = false;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("retCode", z17 ? 0 : -1);
        jSONObject.put(dm.i4.COL_USERNAME, str);
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString(jSONObject.toString()));
        }
    }
}
