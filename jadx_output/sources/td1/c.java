package td1;

/* loaded from: classes7.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Parameter f417594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f417595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ td1.f f417596f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Parameter jsApiGetRecentUsageList$Companion$Parameter, com.tencent.mm.ipcinvoker.r rVar, td1.f fVar) {
        super(1);
        this.f417594d = jsApiGetRecentUsageList$Companion$Parameter;
        this.f417595e = rVar;
        this.f417596f = fVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        com.tencent.mm.plugin.appbrand.appusage.e3 e3Var = com.tencent.mm.plugin.appbrand.app.r9.hj().f76435f;
        com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Parameter jsApiGetRecentUsageList$Companion$Parameter = this.f417594d;
        java.util.ArrayList<com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo> a17 = e3Var.a(longValue, jsApiGetRecentUsageList$Companion$Parameter.f82908d);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetRecentUsageList", "lastUpdateTime=" + longValue + "  requestId=" + jsApiGetRecentUsageList$Companion$Parameter.f82910f + " count=" + jsApiGetRecentUsageList$Companion$Parameter.f82908d);
        for (com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo appBrandRecentTaskInfo : a17) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            kotlin.jvm.internal.o.d(appBrandRecentTaskInfo);
            this.f417596f.getClass();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("userName", appBrandRecentTaskInfo.f76361d);
            jSONObject.put("appName", appBrandRecentTaskInfo.f76356x);
            jSONObject.put("appId", appBrandRecentTaskInfo.f76362e);
            jSONObject.put("shortNickname", appBrandRecentTaskInfo.f76367m);
            jSONObject.put("appIcon", appBrandRecentTaskInfo.f76357y);
            jSONObject.put("appServiceType", appBrandRecentTaskInfo.f76358z);
            jSONObject.put("appVersion", appBrandRecentTaskInfo.f76364g);
            jSONObject.put("runningFlag", appBrandRecentTaskInfo.f76370p);
            jSONObject.put("cannotAddStarWxaUtil", appBrandRecentTaskInfo.f76371q);
            jSONObject.put("starApp", appBrandRecentTaskInfo.B);
            jSONObject.put("debugType", appBrandRecentTaskInfo.A);
            jSONObject.put(dm.i4.COL_UPDATETIME, appBrandRecentTaskInfo.C);
            jSONObject.put("runInThirdPartyAppRecently", appBrandRecentTaskInfo.f76372r);
            jSONObject.put("thirdPartyAppUsingDesc", appBrandRecentTaskInfo.f76373s);
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.relievedbuy, 0) == 1) {
                jSONObject.put("showRelievedBuyFlag", appBrandRecentTaskInfo.D);
            }
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_show_official_flag, 0) == 1) {
                jSONObject.put("showOfficialFlag", appBrandRecentTaskInfo.G);
            }
            jSONArray.put(jSONObject);
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        kotlin.jvm.internal.o.f(jSONArray2, "toString(...)");
        this.f417595e.a(new com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Result(jSONArray2, 0, ""));
        return jz5.f0.f302826a;
    }
}
