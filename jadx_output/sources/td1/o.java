package td1;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltd1/o;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/appbrand/jsapi/rencentusage/JsApiOperateRecentUsageList$Companion$Parameter;", "Lcom/tencent/mm/plugin/appbrand/jsapi/rencentusage/JsApiOperateRecentUsageList$Companion$Result;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class o implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Parameter jsApiOperateRecentUsageList$Companion$Parameter = (com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Parameter) obj;
        if (jsApiOperateRecentUsageList$Companion$Parameter == null || rVar == null) {
            return;
        }
        int ordinal = jsApiOperateRecentUsageList$Companion$Parameter.f82914d.ordinal();
        java.lang.String str = jsApiOperateRecentUsageList$Companion$Parameter.f82915e;
        int i17 = jsApiOperateRecentUsageList$Companion$Parameter.f82917g;
        if (ordinal == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("REMOVE_FROM_RECENT_USAGE_LIST  appId=");
            java.lang.String str2 = jsApiOperateRecentUsageList$Companion$Parameter.f82916f;
            sb6.append(str2);
            sb6.append("  versionType=");
            sb6.append(i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.operateRecentUsageList", sb6.toString());
            com.tencent.mm.plugin.appbrand.appusage.o6.a(str, str2, i17, null);
            rVar.a(com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Result.f82918g);
            return;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.operateRecentUsageList", "REMOVE_FROM_MY_COLLECTION username=" + str + "  versionType=" + i17);
            if (((com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class)).D0(str, i17, true)) {
                rVar.a(com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Result.f82918g);
                return;
            } else {
                rVar.a(com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Result.f82919h);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.operateRecentUsageList", "ADD_TO_MY_COLLECTION   username=" + str + "  versionType=" + i17);
        int m07 = ((com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class)).m0(str, i17, true);
        if (m07 == -3) {
            rVar.a(new com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Result(false, td1.l.f417611h, "action be blocked"));
            return;
        }
        if (m07 == -2) {
            rVar.a(new com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Result(false, td1.l.f417610g, "star app's count reached maximum limit"));
            return;
        }
        if (m07 == -1) {
            rVar.a(com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Result.f82919h);
        } else if (m07 != 0) {
            rVar.a(com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Result.f82919h);
        } else {
            rVar.a(com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Result.f82918g);
        }
    }
}
