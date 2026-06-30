package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/n3;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiHandleLiveCustomBusiness$HandleLiveCustomBusinessTaskData;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
final class n3 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiHandleLiveCustomBusiness$HandleLiveCustomBusinessTaskData jsApiHandleLiveCustomBusiness$HandleLiveCustomBusinessTaskData = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiHandleLiveCustomBusiness$HandleLiveCustomBusinessTaskData) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleLiveCustomBusiness", "#HandleLiveCustomBusinessTask->invoke in mm process");
        try {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1 e1Var = ya2.e1.f460472a;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.String str3 = "";
            if (jsApiHandleLiveCustomBusiness$HandleLiveCustomBusinessTaskData == null || (str = jsApiHandleLiveCustomBusiness$HandleLiveCustomBusinessTaskData.f185888d) == null) {
                str = "";
            }
            if (jsApiHandleLiveCustomBusiness$HandleLiveCustomBusinessTaskData != null && (str2 = jsApiHandleLiveCustomBusiness$HandleLiveCustomBusinessTaskData.f185889e) != null) {
                str3 = str2;
            }
            e1Var.s(context, str, str3);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("retCode", 0);
            if (rVar != null) {
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString(jSONObject.toString()));
            }
        } catch (java.lang.Exception e17) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("retCode", -1);
            if (rVar != null) {
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString(jSONObject2.toString()));
            }
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiHandleLiveCustomBusiness", e17, "#HandleLiveCustomBusinessTask invoke exception", new java.lang.Object[0]);
        }
    }
}
