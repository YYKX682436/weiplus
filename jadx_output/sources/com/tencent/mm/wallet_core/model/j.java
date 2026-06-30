package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public class j {

    /* renamed from: c, reason: collision with root package name */
    public static com.tencent.mm.wallet_core.model.j f213917c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f213918d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f213919a = false;

    /* renamed from: b, reason: collision with root package name */
    public final com.tenpay.ndk.CertUtil.EventListener f213920b = new com.tencent.mm.wallet_core.model.h(this);

    public static com.tencent.mm.wallet_core.model.j b() {
        if (f213917c == null) {
            f213917c = new com.tencent.mm.wallet_core.model.j();
        }
        return f213917c;
    }

    public java.lang.String a(java.lang.String str, byte[] bArr) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.z3.b(true);
        gm0.j1.i();
        int ordinal = com.tencent.mm.wallet_core.model.i.values()[gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_WALLETDIGITAL_CERT_ENCRYPT_TYPE_INT_SYNC, 0)].ordinal();
        if (ordinal != 1 && ordinal != 2) {
            return com.tenpay.ndk.CertUtil.getInstance().genUserSig(str, bArr);
        }
        byte[] certSign = com.tenpay.ndk.WxSmCertUtil.getInstance().certSign(str, bArr, "1234567812345678".getBytes());
        if (com.tencent.mm.sdk.platformtools.t8.M0(certSign)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CertUtilWx", "signData is nil");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(37113, 4, java.lang.Integer.valueOf(com.tenpay.ndk.WxSmCertUtil.getInstance().getLastError()), 1);
            return "";
        }
        java.lang.String encodeToString = android.util.Base64.encodeToString(certSign, 2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(encodeToString)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CertUtilWx", "genUserSig is nil");
        }
        return encodeToString;
    }

    public int c() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.z3.b(true);
        gm0.j1.i();
        int ordinal = com.tencent.mm.wallet_core.model.i.values()[gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_WALLETDIGITAL_CERT_ENCRYPT_TYPE_INT_SYNC, 0)].ordinal();
        return (ordinal == 1 || ordinal == 2) ? com.tenpay.ndk.WxSmCertUtil.getInstance().getLastError() : com.tenpay.ndk.CertUtil.getInstance().getLastError();
    }

    public boolean d(java.lang.String str, java.lang.String str2, com.tencent.mm.wallet_core.model.i iVar) {
        boolean importCert;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(iVar.ordinal());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.CertUtilWx", "importCert  cid %s cert %s certType %d stack %s", str, str2, valueOf, com.tencent.mm.sdk.platformtools.z3.b(true));
        synchronized (this) {
            this.f213919a = false;
            int ordinal = iVar.ordinal();
            if (ordinal == 1 || ordinal == 2) {
                importCert = com.tenpay.ndk.WxSmCertUtil.getInstance().importCert(str, str2, false);
                if (!importCert) {
                    int lastError = com.tenpay.ndk.WxSmCertUtil.getInstance().getLastError();
                    com.tencent.mars.xlog.Log.i("MicroMsg.CertUtilWx", "importCert error %d", java.lang.Integer.valueOf(lastError));
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(37113, 1, java.lang.Integer.valueOf(lastError), 1);
                }
            } else {
                importCert = com.tenpay.ndk.CertUtil.getInstance().importCert(str, str2);
                if (!importCert) {
                    int lastError2 = com.tenpay.ndk.CertUtil.getInstance().getLastError();
                    com.tencent.mars.xlog.Log.i("MicroMsg.CertUtilWx", "importCert error %d", java.lang.Integer.valueOf(lastError2));
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(37113, 1, java.lang.Integer.valueOf(lastError2), 2);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CertUtilWx", "importCert %s", java.lang.Boolean.valueOf(importCert));
        return importCert;
    }

    public void e(android.content.Context context) {
        if (f213918d) {
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.z3.b(true);
        com.tenpay.ndk.CertUtil.getInstance().init(context, this.f213920b);
        java.lang.String str = context.getFilesDir().getParentFile().getAbsolutePath() + "/smcertnew";
        com.tenpay.ndk.WxSmCertUtil wxSmCertUtil = com.tenpay.ndk.WxSmCertUtil.getInstance();
        java.lang.String g17 = wo.w0.g(false);
        if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
            g17 = wo.w0.k();
        }
        if (!wxSmCertUtil.init(str, g17, "", "1234567812345678")) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(37113, 3, java.lang.Integer.valueOf(com.tenpay.ndk.WxSmCertUtil.getInstance().getLastError()), 1);
        }
        f213918d = true;
    }

    public boolean f(java.lang.String str) {
        if (str.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CertUtilWx", "cid length is 0");
            return false;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.z3.b(true);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(414L, 5L, 1L, true);
        if (com.tenpay.ndk.CertUtil.getInstance().isCertExist(str)) {
            g0Var.idkeyStat(414L, 6L, 1L, true);
            return true;
        }
        if (!com.tenpay.ndk.WxSmCertUtil.getInstance().hasCert(str)) {
            return false;
        }
        g0Var.idkeyStat(414L, 6L, 1L, true);
        return true;
    }

    public java.lang.String g(java.lang.String str, java.lang.String str2, com.tencent.mm.wallet_core.model.i iVar, int i17) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.CertUtilWx", "makeCSR lock %s %s", com.tencent.mm.sdk.platformtools.z3.b(true), java.lang.Integer.valueOf(i17));
        synchronized (this) {
            if (this.f213919a) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CertUtilWx", "isCert_Wating");
                return "";
            }
            this.f213919a = true;
            int ordinal = iVar.ordinal();
            if (ordinal == 1 || ordinal == 2) {
                java.lang.String makeCsr = com.tenpay.ndk.WxSmCertUtil.getInstance().makeCsr(str, str2);
                if (com.tencent.mm.sdk.platformtools.t8.K0(makeCsr)) {
                    int lastError = com.tenpay.ndk.WxSmCertUtil.getInstance().getLastError();
                    com.tencent.mars.xlog.Log.i("MicroMsg.CertUtilWx", "csr nil.%d", java.lang.Integer.valueOf(lastError));
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(37113, 2, java.lang.Integer.valueOf(lastError), 1);
                }
                return makeCsr;
            }
            java.lang.String certApplyCSR = com.tenpay.ndk.CertUtil.getInstance().getCertApplyCSR(str2, i17);
            if (com.tencent.mm.sdk.platformtools.t8.K0(certApplyCSR)) {
                int lastError2 = com.tenpay.ndk.CertUtil.getInstance().getLastError();
                com.tencent.mars.xlog.Log.i("MicroMsg.CertUtilWx", "csr nil.%d", java.lang.Integer.valueOf(lastError2));
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(37113, 2, java.lang.Integer.valueOf(lastError2), 2);
            }
            return certApplyCSR;
        }
    }
}
