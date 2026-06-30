package mz2;

/* loaded from: classes9.dex */
public class u1 implements d50.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mz2.w1 f333191a;

    public u1(mz2.w1 w1Var) {
        this.f333191a = w1Var;
    }

    @Override // d50.p
    public void a(int i17) {
    }

    @Override // d50.p
    public void b(eu5.c cVar) {
        int i17 = cVar.f475605a;
        mz2.w1 w1Var = this.f333191a;
        if (i17 == 1006) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterFingerprintOpenDelegate", "hy: failed upload: model is null or necessary elements null");
            re4.n.g(4, -1000223, -1, "gen auth key failed: unexpected! generated but cannot get");
        } else if (i17 == 6) {
            re4.n.g(4, -1000223, -1, "gen auth key failed");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(cVar.f475606b) && cVar.f475606b.startsWith("java.security.ProviderException")) {
                w1Var.d(-2, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.aix));
                return;
            } else if (wt5.a.g() == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(cVar.f475606b) && cVar.f475606b.equals("errmsg not specified")) {
                w1Var.d(-2, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.aiy));
                return;
            }
        } else if (i17 == 1004) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterFingerprintOpenDelegate", "hy: update pay auth key failed. remove");
            re4.n.g(5, 4, cVar.f475605a, "upload auth key failed");
        } else if (i17 == 4 || i17 == 3) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterFingerprintOpenDelegate", "hy: gen auth key failed");
            re4.n.g(2, -1000223, -1, "gen ask failed");
        } else if (i17 == 1003) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterFingerprintOpenDelegate", "upload ask failed");
            re4.n.g(3, 4, cVar.f475605a, cVar.f475606b);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterFingerprintOpenDelegate", "unknown error when prepare auth key");
            re4.n.g(1000, -1000223, cVar.f475605a, cVar.f475606b);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 34);
        w1Var.d(-1, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.aiw));
    }

    @Override // d50.p
    public void c(eu5.c cVar) {
        mz2.w1 w1Var = this.f333191a;
        java.lang.ref.WeakReference weakReference = w1Var.f333198a;
        if (weakReference == null || weakReference.get() == null) {
            w1Var.d(-1, "base ui is null");
            return;
        }
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = (com.tencent.mm.wallet_core.ui.WalletBaseUI) w1Var.f333198a.get();
        ((d50.i) ((d50.k) i95.n0.c(d50.k.class))).getClass();
        walletBaseUI.doSceneProgress(new oz2.a(1), false);
    }
}
