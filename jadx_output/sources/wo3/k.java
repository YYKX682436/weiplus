package wo3;

/* loaded from: classes9.dex */
public class k extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f448168t = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f448169d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f448170e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f448171f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f448172g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f448173h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f448174i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f448175m = "";

    /* renamed from: n, reason: collision with root package name */
    public int f448176n = 0;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f448177o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f448178p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f448179q = "";

    /* renamed from: r, reason: collision with root package name */
    public final int f448180r;

    /* renamed from: s, reason: collision with root package name */
    public final int f448181s;

    public k(com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard, java.lang.String str, int i17) {
        this.f448181s = com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL;
        java.lang.String k17 = wo.w0.k();
        java.lang.String str2 = (java.lang.String) wo.p.a().f447772a.get(256);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && str2.equals(k17)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(965, 48);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayWxOfflineCreate", "old id: %s, new id: %s", str2, k17);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("passwd", str);
        hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, k17);
        hashMap.put("weixin_ver", "0x" + java.lang.Integer.toHexString(o45.wf.f343029g));
        hashMap.put("bind_serialno", bankcard.field_bindSerial);
        hashMap.put("bank_type", bankcard.field_bankcardType);
        hashMap.put("card_tail", bankcard.field_bankcardTail);
        hashMap.put("open_limitfee", "" + i17);
        this.f448181s = i17;
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(com.tencent.mm.sdk.platformtools.w2.a(com.tencent.mm.wallet_core.ui.r1.D()) + com.tencent.mm.sdk.platformtools.w2.b(wo.w0.k().getBytes()));
        hashMap.put("user_id", a17);
        java.lang.String b17 = com.tencent.mm.wallet_core.model.g.c().b(a17, com.tencent.mm.wallet_core.b.a().f() ? 1 : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayWxOfflineCreate", "crt_csr %s %s", b17, java.lang.Boolean.valueOf(com.tencent.mm.wallet_core.b.a().f()));
        if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneTenpayWxOfflineCreate", "crt_csr is null!!! errorcode: %s", java.lang.Integer.valueOf(com.tencent.mm.wallet_core.model.g.c().d()));
        }
        hashMap.put("crt_csr", b17);
        hashMap.put("type", "3");
        hashMap.put("version_number", "3");
        yo3.m.l();
        this.f448180r = 1;
        hashMap.put("is_new_authcodes", "1");
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 565;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 46;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/offlinecreate";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f448170e = jSONObject.optString("crt_crt");
            this.f448169d = jSONObject.optString("cn");
            this.f448171f = jSONObject.optString("token");
            this.f448172g = jSONObject.optString("valid_end");
            this.f448173h = jSONObject.optString("encrypt_str");
            this.f448174i = jSONObject.optString("deviceid");
            if (com.tencent.mm.wallet_core.model.g.c().e(this.f448169d, this.f448170e)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayWxOfflineCreate", "importCert crt_crt success");
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneTenpayWxOfflineCreate", "importCert crt_crt fail");
            }
            this.f448175m = jSONObject.optString("token_v2");
            this.f448176n = jSONObject.optInt("algorithm_type");
            this.f448177o = jSONObject.optString("card_list");
            this.f448178p = jSONObject.optString("key_list");
            this.f448179q = jSONObject.optString("token_pin");
            java.lang.String optString = jSONObject.optString("notice_url");
            java.lang.String optString2 = jSONObject.optString("auth_codes");
            int optInt = jSONObject.optInt("update_interval");
            java.lang.String optString3 = jSONObject.optString("code_ver");
            int optInt2 = jSONObject.optInt("cipher_type", 0);
            to3.c0.Ai().Vi(196617, this.f448169d);
            to3.c0.Ai().Vi(196626, this.f448172g);
            to3.c0.Ai().Vi(196627, this.f448173h);
            to3.c0.Ai().Vi(196628, this.f448174i);
            to3.c0.Ai().Vi(196630, "1");
            to3.c0.Ai().Vi(196632, "" + (java.lang.System.currentTimeMillis() / 1000));
            yo3.m.t(this.f448171f, this.f448175m, this.f448177o, this.f448178p, this.f448180r == 1 ? 2 : 1);
            int i18 = this.f448176n;
            to3.c0.Ai().Vi(196644, "" + i18);
            to3.c0.Ai().Vi(196647, this.f448179q);
            to3.c0.Ai().Vi(196616, optString);
            com.tencent.mm.wallet_core.model.g.c().a(to3.c0.Ai().Ni(196617));
            boolean h17 = com.tencent.mm.wallet_core.model.g.c().h(this.f448169d, optString2, optInt2 == 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayWxOfflineCreate", "offlinecreate isOk %s cn: %s", java.lang.Boolean.valueOf(h17), this.f448169d);
            if (!h17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneTenpayWxOfflineCreate", "CertUtil.getInstance().setTokens failed!");
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneTenpayWxOfflineCreate", "WalletOfflineEntranceUI CertUtil.getInstance().getLastError():" + com.tencent.mm.wallet_core.model.g.c().d());
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayWxOfflineCreate", "CertUtil.getInstance().setTokens success!");
            }
            to3.c0.Ai().Vi(196649, "" + optInt);
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_IEMI_STRING_SYNC, "" + wo.w0.g(true));
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_CODE_VER_STRING, optString3);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_KINDAOFFLINE_CERTTYPE_INT_SYNC, 1);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd2(com.tencent.mm.wallet_core.model.o oVar, org.json.JSONObject jSONObject) {
        com.tencent.mm.wallet_core.model.g c17 = com.tencent.mm.wallet_core.model.g.c();
        synchronized (c17) {
            c17.f213898a = false;
        }
    }

    @Override // com.tencent.mm.wallet_core.model.d1, com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        super.onGYNetEnd(i17, i18, i19, str, v0Var, bArr);
        if (i18 != 0 || i19 != 0) {
            to3.c0.Ai().Vi(196630, "0");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
        iDKey.SetID(135);
        iDKey.SetValue(1L);
        iDKey.SetKey(11);
        com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
        iDKey2.SetID(135);
        iDKey2.SetValue(1L);
        if (i19 == 0 && i19 == 0) {
            iDKey2.SetKey(9);
        } else {
            iDKey2.SetKey(10);
        }
        arrayList.add(iDKey);
        arrayList.add(iDKey2);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList, true, false);
    }
}
