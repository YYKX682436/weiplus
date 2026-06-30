package ss4;

/* loaded from: classes9.dex */
public class y extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f412143d;

    /* renamed from: e, reason: collision with root package name */
    public int f412144e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f412145f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f412146g;

    public y(java.lang.String str, int i17, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("token", str);
        hashMap.put("use_touch", "" + i17);
        setRequestData(hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("soter_req", str2);
        setWXRequestData(hashMap2);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        boolean h17 = ih.a.h("clicfg_user_token_open", false);
        com.tencent.mars.xlog.Log.i("Micromsg.NetSceneTenpayCheckPwdByToken", "[getFuncId] enableSwitch：%s", java.lang.Boolean.valueOf(h17));
        return h17 ? 1550 : 1515;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 100;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/getusertoken";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("Micromsg.NetSceneTenpayCheckPwdByToken", "[onGYNetEnd] errCode " + i17 + " errMsg: " + str);
        this.f412143d = jSONObject.optString("usertoken");
        this.f412144e = jSONObject.optInt("is_free_sms");
        this.f412145f = jSONObject.optString("mobile_no");
        this.f412146g = jSONObject.optString("relation_key");
    }

    public y(java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("passwd", str);
        hashMap.put("token", str2);
        setRequestData(hashMap);
        setWXRequestData(new java.util.HashMap<>());
    }

    public y(java.lang.String str, java.lang.String str2, boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("passwd", str);
        hashMap.put("token", str2);
        hashMap.put("resend", z17 ? "1" : "0");
        setRequestData(hashMap);
        setWXRequestData(new java.util.HashMap<>());
    }
}
