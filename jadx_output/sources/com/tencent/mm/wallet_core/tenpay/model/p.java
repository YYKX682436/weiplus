package com.tencent.mm.wallet_core.tenpay.model;

/* loaded from: classes9.dex */
public abstract class p extends com.tencent.mm.wallet_core.tenpay.model.r implements com.tencent.mm.wallet_core.model.t {

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f214056n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f214057o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f214058p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f214059q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f214060r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper f214061s;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f214064v;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f214049d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public int f214050e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f214051f = false;

    /* renamed from: g, reason: collision with root package name */
    public int f214052g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f214053h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f214054i = null;

    /* renamed from: m, reason: collision with root package name */
    public org.json.JSONObject f214055m = null;

    /* renamed from: t, reason: collision with root package name */
    public boolean f214062t = false;

    /* renamed from: u, reason: collision with root package name */
    public int f214063u = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f214065w = -1;

    public abstract boolean H();

    public void I(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, java.lang.String str4) {
        java.util.HashMap hashMap = (java.util.HashMap) this.f214049d;
        hashMap.put("req_key", str);
        hashMap.put(ya.b.TRANSACTION_ID, str2);
        hashMap.put("pay_scene", i17 + "");
        hashMap.put("bank_type", str3);
        hashMap.put("channel", i18 + "");
        hashMap.put("bind_serial", str4);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.r, com.tencent.mm.wallet_core.tenpay.model.o
    public boolean canRetry() {
        return false;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.r, com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        boolean z17;
        com.tencent.mm.plugin.wallet_core.id_verify.util.SetPwdInfo setPwdInfo;
        if (!this.f214051f) {
            this.f214053h = i17;
            this.f214054i = str;
            this.f214055m = jSONObject;
            this.f214051f = true;
            if (jSONObject != null) {
                this.f214050e = jSONObject.optInt("query_order_flag", 0);
            }
        }
        if (jSONObject == null || !jSONObject.has("real_name_info")) {
            z17 = false;
        } else {
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("real_name_info");
            this.f214056n = optJSONObject.optString("guide_flag");
            this.f214057o = optJSONObject.optString("guide_wording");
            this.f214058p = optJSONObject.optString("left_button_wording");
            this.f214059q = optJSONObject.optString("right_button_wording");
            this.f214060r = optJSONObject.optString("upload_credit_url");
            z17 = true;
        }
        if (jSONObject == null || !jSONObject.has("set_pwd_info")) {
            setPwdInfo = null;
        } else {
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("set_pwd_info");
            setPwdInfo = new com.tencent.mm.plugin.wallet_core.id_verify.util.SetPwdInfo();
            setPwdInfo.f179513e = optJSONObject2.optString("guide_wording");
            setPwdInfo.f179514f = optJSONObject2.optString("left_button_wording");
            setPwdInfo.f179515g = optJSONObject2.optString("right_button_wording");
            setPwdInfo.f179512d = optJSONObject2.optInt("send_pwd_msg");
            z17 = true;
        }
        if (z17 && ("1".equals(this.f214056n) || "2".equals(this.f214056n) || setPwdInfo != null)) {
            com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = new com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper();
            this.f214061s = realnameGuideHelper;
            java.lang.String str2 = this.f214056n;
            java.lang.String str3 = this.f214057o;
            java.lang.String str4 = this.f214058p;
            java.lang.String str5 = this.f214059q;
            java.lang.String str6 = this.f214060r;
            realnameGuideHelper.f179504d = setPwdInfo;
            realnameGuideHelper.f179505e = str2;
            realnameGuideHelper.f179506f = str3;
            realnameGuideHelper.f179507g = str4;
            realnameGuideHelper.f179508h = str5;
            realnameGuideHelper.f179509i = str6;
            realnameGuideHelper.f179511n = 0;
        }
        this.f214064v = jSONObject.optString("forget_pwd_url", "");
        this.f214065w = jSONObject.optInt("is_clear_failure", -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayDelayQueryBase", "forget_pwd_url %s", this.f214064v);
        this.f214062t = true;
        super.onGYNetEnd(i17, str, jSONObject);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.r, com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd2(com.tencent.mm.wallet_core.model.o oVar, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayDelayQueryBase", "always callback: %s,%s", java.lang.Integer.valueOf(oVar.f213953b), oVar.f213954c);
        super.onGYNetEnd2(oVar, jSONObject);
        if (this.f214062t || this.f214051f) {
            return;
        }
        this.f214052g = oVar.f213952a;
        this.f214053h = oVar.f213953b;
        this.f214054i = oVar.f213954c;
        if (jSONObject != null) {
            this.f214050e = jSONObject.optInt("query_order_flag", 0);
            this.f214055m = jSONObject;
        }
        this.f214051f = true;
    }
}
