package d05;

/* loaded from: classes9.dex */
public class a extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f225577d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f225578e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f225579f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f225580g = false;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f225581h;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f225577d = hashMap;
        hashMap.put("session_key", str3);
        hashMap.put("bank_type", str4);
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str);
        hashMap.put("cre_id", str2);
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 64;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 != 0) {
            return;
        }
        try {
            this.f225578e = jSONObject.optString("session_key");
            this.f225579f = "1".equals(jSONObject.getString("need_bind"));
            this.f225580g = "1".equals(jSONObject.getString("bank_user"));
            this.f225581h = jSONObject.optString("mobile_no");
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Micromsg.NetSceneTenpayCheckPwd", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public boolean resend() {
        super.resend();
        java.util.Map<java.lang.String, java.lang.String> map = this.f225577d;
        ((java.util.HashMap) map).put("retry", "1");
        setRequestData(map);
        return true;
    }
}
