package com.tencent.mm.plugin.webview.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/model/e;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/plugin/webview/model/AISummarySearchLogic$RequestParams;", "Lcom/tencent/mm/plugin/webview/model/AISummarySearchLogic$ResponseWrapper;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class e implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.plugin.webview.model.AISummarySearchLogic$RequestParams, com.tencent.mm.plugin.webview.model.AISummarySearchLogic$ResponseWrapper> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.webview.model.AISummarySearchLogic$RequestParams requestParams = (com.tencent.mm.plugin.webview.model.AISummarySearchLogic$RequestParams) obj;
        kotlin.jvm.internal.o.g(requestParams, "requestParams");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start GenFTSParamsTask ");
        int i17 = requestParams.f182725d;
        sb6.append(i17);
        sb6.append(", ");
        int i18 = requestParams.f182726e;
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.AISummarySearchLogic", sb6.toString());
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        java.util.Map b17 = su4.r2.b(i17, true, i18);
        if (rVar != null) {
            rVar.a(new com.tencent.mm.plugin.webview.model.AISummarySearchLogic$ResponseWrapper(b17));
        }
    }
}
