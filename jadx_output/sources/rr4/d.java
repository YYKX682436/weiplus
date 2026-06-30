package rr4;

/* loaded from: classes9.dex */
public class d extends com.tencent.mm.wallet_core.tenpay.model.o implements com.tencent.mm.wallet_core.tenpay.model.c, com.tencent.mm.wallet_core.model.t {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f399227d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f399228e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f399229f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f399230g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f399231h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f399232i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.wallet_core.tenpay.model.ITenpaySave$RetryPayInfo f399233m;

    public d(double d17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("total_fee", com.tencent.mm.wallet_core.ui.r1.h0("" + d17, "100", 0, java.math.RoundingMode.HALF_UP).toString());
        hashMap.put("fee_type", str);
        hashMap.put("bind_serial", str2);
        hashMap.put("bank_type", str3);
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1502;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 74;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/genpresave";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 != 0) {
            return;
        }
        this.f399227d = jSONObject.optString("req_key");
        "1".equals(jSONObject.optString("should_alert"));
        jSONObject.optString("alert_msg");
        if (jSONObject.has("real_name_info")) {
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("real_name_info");
            com.tencent.mars.xlog.Log.i("Micromsg.NetSceneTenpayBalanceSave", "get real_name_info %s", optJSONObject.toString());
            this.f399228e = optJSONObject.optString("guide_flag");
            this.f399229f = optJSONObject.optString("guide_wording");
            this.f399230g = optJSONObject.optString("left_button_wording");
            this.f399231h = optJSONObject.optString("right_button_wording");
            this.f399232i = optJSONObject.optString("upload_credit_url");
        }
        com.tencent.mm.wallet_core.tenpay.model.ITenpaySave$RetryPayInfo iTenpaySave$RetryPayInfo = new com.tencent.mm.wallet_core.tenpay.model.ITenpaySave$RetryPayInfo();
        this.f399233m = iTenpaySave$RetryPayInfo;
        iTenpaySave$RetryPayInfo.a(jSONObject);
    }
}
