package oz2;

/* loaded from: classes9.dex */
public class e extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f350250d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f350251e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f350252f = "";

    public e(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_cert_info is empty");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_cert_info is not empty");
        }
        hashMap.put("encrypted_cert_info", java.net.URLEncoder.encode(str));
        hashMap.put("ver", "0x1.0");
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1598;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 118;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/getopentouchcert";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f350250d = jSONObject.optString("encrypted_device_info");
            this.f350251e = jSONObject.optString("encrypted_rsa_sign");
            this.f350252f = jSONObject.optString("cert");
            if (android.text.TextUtils.isEmpty(this.f350250d)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_device_info is empty");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_device_info is not empty");
            }
            if (android.text.TextUtils.isEmpty(this.f350251e)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_rsa_sign is empty");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayGetOpenTouchCert", "encrypted_rsa_sign is not empty");
            }
            if (android.text.TextUtils.isEmpty(this.f350252f)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneTenpayGetOpenTouchCert", "cert is empty");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayGetOpenTouchCert", "cert is not empty");
            }
        }
    }
}
