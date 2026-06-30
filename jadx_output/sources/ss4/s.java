package ss4;

/* loaded from: classes9.dex */
public class s extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f412130d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f412131e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f412132f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.wallet_core.model.BindCardOrder f412133g;

    public s(com.tencent.mm.plugin.wallet_core.model.BindCardOrder bindCardOrder, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, long j18, java.lang.String str5, java.lang.String str6, int i17, int i18) {
        this.f412133g = bindCardOrder;
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
        return 1786;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 1786;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/sendbindcardaward";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (jSONObject == null || i17 != 0) {
            return;
        }
        this.f412130d = jSONObject.optString("result_code");
        this.f412131e = jSONObject.optString("result_msg");
        this.f412132f = jSONObject.optString("alert_wording");
    }
}
