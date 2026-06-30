package wo3;

/* loaded from: classes9.dex */
public class i extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f448166d = "0";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f448167e;

    public i(com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        this.f448167e = "";
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("passwd", str);
        hashMap.put("oper", str2);
        if (str2.equals("changeto")) {
            if (android.text.TextUtils.isEmpty(str3)) {
                hashMap.put("verify_code", "");
            } else {
                hashMap.put("verify_code", str3);
            }
            hashMap.put("chg_fee", "" + i17);
            hashMap.put("bind_serialno", bankcard.field_bindSerial);
            hashMap.put("bank_type", bankcard.field_bankcardType);
            hashMap.put("card_tail", bankcard.field_bankcardTail);
        }
        this.f448167e = bankcard.field_mobile;
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 50;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f448166d = jSONObject.optString("verify_flag");
            jSONObject.optString("limit_fee");
        }
    }
}
