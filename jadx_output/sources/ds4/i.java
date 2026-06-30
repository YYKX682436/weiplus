package ds4;

/* loaded from: classes9.dex */
public class i extends ds4.b {
    @Override // ds4.b, ds4.g
    public void J(java.util.Map map) {
        map.put("busi_scene", this.f242927y.f14026e);
    }

    @Override // ds4.b, com.tencent.mm.wallet_core.tenpay.model.o, com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(663L, 26L, 1L, false);
        return super.doScene(sVar, u0Var);
    }

    @Override // ds4.b, ds4.g, com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1281;
    }

    @Override // ds4.b, ds4.g, com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/snslqtpaybindverify";
    }

    @Override // ds4.b, ds4.g, com.tencent.mm.wallet_core.tenpay.model.p, com.tencent.mm.wallet_core.tenpay.model.r, com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        super.onGYNetEnd(i17, str, jSONObject);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(663L, 27L, 1L, false);
    }
}
