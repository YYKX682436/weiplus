package ss4;

/* loaded from: classes9.dex */
public class g0 extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f412059d;

    /* renamed from: e, reason: collision with root package name */
    public org.json.JSONObject f412060e;

    public g0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, long j17) {
        this.f412059d = "";
        this.f412059d = str;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.mm.opensdk.constants.ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, str);
        hashMap.put("award_id", str2);
        hashMap.put("send_record_id", str3);
        hashMap.put("user_record_id", str4);
        hashMap.put("req_key", str5);
        hashMap.put(ya.b.TRANSACTION_ID, str6);
        hashMap.put("activity_mch_id", j17 + "");
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1979;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 1979;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/querypayaward";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public boolean isBlock() {
        return false;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayQueryPayaward", "errcode %s errmsg %s json %s", java.lang.Integer.valueOf(i17), str, jSONObject);
        this.f412060e = jSONObject;
    }
}
