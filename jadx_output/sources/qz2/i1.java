package qz2;

/* loaded from: classes9.dex */
public final class i1 implements nz2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qz2.j1 f367873a;

    public i1(qz2.j1 j1Var) {
        this.f367873a = j1Var;
    }

    @Override // nz2.b
    public final void a(nz2.c cVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "authentication result: %s", java.lang.Integer.valueOf(cVar.f341543a));
        int i17 = cVar.f341543a;
        qz2.j1 j1Var = this.f367873a;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "identify success");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 40);
            j1Var.P6(new qz2.o0(cVar.f341547e, cVar.f341548f));
            return;
        }
        if (i17 == 2005) {
            re4.n.g(1000, -1000223, i17, "fingerprint error");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 39);
            j1Var.O6(new qz2.v0(j1Var.getString(com.tencent.mm.R.string.jiz)));
            return;
        }
        if (i17 == 2007) {
            java.lang.String string = (android.os.Build.VERSION.SDK_INT == 27 && kotlin.jvm.internal.o.b("Xiaomi", android.os.Build.MANUFACTURER)) ? j1Var.getString(com.tencent.mm.R.string.aiw) : j1Var.getString(com.tencent.mm.R.string.jiv);
            re4.n.g(1000, -1000223, cVar.f341543a, "fingerprint error");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 39);
            j1Var.O6(new qz2.v0(string));
            return;
        }
        if (i17 == 10308) {
            re4.n.g(6, -1000223, -1, "too many trial");
            j1Var.O6(new qz2.w0(j1Var.getString(com.tencent.mm.R.string.jiy), j1Var.getString(com.tencent.mm.R.string.jix)));
            return;
        }
        if (i17 == 2009) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "hy: on error: %d", java.lang.Integer.valueOf(i17));
            re4.n.g(1000, -1000223, cVar.f341543a, "fingerprint error");
            re4.n.a(3, 2);
            j1Var.O6(new qz2.v0(j1Var.getString(com.tencent.mm.R.string.jiv)));
            return;
        }
        if (i17 != 2010) {
            switch (i17) {
                case 2000:
                case 2001:
                    break;
                case 2002:
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "identify FingerPrintConst.RESULT_NO_MATCH");
                    return;
                default:
                    j1Var.O6(new qz2.v0(j1Var.getString(com.tencent.mm.R.string.jiv)));
                    return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "identify timeout");
        j1Var.P6(new qz2.q0(cVar.f341543a));
    }
}
