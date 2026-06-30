package yc1;

/* loaded from: classes7.dex */
public final class t implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f460810a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f460811b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yc1.u f460812c;

    public t(com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, yc1.u uVar) {
        this.f460810a = c0Var;
        this.f460811b = i17;
        this.f460812c = uVar;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        java.lang.String str2;
        java.lang.String str3;
        rk0.c.c("MicroMsg.JsApiNativeWXPayCgiTunnel", "onGYNetEnd errType :" + i17 + " errCode: " + i18 + " errMsg :" + str, new java.lang.Object[0]);
        yc1.u uVar = this.f460812c;
        int i19 = this.f460811b;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f460810a;
        if (i17 != 0 || i18 != 0 || oVar.f70711b.f70700a == null) {
            rk0.c.b("MicroMsg.JsApiNativeWXPayCgiTunnel", "nativeWXPayCgiTunnel cgi failed", new java.lang.Object[0]);
            uVar.getClass();
            str2 = android.text.TextUtils.isEmpty(null) ? "fail:server system error" : null;
            str3 = str2 != null ? str2 : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 1000);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i19, uVar.u(str3, jSONObject));
            return;
        }
        rk0.c.c("MicroMsg.JsApiNativeWXPayCgiTunnel", "nativeWXPayCgiTunnel cgi success", new java.lang.Object[0]);
        og0.m mVar = (og0.m) i95.n0.c(og0.m.class);
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        ((ng0.m) mVar).getClass();
        java.lang.String str5 = ((r45.hy5) fVar).f376556d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            java.util.HashMap hashMap = new java.util.HashMap();
            kotlin.jvm.internal.o.d(str5);
            hashMap.put("respbuf", str5);
            uVar.getClass();
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 0);
            c0Var.a(i19, uVar.t("ok", hashMap));
            return;
        }
        uVar.getClass();
        str2 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str3 = str2 != null ? str2 : "";
        java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        c0Var.a(i19, uVar.u(str3, jSONObject2));
    }
}
