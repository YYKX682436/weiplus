package tr4;

/* loaded from: classes9.dex */
public class a extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public int f421433d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f421434e;

    public a(java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("bankcard_type", str);
        hashMap.put("bind_serial", str2);
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1540;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 1540;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/unbindbanner";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 == 0) {
            if (jSONObject == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetUnbindInfo", "json is null");
            } else {
                this.f421433d = jSONObject.optInt("unbindbannerlevel", 0);
                this.f421434e = jSONObject.optString("unbindbannerwording");
            }
        }
    }
}
