package wo3;

/* loaded from: classes9.dex */
public class j extends com.tencent.mm.wallet_core.tenpay.model.o {
    public j(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("passwd", str);
        hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, wo.w0.k());
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 566;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 47;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/offlineclose";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
    }

    @Override // com.tencent.mm.wallet_core.model.d1, com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        super.onGYNetEnd(i17, i18, i19, str, v0Var, bArr);
    }
}
