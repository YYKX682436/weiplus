package wo3;

/* loaded from: classes9.dex */
public class p extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f448206h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final wo3.m f448207d;

    /* renamed from: e, reason: collision with root package name */
    public final ss4.e0 f448208e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.wallet_core.model.o f448209f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.wallet_core.model.o f448210g;

    public p(int i17, java.lang.String str, int i18, int i19, java.lang.String str2) {
        wo3.m mVar = new wo3.m("" + java.lang.System.currentTimeMillis(), i17);
        this.f448207d = mVar;
        setRequestData(mVar.f448205i);
        ss4.e0 e0Var = new ss4.e0(str, i18);
        this.f448208e = e0Var;
        e0Var.D = true;
        java.util.HashMap hashMap = (java.util.HashMap) e0Var.f412048s;
        hashMap.put("event_id", java.lang.String.valueOf(i19));
        hashMap.put("event_feature", str2);
        yo3.m.l();
        hashMap.put("is_new_authcodes", "1");
        com.tencent.mm.plugin.wallet_core.model.Bankcard a17 = yo3.f.f464145a.a(false);
        if (a17 != null) {
            hashMap.put("prefer_bind_serial", a17.field_bindSerial);
            hashMap.put("prefer_bank_type", a17.field_bankcardType);
        } else {
            yo3.d dVar = yo3.f.f464146b;
            if (dVar != null) {
                java.lang.String b17 = dVar.b();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                    hashMap.put("prefer_bind_serial", b17);
                    if (b17.equalsIgnoreCase("LQT")) {
                        hashMap.put("prefer_bank_type", "LQT");
                    }
                }
            } else {
                kotlin.jvm.internal.o.o("sImpl");
                throw null;
            }
        }
        addRequestData(hashMap);
        setWXRequestData(e0Var.f412049t);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayWxOfflineUserBindQuery", "do offline user bind query");
    }

    public com.tencent.mm.wallet_core.model.o H(org.json.JSONObject jSONObject) {
        int i17;
        com.tencent.mm.wallet_core.model.o oVar = new com.tencent.mm.wallet_core.model.o();
        oVar.f213954c = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kkk);
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kkk);
        try {
            i17 = jSONObject.getInt("retcode");
            string = jSONObject.optString("retmsg");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneTenpayWxOfflineUserBindQuery", "hy: json resolve error: error when resolving error code : " + e17.toString());
            i17 = -10089;
        }
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneTenpayWxOfflineUserBindQuery", "hy: resolve busi error: retCode is error");
            if (i17 != -10089) {
                oVar.a(1000, i17, string, 2);
            } else {
                oVar.a(1000, 2, string, 2);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayWxOfflineUserBindQuery", "hy: all's OK");
        }
        return oVar;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1742;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 1742;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/offlineuserbindquery";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("jump_info");
        if (optJSONObject != null) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_PAY_OFFLINE_JUMPINFOPAGE_DATA_STRING_SYNC, optJSONObject.toString());
        } else {
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_PAY_OFFLINE_JUMPINFOPAGE_DATA_STRING_SYNC, "");
        }
        if (i17 != 0) {
            return;
        }
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("queryuser_resp");
        com.tencent.mm.wallet_core.model.o H = H(optJSONObject2);
        this.f448209f = H;
        this.f448207d.onGYNetEnd(H.f213953b, H.f213954c, optJSONObject2);
        org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("bindquerynew_resp");
        com.tencent.mm.wallet_core.model.o H2 = H(optJSONObject3);
        this.f448210g = H2;
        this.f448208e.onGYNetEnd(H2.f213953b, H2.f213954c, optJSONObject3);
        if (optJSONObject2 != null) {
            java.lang.String optString = optJSONObject2.optString("card_list");
            if (optString != null) {
                to3.c0.Ai().Vi(196656, optString);
                yo3.m.f464156c = optString;
            }
            org.json.JSONObject optJSONObject4 = optJSONObject2.optJSONObject("prefer_card");
            if (optJSONObject4 != null) {
                java.lang.String optString2 = optJSONObject4.optString("bind_serial");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                    vr4.f1.wi().Ai().getClass();
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_ONLINE_BIND_SERIAL_STRING_SYNC, optString2);
                    yo3.f fVar = yo3.f.f464145a;
                    yo3.d dVar = yo3.f.f464146b;
                    if (dVar == null) {
                        kotlin.jvm.internal.o.o("sImpl");
                        throw null;
                    }
                    if (dVar instanceof yo3.c) {
                        fVar.c();
                    }
                }
            }
            java.lang.String optString3 = optJSONObject2.optString("prefer_card_changed_wording");
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
                return;
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_PREFER_CARD_CHANGE_WORDING_STRING_SYNC, optString3);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public boolean shouldResolveJsonWhenError() {
        return true;
    }

    public p(int i17, java.lang.String str, int i18, int i19, java.lang.String str2, int i27) {
        wo3.m mVar = new wo3.m("" + java.lang.System.currentTimeMillis(), i17);
        this.f448207d = mVar;
        setRequestData(mVar.f448205i);
        ss4.e0 e0Var = new ss4.e0(str, i18);
        this.f448208e = e0Var;
        e0Var.D = true;
        java.util.HashMap hashMap = (java.util.HashMap) e0Var.f412048s;
        hashMap.put("event_id", java.lang.String.valueOf(i19));
        hashMap.put("event_feature", str2);
        hashMap.put("is_first_show", java.lang.String.valueOf(i27));
        yo3.m.l();
        hashMap.put("is_new_authcodes", "1");
        com.tencent.mm.plugin.wallet_core.model.Bankcard a17 = yo3.f.f464145a.a(false);
        if (a17 != null) {
            hashMap.put("prefer_bind_serial", a17.field_bindSerial);
            hashMap.put("prefer_bank_type", a17.field_bankcardType);
        }
        addRequestData(hashMap);
        setWXRequestData(e0Var.f412049t);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayWxOfflineUserBindQuery", "do offline user bind query");
    }

    public p(int i17, java.lang.String str, int i18, int i19, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        wo3.m mVar = new wo3.m("" + java.lang.System.currentTimeMillis(), i17);
        this.f448207d = mVar;
        setRequestData(mVar.f448205i);
        ss4.e0 e0Var = new ss4.e0(str, i18);
        this.f448208e = e0Var;
        e0Var.D = true;
        java.util.HashMap hashMap = (java.util.HashMap) e0Var.f412048s;
        hashMap.put("event_id", java.lang.String.valueOf(i19));
        hashMap.put("event_feature", str2);
        hashMap.put("package", str4);
        hashMap.put("appId", str3);
        yo3.m.l();
        hashMap.put("is_new_authcodes", "1");
        com.tencent.mm.plugin.wallet_core.model.Bankcard a17 = yo3.f.f464145a.a(false);
        if (a17 != null) {
            hashMap.put("prefer_bind_serial", a17.field_bindSerial);
            hashMap.put("prefer_bank_type", a17.field_bankcardType);
        }
        addRequestData(hashMap);
        setWXRequestData(e0Var.f412049t);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTenpayWxOfflineUserBindQuery", "do offline user bind query");
    }
}
