package gs4;

/* loaded from: classes8.dex */
public class m extends com.tencent.mm.wallet_core.tenpay.model.o {
    public m(java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("auth_token", str);
        hashMap.put("passwd", str2 + "");
        hashMap.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.System.currentTimeMillis() + "");
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 2514;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 2514;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/resetpaypwdbyface";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneResetPayPwdByFace", "onGYNetEnd, errCode: %s, errMsg: %s, json: %s", java.lang.Integer.valueOf(i17), str, jSONObject);
        if (i17 == 0) {
            jSONObject.optString("retcode");
            jSONObject.optString("retmsg");
        }
    }
}
