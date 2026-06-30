package of1;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"Lof1/b1;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class b1 extends com.tencent.mm.plugin.appbrand.ipc.v {
    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        if (!(appBrandProxyUIProcessTask$ProcessRequest instanceof com.tencent.mm.plugin.appbrand.jsapi.webview.bwc.HTMLWebViewWithBWC$OpenSearchRequest)) {
            finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.EmptyResult());
            return;
        }
        su4.j2 j2Var = new su4.j2();
        j2Var.f412939b = 182;
        j2Var.f412940c = 0;
        j2Var.A = !((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).wi(201, 262208);
        java.lang.String query = ((com.tencent.mm.plugin.appbrand.jsapi.webview.bwc.HTMLWebViewWithBWC$OpenSearchRequest) appBrandProxyUIProcessTask$ProcessRequest).getQuery();
        if (query == null) {
            query = "";
        }
        j2Var.f412941d = query;
        u50.v vVar = (u50.v) i95.n0.c(u50.v.class);
        int i17 = j2Var.f412939b;
        ((s50.g0) vVar).getClass();
        j2Var.f412942e = o13.n.l(i17);
        j2Var.f412938a = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
        finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.EmptyResult());
    }
}
