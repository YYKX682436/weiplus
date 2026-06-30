package wo3;

/* loaded from: classes8.dex */
public class d extends com.tencent.mm.wallet_core.tenpay.model.o {
    public d(java.lang.String str, int i17, int i18) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("req_key", str);
        hashMap.put("pay_scene", "" + i17);
        hashMap.put("pay_channel", "" + i18);
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 1385;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/offlinecancelpay";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("NetSceneOfflineCancelPay", "onGYNetEnd errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), str);
    }
}
