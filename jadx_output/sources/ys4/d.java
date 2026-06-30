package ys4;

/* loaded from: classes8.dex */
public class d extends com.tencent.mm.wallet_core.tenpay.model.o {
    public d(int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i17 + "");
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return com.tencent.mm.plugin.appbrand.jsapi.liteapp.d.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return com.tencent.mm.plugin.appbrand.jsapi.liteapp.d.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/realnamesetduty";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAgreeDisclaimer", "errCode = " + i17 + ";errMsg = " + str);
    }
}
