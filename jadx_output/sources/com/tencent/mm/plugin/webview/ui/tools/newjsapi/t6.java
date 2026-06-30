package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/t6;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenFinderCreateAcctView$OpenFinderCreateAccountTaskData;", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class t6 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderCreateAcctView$OpenFinderCreateAccountTaskData jsApiOpenFinderCreateAcctView$OpenFinderCreateAccountTaskData = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderCreateAcctView$OpenFinderCreateAccountTaskData) obj;
        try {
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ((c61.l7) b6Var).qj(context, null, jsApiOpenFinderCreateAcctView$OpenFinderCreateAccountTaskData != null ? jsApiOpenFinderCreateAcctView$OpenFinderCreateAccountTaskData.f185895d : null, false, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.s6(rVar));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiOpenFinderCreateAcctView", e17, "OpenFinderCreateAccountTask exception", new java.lang.Object[0]);
            if (rVar != null) {
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCInteger(0));
            }
        }
    }
}
