package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/b8;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenFinderTopicView$OpenFinderTopicTaskData;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
final class b8 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        boolean z17;
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderTopicView$OpenFinderTopicTaskData jsApiOpenFinderTopicView$OpenFinderTopicTaskData = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderTopicView$OpenFinderTopicTaskData) obj;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("extInfo", new org.json.JSONObject(jsApiOpenFinderTopicView$OpenFinderTopicTaskData != null ? jsApiOpenFinderTopicView$OpenFinderTopicTaskData.f185904d : null));
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1 e1Var = ya2.e1.f460472a;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            zy2.ta.e(e1Var, context, jSONObject.toString(), null, 4, null);
            z17 = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiOpenFinderTopicView", e17, "openFinderTopic exception", new java.lang.Object[0]);
            z17 = false;
        }
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(z17));
        }
    }
}
