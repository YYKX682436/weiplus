package rs4;

/* loaded from: classes9.dex */
public class b extends com.tencent.mm.wallet_core.tenpay.model.o implements com.tencent.mm.wallet_core.model.t {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.BindCardOrder f399346d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f399347e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f399348f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f399349g;

    /* renamed from: h, reason: collision with root package name */
    public int f399350h;

    public b(at4.z0 z0Var) {
        this(z0Var, -1, "", null);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return com.tencent.mm.plugin.appbrand.jsapi.appdownload.x.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 17;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/bindverifyreg";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.wallet_core.model.BindCardOrder bindCardOrder = new com.tencent.mm.plugin.wallet_core.model.BindCardOrder();
        this.f399346d = bindCardOrder;
        bindCardOrder.a(jSONObject);
        this.f399347e = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f399348f = jSONObject.optString("desc");
        this.f399349g = jSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE);
        this.f399350h = jSONObject.optInt("err_jump_page");
    }

    public b(at4.z0 z0Var, int i17, java.lang.String str, com.tencent.mm.plugin.wallet_core.id_verify.model.RealNameBundle realNameBundle) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap.put("flag", z0Var.f14022a);
        hashMap.put("passwd", z0Var.f14023b);
        hashMap.put("verify_code", z0Var.f14024c);
        hashMap.put("token", z0Var.f14025d);
        hashMap.put("bind_flag", z0Var.f14028g ? "1" : "0");
        if (i17 > 0) {
            hashMap.put("realname_scene", i17 + "");
            com.tencent.mars.xlog.Log.i(com.tencent.mm.wallet_core.tenpay.model.o.TAG, "realname_scene=%d", java.lang.Integer.valueOf(i17));
        }
        if (realNameBundle != null) {
            realNameBundle.a(hashMap);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(z0Var.f14026e)) {
            hashMap.put("bank_type", z0Var.f14026e + "");
        }
        hashMap.put("session_id", str);
        if (com.tencent.mm.wallet_core.model.i1.f213914a) {
            hashMap2.put("uuid_for_bindcard", com.tencent.mm.wallet_core.model.i1.f213916c);
            hashMap2.put("bindcard_scene", "" + com.tencent.mm.wallet_core.model.i1.f213915b);
        }
        setPayInfo(z0Var.f14035n, hashMap, hashMap2);
        setRequestData(hashMap);
        setWXRequestData(hashMap2);
    }
}
