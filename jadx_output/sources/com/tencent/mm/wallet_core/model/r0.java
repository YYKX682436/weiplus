package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public class r0 extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f213986d;

    public r0(java.lang.String str) {
        this.f213986d = str;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Map<java.lang.String, java.lang.String> hashMap2 = new java.util.HashMap<>();
        hashMap.put("crt_no", fp.s0.a(str));
        hashMap.put("deviceid", wo.w0.g(false));
        setRequestData(hashMap);
        setWXRequestData(hashMap2);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1568;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 1568;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o, com.tencent.mm.modelbase.m1
    public int getType() {
        return 1568;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/deletedigitalcert";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDeletedigitalcert", "onGYNetEnd %d %s", java.lang.Integer.valueOf(i17), str);
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd2(com.tencent.mm.wallet_core.model.o oVar, org.json.JSONObject jSONObject) {
    }
}
