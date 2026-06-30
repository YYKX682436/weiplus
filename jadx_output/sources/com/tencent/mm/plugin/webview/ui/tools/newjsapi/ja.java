package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/ja;", "Lcom/tencent/mm/ipcinvoker/j;", "", "", "", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class ja implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        byte[] data = (byte[]) obj;
        kotlin.jvm.internal.o.g(data, "data");
        dw5.o oVar = new dw5.o();
        try {
            dw5.o parseFrom = new dw5.o().parseFrom(data);
            kotlin.jvm.internal.o.f(parseFrom, "parseFrom(...)");
            oVar = parseFrom;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPreviewAppMsgCommentImage", "parse launch info error: " + com.tencent.mm.sdk.platformtools.t8.H(e17, true));
        }
        rv.k3 k3Var = (rv.k3) i95.n0.c(rv.k3.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.ia iaVar = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.ia(rVar);
        vw.m2 m2Var = (vw.m2) k3Var;
        m2Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        m2Var.ij();
        kotlinx.coroutines.l.d(m2Var.f440685e, null, null, new vw.c2(oVar, context, iaVar, null), 3, null);
    }
}
