package oz2;

/* loaded from: classes9.dex */
public class f extends com.tencent.mm.wallet_core.tenpay.model.o {
    public f(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("encrypted_open_info", java.net.URLEncoder.encode(str));
        hashMap.put("encrypted_rsa_sign", java.net.URLEncoder.encode(str2));
        hashMap.put("passwd", str3);
        setRequestData(hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("device_type", wo.w0.m());
        hashMap2.put("open_scene", "" + i17);
        setWXRequestData(hashMap2);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1599;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 119;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/androidopentouch";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
    }

    @Override // com.tencent.mm.wallet_core.model.d1, com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        super.onGYNetEnd(i17, i18, i19, str, v0Var, bArr);
        if (i18 == 0 && i19 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayOpenTouch", "open fingerprintpay success");
            mz2.m0.b(true);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneTenpayOpenTouch", "open fingerprintpay failed");
        }
    }
}
