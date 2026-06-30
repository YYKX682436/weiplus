package tr4;

/* loaded from: classes9.dex */
public class d extends com.tencent.mm.wallet_core.tenpay.model.o {
    public d(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, java.lang.String str4) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("bank_type", str);
        hashMap.put("bind_serial", str2);
        hashMap.put("passwd", str3);
        if (z17) {
            hashMap.put("unbind_scene", "1");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            hashMap.put("support_quick_bind", str4);
        }
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 473;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 14;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/unbind";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
    }

    public d(java.lang.String str, java.lang.String str2, boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("bank_type", str);
        hashMap.put("bind_serial", str2);
        hashMap.put("expired_flag", "1");
        if (z17) {
            hashMap.put("unbind_scene", "1");
        }
        setRequestData(hashMap);
    }
}
