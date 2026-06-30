package gs4;

/* loaded from: classes9.dex */
public class w extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f275138d;

    /* renamed from: e, reason: collision with root package name */
    public final int f275139e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f275140f;

    /* renamed from: g, reason: collision with root package name */
    public int f275141g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f275142h = -1;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f275143i = "";

    /* renamed from: m, reason: collision with root package name */
    public int f275144m = -1;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f275145n = "";

    public w(java.lang.String str, int i17, java.lang.String str2, int i18) {
        this.f275138d = str;
        this.f275139e = i17;
        this.f275140f = str2;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("cre_id", fp.s0.a(str));
        hashMap.put("cre_type", fp.s0.a(i17 + ""));
        hashMap.put("true_name", fp.s0.a(str2));
        hashMap.put("verifyScene", i18 + "");
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 2784;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 2784;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/verifyuserrealnameinfo";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneVerifyUserRealNameInfo", "onGYNetEnd, errCode: %s, errMsg: %s, json: %s", java.lang.Integer.valueOf(i17), str, jSONObject);
        if (i17 == 0) {
            jSONObject.optString("retcode");
            jSONObject.optString("retmsg");
            this.f275141g = jSONObject.optInt("is_support_face", 0);
            this.f275142h = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            this.f275143i = jSONObject.optString("package");
            this.f275144m = jSONObject.optInt("is_need_cert");
            this.f275145n = jSONObject.optString("packagesign");
        }
    }
}
