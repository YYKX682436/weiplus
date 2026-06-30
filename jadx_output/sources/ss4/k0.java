package ss4;

/* loaded from: classes9.dex */
public class k0 extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f412075d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f412076e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f412077f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f412078g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f412079h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f412080i;

    /* renamed from: m, reason: collision with root package name */
    public int f412081m;

    /* renamed from: n, reason: collision with root package name */
    public int f412082n;

    /* renamed from: o, reason: collision with root package name */
    public long f412083o;

    /* renamed from: p, reason: collision with root package name */
    public ss4.j0 f412084p = null;

    public k0() {
        setRequestData(null);
    }

    public static boolean H(boolean z17, np5.b0 b0Var, ss4.j0 j0Var) {
        gm0.j1.i();
        long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_DELAY_TRANSFER_EXPIRE_TIME_LONG, 0L)).longValue();
        if (!z17 && longValue >= java.lang.System.currentTimeMillis()) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTransferWording", "do scene: %d, force: %B", java.lang.Long.valueOf(longValue), java.lang.Boolean.valueOf(z17));
        ss4.k0 k0Var = new ss4.k0();
        k0Var.f412084p = j0Var;
        if (b0Var != null) {
            b0Var.d(k0Var, false);
            return true;
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.g(k0Var);
        return true;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1992;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 0;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/gettransferwording";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public boolean isBlock() {
        return false;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTransferWording", "errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), str);
        this.f412075d = jSONObject.optString("delay_confirm_wording");
        this.f412076e = jSONObject.optString("delay_confirm_switch_wording");
        this.f412077f = jSONObject.optString("delay_confirm_switch_remind_wording");
        this.f412078g = jSONObject.optString("delay_confirm_switch_remind_half_page_wording");
        this.f412079h = jSONObject.optString("delay_confirm_desc_url");
        this.f412081m = jSONObject.optInt("delay_confirm_desc_url_flag", 0);
        this.f412083o = jSONObject.optLong("expire_time", 0L) * 1000;
        this.f412082n = jSONObject.optInt("delay_confirm_switch_flag", 0);
        gm0.j1.i();
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f412075d)) {
            c17.x(com.tencent.mm.storage.u3.USERINFO_DELAY_TRANSFER_CONFIRM_WORDING_STRING, this.f412075d);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f412076e)) {
            c17.x(com.tencent.mm.storage.u3.USERINFO_DELAY_TRANSFER_SWITCH_WORDING_STRING, this.f412076e);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f412077f)) {
            c17.x(com.tencent.mm.storage.u3.USERINFO_DELAY_TRANSFER_REMIND_WORDING_STRING, this.f412077f);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f412078g)) {
            c17.x(com.tencent.mm.storage.u3.USERINFO_DELAY_TRANSFER_HALF_PAGE_WORDING_STRING, this.f412078g);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f412079h)) {
            try {
                java.lang.String decode = java.net.URLDecoder.decode(this.f412079h, com.tencent.mapsdk.internal.rv.f51270c);
                this.f412080i = decode;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(decode)) {
                    c17.x(com.tencent.mm.storage.u3.USERINFO_DELAY_TRANSFER_DESC_URL_STRING, this.f412080i);
                }
            } catch (java.io.UnsupportedEncodingException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneTransferWording", e17, "", new java.lang.Object[0]);
            }
        }
        c17.x(com.tencent.mm.storage.u3.USERINFO_DELAY_TRANSFER_DESC_URL_FLAG_INT, java.lang.Integer.valueOf(this.f412081m));
        c17.x(com.tencent.mm.storage.u3.USERINFO_DELAY_TRANSFER_EXPIRE_TIME_LONG, java.lang.Long.valueOf(this.f412083o));
        c17.x(com.tencent.mm.storage.u3.USERINFO_DELAY_TRANSFER_SHOW_SWITCH_FLAG_INT, java.lang.Integer.valueOf(this.f412082n));
        ss4.j0 j0Var = this.f412084p;
        if (j0Var != null) {
            j0Var.a();
        }
    }
}
