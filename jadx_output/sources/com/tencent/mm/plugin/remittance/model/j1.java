package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes9.dex */
public class j1 extends lp5.a {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f156866f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f156867g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f156868h;

    /* renamed from: i, reason: collision with root package name */
    public int f156869i;

    public j1(double d17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayh5Pay", "NetSceneTenpayh5Pay create");
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            hashMap.put("transfer_amount", java.lang.Math.round(d17 * 100.0d) + "");
            hashMap.put("pay_nickname", java.net.URLEncoder.encode(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding) + "");
            hashMap.put("rcvd_username", str2 + "");
            hashMap.put("rcvd_nickname", java.net.URLEncoder.encode(str3, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding) + "");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(java.net.URLEncoder.encode(str4 == null ? "" : str4, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
            sb6.append("");
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, sb6.toString());
            hashMap.put(ya.b.CURRENCY, i17 + "");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneTenpayh5Pay", "error " + e17.getMessage());
        }
        setRequestData(hashMap);
    }

    @Override // lp5.a
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/h5requesttransfer";
    }

    @Override // lp5.a
    public int I() {
        return 1;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1622;
    }

    @Override // lp5.a
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayh5Pay", "errCode " + i17 + " errMsg: " + str);
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayh5Pay", "NetSceneTenpayh5Pay request error");
            return;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        this.f156866f = jSONObject.optString("payurl");
        this.f156867g = jSONObject.optString("tradeurl");
        this.f156868h = jSONObject.optInt("transfering_num");
        this.f156869i = jSONObject.optInt("transfering_type");
        stringBuffer.append("payurl:" + this.f156866f);
        stringBuffer.append(" tradeurl:" + this.f156867g);
        stringBuffer.append(" transfering_num:" + this.f156868h);
        stringBuffer.append(" transfering_type:" + this.f156869i);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayh5Pay", "resp " + stringBuffer.toString());
    }
}
