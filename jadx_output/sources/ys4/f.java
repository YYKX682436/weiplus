package ys4;

/* loaded from: classes9.dex */
public class f extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465228d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465229e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465230f;

    /* renamed from: g, reason: collision with root package name */
    public int f465231g;

    public f(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4, com.tencent.mm.plugin.wallet_core.id_verify.model.RealNameBundle realNameBundle, boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("flag", i17 + "");
        hashMap.put("passwd", str);
        hashMap.put("token", str2);
        hashMap.put("face_token", str3);
        hashMap.put("realname_scene", i18 + "");
        hashMap.put("session_id", str4);
        if (z17) {
            hashMap.put("is_close_marketing", z17 + "");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneRealNameReg", "realname_scene=%d", java.lang.Integer.valueOf(i18));
        if (realNameBundle != null) {
            realNameBundle.a(hashMap);
        }
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1648;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 1648;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/realnamereg";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneRealNameReg", "errCode=" + str + ";errMsg=" + str);
        this.f465228d = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f465229e = jSONObject.optString("desc");
        this.f465230f = jSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE);
        this.f465231g = jSONObject.optInt("err_jump_page");
    }
}
