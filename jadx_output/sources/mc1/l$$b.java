package mc1;

/* loaded from: classes7.dex */
public final /* synthetic */ class l$$b implements h63.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mc1.l f325612a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f325613b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f325614c;

    public /* synthetic */ l$$b(mc1.l lVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f325612a = lVar;
        this.f325613b = c0Var;
        this.f325614c = i17;
    }

    public final void a(int i17, int i18, boolean z17) {
        mc1.l lVar = this.f325612a;
        lVar.getClass();
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f325613b;
        int i19 = this.f325614c;
        if (!z17) {
            java.util.HashMap hashMap = new java.util.HashMap(2);
            hashMap.put("selectedIndex", java.lang.Integer.valueOf(i17));
            hashMap.put("cgiCode", java.lang.Integer.valueOf(i18));
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 0);
            c0Var.a(i19, lVar.t("ok", hashMap));
            return;
        }
        com.tencent.mars.xlog.Log.i("JsApiShareInvitationToLiveRoom", "panel is canceled");
        java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 1);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        c0Var.a(i19, lVar.u(str2, jSONObject));
    }
}
