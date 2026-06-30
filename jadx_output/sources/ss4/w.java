package ss4;

/* loaded from: classes9.dex */
public class w extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.BindCardOrder f412138d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f412139e;

    public w(at4.z0 z0Var) {
        this(z0Var, -1, "");
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return com.tencent.mm.plugin.appbrand.jsapi.sensor.u.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 13;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/bindverify";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.wallet_core.model.BindCardOrder bindCardOrder = new com.tencent.mm.plugin.wallet_core.model.BindCardOrder();
        this.f412138d = bindCardOrder;
        bindCardOrder.a(jSONObject);
        this.f412139e = jSONObject.optString("action");
    }

    public w(at4.z0 z0Var, int i17, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        setPayInfo(z0Var.f14035n, hashMap, hashMap2);
        hashMap.put("flag", z0Var.f14022a);
        if ("2".equals(z0Var.f14022a)) {
            hashMap.put("passwd", z0Var.f14023b);
        }
        hashMap.put("verify_code", z0Var.f14024c);
        hashMap.put("token", z0Var.f14025d);
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = z0Var.f14035n;
        if (payInfo != null && !com.tencent.mm.sdk.platformtools.t8.K0(payInfo.f192114m)) {
            hashMap.put("req_key", z0Var.f14035n.f192114m);
        }
        if (i17 >= 0) {
            hashMap.put("realname_scene", i17 + "");
            com.tencent.mars.xlog.Log.i(com.tencent.mm.wallet_core.tenpay.model.o.TAG, "realname_scene=%d", java.lang.Integer.valueOf(i17));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(z0Var.f14026e)) {
            hashMap.put("bank_type", z0Var.f14026e + "");
        }
        if (z0Var.f14022a == "2" && z0Var.f14036o == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(z0Var.f14037p)) {
            hashMap.put("verify_user_token", "1");
            hashMap.put("usertoken", z0Var.f14037p);
        }
        hashMap.put("session_id", str);
        if (com.tencent.mm.wallet_core.model.i1.f213914a) {
            hashMap2.put("uuid_for_bindcard", com.tencent.mm.wallet_core.model.i1.f213916c);
            hashMap2.put("bindcard_scene", "" + com.tencent.mm.wallet_core.model.i1.f213915b);
        }
        setRequestData(hashMap);
        setWXRequestData(hashMap2);
    }
}
