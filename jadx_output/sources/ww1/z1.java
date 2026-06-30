package ww1;

/* loaded from: classes9.dex */
public class z1 extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f450371d = null;

    /* renamed from: e, reason: collision with root package name */
    public final double f450372e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f450373f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f450374g;

    /* renamed from: h, reason: collision with root package name */
    public int f450375h;

    public z1(double d17, java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            hashMap.put("fee", java.lang.Math.round(100.0d * d17) + "");
            hashMap.put("fee_type", str);
            hashMap.put("desc", java.net.URLEncoder.encode(str2, com.tencent.mapsdk.internal.rv.f51270c));
        } catch (java.io.UnsupportedEncodingException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Micromsg.NetSceneTenpayRemittanceQuery", e17, "", new java.lang.Object[0]);
        }
        this.f450372e = d17;
        this.f450373f = str;
        this.f450374g = str2;
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1623;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 0;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/transfersetf2ffee";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        int i18;
        if (i17 != 0) {
            return;
        }
        this.f450371d = jSONObject.optString("pay_url");
        int optInt = jSONObject.optInt("qrcode_level");
        if (optInt != 0) {
            i18 = 1;
            if (optInt != 1) {
                i18 = 2;
                if (optInt != 2) {
                    i18 = 3;
                }
            }
        } else {
            i18 = 0;
        }
        this.f450375h = i18;
        this.f450374g = jSONObject.optString("desc");
        com.tencent.mars.xlog.Log.i("Micromsg.NetSceneTenpayRemittanceQuery", "qrcodeLevel:%s ", java.lang.Integer.valueOf(this.f450375h));
    }
}
