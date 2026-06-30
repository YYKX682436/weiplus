package td1;

/* loaded from: classes7.dex */
public final class g implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f417603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f417604e;

    public g(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f417603d = lVar;
        this.f417604e = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Result jsApiGetRecentUsageList$Companion$Result = (com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Result) obj;
        kotlin.jvm.internal.o.d(jsApiGetRecentUsageList$Companion$Result);
        com.tencent.mm.plugin.appbrand.jsapi.l component = this.f417603d;
        kotlin.jvm.internal.o.g(component, "component");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("requestId", this.f417604e);
        jSONObject.put("recentUsageInfo", new org.json.JSONArray(jsApiGetRecentUsageList$Companion$Result.f82911d));
        int i17 = jsApiGetRecentUsageList$Companion$Result.f82912e;
        jSONObject.put(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, i17);
        java.lang.String str = jsApiGetRecentUsageList$Companion$Result.f82913f;
        java.lang.String jSONObject2 = jSONObject.put(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_MSG, str).toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("******errorCode=");
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        sb6.append(i17);
        sb6.append("\nerrorMsg=");
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOnGetRecentUsageListResultEvent", sb6.toString());
        td1.i iVar = new td1.i(null);
        iVar.u(component);
        iVar.f82374f = jSONObject2;
        iVar.m();
    }
}
