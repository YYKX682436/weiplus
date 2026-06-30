package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/aa;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiPreRenderMiniProgram$PreRenderMiniProgramData;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
final class aa implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        boolean z17;
        java.lang.String str;
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiPreRenderMiniProgram$PreRenderMiniProgramData jsApiPreRenderMiniProgram$PreRenderMiniProgramData = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiPreRenderMiniProgram$PreRenderMiniProgramData) obj;
        try {
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.da daVar = com.tencent.mm.plugin.webview.ui.tools.newjsapi.da.f186038d;
            if (jsApiPreRenderMiniProgram$PreRenderMiniProgramData == null || (str = jsApiPreRenderMiniProgram$PreRenderMiniProgramData.f185914d) == null) {
                str = "";
            }
            z17 = com.tencent.mm.plugin.webview.ui.tools.newjsapi.da.e(daVar, str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.prerenderMiniProgram", e17, "openFinderTopic exception", new java.lang.Object[0]);
            z17 = false;
        }
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(z17));
        }
    }
}
