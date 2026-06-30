package qz2;

/* loaded from: classes9.dex */
public final class g2 implements d50.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qz2.i2 f367867a;

    public g2(qz2.i2 i2Var) {
        this.f367867a = i2Var;
    }

    @Override // d50.p
    public void a(int i17) {
    }

    @Override // d50.p
    public void b(eu5.c result) {
        kotlin.jvm.internal.o.g(result, "result");
        int i17 = result.f475605a;
        qz2.i2 i2Var = this.f367867a;
        if (i17 == 1006) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletOpenTouchPayUIC", "hy: failed upload: model is null or necessary elements null");
            re4.n.g(4, -1000223, -1, "gen auth key failed: unexpected! generated but cannot get");
        } else if (i17 == 6) {
            re4.n.g(4, -1000223, -1, "gen auth key failed");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(result.f475606b)) {
                java.lang.String errMsg = result.f475606b;
                kotlin.jvm.internal.o.f(errMsg, "errMsg");
                if (r26.i0.y(errMsg, "java.security.ProviderException", false)) {
                    i2Var.O6(new qz2.v1(i2Var.getString(com.tencent.mm.R.string.aix)));
                    return;
                }
            }
            if (wt5.a.g() == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(result.f475606b) && kotlin.jvm.internal.o.b(result.f475606b, "errmsg not specified")) {
                i2Var.O6(new qz2.v1(i2Var.getString(com.tencent.mm.R.string.aiy)));
                return;
            }
        } else if (i17 == 1004) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletOpenTouchPayUIC", "hy: update pay auth key failed. remove");
            re4.n.g(5, 4, result.f475605a, "upload auth key failed");
        } else if (i17 == 4 || i17 == 3) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletOpenTouchPayUIC", "hy: gen auth key failed");
            re4.n.g(2, -1000223, -1, "gen ask failed");
        } else if (i17 == 1003) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletOpenTouchPayUIC", "upload ask failed");
            re4.n.g(3, 4, result.f475605a, result.f475606b);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletOpenTouchPayUIC", "unknown error when prepare auth key");
            re4.n.g(1000, -1000223, result.f475605a, result.f475606b);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 34);
        i2Var.O6(new qz2.v1(i2Var.getString(com.tencent.mm.R.string.aiw)));
    }

    @Override // d50.p
    public void c(eu5.c result) {
        kotlin.jvm.internal.o.g(result, "result");
        this.f367867a.P6(qz2.m1.f367890a);
    }
}
