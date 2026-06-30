package ma1;

/* loaded from: classes7.dex */
public final class k implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f325198a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f325199b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f325200c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ma1.m f325201d;

    public k(int i17, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i18, ma1.m mVar) {
        this.f325198a = i17;
        this.f325199b = c0Var;
        this.f325200c = i18;
        this.f325201d = mVar;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        jz5.f0 f0Var;
        if (i17 != this.f325198a) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiScreenRecorderShare", "on result callback, result code: %d", java.lang.Integer.valueOf(i18));
        ma1.m mVar = this.f325201d;
        int i19 = this.f325200c;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f325199b;
        if (i18 == -1) {
            java.io.Serializable serializableExtra = intent.getSerializableExtra("k_ext_data");
            if (serializableExtra != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (java.util.Map.Entry entry : ((java.util.Map) serializableExtra).entrySet()) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("optionKey", ((java.lang.Number) entry.getKey()).intValue());
                    jSONObject2.put("errCode", ((com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI.ShareResult) entry.getValue()).f90190d);
                    jSONObject2.put("errMsg", ((com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI.ShareResult) entry.getValue()).f90191e);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("shareResult", jSONArray);
                mVar.getClass();
                java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                try {
                    jSONObject.put("errno", 0);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                c0Var.a(i19, mVar.u(str, jSONObject));
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                mVar.getClass();
                java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                java.lang.String str4 = str3 != null ? str3 : "";
                java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("errno", 4);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                c0Var.a(i19, mVar.u(str4, jSONObject3));
            }
        } else if (i18 != 0) {
            this.f325201d.F(this.f325199b, this.f325200c, 1, 804, "share video failed!");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiScreenRecorderShare", "user cancelled share!");
            java.util.Map hashMap = new java.util.HashMap(1);
            hashMap.put("errCode", 803);
            c0Var.a(i19, mVar.p("fail: user cancelled", hashMap));
        }
        return true;
    }
}
