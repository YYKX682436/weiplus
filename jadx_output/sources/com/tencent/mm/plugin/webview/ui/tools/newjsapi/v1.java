package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/v1;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiGetFinderRedDot$GetFinderRedDotData;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
final class v1 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiGetFinderRedDot$GetFinderRedDotData jsApiGetFinderRedDot$GetFinderRedDotData = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiGetFinderRedDot$GetFinderRedDotData) obj;
        try {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Xj(jsApiGetFinderRedDot$GetFinderRedDotData != null ? jsApiGetFinderRedDot$GetFinderRedDotData.f185883d : null, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.u1(rVar));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiGetFinderRedDot", e17, "JsApiGetFinderRedDot exception", new java.lang.Object[0]);
            if (rVar != null) {
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString(""));
            }
        }
    }
}
