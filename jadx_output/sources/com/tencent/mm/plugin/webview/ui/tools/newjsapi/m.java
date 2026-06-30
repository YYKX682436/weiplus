package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/m;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiCallFinderJsHandler$CallFinderJsHandlerTaskData;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
final class m implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiCallFinderJsHandler$CallFinderJsHandlerTaskData jsApiCallFinderJsHandler$CallFinderJsHandlerTaskData = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiCallFinderJsHandler$CallFinderJsHandlerTaskData) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCallFinderJsHandler", "CallFinderJsHandlerTask in mm process");
        try {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.finder.assist.v1.f102614d;
            android.content.Context context = weakReference != null ? (android.app.Activity) weakReference.get() : null;
            if (context == null) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCallFinderJsHandler", "CallFinderJsHandlerTask context:" + context);
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            kotlin.jvm.internal.o.d(context);
            ((c61.l7) b6Var).Ni(context, java.lang.String.valueOf(jsApiCallFinderJsHandler$CallFinderJsHandlerTaskData != null ? jsApiCallFinderJsHandler$CallFinderJsHandlerTaskData.f185881d : null));
            if (rVar != null) {
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(true));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiCallFinderJsHandler", e17, "CallFinderJsHandlerTask exception", new java.lang.Object[0]);
            if (rVar != null) {
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
            }
        }
    }
}
