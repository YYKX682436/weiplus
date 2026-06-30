package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes9.dex */
public class z extends lp5.a implements com.tencent.mm.wallet_core.model.t {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f157068f;

    public z(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, int i18) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("amount", java.lang.String.valueOf(j17));
        hashMap.put("recv_username", str);
        hashMap.put("recv_nickname", str2);
        hashMap.put("qrcodeid", str5);
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                try {
                    hashMap.put("desc", java.net.URLEncoder.encode(str3, com.tencent.mapsdk.internal.rv.f51270c));
                } catch (java.io.UnsupportedEncodingException e17) {
                    e = e17;
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneH5F2fTransferPay", e, "", new java.lang.Object[0]);
                    hashMap.put(ya.b.CURRENCY, java.lang.String.valueOf(i17));
                    hashMap.put("set_amount", java.lang.String.valueOf(i18));
                    setRequestData(hashMap);
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneH5F2fTransferPay", "username: %s, nickname: %s, amount: %s, desc: %s, msg: %s, currency: %s", str, str2, java.lang.Long.valueOf(j17), str3, str4, java.lang.Integer.valueOf(i17));
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                try {
                    hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, java.net.URLEncoder.encode(str4, com.tencent.mapsdk.internal.rv.f51270c));
                } catch (java.io.UnsupportedEncodingException e18) {
                    e = e18;
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneH5F2fTransferPay", e, "", new java.lang.Object[0]);
                    hashMap.put(ya.b.CURRENCY, java.lang.String.valueOf(i17));
                    hashMap.put("set_amount", java.lang.String.valueOf(i18));
                    setRequestData(hashMap);
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneH5F2fTransferPay", "username: %s, nickname: %s, amount: %s, desc: %s, msg: %s, currency: %s", str, str2, java.lang.Long.valueOf(j17), str3, str4, java.lang.Integer.valueOf(i17));
                }
            }
        } catch (java.io.UnsupportedEncodingException e19) {
            e = e19;
        }
        hashMap.put(ya.b.CURRENCY, java.lang.String.valueOf(i17));
        hashMap.put("set_amount", java.lang.String.valueOf(i18));
        setRequestData(hashMap);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneH5F2fTransferPay", "username: %s, nickname: %s, amount: %s, desc: %s, msg: %s, currency: %s", str, str2, java.lang.Long.valueOf(j17), str3, str4, java.lang.Integer.valueOf(i17));
    }

    @Override // lp5.a
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/h5f2ftransferpay";
    }

    @Override // lp5.a
    public int I() {
        return 1529;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1529;
    }

    @Override // lp5.a
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject.optString("payurl", "");
        this.f157068f = optString;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneH5F2fTransferPay", "payurl: %s", optString);
    }
}
