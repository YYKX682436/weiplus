package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/ea;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
final class ea implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void invoke(android.os.Bundle bundle, com.tencent.mm.ipcinvoker.r rVar) {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreloadFinderFeed", "start preload");
            cl0.e eVar = new cl0.e(bundle != null ? bundle.getString("KEY_REQUEST_DATA") : null);
            int i17 = bundle != null ? bundle.getInt("KEY_REQUEST_SCENE", 0) : 0;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            int length = eVar.length();
            if (length > 20) {
                length = 20;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreloadFinderFeed", "preload %s", java.lang.Integer.valueOf(eVar.length()));
            for (int i18 = 0; i18 < length; i18++) {
                r45.rv0 rv0Var = new r45.rv0();
                java.lang.Object obj = eVar.get(i18);
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.json.InnerJSONObject");
                cl0.c cVar = (cl0.c) obj;
                rv0Var.set(1, cVar.getString("encryptId"));
                rv0Var.set(2, cVar.getString("nonceId"));
                linkedList.add(rv0Var);
            }
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Uk(linkedList, 39, i17);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiPreloadFinderFeed", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreloadFinderFeed", "callback");
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCVoid());
        }
    }
}
