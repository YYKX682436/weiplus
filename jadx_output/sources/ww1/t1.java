package ww1;

/* loaded from: classes9.dex */
public class t1 extends lp5.a {

    /* renamed from: f, reason: collision with root package name */
    public int f450285f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f450286g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f450287h;

    /* renamed from: i, reason: collision with root package name */
    public int f450288i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f450289m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f450290n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f450291o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f450292p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f450293q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f450294r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f450295s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f450296t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f450297u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f450298v;

    /* renamed from: w, reason: collision with root package name */
    public final long f450299w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f450300x;

    public t1(int i17, int i18) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("set_amount", java.lang.String.valueOf(i17));
        hashMap.put("wallet_type", java.lang.String.valueOf(i18));
        setRequestData(hashMap);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneH5F2fTransferGetQrCode", "setAmount: %s, walletType: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // lp5.a
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/h5f2ftransfergetqrcode";
    }

    @Override // lp5.a
    public int I() {
        return 1335;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1335;
    }

    @Override // lp5.a
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f450285f = jSONObject.optInt("retcode", 0);
        this.f450286g = jSONObject.optString("retmsg", "");
        this.f450287h = jSONObject.optString("qrcode_url", "");
        this.f450288i = jSONObject.optInt("alert_type", 0);
        this.f450289m = jSONObject.optString("alert_title", "");
        this.f450290n = jSONObject.optString("left_button_text", "");
        this.f450291o = jSONObject.optString("right_button_text", "");
        this.f450292p = jSONObject.optString("right_button_url", "");
        this.f450293q = jSONObject.optString("bottom_text", "");
        this.f450294r = jSONObject.optString("bottom_url", "");
        jSONObject.optInt(ya.b.CURRENCY, 0);
        this.f450295s = jSONObject.optString("currencyunit", "");
        this.f450296t = jSONObject.optString("notice", "");
        this.f450297u = jSONObject.optString("notice_url", "");
        this.f450298v = jSONObject.optString("recv_realname", "");
        if (jSONObject.optInt("set_amount", 0) == 0) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_HK_PAY_URL_STRING, this.f450287h);
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneH5F2fTransferGetQrCode", "set payurl: %s", this.f450287h);
        }
    }

    public t1(long j17, int i17, java.lang.String str, int i18) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("amount", java.lang.String.valueOf(j17));
        hashMap.put("set_amount", java.lang.String.valueOf(i17));
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                hashMap.put("desc", java.net.URLEncoder.encode(str, com.tencent.mapsdk.internal.rv.f51270c));
            }
        } catch (java.io.UnsupportedEncodingException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneH5F2fTransferGetQrCode", e17, "", new java.lang.Object[0]);
        }
        hashMap.put("wallet_type", java.lang.String.valueOf(i18));
        setRequestData(hashMap);
        this.f450299w = j17;
        this.f450300x = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneH5F2fTransferGetQrCode", "amount: %d, setAmount: %s, desc: %s, walletType: %s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(i18));
    }
}
