package rs4;

/* loaded from: classes9.dex */
public class a extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f399343d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f399344e = null;

    /* renamed from: f, reason: collision with root package name */
    public at4.y0 f399345f;

    public a(com.tencent.mm.plugin.wallet_core.model.Authen authen, java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f399343d = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        setPayInfo(authen.f179557v, hashMap, hashMap2);
        hashMap.put("flag", "" + authen.f179542d);
        hashMap.put("bank_type", authen.f179545g);
        hashMap.put("mobile_area", authen.M);
        hashMap.put("session_id", str2);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.f179544f)) {
            hashMap.put("passwd", authen.f179544f);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.f179554s)) {
            hashMap.put("token", authen.f179554s);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.F)) {
            gm0.j1.i();
            kk.v vVar = new kk.v(com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) gm0.j1.u().c().l(9, null), 0));
            hashMap.put("import_code", authen.F);
            hashMap.put("qqid", vVar.toString());
            if (authen.f179549n > 0) {
                hashMap.put("cre_type", authen.f179549n + "");
            }
            hashMap.put("bind_serailno", authen.f179546h);
        }
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
            hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, com.tencent.mm.sdk.platformtools.m2.d());
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.f179547i)) {
            hashMap.put("true_name", authen.f179547i);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.f179548m)) {
            hashMap.put("identify_card", authen.f179548m);
        }
        if (authen.f179549n > 0) {
            hashMap.put("cre_type", authen.f179549n + "");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.f179550o)) {
            hashMap.put("mobile_no", authen.f179550o);
        }
        hashMap.put("bank_card_id", authen.f179551p);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.f179552q)) {
            hashMap.put("cvv2", authen.f179552q);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.f179553r)) {
            hashMap.put("valid_thru", authen.f179553r);
        }
        int i17 = authen.f179542d;
        if (i17 == 1 || i17 == 2) {
            hashMap.put("creid_renewal", java.lang.String.valueOf(authen.N));
            hashMap.put("birth_date", authen.P);
            hashMap.put("cre_expire_date", authen.Q);
        }
        int i18 = authen.f179542d;
        if ((i18 == 2 || i18 == 5) && authen.R == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(authen.S)) {
            hashMap.put("verify_user_token", "1");
            hashMap.put("usertoken", authen.S);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(authen.T) && authen.T.isEmpty()) {
            hashMap.put("checkpayjsapi_token", authen.T);
        }
        if (com.tencent.mm.wallet_core.model.i1.f213914a) {
            hashMap2.put("uuid_for_bindcard", com.tencent.mm.wallet_core.model.i1.f213916c);
            hashMap2.put("bindcard_scene", "" + com.tencent.mm.wallet_core.model.i1.f213915b);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            hashMap.put("has_underage_alert", str);
        }
        setRequestData(hashMap);
        setWXRequestData(hashMap2);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 471;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 12;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public java.lang.String getToken() {
        return this.f399344e;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/bindauthen";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            jSONObject.optString("req_key");
            this.f399344e = jSONObject.optString("token");
            this.f399345f = at4.y0.b(jSONObject);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public boolean resend() {
        super.resend();
        java.util.Map<java.lang.String, java.lang.String> map = this.f399343d;
        ((java.util.HashMap) map).put("is_repeat_send", "1");
        setRequestData(map);
        return true;
    }
}
