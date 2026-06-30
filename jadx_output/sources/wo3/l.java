package wo3;

/* loaded from: classes9.dex */
public class l extends wo3.h {

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f448191r;

    /* renamed from: s, reason: collision with root package name */
    public int f448192s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f448193t;

    /* renamed from: w, reason: collision with root package name */
    public final int f448196w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f448197x;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f448182f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f448183g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f448184h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f448185i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f448186m = "";

    /* renamed from: n, reason: collision with root package name */
    public int f448187n = 0;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f448188o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f448189p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f448190q = "";

    /* renamed from: u, reason: collision with root package name */
    public int f448194u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f448195v = 0;

    public l(java.lang.String str, int i17, int i18) {
        java.lang.String str2;
        int i19;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String g17 = kk.k.g((java.lang.System.currentTimeMillis() + "").getBytes());
        this.f448197x = g17;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.z3.b(true);
        java.lang.String e17 = yo3.m.e();
        java.lang.String Ni = to3.c0.Ai().Ni(196628);
        Ni = android.text.TextUtils.isEmpty(Ni) ? wo.w0.k() : Ni;
        if (android.text.TextUtils.isEmpty(e17)) {
            str2 = Ni + "&" + str + "&" + (((int) (java.lang.Math.random() * 1000000.0d)) + 1000000);
        } else {
            str2 = Ni + "&" + str + "&" + (((int) (java.lang.Math.random() * 1000000.0d)) + 1000000) + "&" + e17;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("token_src", str2);
        java.lang.String Ni2 = to3.c0.Ai().Ni(196617);
        switch (i18) {
            case 1:
                i19 = 13;
                break;
            case 2:
                i19 = 14;
                break;
            case 3:
                i19 = 15;
                break;
            case 4:
                i19 = 16;
                break;
            case 5:
                i19 = 17;
                break;
            case 6:
                i19 = 18;
                break;
            case 7:
                i19 = 19;
                break;
            case 8:
                i19 = 20;
                break;
            case 9:
                i19 = 24;
                break;
            case 10:
                i19 = 72;
                break;
            default:
                i19 = 12;
                break;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(135L, i19, 1L, true);
        com.tencent.mm.autogen.mmdata.rpt.AndroidCertErrorStruct androidCertErrorStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidCertErrorStruct();
        androidCertErrorStruct.f55040h = androidCertErrorStruct.b("session2", g17, true);
        androidCertErrorStruct.f55036d = 1L;
        if (com.tencent.mm.wallet_core.model.g.c().g(Ni2)) {
            androidCertErrorStruct.f55037e = 1;
            androidCertErrorStruct.f55038f = com.tencent.mm.wallet_core.model.g.c().d();
            androidCertErrorStruct.k();
            com.tencent.mm.autogen.mmdata.rpt.AndroidCertErrorStruct androidCertErrorStruct2 = new com.tencent.mm.autogen.mmdata.rpt.AndroidCertErrorStruct();
            androidCertErrorStruct2.f55040h = androidCertErrorStruct2.b("session2", g17, true);
            androidCertErrorStruct2.f55036d = 3L;
            com.tencent.mm.wallet_core.model.g.c().getClass();
            com.tencent.mm.sdk.platformtools.z3.b(true);
            str4 = com.tenpay.ndk.CertUtil.getInstance().genUserSig(Ni2, str2);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                androidCertErrorStruct2.f55037e = 0;
                androidCertErrorStruct2.f55038f = com.tencent.mm.wallet_core.model.g.c().d();
                androidCertErrorStruct2.k();
            } else {
                androidCertErrorStruct2.f55037e = 1;
                androidCertErrorStruct2.f55038f = com.tencent.mm.wallet_core.model.g.c().d();
                androidCertErrorStruct2.k();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "CertUtil.getInstance().isCertExist(cn) true");
            str3 = "MicroMsg.NetSceneTenpayWxOfflineGetToken";
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneTenpayWxOfflineGetToken", "NetSceneTenpayWxOfflineGetToken CertUtil.getInstance().getLastError():" + com.tencent.mm.wallet_core.model.g.c().d());
            androidCertErrorStruct.f55037e = 0;
            androidCertErrorStruct.f55038f = (long) com.tencent.mm.wallet_core.model.g.c().d();
            androidCertErrorStruct.k();
            str3 = "MicroMsg.NetSceneTenpayWxOfflineGetToken";
            g0Var.idkeyStat(135L, 6L, 1L, true);
            com.tencent.mm.autogen.mmdata.rpt.AndroidCertErrorStruct androidCertErrorStruct3 = new com.tencent.mm.autogen.mmdata.rpt.AndroidCertErrorStruct();
            androidCertErrorStruct3.f55040h = androidCertErrorStruct3.b("session2", g17, true);
            androidCertErrorStruct3.f55036d = 2L;
            gm0.j1.i();
            java.lang.String str6 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_IEMI_STRING_SYNC, "");
            if (str6 == null || !str6.equals(wo.w0.g(true))) {
                androidCertErrorStruct3.f55037e = 0;
                androidCertErrorStruct3.f55038f = com.tencent.mm.wallet_core.model.g.c().d();
                com.tencent.mars.xlog.Log.i(str3, " NetSceneTenpayWxOfflineGetToken iemi is diff between create and getToken");
                g0Var.idkeyStat(135L, 5L, 1L, true);
            } else {
                com.tencent.mars.xlog.Log.i(str3, " NetSceneTenpayWxOfflineGetToken iemi is same between create and getToken");
                androidCertErrorStruct3.f55037e = 1;
                androidCertErrorStruct3.f55038f = com.tencent.mm.wallet_core.model.g.c().d();
            }
            androidCertErrorStruct3.k();
            com.tencent.mars.xlog.Log.e(str3, " NetSceneTenpayWxOfflineGetToken CertUtil.getInstance().isCertExist return false! cn: " + Ni2);
            str4 = "";
        }
        if (android.text.TextUtils.isEmpty(str4)) {
            com.tencent.mars.xlog.Log.e(str3, " NetSceneTenpayWxOfflineGetToken sign is empty!");
            g0Var.idkeyStat(135L, 4L, 1L, true);
        } else {
            com.tencent.mars.xlog.Log.i(str3, "sign is valid");
        }
        hashMap.put("sign", str4);
        hashMap.put("cert_no", Ni2);
        int i27 = wo3.k.f448168t;
        hashMap.put("type", "3");
        hashMap.put("version_number", "3");
        java.lang.String Ni3 = to3.c0.Ai().Ni(196644);
        if (((android.text.TextUtils.isEmpty(Ni3) || !yo3.m.j(Ni3)) ? 0 : com.tencent.mm.sdk.platformtools.t8.P(Ni3, 0)) == 2) {
            if (android.text.TextUtils.isEmpty(yo3.m.f464155b)) {
                gm0.j1.n().f273288b.g(new c01.ra(new yo3.j(), null));
                if (android.text.TextUtils.isEmpty(yo3.m.f464155b)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WalletOfflineUtil", "offline_token_v2 is null");
                }
                str5 = yo3.m.f464155b;
            } else {
                str5 = yo3.m.f464155b;
            }
            hashMap.put("last_token", str5);
        } else {
            hashMap.put("last_token", yo3.m.e());
        }
        com.tencent.mars.xlog.Log.i(str3, "inOfflineUI: %B", java.lang.Boolean.valueOf(to3.c0.f420951i));
        if (i17 == 65281) {
            hashMap.put("fetch_tag", java.lang.String.valueOf(2));
        } else if (to3.c0.f420951i) {
            hashMap.put("fetch_tag", java.lang.String.valueOf(1));
        } else {
            hashMap.put("fetch_tag", java.lang.String.valueOf(0));
        }
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "" + (i17 == 65281 ? 3 : i17));
        yo3.m.l();
        this.f448196w = 1;
        hashMap.put("is_new_authcodes", "1");
        hashMap.put("code_ver", "" + gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_CODE_VER_STRING, ""));
        setRequestData(hashMap);
    }

    public static r45.ak0 I(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        r45.ak0 ak0Var = new r45.ak0();
        ak0Var.f370061d = jSONObject.optInt("is_need_show", 0);
        ak0Var.f370063f = jSONObject.optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
        ak0Var.f370064g = jSONObject.optString("button");
        ak0Var.f370062e = jSONObject.optString("icon");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_ENABLECODEPAGE_STRING_SYNC, jSONObject.toString());
        return ak0Var;
    }

    @Override // wo3.h
    public void H(int i17, java.lang.String str, java.lang.String str2) {
        try {
            I(new org.json.JSONObject(str2).optJSONObject("enable_code_page"));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneTenpayWxOfflineGetToken", e17, "", new java.lang.Object[0]);
        }
    }

    public boolean J() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "do save token");
        to3.c0.Ai().Vi(196626, this.f448183g);
        to3.c0.Ai().Vi(196627, this.f448184h);
        to3.c0.Ai().Vi(196628, this.f448185i);
        to3.c0.Ai().Vi(196632, "" + (java.lang.System.currentTimeMillis() / 1000));
        yo3.m.t(this.f448182f, this.f448186m, this.f448188o, this.f448189p, this.f448196w == 1 ? 2 : 1);
        int i17 = this.f448187n;
        to3.c0.Ai().Vi(196644, "" + i17);
        to3.c0.Ai().Vi(196647, this.f448190q);
        java.lang.String Ni = to3.c0.Ai().Ni(196617);
        com.tencent.mm.wallet_core.model.g.c().a(Ni);
        boolean h17 = com.tencent.mm.wallet_core.model.g.c().h(Ni, this.f448191r, this.f448195v == 1);
        com.tencent.mm.autogen.mmdata.rpt.AndroidCertErrorStruct androidCertErrorStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidCertErrorStruct();
        androidCertErrorStruct.f55040h = androidCertErrorStruct.b("session2", this.f448197x, true);
        androidCertErrorStruct.f55036d = 3L;
        if (h17) {
            androidCertErrorStruct.f55037e = 1;
            androidCertErrorStruct.f55038f = com.tencent.mm.wallet_core.model.g.c().d();
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayWxOfflineGetToken", "CertUtil.getInstance().setTokens success!");
        } else {
            androidCertErrorStruct.f55037e = 0;
            androidCertErrorStruct.f55038f = com.tencent.mm.wallet_core.model.g.c().d();
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneTenpayWxOfflineGetToken", "CertUtil.getInstance().setTokens failed!");
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneTenpayWxOfflineGetToken", "WalletOfflineEntranceUI CertUtil.getInstance().getLastError():" + com.tencent.mm.wallet_core.model.g.c().d());
        }
        androidCertErrorStruct.k();
        to3.c0.Ai().Vi(196649, "" + this.f448192s);
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_CODE_VER_STRING, this.f448193t);
        return h17;
    }

    @Override // wo3.h
    public int getFuncId() {
        return to3.c0.f420951i ? 571 : 1725;
    }

    @Override // wo3.h
    public int getTenpayCgicmd() {
        return to3.c0.f420951i ? 52 : 1725;
    }

    @Override // wo3.h
    public java.lang.String getUri() {
        return to3.c0.f420951i ? "/cgi-bin/mmpay-bin/tenpay/offlinegettoken" : "/cgi-bin/mmpay-bin/tenpay/offlinegettokenbackground";
    }

    @Override // wo3.h
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 != 0 || jSONObject == null) {
            return;
        }
        this.f448182f = jSONObject.optString("token");
        this.f448183g = jSONObject.optString("valid_end");
        this.f448184h = jSONObject.optString("encrypt_str");
        this.f448185i = jSONObject.optString("deviceid");
        this.f448186m = jSONObject.optString("token_v2");
        this.f448187n = jSONObject.optInt("algorithm_type");
        this.f448188o = jSONObject.optString("card_list");
        this.f448189p = jSONObject.optString("key_list");
        this.f448190q = jSONObject.optString("token_pin");
        this.f448191r = jSONObject.optString("auth_codes");
        this.f448192s = jSONObject.optInt("update_interval");
        this.f448193t = jSONObject.optString("code_ver");
        this.f448194u = jSONObject.optInt("reget_token_num", 0);
        this.f448195v = jSONObject.optInt("cipher_type", 0);
        yo3.m.r(this.f448194u);
        jSONObject.toString();
    }
}
