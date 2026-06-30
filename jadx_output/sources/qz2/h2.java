package qz2;

/* loaded from: classes9.dex */
public final class h2 implements nz2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qz2.i2 f367871a;

    public h2(qz2.i2 i2Var) {
        this.f367871a = i2Var;
    }

    @Override // nz2.b
    public final void a(nz2.c cVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenTouchPayUIC", "authentication result: %s", java.lang.Integer.valueOf(cVar.f341543a));
        int i17 = cVar.f341543a;
        qz2.i2 i2Var = this.f367871a;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenTouchPayUIC", "identify success");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 40);
            i2Var.P6(new qz2.o1(cVar.f341547e, cVar.f341548f));
            return;
        }
        if (i17 == 2005) {
            re4.n.g(1000, -1000223, i17, "fingerprint error");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 39);
            i2Var.O6(new qz2.v1(i2Var.getString(com.tencent.mm.R.string.jiz)));
            return;
        }
        if (i17 == 2007) {
            java.lang.String string = (android.os.Build.VERSION.SDK_INT == 27 && kotlin.jvm.internal.o.b("Xiaomi", android.os.Build.MANUFACTURER)) ? i2Var.getString(com.tencent.mm.R.string.aiw) : i2Var.getString(com.tencent.mm.R.string.jiv);
            re4.n.g(1000, -1000223, cVar.f341543a, "fingerprint error");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 39);
            i2Var.O6(new qz2.v1(string));
            return;
        }
        if (i17 == 10308) {
            re4.n.g(6, -1000223, -1, "too many trial");
            i2Var.O6(new qz2.w1(i2Var.getString(com.tencent.mm.R.string.jiy), i2Var.getString(com.tencent.mm.R.string.jix)));
            return;
        }
        if (i17 == 2009) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenTouchPayUIC", "hy: on error: %d", java.lang.Integer.valueOf(i17));
            re4.n.g(1000, -1000223, cVar.f341543a, "fingerprint error");
            re4.n.a(3, 2);
            i2Var.O6(new qz2.v1(i2Var.getString(com.tencent.mm.R.string.jiv)));
            return;
        }
        if (i17 != 2010) {
            switch (i17) {
                case 2000:
                case 2001:
                    break;
                case 2002:
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenTouchPayUIC", "identify FingerPrintConst.RESULT_NO_MATCH");
                    return;
                default:
                    i2Var.O6(new qz2.v1(i2Var.getString(com.tencent.mm.R.string.jiv)));
                    return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenTouchPayUIC", "identify timeout");
        i2Var.P6(new qz2.q1(cVar.f341543a));
    }
}
