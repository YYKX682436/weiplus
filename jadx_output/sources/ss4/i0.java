package ss4;

/* loaded from: classes9.dex */
public class i0 extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f412067d;

    public i0(at4.z0 z0Var, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("verify_code", z0Var.f14024c);
        hashMap.put("token", z0Var.f14025d);
        hashMap.put("passwd", z0Var.f14023b);
        hashMap.put("relation_key", str);
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1604;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 124;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/webankverifysms";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (jSONObject == null || i17 != 0) {
            return;
        }
        jSONObject.optString("token_type");
        this.f412067d = jSONObject.optString("usertoken");
    }
}
