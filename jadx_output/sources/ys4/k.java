package ys4;

/* loaded from: classes9.dex */
public class k extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public int f465249d;

    /* renamed from: e, reason: collision with root package name */
    public int f465250e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.id_verify.model.Profession[] f465251f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String[] f465252g = null;

    public k(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, str);
        }
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1976;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 1976;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/getuserexinfo";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayGetUserExInfo", "errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i17), str);
        jSONObject.toString();
        this.f465249d = jSONObject.optInt("need_area");
        this.f465250e = jSONObject.optInt("need_profession");
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("array");
        if (optJSONArray != null) {
            this.f465251f = new com.tencent.mm.plugin.wallet_core.id_verify.model.Profession[optJSONArray.length()];
            for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
                if (optJSONObject != null) {
                    java.lang.String optString = optJSONObject.optString("profession_name");
                    int optInt = optJSONObject.optInt("profession_type");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayGetUserExInfo", "empty profession_name!");
                    } else {
                        this.f465251f[i18] = new com.tencent.mm.plugin.wallet_core.id_verify.model.Profession(optString, optInt);
                    }
                }
            }
        }
        jSONObject.optInt("need_nationality");
        org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("nationality_exclude_array");
        if (optJSONArray2 != null) {
            this.f465252g = new java.lang.String[optJSONArray2.length()];
            for (int i19 = 0; i19 < optJSONArray2.length(); i19++) {
                this.f465252g[i19] = optJSONArray2.optString(i19);
            }
        }
    }
}
