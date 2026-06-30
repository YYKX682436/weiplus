package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    public static com.tencent.mm.wallet_core.model.g f213896c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f213897d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f213898a = false;

    /* renamed from: b, reason: collision with root package name */
    public final com.tenpay.ndk.CertUtil.EventListener f213899b = new com.tencent.mm.wallet_core.model.f(this);

    public static com.tencent.mm.wallet_core.model.g c() {
        if (f213896c == null) {
            f213896c = new com.tencent.mm.wallet_core.model.g();
        }
        return f213896c;
    }

    public void a(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.z3.b(true);
        com.tenpay.ndk.CertUtil.getInstance().clearToken(str);
    }

    public java.lang.String b(java.lang.String str, int i17) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.CertUtilWx", "getCertApplyCSR lock %s %s", com.tencent.mm.sdk.platformtools.z3.b(true), java.lang.Integer.valueOf(i17));
        synchronized (this) {
            if (this.f213898a) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CertUtilWx", "isCert_Wating");
                return "";
            }
            this.f213898a = true;
            return com.tenpay.ndk.CertUtil.getInstance().getCertApplyCSR(str, i17);
        }
    }

    public int d() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.z3.b(true);
        return com.tenpay.ndk.CertUtil.getInstance().getLastError();
    }

    public boolean e(java.lang.String str, java.lang.String str2) {
        boolean importCert;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.CertUtilWx", "importCert  cid %s cert %s stack %s", str, str2, com.tencent.mm.sdk.platformtools.z3.b(true));
        synchronized (this) {
            this.f213898a = false;
            importCert = com.tenpay.ndk.CertUtil.getInstance().importCert(str, str2);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CertUtilWx", "importCert %s", java.lang.Boolean.valueOf(importCert));
        return importCert;
    }

    public void f(android.content.Context context) {
        if (f213897d) {
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.z3.b(true);
        com.tenpay.ndk.CertUtil.getInstance().init(context, this.f213899b);
        f213897d = true;
    }

    public boolean g(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.z3.b(true);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(414L, 5L, 1L, true);
        boolean isCertExist = com.tenpay.ndk.CertUtil.getInstance().isCertExist(str);
        g0Var.idkeyStat(414L, 6L, 1L, true);
        return isCertExist;
    }

    public boolean h(java.lang.String str, java.lang.String str2, boolean z17) {
        java.lang.String str3;
        if (z17) {
            com.tenpay.ndk.MessageDigestUtil messageDigestUtil = new com.tenpay.ndk.MessageDigestUtil();
            gm0.j1.i();
            byte[] bArr = new byte[16];
            byte[] bytes = messageDigestUtil.getSHA256Hex((kk.v.a(gm0.j1.b().h()) + "_pUI6cNqzLt2Z3mQSrYuF09XSGsBtTIcUgp9jcWZ7F7BBs8/DFVFMKiwbtaRPOiLE").getBytes()).getBytes();
            for (int i17 = 0; i17 < 16 && i17 < bytes.length; i17++) {
                bArr[i17] = bytes[i17];
            }
            str3 = new java.lang.String(bArr);
        } else {
            str3 = "";
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.z3.b(true);
        return com.tenpay.ndk.CertUtil.getInstance().setTokens(str, str2, z17, str3);
    }
}
