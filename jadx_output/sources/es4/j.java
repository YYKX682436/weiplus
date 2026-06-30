package es4;

/* loaded from: classes9.dex */
public class j extends com.tencent.mm.wallet_core.tenpay.model.p {

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Orders f256425x;

    /* renamed from: y, reason: collision with root package name */
    public final int f256426y;

    public j(at4.z0 z0Var, com.tencent.mm.plugin.wallet_core.model.Orders orders) {
        int i17 = -1;
        this.f256426y = -1;
        this.f256425x = orders;
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = z0Var.f14035n;
        if (payInfo != null) {
            this.f256426y = payInfo.f192109e;
            i17 = payInfo.f192111g;
        }
        int i18 = i17;
        java.util.ArrayList arrayList = (java.util.ArrayList) orders.M;
        I(orders.f179675e, arrayList.size() > 0 ? ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) arrayList.get(0)).f179714r : null, this.f256426y, i18, z0Var.f14026e, z0Var.f14027f);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Map<java.lang.String, java.lang.String> hashMap2 = new java.util.HashMap<>();
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(z0Var.f14023b);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayVertifyReg", "hy: has pwd: %b", java.lang.Boolean.valueOf(z17));
        setPayInfo(z0Var.f14035n, hashMap, hashMap2, z17);
        hashMap.put("flag", z0Var.f14022a);
        hashMap.put("passwd", z0Var.f14023b);
        hashMap.put("verify_code", z0Var.f14024c);
        hashMap.put("token", z0Var.f14025d);
        hashMap.put("favorcomposedid", z0Var.f14031j);
        hashMap.put("default_favorcomposedid", z0Var.f14030i);
        setRequestData(hashMap);
        setWXRequestData(hashMap2);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.p
    public boolean H() {
        int i17 = this.f256426y;
        return i17 == 11 || i17 == 21;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        int i17 = this.f256426y;
        if (i17 == 11) {
            return 1684;
        }
        if (i17 == 21) {
            return 1608;
        }
        return com.tencent.mm.plugin.appbrand.jsapi.appdownload.q.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 16;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        int i17 = this.f256426y;
        return i17 == 11 ? "/cgi-bin/mmpay-bin/tenpay/saveverifyreg" : i17 == 21 ? "/cgi-bin/mmpay-bin/tenpay/fetchverifyreg" : "/cgi-bin/mmpay-bin/tenpay/verifyreg";
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.p, com.tencent.mm.wallet_core.tenpay.model.r, com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        super.onGYNetEnd(i17, str, jSONObject);
        if (i17 != 0) {
            return;
        }
        jSONObject.optString("bind_serial");
        if ("1".equals(jSONObject.optString("pay_flag"))) {
            setPaySuccess(true);
            com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f256425x;
            com.tencent.mm.plugin.wallet_core.model.Orders.g(jSONObject, orders);
            this.f256425x = orders;
        } else {
            setPaySuccess(false);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mPayScene:");
        int i18 = this.f256426y;
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayVertifyReg", sb6.toString());
        if (i18 == 39) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayVertifyReg", "it's the sns scene, parse the sns pay data");
            com.tencent.mm.plugin.wallet_core.utils.a1.a(jSONObject);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayVertifyReg", "it's not the sns scene");
        }
        java.util.Iterator it = ((java.util.ArrayList) com.tencent.mm.wallet_core.a.f("PayProcess")).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.wallet_core.h) it.next()).f213801c.putInt("key_is_clear_failure", this.f214065w);
        }
    }
}
