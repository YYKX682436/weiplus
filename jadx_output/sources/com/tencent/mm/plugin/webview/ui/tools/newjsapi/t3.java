package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/t3;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiHandleMPPageAction$DeleteProfileOutboxRequest;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class t3 implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiHandleMPPageAction$DeleteProfileOutboxRequest, com.tencent.mm.ipcinvoker.type.IPCVoid> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r callback) {
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiHandleMPPageAction$DeleteProfileOutboxRequest data = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiHandleMPPageAction$DeleteProfileOutboxRequest) obj;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invoke DeleteProfileOutboxTask in MM process, data: ");
        java.lang.String str = data.f185890d;
        sb6.append(str);
        sb6.append(", bizType: ");
        int i17 = data.f185891e;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", sb6.toString());
        ((ox.r) ((rm.d0) i95.n0.c(rm.d0.class))).Di(i17).b((int) java.lang.Long.parseLong(str));
        callback.a(new com.tencent.mm.ipcinvoker.type.IPCVoid());
    }
}
