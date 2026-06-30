package gs4;

/* loaded from: classes8.dex */
public class e extends com.tencent.mm.wallet_core.tenpay.model.o {
    public e(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("passwd", str);
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return zd1.s.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 0;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/closewalletlock";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCloseWalletLock", "close wallet lock errCode: %d, errMsg: %s, json: %s", java.lang.Integer.valueOf(i17), str, jSONObject);
    }
}
