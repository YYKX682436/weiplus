package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes9.dex */
public class a0 extends lp5.a {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f156774f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f156775g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f156776h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f156777i;

    /* renamed from: m, reason: collision with root package name */
    public long f156778m;

    /* renamed from: n, reason: collision with root package name */
    public int f156779n;

    /* renamed from: o, reason: collision with root package name */
    public int f156780o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f156781p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f156782q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f156783r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f156784s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f156785t;

    public a0(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                hashMap.put("qrcode_url", java.net.URLEncoder.encode(str, com.tencent.mapsdk.internal.rv.f51270c));
            }
        } catch (java.io.UnsupportedEncodingException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneH5F2fTransferScanQrCode", e17, "", new java.lang.Object[0]);
        }
        setRequestData(hashMap);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneH5F2fTransferScanQrCode", "qrcode_url: %s", str);
    }

    @Override // lp5.a
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/h5f2ftransferscanqrcode";
    }

    @Override // lp5.a
    public int I() {
        return com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX;
    }

    @Override // lp5.a
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f156774f = jSONObject.optString("recv_username", "");
        this.f156775g = jSONObject.optString("recv_realname", "");
        this.f156776h = jSONObject.optString("recv_nickname", "");
        this.f156777i = jSONObject.optString("desc", "");
        this.f156778m = jSONObject.optLong("amount", 0L);
        this.f156779n = jSONObject.optInt("set_amount", 0);
        this.f156780o = jSONObject.optInt(ya.b.CURRENCY, 0);
        this.f156781p = jSONObject.optString("currencyunit", "");
        this.f156782q = jSONObject.optString("qrcodeid", "");
        this.f156783r = jSONObject.optString("notice", "");
        this.f156784s = jSONObject.optString("notice_url", "");
        this.f156785t = jSONObject.optString("recv_headimgurl", "");
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneH5F2fTransferScanQrCode", "recv_username: %s, recv_nickname: %s, desc: %s, amount: %s, setAmount: %s, currencyunit: %s recv_headimgurl: %s", this.f156774f, this.f156776h, this.f156777i, java.lang.Long.valueOf(this.f156778m), java.lang.Integer.valueOf(this.f156779n), this.f156781p, this.f156785t);
    }
}
