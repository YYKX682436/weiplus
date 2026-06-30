package ss4;

/* loaded from: classes9.dex */
public class t extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.wallet_core.model.Orders.Promotions f412134d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f412135e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f412136f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f412137g;

    public t(com.tencent.mm.plugin.wallet_core.model.Orders.Promotions promotions, java.lang.String str, java.lang.String str2, long j17) {
        this.f412134d = promotions;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.mm.opensdk.constants.ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, promotions.f179779o + "");
        hashMap.put("award_id", promotions.f179781q + "");
        hashMap.put("send_record_id", promotions.f179782r + "");
        hashMap.put("user_record_id", promotions.f179783s + "");
        hashMap.put("req_key", str);
        hashMap.put(ya.b.TRANSACTION_ID, str2);
        hashMap.put("activity_mch_id", j17 + "");
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return com.tencent.mm.plugin.appbrand.jsapi.emoji.m.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return com.tencent.mm.plugin.appbrand.jsapi.emoji.m.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/sendpayaward";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i(com.tencent.mm.wallet_core.tenpay.model.o.TAG, "onGYNetEnd, errCode: %s, errMsg: %s, json: %s", java.lang.Integer.valueOf(i17), str, jSONObject);
        if (jSONObject == null || i17 != 0) {
            return;
        }
        this.f412135e = jSONObject.optString("result_code");
        this.f412136f = jSONObject.optString("result_msg");
        this.f412137g = jSONObject.optString("alert_wording");
    }
}
