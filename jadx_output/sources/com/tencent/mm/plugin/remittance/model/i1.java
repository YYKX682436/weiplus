package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes9.dex */
public class i1 extends lp5.a {

    /* renamed from: f, reason: collision with root package name */
    public int f156856f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f156857g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f156858h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f156859i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f156860m;

    public i1(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayh5Index", "NetSceneTenpayh5Index create");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("wallet_type", i17 + "");
        setRequestData(hashMap);
    }

    @Override // lp5.a
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/h5transferoperate";
    }

    @Override // lp5.a
    public int I() {
        return 0;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1574;
    }

    @Override // lp5.a
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayh5Index", "errCode " + i17 + " errMsg: " + str);
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayh5Index", "NetSceneTransferChargeQuery request error");
            return;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        this.f156856f = jSONObject.optInt(ya.b.CURRENCY);
        this.f156857g = jSONObject.optString("currencyUint");
        this.f156858h = jSONObject.optString("currencyWording");
        this.f156859i = jSONObject.optString("notice");
        this.f156860m = jSONObject.optString("notice_url");
        stringBuffer.append("currency:" + this.f156856f);
        stringBuffer.append(" currencyuint:" + this.f156857g);
        stringBuffer.append(" currencywording:" + this.f156858h);
        stringBuffer.append(" notice:" + this.f156859i);
        stringBuffer.append(" notice_url:" + this.f156860m);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayh5Index", "resp " + stringBuffer.toString());
    }
}
