package d05;

/* loaded from: classes9.dex */
public class g extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f225591d = null;

    public g(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("verify_code", str);
        hashMap.put("session_key", str2);
        hashMap.put("passwd", str3);
        hashMap.put("bind_serialno", str4);
        hashMap.put("bank_type", str5);
        setRequestData(hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("banktype", str5);
        setWXRequestData(hashMap2);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 65;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 != 0) {
            return;
        }
        this.f225591d = jSONObject.optString("app_username");
    }
}
