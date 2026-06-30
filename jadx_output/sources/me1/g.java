package me1;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"Lme1/g;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class g extends com.tencent.mm.plugin.appbrand.ipc.v {
    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        if (!(appBrandProxyUIProcessTask$ProcessRequest instanceof com.tencent.mm.plugin.appbrand.jsapi.ui.launcher.API_openWeAppSearch$OpenSearchRequest)) {
            finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.ui.launcher.API_openWeAppSearch$OpenSearchResponse(false));
            return;
        }
        ((com.tencent.mm.plugin.websearch.p2) ((su4.g1) i95.n0.c(su4.g1.class))).Bi(getActivityContext(), new me1.f(this));
    }
}
