package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/r8;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
final class r8 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCString data = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        kotlin.jvm.internal.o.g(data, "data");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(data.f68406d);
            java.lang.String optString = jSONObject.optString("action", "");
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenTingView", "action = " + optString);
            if (kotlin.jvm.internal.o.b(optString, "openCategory")) {
                kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.t8(jSONObject, rVar, null), 2, null);
            } else if (kotlin.jvm.internal.o.b(optString, "openProfile")) {
                com.tencent.mm.plugin.webview.ui.tools.newjsapi.u8.e(com.tencent.mm.plugin.webview.ui.tools.newjsapi.u8.f186559d, jSONObject, rVar);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenTingView", "OpenTingView not support action");
                if (rVar != null) {
                    rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiOpenTingView", e17, "open fail", new java.lang.Object[0]);
            if (rVar != null) {
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
            }
        }
    }
}
