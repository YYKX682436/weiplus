package com.tencent.mm.wallet_core.tenpay.model;

/* loaded from: classes9.dex */
public class i extends com.tencent.mm.wallet_core.tenpay.model.r {

    /* renamed from: d, reason: collision with root package name */
    public org.json.JSONObject f214047d;

    /* renamed from: e, reason: collision with root package name */
    public int f214048e = 0;

    public i(java.util.Map map) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDelayQueryOrder", "NetSceneDelayQueryOrder call");
        setRequestData(map);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return com.tencent.mm.minigame.download.mmdownloader.k.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return com.tencent.mm.minigame.download.mmdownloader.k.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/payorderquery";
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.r, com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        super.onGYNetEnd(i17, str, jSONObject);
        if (x51.o1.S) {
            try {
                jSONObject = new org.json.JSONObject("{\"retcode\":268447844,\"retmsg\":\"系统麻烦请稍后再试\",\"can_pay_retry\":1,\"show_retmsg_type\":1}");
            } catch (java.lang.Exception unused) {
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDelayQueryOrder", "errCode = " + i17 + "errMsg=" + str);
        this.f214047d = jSONObject;
        if (jSONObject != null) {
            jSONObject.toString();
            jSONObject.optInt("can_pay_retry");
            this.f214048e = jSONObject.optInt("show_retmsg_type");
        }
    }
}
