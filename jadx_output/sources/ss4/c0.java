package ss4;

/* loaded from: classes9.dex */
public class c0 extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f412027d;

    public c0(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("passwd", str);
        hashMap.put("check_pwd_scene", i17 + "");
        hashMap.put("package", java.net.URLEncoder.encode(str2));
        hashMap.put("sign", str3);
        hashMap.put("sign_type", str4);
        hashMap.put("busi_id", str5);
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public boolean callbackUIWhenWalletError() {
        return true;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 2704;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 2704;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/getpaypwdtoken";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f412027d = jSONObject.optString("usertoken", "");
    }

    public c0(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i18, java.lang.String str6, java.lang.String str7) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("passwd", str);
        hashMap.put("check_pwd_scene", i17 + "");
        hashMap.put("package", java.net.URLEncoder.encode(str2));
        hashMap.put("sign", str3);
        hashMap.put("sign_type", str4);
        hashMap.put("busi_id", str5);
        hashMap.put("use_touch", i18 + "");
        setRequestData(hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("soter_req", str6);
        hashMap2.put("fingerData", str7);
        setWXRequestData(hashMap2);
    }
}
