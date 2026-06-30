package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/e;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/GetWxInfoMpPageResponse;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class e implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.ipcinvoker.type.IPCVoid, com.tencent.mm.plugin.webview.ui.tools.newjsapi.GetWxInfoMpPageResponse> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.modelavatar.s0 Ni;
        com.tencent.mm.modelavatar.r0 n07;
        com.tencent.mm.ipcinvoker.type.IPCVoid data = (com.tencent.mm.ipcinvoker.type.IPCVoid) obj;
        kotlin.jvm.internal.o.g(data, "data");
        try {
            java.lang.String r17 = c01.z1.r();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str = r17 == null ? "" : r17;
            java.lang.String l17 = c01.z1.l();
            java.lang.String d17 = (((kv.a0) i95.n0.c(kv.a0.class)) == null || (Ni = com.tencent.mm.modelavatar.d1.Ni()) == null || (n07 = Ni.n0(str)) == null) ? null : n07.d();
            java.lang.String str2 = d17 == null ? "" : d17;
            if (rVar != null) {
                rVar.a(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.GetWxInfoMpPageResponse(true, l17, str2, str, null, 16, null));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GetWxInfoMpPageIPCTask", e17, "getWxInfo ipc", new java.lang.Object[0]);
            if (rVar != null) {
                java.lang.String message = e17.getMessage();
                if (message == null) {
                    message = "getWxInfo failed";
                }
                rVar.a(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.GetWxInfoMpPageResponse(false, null, null, null, message, 14, null));
            }
        }
    }
}
