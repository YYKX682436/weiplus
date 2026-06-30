package d05;

/* loaded from: classes9.dex */
public class b extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f225582d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f225583e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f225584f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f225585g = true;

    public b(java.lang.String str, int i17, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("passwd", str);
        hashMap.put("bank_type", str2);
        hashMap.put("check_pwd_scene", i17 + "");
        setRequestData(hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("check_pwd_scene", i17 + "");
        setWXRequestData(hashMap2);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 63;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 != 0) {
            return;
        }
        this.f225582d = jSONObject.optString("session_key");
        if ("1".equals(jSONObject.optString("all_info"))) {
            this.f225585g = false;
            return;
        }
        this.f225585g = true;
        this.f225583e = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
        this.f225584f = jSONObject.optString("cre_id");
    }
}
