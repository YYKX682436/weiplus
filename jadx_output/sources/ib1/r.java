package ib1;

/* loaded from: classes7.dex */
public class r implements ob1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290079a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f290080b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f290081c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ib1.s f290082d;

    public r(ib1.s sVar, java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f290082d = sVar;
        this.f290079a = str;
        this.f290080b = lVar;
        this.f290081c = i17;
    }

    @Override // ob1.d
    public void a(ob1.m mVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "appId:%s notifyBLECharacteristicValueChanged result:%s", this.f290079a, mVar);
        int i17 = mVar.f344038a;
        ib1.s sVar = this.f290082d;
        int i18 = this.f290081c;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f290080b;
        if (i17 != 0) {
            new java.util.HashMap().put("errCode", java.lang.Integer.valueOf(mVar.f344038a));
            lVar.a(i18, sVar.r(mVar.f344039b, mVar.f344040c, null));
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(43);
            return;
        }
        new java.util.HashMap().put("errCode", 0);
        sVar.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        lVar.a(i18, sVar.u(str, jSONObject));
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l.a(42);
    }
}
