package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public class p1 {

    /* renamed from: h, reason: collision with root package name */
    public static com.tencent.mm.wallet_core.model.p1 f213975h;

    /* renamed from: a, reason: collision with root package name */
    public int f213976a = 0;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f213977b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f213978c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f213979d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f213980e = "";

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.wallet_core.model.i f213981f = com.tencent.mm.wallet_core.model.i.DigitalCertEncryptTypeRSA;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Vector f213982g = new java.util.Vector();

    public static java.lang.String b() {
        gm0.j1.i();
        return (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLETDIGITAL_CERT_NO_STRING_SYNC, "");
    }

    public static com.tencent.mm.wallet_core.model.p1 c() {
        if (f213975h == null) {
            f213975h = new com.tencent.mm.wallet_core.model.p1();
        }
        return f213975h;
    }

    public static void e(java.lang.String str, com.tencent.mm.wallet_core.model.i iVar) {
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLETDIGITAL_CERT_NO_STRING_SYNC, str);
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLETDIGITAL_CERT_ENCRYPT_TYPE_INT_SYNC, java.lang.Integer.valueOf(iVar.ordinal()));
    }

    public void a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (str.equals(b())) {
            this.f213976a = 0;
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLETDIGITAL_CERT_NO_STRING_SYNC, "");
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletDigCertManager", "clean token %s  stack %s ", str, com.tencent.mm.sdk.platformtools.z3.b(true));
            com.tencent.mm.wallet_core.model.j.b().getClass();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mm.sdk.platformtools.z3.b(true);
                if (com.tenpay.ndk.CertUtil.getInstance().isCertExist(str)) {
                    com.tenpay.ndk.CertUtil.getInstance().clearCert(str);
                } else if (com.tenpay.ndk.WxSmCertUtil.getInstance().hasCert(str)) {
                    com.tenpay.ndk.WxSmCertUtil.getInstance().clearCert(str);
                }
            }
        }
        java.util.Iterator it = this.f213982g.iterator();
        while (it.hasNext()) {
            com.tencent.mm.wallet_core.model.o1 o1Var = (com.tencent.mm.wallet_core.model.o1) it.next();
            if (com.tencent.mm.sdk.platformtools.t8.D0(str, o1Var.f213960c)) {
                this.f213982g.remove(o1Var);
                return;
            }
        }
    }

    public void d(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("cert_info");
        if (optJSONObject == null) {
            return;
        }
        this.f213982g = new java.util.Vector();
        int optInt = optJSONObject.optInt("show_crt_info");
        this.f213976a = optJSONObject.optInt("is_crt_install");
        this.f213980e = optJSONObject.optString("crt_item_logo_url");
        this.f213977b = optJSONObject.optString("crt_entry_desc");
        this.f213978c = optJSONObject.optString("crt_entry_title");
        this.f213979d = optJSONObject.optString("crt_status_name");
        int optInt2 = optJSONObject.optInt("use_cert_encrypt_type");
        com.tencent.mars.xlog.Log.i("NetSceneKindaGenDigitalCert", "encrypt type: %d", java.lang.Integer.valueOf(optInt2));
        com.tencent.mm.wallet_core.model.i iVar = com.tencent.mm.wallet_core.model.i.DigitalCertEncryptTypeRSA;
        com.tencent.mm.wallet_core.model.i iVar2 = (optInt2 < 0 || optInt2 > 2) ? iVar : com.tencent.mm.wallet_core.model.i.values()[optInt2];
        com.tencent.mm.wallet_core.model.i iVar3 = com.tencent.mm.wallet_core.model.i.DigitalCertEncryptTypeCa;
        if (iVar2 == iVar3) {
            this.f213981f = iVar3;
        } else {
            com.tencent.mm.wallet_core.model.i iVar4 = com.tencent.mm.wallet_core.model.i.DigitalCertEncryptTypeTw;
            if (iVar2 == iVar4) {
                this.f213981f = iVar4;
            } else {
                this.f213981f = iVar;
            }
        }
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLETDIGITAL_CERT_SHOW_INT_SYNC, java.lang.Integer.valueOf(optInt));
        java.lang.String b17 = b();
        org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("crt_list");
        if (optJSONArray != null) {
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                try {
                    com.tencent.mm.wallet_core.model.o1 o1Var = new com.tencent.mm.wallet_core.model.o1(optJSONArray.getJSONObject(i17));
                    java.lang.String str = o1Var.f213960c;
                    if (o1Var.f213961d == 0) {
                        this.f213982g.add(o1Var);
                    } else if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletDigCertManager", "drop crt list no exist local drop: %s", str);
                    } else if (str.equals(b17)) {
                        this.f213982g.add(o1Var);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletDigCertManager", "drop crt list %s drop: %s", b17, str);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletDigCertManager", "WalletDigCertManager error %s", e17.getMessage());
                }
            }
        }
    }
}
