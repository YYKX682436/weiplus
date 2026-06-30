package gs4;

/* loaded from: classes9.dex */
public class s extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f275135d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f275136e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f275137f;

    public s(com.tencent.mm.plugin.wallet_core.model.Authen authen, boolean z17, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f275135d = hashMap;
        hashMap.put("flag", "" + authen.f179542d);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.f179558w)) {
            hashMap.put("first_name", authen.f179558w);
            hashMap.put("last_name", authen.f179559x);
            hashMap.put("country", authen.f179560y);
            hashMap.put("area", authen.f179561z);
            hashMap.put("city", authen.A);
            hashMap.put("address", authen.B);
            hashMap.put("phone_number", authen.C);
            hashMap.put("zip_code", authen.D);
            hashMap.put(com.google.android.gms.common.Scopes.EMAIL, authen.E);
        }
        hashMap.put("business_source", i17 + "");
        hashMap.put("bank_type", authen.f179545g);
        if (authen.f179549n > 0) {
            hashMap.put("cre_type", authen.f179549n + "");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.f179547i)) {
            hashMap.put("true_name", authen.f179547i);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.f179548m)) {
            hashMap.put("identify_card", authen.f179548m);
        }
        hashMap.put("mobile_no", authen.f179550o);
        hashMap.put("bank_card_id", authen.f179551p);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.f179552q)) {
            hashMap.put("cvv2", authen.f179552q);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.f179553r)) {
            hashMap.put("valid_thru", authen.f179553r);
        }
        hashMap.put("new_card_reset_pwd", z17 ? "1" : "0");
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return kf1.i.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 10;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public java.lang.String getToken() {
        return this.f275136e;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/resetpwdauthen";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f275136e = jSONObject.optString("token");
        }
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public boolean resend() {
        super.resend();
        java.util.Map<java.lang.String, java.lang.String> map = this.f275135d;
        ((java.util.HashMap) map).put("is_repeat_send", "1");
        setRequestData(map);
        this.f275137f = true;
        return true;
    }
}
