package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/z6;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenFinderLiveGetTicket$OpenFinderLiveGetTicketTaskData;", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
final class z6 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.lang.String str;
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderLiveGetTicket$OpenFinderLiveGetTicketTaskData jsApiOpenFinderLiveGetTicket$OpenFinderLiveGetTicketTaskData = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenFinderLiveGetTicket$OpenFinderLiveGetTicketTaskData) obj;
        if (jsApiOpenFinderLiveGetTicket$OpenFinderLiveGetTicketTaskData != null) {
            try {
                str = jsApiOpenFinderLiveGetTicket$OpenFinderLiveGetTicketTaskData.f185896d;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiOpenFinderLiveGetTicket", e17, "openFinderLiveGetTicket exception", new java.lang.Object[0]);
                if (rVar != null) {
                    rVar.a(new com.tencent.mm.ipcinvoker.type.IPCInteger(-1000));
                    return;
                }
                return;
            }
        } else {
            str = null;
        }
        java.lang.String str2 = str;
        if (str2 != null) {
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ((com.tencent.mm.feature.finder.live.v4) w0Var).Dk(context, str2, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.x6(rVar), new com.tencent.mm.plugin.webview.ui.tools.newjsapi.y6(rVar), false);
        }
    }
}
