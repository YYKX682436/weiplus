package ss4;

/* loaded from: classes9.dex */
public class d0 extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f412031d;

    /* renamed from: e, reason: collision with root package name */
    public org.json.JSONObject f412032e;

    public d0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, long j18, java.lang.String str5, java.lang.String str6, int i17, int i18) {
        this.f412031d = "";
        this.f412031d = str;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.mm.opensdk.constants.ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, str);
        hashMap.put("award_id", str2);
        hashMap.put("send_record_id", str3);
        hashMap.put("user_record_id", str4);
        hashMap.put("activity_mch_id", j17 + "");
        hashMap.put("activity_type", j18 + "");
        hashMap.put("bank_type", str5 + "");
        hashMap.put("bank_serial", str6 + "");
        hashMap.put("bindbankscene", i17 + "");
        hashMap.put("realname_scene", i18 + "");
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1773;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 1773;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/querybindcardaward";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public boolean isBlock() {
        return false;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayQueryBindPayaward", "errcode %s errmsg %s json %s", java.lang.Integer.valueOf(i17), str, jSONObject);
        this.f412032e = jSONObject;
    }
}
