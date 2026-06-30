package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class n0 implements com.tencent.mm.plugin.lite.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f144022b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.gen.LiteAppOpenScene f144023c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.GetA8KeyRedirectEvent f144024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.t0 f144025e;

    public n0(com.tencent.mm.plugin.lite.logic.t0 t0Var, java.lang.String str, java.lang.String[] strArr, com.tencent.liteapp.gen.LiteAppOpenScene liteAppOpenScene, com.tencent.mm.autogen.events.GetA8KeyRedirectEvent getA8KeyRedirectEvent) {
        this.f144025e = t0Var;
        this.f144021a = str;
        this.f144022b = strArr;
        this.f144023c = liteAppOpenScene;
        this.f144024d = getA8KeyRedirectEvent;
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void fail(java.lang.String str, int i17) {
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.lite.logic.o0(this));
        com.tencent.mm.autogen.events.LiteAppPackageUpdateEvent liteAppPackageUpdateEvent = new com.tencent.mm.autogen.events.LiteAppPackageUpdateEvent();
        am.ti tiVar = liteAppPackageUpdateEvent.f54470g;
        tiVar.f8013a = false;
        tiVar.f8014b = str;
        liteAppPackageUpdateEvent.e();
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void success(com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, int i17) {
        java.lang.String str;
        com.tencent.mm.autogen.events.LiteAppPackageUpdateEvent liteAppPackageUpdateEvent = new com.tencent.mm.autogen.events.LiteAppPackageUpdateEvent();
        am.ti tiVar = liteAppPackageUpdateEvent.f54470g;
        tiVar.f8013a = true;
        tiVar.f8014b = wxaLiteAppInfo.appId;
        tiVar.f8015c = wxaLiteAppInfo.path;
        tiVar.f8016d = wxaLiteAppInfo.version;
        com.tencent.mm.plugin.lite.logic.t0 t0Var = this.f144025e;
        java.lang.String str2 = this.f144021a;
        t0Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (str2 != null && !str2.equals("")) {
            for (java.lang.String str3 : str2.split("&")) {
                java.lang.String[] split = str3.split("=", 2);
                if (split.length > 1) {
                    hashMap.put(split[0], split[1]);
                } else {
                    com.tencent.mars.xlog.Log.w("LiteAppDevQrCodeListener", "query2Map params split length unexpected! param:%s", str3);
                    hashMap.put(split[0], "");
                }
            }
        }
        if (hashMap.containsKey("attach") && "1".equals(hashMap.get("attach")) && hashMap.containsKey("debug") && "1".equals(hashMap.get("debug")) && hashMap.containsKey("debugSvr")) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                wxaLiteAppInfo.openOption = jSONObject;
                jSONObject.put("type", "debug");
                wxaLiteAppInfo.openOption.put("debugInfo", this.f144021a);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("LiteAppDevQrCodeListener", "exception: ", e17.toString());
            }
            try {
                com.tencent.mm.plugin.lite.logic.g1.s().V(wxaLiteAppInfo);
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.lite.logic.n0$$a());
            } catch (java.lang.Exception unused) {
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.lite.logic.n0$$b());
            }
            liteAppPackageUpdateEvent.e();
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", wxaLiteAppInfo.appId);
        java.lang.String str4 = this.f144022b[0];
        if (str4 != null) {
            bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str4);
        }
        java.lang.String str5 = this.f144022b[1];
        if (str5 != null) {
            bundle.putString("query", str5);
        }
        if (!"".equals(this.f144021a) && (str = this.f144021a) != null) {
            bundle.putString("qr_url_query_string", str);
        }
        com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = new com.tencent.liteapp.storage.LiteAppReferrerInfo();
        liteAppReferrerInfo.scene = this.f144023c;
        bundle.putParcelable("liteappReferrerInfo", liteAppReferrerInfo);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk((android.content.Context) this.f144024d.f54376g.f6448c.get(), bundle, true, false, null);
        com.tencent.mm.plugin.lite.logic.t0.b(this.f144025e, this.f144024d);
        liteAppPackageUpdateEvent.e();
    }
}
