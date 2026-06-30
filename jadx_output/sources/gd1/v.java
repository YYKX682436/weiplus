package gd1;

/* loaded from: classes7.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f270513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f270514e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gd1.w f270515f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, gd1.w wVar) {
        super(1);
        this.f270513d = lVar;
        this.f270514e = i17;
        this.f270515f = wVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String t17;
        hd1.z result = (hd1.z) obj;
        kotlin.jvm.internal.o.g(result, "result");
        result.toString();
        boolean z17 = result instanceof hd1.y;
        gd1.w wVar = this.f270515f;
        int i17 = this.f270514e;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f270513d;
        if (z17) {
            java.util.Map l17 = kz5.c1.l(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, com.tencent.mm.plugin.appbrand.utils.v3.e((byte[]) ((hd1.y) result).f280442a)));
            wVar.getClass();
            if (com.tencent.mm.plugin.appbrand.utils.v3.d(lVar.getJsRuntime(), l17, (com.tencent.mm.plugin.appbrand.utils.t3) lVar.b(com.tencent.mm.plugin.appbrand.utils.t3.class)) == com.tencent.mm.plugin.appbrand.utils.u3.FAIL_SIZE_EXCEED_LIMIT) {
                java.lang.String str = android.text.TextUtils.isEmpty("fail:convert native buffer parameter fail. native buffer exceed size limit.") ? "fail:native buffer exceed size limit" : "fail:convert native buffer parameter fail. native buffer exceed size limit.";
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("errno", 2);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                t17 = wVar.u(str, jSONObject);
            } else {
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                l17.put("errno", 0);
                t17 = wVar.t("ok", l17);
            }
            lVar.a(i17, t17);
        } else if (result instanceof hd1.x) {
            hd1.x xVar = (hd1.x) result;
            java.lang.String str4 = "fail:" + xVar.f280441b;
            int i18 = xVar.f280440a;
            lVar.a(i17, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(wVar, i18, str4, kz5.c1.i(new jz5.l("errCode", java.lang.Integer.valueOf(i18)))));
        }
        return jz5.f0.f302826a;
    }
}
