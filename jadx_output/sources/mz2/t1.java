package mz2;

/* loaded from: classes9.dex */
public class t1 implements nz2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pz2.b f333189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mz2.w1 f333190b;

    public t1(mz2.w1 w1Var, pz2.b bVar) {
        this.f333190b = w1Var;
        this.f333189a = bVar;
    }

    @Override // nz2.b
    public void a(nz2.c cVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "authentication result: %s", java.lang.Integer.valueOf(cVar.f341543a));
        int i17 = cVar.f341543a;
        pz2.b bVar = this.f333189a;
        java.lang.String str = "";
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "identify success");
            mz2.w1 w1Var = this.f333190b;
            w1Var.getClass();
            w1Var.f333204g = cVar.f341547e;
            w1Var.f333205h = cVar.f341548f;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 40);
            bVar.h(0, "");
            return;
        }
        if (i17 != 2005) {
            if (i17 != 2007) {
                if (i17 == 2009) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: on error: %d", java.lang.Integer.valueOf(i17));
                    str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jiv);
                    re4.n.g(1000, -1000223, cVar.f341543a, "fingerprint error");
                    re4.n.a(3, 2);
                } else if (i17 != 10308) {
                    switch (i17) {
                        case 2000:
                        case 2001:
                            com.tencent.mars.xlog.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "identify timeout");
                            return;
                        case 2002:
                            com.tencent.mars.xlog.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "identify FingerPrintConst.RESULT_NO_MATCH");
                            bVar.h(-1, "");
                            return;
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: on error: %d", java.lang.Integer.valueOf(i17));
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jiv);
            if (cVar.f341543a == 10308) {
                java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jix);
                re4.n.g(6, -1000223, -1, "too many trial");
                bVar.h(-3, string2);
                return;
            } else {
                if (android.os.Build.VERSION.SDK_INT == 27 && "Xiaomi".equals(android.os.Build.MANUFACTURER)) {
                    string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.aiw);
                }
                str = string;
                re4.n.g(1000, -1000223, cVar.f341543a, "fingerprint error");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 39);
            }
        } else {
            str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jiz);
            re4.n.g(1000, -1000223, cVar.f341543a, "fingerprint error");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 39);
        }
        bVar.h(-2, str);
    }
}
