package ss4;

/* loaded from: classes9.dex */
public class x extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public int f412140d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f412141e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f412142f;

    public x(java.lang.String str, int i17, java.lang.String str2) {
        H(str, i17, str2, "");
    }

    public final void H(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("passwd", str);
        hashMap.put("req_key", str2);
        if (i17 == 6) {
            hashMap.put("time_stamp", "" + java.lang.System.currentTimeMillis());
        }
        setRequestData(hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("check_pwd_scene", i17 + "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            hashMap2.put("bus_info", str3);
        }
        if (com.tencent.mm.wallet_core.model.i1.f213914a) {
            hashMap2.put("uuid_for_bindcard", com.tencent.mm.wallet_core.model.i1.f213916c);
            hashMap2.put("bindcard_scene", "" + com.tencent.mm.wallet_core.model.i1.f213915b);
        }
        setWXRequestData(hashMap2);
        this.f412140d = i17;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return com.tencent.mm.plugin.appbrand.jsapi.advertise.r.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 18;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/checkpwd";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        int i18 = this.f412140d;
        if (i18 == 6 || i18 == 8 || i18 == 18 || i18 == 1 || i18 == 10) {
            this.f412141e = jSONObject.optString("usertoken");
            this.f412142f = jSONObject.optString("token_type");
        }
    }

    public x(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        H(str, i17, str2, str3);
    }
}
