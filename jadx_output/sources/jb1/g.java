package jb1;

/* loaded from: classes7.dex */
public final class g implements com.tencent.mm.plugin.appbrand.utils.y3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f298716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f298717b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jb1.i f298718c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f298719d;

    public g(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, jb1.i iVar, yz5.a aVar) {
        this.f298716a = lVar;
        this.f298717b = i17;
        this.f298718c = iVar;
        this.f298719d = aVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.y3
    public final void a(com.tencent.mm.plugin.appbrand.utils.i4 res) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(res, "res");
        int ordinal = res.ordinal();
        jb1.i iVar = this.f298718c;
        int i17 = this.f298717b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f298716a;
        if (ordinal == 0) {
            iVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, iVar.u(str2, jSONObject));
            return;
        }
        if (ordinal == 1) {
            this.f298719d.invoke();
            return;
        }
        if (ordinal != 2) {
            return;
        }
        iVar.getClass();
        str = android.text.TextUtils.isEmpty(null) ? "fail:system permission denied" : null;
        str2 = str != null ? str : "";
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 3);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        lVar.a(i17, iVar.u(str2, jSONObject2));
    }
}
