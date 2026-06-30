package gs4;

/* loaded from: classes9.dex */
public class q extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public org.json.JSONObject f275134d;

    public q(boolean z17, boolean z18, java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("is_root", z17 ? "1" : "0");
        hashMap.put("is_device_open_touch", z18 ? "1" : "0");
        hashMap.put("cpu_id", str);
        hashMap.put("app_uid", str2);
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o, com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.callback = u0Var;
        return super.doScene(sVar, u0Var);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1669;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 0;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/paysecurity";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayQueryBasicSecurityInfo", "errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), str);
        if (i17 != 0 || jSONObject == null) {
            return;
        }
        jSONObject.toString();
        this.f275134d = jSONObject;
        com.tencent.mm.wallet_core.model.p1.c().d(this.f275134d);
    }
}
