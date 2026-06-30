package gs4;

/* loaded from: classes9.dex */
public class r extends com.tencent.mm.wallet_core.tenpay.model.o implements com.tencent.mm.wallet_core.model.t {
    public r(at4.z0 z0Var) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Map<java.lang.String, java.lang.String> hashMap2 = new java.util.HashMap<>();
        hashMap.put("flag", z0Var.f14022a);
        hashMap.put("passwd", z0Var.f14023b);
        hashMap.put("rpasswd", z0Var.f14023b);
        hashMap.put("verify_code", z0Var.f14024c);
        hashMap.put("token", z0Var.f14025d);
        setPayInfo(z0Var.f14035n, hashMap, hashMap2);
        setRequestData(hashMap);
        setWXRequestData(hashMap2);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 478;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 20;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/resetpwd";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
    }
}
