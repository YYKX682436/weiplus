package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/c9;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeCoinView$OpenWeCoinTaskData;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
final class c9 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        boolean z17;
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenWeCoinView$OpenWeCoinTaskData jsApiOpenWeCoinView$OpenWeCoinTaskData = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenWeCoinView$OpenWeCoinTaskData) obj;
        try {
            new org.json.JSONObject().put("extInfo", new org.json.JSONObject(jsApiOpenWeCoinView$OpenWeCoinTaskData != null ? jsApiOpenWeCoinView$OpenWeCoinTaskData.f185911d : null));
            ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).h(com.tencent.mm.sdk.platformtools.x2.f193071a, null, "", 1, false, "");
            z17 = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiOpenWeCoinView", e17, "OpenWeCoinTaskData exception", new java.lang.Object[0]);
            z17 = false;
        }
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(z17));
        }
    }
}
