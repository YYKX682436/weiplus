package oz2;

/* loaded from: classes9.dex */
public class d extends com.tencent.mm.wallet_core.tenpay.model.o {
    public d(int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        re4.v a17 = re4.u.a();
        hashMap.put("cpu_id", a17.f394553a);
        hashMap.put("uid", a17.f394554b);
        if (i17 == 0) {
            mz2.a aVar = (mz2.a) ((pz2.a) gm0.j1.s(pz2.a.class));
            i17 = aVar.b() ? 2 : aVar.a() ? 1 : -1;
        }
        hashMap.put("soter_type", "" + i17);
        setRequestData(hashMap);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayCloseTouchPay", "soter_type: %s", java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1597;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 116;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/closetouchpay";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 == 0) {
            ((nz2.o) gm0.j1.s(nz2.o.class)).D1(java.lang.Integer.valueOf(jSONObject != null ? jSONObject.optInt("clear_rsa_key_level", 0) : 0));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneTenpayCloseTouchPay", "do close fingerprint cgi failed!");
        }
    }

    @Override // com.tencent.mm.wallet_core.model.d1, com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        super.onGYNetEnd(i17, i18, i19, str, v0Var, bArr);
        mz2.a aVar = (mz2.a) ((pz2.a) gm0.j1.s(pz2.a.class));
        if (aVar.a()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13686, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        } else if (aVar.b()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16994, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        }
        if (i18 == 0 && i19 == 0) {
            aVar.e(false);
            aVar.d(false);
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneTenpayCloseTouchPay", "hy: do close fingerprint cgi success!");
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneTenpayCloseTouchPay", "hy: do close fingerprint cgi failed!");
    }
}
