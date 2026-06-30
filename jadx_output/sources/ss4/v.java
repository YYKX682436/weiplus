package ss4;

/* loaded from: classes8.dex */
public class v extends com.tencent.mm.wallet_core.tenpay.model.o {
    public v(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("wallet_tpa_country", str);
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return ss4.p0.f412124a.a(ss4.n0.f412106e, 1663);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 1663;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o, com.tencent.mm.modelbase.m1
    public int getType() {
        return super.getType();
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return ss4.p0.f412124a.b(ss4.n0.f412106e, "/cgi-bin/mmpay-bin/tenpay/setuserwallet");
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
    }
}
