package nd1;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnd1/u;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/plugin/appbrand/jsapi/page/JsApiNavigateToWC$LaunchArgs;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes7.dex */
public final class u implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.plugin.appbrand.jsapi.page.JsApiNavigateToWC$LaunchArgs, com.tencent.mm.ipcinvoker.type.IPCBoolean> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.jsapi.page.JsApiNavigateToWC$LaunchArgs jsApiNavigateToWC$LaunchArgs = (com.tencent.mm.plugin.appbrand.jsapi.page.JsApiNavigateToWC$LaunchArgs) obj;
        if (jsApiNavigateToWC$LaunchArgs != null) {
            ym5.a1.f(new nd1.t(jsApiNavigateToWC$LaunchArgs, rVar));
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.JsApiNavigateToWC", "halfRestartAppBrandImpl data is empty.");
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
        }
    }
}
