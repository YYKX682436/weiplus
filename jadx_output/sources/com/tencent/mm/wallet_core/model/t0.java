package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public class t0 extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public final int f213988d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.wallet_core.model.i f213989e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f213990f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.wallet_core.model.s0 f213991g;

    public t0(java.lang.String str, int i17, java.lang.String str2, com.tencent.mm.wallet_core.model.i iVar) {
        this.f213988d = 0;
        this.f213989e = com.tencent.mm.wallet_core.model.i.DigitalCertEncryptTypeRSA;
        this.f213990f = true;
        this.f213991g = null;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Map<java.lang.String, java.lang.String> hashMap2 = new java.util.HashMap<>();
        this.f213988d = 1;
        this.f213989e = iVar;
        baseRequset(hashMap);
        hashMap.put("type", fp.s0.a("1"));
        hashMap.put("id_no", fp.s0.a(str));
        hashMap.put("id_type", fp.s0.a(i17 + ""));
        hashMap.put("cert_encrypt_type", fp.s0.a(iVar.ordinal() + ""));
        setRequestData(hashMap);
        setWXRequestData(hashMap2);
    }

    public final void baseRequset(java.util.Map map) {
        java.lang.String g17;
        gm0.j1.i();
        java.lang.String a17 = kk.v.a(gm0.j1.b().h());
        java.lang.String g18 = wo.w0.g(false);
        byte[] bArr = new byte[16];
        byte[] bytes = com.tencent.mm.wallet_core.model.f1.a().getBytes();
        if (bytes == null || bytes.length <= 0) {
            bytes = ("" + java.lang.System.currentTimeMillis()).getBytes();
        }
        int i17 = 0;
        int i18 = 0;
        do {
            bArr[i18] = bytes[i17];
            i18++;
            i17++;
            if (i17 >= bytes.length) {
                i17 = 0;
            }
        } while (i18 < 16);
        java.lang.String str = new java.lang.String(bArr);
        java.lang.String a18 = com.tencent.mm.sdk.platformtools.w2.a(a17 + g18);
        java.lang.String a19 = com.tencent.mm.sdk.platformtools.w2.a(a17 + g18 + bArr);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SN=");
        sb6.append(a19);
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.wallet_core.model.i iVar = this.f213989e;
        int ordinal = iVar.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            g17 = com.tencent.mm.wallet_core.model.j.b().g("WeChatPay", sb7, iVar, 0);
        } else {
            java.lang.String a27 = com.tencent.mm.sdk.platformtools.w2.a(a17 + a18 + new java.lang.String(bArr));
            com.tencent.mm.wallet_core.b.a().getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.TenPaySdkAbTest", "isCertOpen2048 %s", java.lang.Boolean.TRUE);
            g17 = com.tencent.mm.wallet_core.model.j.b().g("WeChatPay", a27, iVar, 1);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGendigitalcert", "salt ".concat(new java.lang.String(bArr)));
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGendigitalcert", "crt_csr: %s", g17);
        try {
            map.put("sn_salt", fp.s0.a(str));
            map.put("crt_csr", fp.s0.a(g17));
            map.put("crt_device_id", a18);
            int i19 = o45.wf.f343023a;
            map.put("device_os", wo.q.f447780a);
            map.put("device_name", o45.wf.f343027e);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return fe1.o.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return fe1.o.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/gendigitalcert";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public boolean isBlock() {
        return this.f213990f;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGendigitalcert", "errCode %d errMsg %s", java.lang.Integer.valueOf(i17), str);
        try {
            java.lang.String optString = jSONObject.optString("crt_crt");
            java.lang.String optString2 = jSONObject.optString("crt_no");
            com.tencent.mm.wallet_core.model.i iVar = com.tencent.mm.wallet_core.model.i.values()[jSONObject.optInt("cert_encrypt_type")];
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(414L, 0L, 1L, true);
            if (com.tencent.mm.wallet_core.model.j.b().d(optString2, optString, iVar)) {
                g0Var.idkeyStat(414L, 1L, 1L, true);
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGendigitalcert", "importCert crt_crt success");
                com.tencent.mm.wallet_core.model.p1.e(optString2, iVar);
            } else {
                g0Var.idkeyStat(414L, 2L, 1L, true);
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGendigitalcert", "importCert crt_crt fail");
            }
            int i18 = this.f213988d;
            if (i18 == 1) {
                g0Var.d(13731, 3);
            } else if (i18 == 2) {
                g0Var.d(13731, 7);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGendigitalcert", "_crt_crt %s _crt_no %s", com.tencent.mm.sdk.platformtools.w2.a(optString), optString2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneGendigitalcert", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd2(com.tencent.mm.wallet_core.model.o oVar, org.json.JSONObject jSONObject) {
        com.tencent.mm.wallet_core.model.j b17 = com.tencent.mm.wallet_core.model.j.b();
        synchronized (b17) {
            b17.f213919a = false;
        }
        if (oVar.f213953b != 0) {
            int i17 = this.f213988d;
            if (i17 == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13731, 4);
            } else if (i17 == 2) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13731, 8);
            }
        }
        com.tencent.mm.wallet_core.model.s0 s0Var = this.f213991g;
        if (s0Var != null) {
            if (!this.f213990f) {
                s0Var.a(this, true);
            } else if (oVar.f213953b == 0) {
                s0Var.a(this, true);
            }
        }
    }

    public t0(java.lang.String str, java.lang.String str2, com.tencent.mm.wallet_core.model.s0 s0Var, boolean z17, com.tencent.mm.wallet_core.model.i iVar) {
        this.f213988d = 0;
        this.f213989e = com.tencent.mm.wallet_core.model.i.DigitalCertEncryptTypeRSA;
        this.f213990f = true;
        this.f213991g = null;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Map<java.lang.String, java.lang.String> hashMap2 = new java.util.HashMap<>();
        this.f213990f = z17;
        this.f213988d = 2;
        this.f213989e = iVar;
        baseRequset(hashMap);
        hashMap.put("type", fp.s0.a("2"));
        hashMap.put("crt_sms", fp.s0.a(str));
        hashMap.put("reqkey", fp.s0.a(str2));
        hashMap.put("cert_encrypt_type", fp.s0.a(iVar.ordinal() + ""));
        this.f213991g = s0Var;
        setRequestData(hashMap);
        setWXRequestData(hashMap2);
    }

    public t0(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.wallet_core.model.s0 s0Var, boolean z17) {
        this.f213988d = 0;
        this.f213989e = com.tencent.mm.wallet_core.model.i.DigitalCertEncryptTypeRSA;
        this.f213990f = true;
        this.f213991g = null;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Map<java.lang.String, java.lang.String> hashMap2 = new java.util.HashMap<>();
        this.f213988d = 4;
        this.f213991g = s0Var;
        this.f213990f = z17;
        baseRequset(hashMap);
        hashMap.put("type", fp.s0.a("4"));
        hashMap.put("id_type", fp.s0.a(str));
        hashMap.put("cre_tail", fp.s0.a(str2));
        hashMap.put("reqkey", fp.s0.a(str3));
        setRequestData(hashMap);
        setWXRequestData(hashMap2);
    }
}
