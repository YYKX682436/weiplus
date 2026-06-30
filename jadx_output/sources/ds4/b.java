package ds4;

/* loaded from: classes9.dex */
public class b extends ds4.g {
    public boolean A;
    public boolean B;

    public b(at4.z0 z0Var, com.tencent.mm.plugin.wallet_core.model.Orders orders) {
        super(z0Var, orders);
        this.A = false;
        K();
    }

    @Override // ds4.g
    public void J(java.util.Map map) {
        K();
        if (this.A || this.B) {
            map.put("busi_scene", this.f242927y.f14026e);
        }
    }

    public final void K() {
        this.A = false;
        if (vr4.f1.wi().Ai().f14004m != null) {
            at4.z0 z0Var = this.f242927y;
            if (z0Var.f14035n != null && z0Var.f14026e.equals(vr4.f1.wi().Ai().f14004m.field_bankcardType)) {
                int i17 = z0Var.f14035n.f192109e;
                if (i17 == 31 || i17 == 32 || i17 == 33 || i17 == 42 || i17 == 37 || i17 == 56) {
                    this.A = true;
                } else {
                    this.B = true;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayPayVertify", "isLqtSns: %s, isLqtTs: %s", java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(this.B));
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o, com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        if (this.A) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(663L, 26L, 1L, false);
        } else if (this.B) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(663L, 22L, 1L, false);
        }
        return super.doScene(sVar, u0Var);
    }

    @Override // ds4.g, com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        K();
        if (this.A) {
            return 1281;
        }
        return this.B ? 1305 : 1601;
    }

    @Override // ds4.g, com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 121;
    }

    @Override // ds4.g, com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        K();
        return this.A ? "/cgi-bin/mmpay-bin/tenpay/snslqtpaybindverify" : this.B ? "/cgi-bin/mmpay-bin/tenpay/lqtpaybindverify" : "/cgi-bin/mmpay-bin/tenpay/banpaybindverify";
    }

    @Override // ds4.g, com.tencent.mm.wallet_core.tenpay.model.p, com.tencent.mm.wallet_core.tenpay.model.r, com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        super.onGYNetEnd(i17, str, jSONObject);
        if (i17 != 0) {
            if (this.A) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(663L, 27L, 1L, false);
            } else if (this.B) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(663L, 23L, 1L, false);
            }
        }
    }
}
