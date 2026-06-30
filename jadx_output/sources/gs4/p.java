package gs4;

/* loaded from: classes9.dex */
public class p extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f275127m = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f275128d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f275129e;

    /* renamed from: f, reason: collision with root package name */
    public int f275130f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f275131g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f275132h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f275133i;

    public p() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("deviceid", wo.w0.g(false));
        setRequestData(hashMap);
    }

    public boolean H(java.lang.String str) {
        char charAt;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        int length = str.length();
        do {
            length--;
            if (length >= 0) {
                charAt = str.charAt(length);
                if (charAt < '0') {
                    break;
                }
            } else {
                return true;
            }
        } while (charAt <= '9');
        return false;
    }

    public final at4.m1 I(org.json.JSONObject jSONObject, java.lang.String str) {
        at4.m1 m1Var = new at4.m1();
        m1Var.field_is_show = jSONObject.optInt("show_label", 0);
        m1Var.field_pref_key = str;
        m1Var.field_pref_title = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        m1Var.field_pref_desc = jSONObject.optString("desc");
        m1Var.field_logo_url = jSONObject.optString("logo_url");
        m1Var.field_jump_type = jSONObject.optInt("jump_type");
        m1Var.field_pref_url = jSONObject.optString("jump_h5_url");
        m1Var.field_tinyapp_username = jSONObject.optString("tinyapp_username");
        m1Var.field_tinyapp_path = jSONObject.optString("tinyapp_path");
        return m1Var;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1654;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o, com.tencent.mm.wallet_core.model.z0
    public int getPayCgicmd() {
        return 100000;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 0;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/paymanage";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayPayManager", "errCode:" + i17 + ";errMsg:" + str);
        jSONObject.toString();
        if (i17 == 0) {
            java.lang.String optString = jSONObject.optString("is_show_deduct", "0");
            this.f275128d = com.tencent.mm.sdk.platformtools.t8.P(H(optString) ? optString : "0", 0);
            this.f275129e = jSONObject.optString("deduct_show_url", "");
            java.lang.String optString2 = jSONObject.optString("deduct_cache_time", "");
            if (!H(optString2)) {
                optString2 = "84600";
            }
            this.f275130f = com.tencent.mm.sdk.platformtools.t8.P(optString2, 0);
            this.f275131g = jSONObject.optString("deduct_title", "");
            this.f275132h = jSONObject.optString("realname_url", "");
            this.f275133i = jSONObject.optString("forget_pwd_url", "");
            java.lang.String optString3 = jSONObject.optString("payway_select_wording", "");
            java.lang.String optString4 = jSONObject.optString("payway_change_wording", "");
            at4.m1 m1Var = new at4.m1();
            m1Var.field_is_show = this.f275128d;
            m1Var.field_pref_key = "wallet_open_auto_pay";
            m1Var.field_pref_title = this.f275131g;
            m1Var.field_pref_url = this.f275129e;
            m1Var.field_jump_type = 1;
            ((pg0.a3) i95.n0.c(pg0.a3.class)).Zi().y0("wallet_open_auto_pay");
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayPayManager", "deductCacheTime %s forget_pwd_url %s", java.lang.Integer.valueOf(this.f275130f), this.f275133i);
            ((pg0.a3) i95.n0.c(pg0.a3.class)).Zi().insert(m1Var);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("switch_wallet");
            if (optJSONObject != null) {
                at4.m1 I = I(optJSONObject, "wallet_switch_currency");
                ((pg0.a3) i95.n0.c(pg0.a3.class)).Zi().y0("wallet_switch_currency");
                ((pg0.a3) i95.n0.c(pg0.a3.class)).Zi().insert(I);
            }
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("im_mch");
            if (optJSONObject2 != null) {
                at4.m1 I2 = I(optJSONObject2, "wallet_im_mch");
                ((pg0.a3) i95.n0.c(pg0.a3.class)).Zi().y0("wallet_im_mch");
                ((pg0.a3) i95.n0.c(pg0.a3.class)).Zi().insert(I2);
            }
            org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("deduct_manage");
            if (optJSONObject3 != null) {
                at4.m1 I3 = I(optJSONObject3, "wallet_open_auto_pay");
                ((pg0.a3) i95.n0.c(pg0.a3.class)).Zi().y0("wallet_open_auto_pay");
                ((pg0.a3) i95.n0.c(pg0.a3.class)).Zi().insert(I3);
            }
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("extra_sections");
            if (optJSONArray != null) {
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_PAY_MANAGE_EXTRA_SECTION_DATA_STRING_SYNC, optJSONArray.toString());
            } else {
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_PAY_MANAGE_EXTRA_SECTION_DATA_STRING_SYNC, " ");
            }
            org.json.JSONObject optJSONObject4 = jSONObject.optJSONObject("unreg_info");
            if (optJSONObject4 != null) {
                java.lang.String optString5 = optJSONObject4.optString("unreg_title", "");
                java.lang.String optString6 = optJSONObject4.optString("unreg_url", "");
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_USERINFO_UNREGTITLE_TYPE_STRING_SYNC, optString5);
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_USERINFO_UNREGURL_TYPE_STRING_SYNC, optString6);
            } else {
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_USERINFO_UNREGTITLE_TYPE_STRING_SYNC, "");
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_USERINFO_UNREGURL_TYPE_STRING_SYNC, "");
            }
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_PREF_INFO_CACHE_TIME_LONG_SYNC, java.lang.Long.valueOf(new java.util.Date().getTime() / 1000));
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_PREF_INFO_EXPIRES_INT_SYNC, java.lang.Integer.valueOf(this.f275130f));
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_REALNAME_URL_STRING_SYNC, this.f275132h);
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_DEDUCT_FORGET_URL_STRING, this.f275133i);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_DEDUCT_SELECT_WORDING_STRING, optString3);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString4)) {
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_DEDUCT_CHANGE_WORDING_STRING, optString4);
            }
            gm0.j1.i();
            gm0.j1.u().c().i(true);
        }
    }
}
