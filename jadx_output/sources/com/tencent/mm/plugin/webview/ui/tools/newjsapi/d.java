package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/d;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/BizPoiResponse;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class d implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.ipcinvoker.type.IPCVoid, com.tencent.mm.plugin.webview.ui.tools.newjsapi.BizPoiResponse> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        try {
            com.tencent.mars.xlog.Log.i("GetBizPoiIPCTask", "getPosition");
            kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.c(rVar, null), 2, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("GetBizPoiIPCTask", "getPosition outer fail e:%s", e17.getMessage());
            if (rVar != null) {
                rVar.a(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.BizPoiResponse(0.0d, 0.0d, 0L, "fail interal error"));
            }
        }
    }
}
