package ds4;

/* loaded from: classes9.dex */
public class g extends com.tencent.mm.wallet_core.tenpay.model.p {

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Orders f242926x;

    /* renamed from: y, reason: collision with root package name */
    public final at4.z0 f242927y;

    /* renamed from: z, reason: collision with root package name */
    public final int f242928z;

    public g(at4.z0 z0Var, com.tencent.mm.plugin.wallet_core.model.Orders orders) {
        this.f242928z = -1;
        this.f242926x = orders;
        this.f242927y = z0Var;
        java.util.ArrayList arrayList = (java.util.ArrayList) orders.M;
        java.lang.String str = arrayList.size() > 0 ? ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) arrayList.get(0)).f179714r : null;
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = z0Var.f14035n;
        if (payInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneTenpayPayVertify", "empty payInfo");
            return;
        }
        int i17 = payInfo.f192109e;
        this.f242928z = i17;
        I(orders.f179675e, str, i17, payInfo.f192111g, z0Var.f14026e, z0Var.f14027f);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap.put("flag", z0Var.f14022a);
        hashMap.put("passwd", z0Var.f14023b);
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(z0Var.f14023b);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayPayVertify", "hy: has pwd: %b", java.lang.Boolean.valueOf(z17));
        setPayInfo(z0Var.f14035n, hashMap, hashMap2, z17);
        hashMap.put("verify_type", "" + z0Var.f14032k);
        if (z0Var.f14032k == 0) {
            hashMap.put("verify_code", z0Var.f14024c);
        } else {
            hashMap.put("cre_tail", z0Var.f14033l);
            hashMap.put("cre_type", z0Var.f14034m);
        }
        hashMap.put("token", z0Var.f14025d);
        hashMap.put("bank_type", z0Var.f14026e);
        hashMap.put("bind_serial", z0Var.f14027f);
        hashMap.put("arrive_type", z0Var.f14029h);
        hashMap.put("default_favorcomposedid", z0Var.f14030i);
        hashMap.put("favorcomposedid", z0Var.f14031j);
        J(hashMap);
        if (com.tencent.mm.wallet_core.model.i1.f213914a) {
            hashMap2.put("uuid_for_bindcard", com.tencent.mm.wallet_core.model.i1.f213916c);
            hashMap2.put("bindcard_scene", "" + com.tencent.mm.wallet_core.model.i1.f213915b);
        }
        setRequestData(hashMap);
        setWXRequestData(hashMap2);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.p
    public boolean H() {
        int i17 = this.f242928z;
        return i17 == 11 || i17 == 21;
    }

    public void J(java.util.Map map) {
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        int i17 = this.f242928z;
        if (i17 == 11) {
            return 1607;
        }
        return i17 == 21 ? 1606 : 462;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 1;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        int i17 = this.f242928z;
        return i17 == 11 ? "/cgi-bin/mmpay-bin/tenpay/saveverify" : i17 == 21 ? "/cgi-bin/mmpay-bin/tenpay/fetchverify" : "/cgi-bin/mmpay-bin/tenpay/verify";
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
            com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f242926x;
            com.tencent.mm.plugin.wallet_core.model.Orders.g(jSONObject, orders);
            this.f242926x = orders;
        } else {
            setPaySuccess(false);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mPayScene:");
        int i18 = this.f242928z;
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayPayVertify", sb6.toString());
        if (i18 == 39) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayPayVertify", "it's the sns scene, parse the sns pay data");
            com.tencent.mm.plugin.wallet_core.utils.a1.a(jSONObject);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayPayVertify", "it's not the sns scene");
        }
        java.util.Iterator it = ((java.util.ArrayList) com.tencent.mm.wallet_core.a.f("PayProcess")).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.wallet_core.h) it.next()).f213801c.putInt("key_is_clear_failure", this.f214065w);
        }
    }
}
