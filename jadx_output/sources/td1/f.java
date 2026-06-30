package td1;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltd1/f;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/plugin/appbrand/jsapi/rencentusage/JsApiGetRecentUsageList$Companion$Parameter;", "Lcom/tencent/mm/plugin/appbrand/jsapi/rencentusage/JsApiGetRecentUsageList$Companion$Result;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes7.dex */
public final class f implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Parameter, com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Result> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Parameter jsApiGetRecentUsageList$Companion$Parameter = (com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Parameter) obj;
        if (jsApiGetRecentUsageList$Companion$Parameter == null || rVar == null) {
            return;
        }
        td1.c cVar = new td1.c(jsApiGetRecentUsageList$Companion$Parameter, rVar, this);
        td1.e eVar = new td1.e(jsApiGetRecentUsageList$Companion$Parameter, cVar, rVar);
        long j17 = jsApiGetRecentUsageList$Companion$Parameter.f82909e;
        if (0 != j17) {
            eVar.invoke(java.lang.Boolean.FALSE, java.lang.Long.valueOf(j17));
        } else {
            cVar.invoke(java.lang.Long.valueOf(com.tencent.wcdb.core.Database.DictDefaultMatchValue));
            eVar.invoke(java.lang.Boolean.TRUE, java.lang.Long.valueOf(com.tencent.wcdb.core.Database.DictDefaultMatchValue));
        }
    }
}
