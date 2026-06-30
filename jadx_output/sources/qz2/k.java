package qz2;

/* loaded from: classes9.dex */
public class k implements pz2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI f367883a;

    public k(com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI) {
        this.f367883a = fingerPrintAuthTransparentUI;
    }

    @Override // pz2.c
    public void a(int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI = this.f367883a;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "identify success");
            fingerPrintAuthTransparentUI.f136999h = i18;
            fingerPrintAuthTransparentUI.c7();
            com.tencent.mm.ui.widget.dialog.k2 k2Var = fingerPrintAuthTransparentUI.f136996e;
            if (k2Var != null && k2Var.isShowing()) {
                fingerPrintAuthTransparentUI.f136996e.dismiss();
            }
            fingerPrintAuthTransparentUI.Y6();
            return;
        }
        if (i17 == 2005) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jiz);
            re4.n.g(1000, -1000223, i17, "fingerprint error");
            int i28 = com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI.f136994s;
            fingerPrintAuthTransparentUI.b7(-1, string);
            return;
        }
        if (i17 != 2007) {
            if (i17 == 2009) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "hy: on error: %d", java.lang.Integer.valueOf(i17));
                java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jiv);
                re4.n.g(1000, -1000223, i17, "fingerprint error");
                re4.n.a(3, 2);
                int i29 = com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI.f136994s;
                fingerPrintAuthTransparentUI.b7(-1, string2);
                return;
            }
            if (i17 != 10308) {
                if (i17 == 2001) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "identify timeout");
                    return;
                }
                if (i17 != 2002) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "identify FingerPrintConst.RESULT_NO_MATCH");
                com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI.U6(fingerPrintAuthTransparentUI);
                pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
                aVar.userCancel();
                if (!aVar.yh()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FingerPrintAuthTransparentUI", "no fingerprints enrolled, use settings to enroll fingerprints first");
                    return;
                } else {
                    if (aVar.dg(fingerPrintAuthTransparentUI.f137006r, 0, true) != 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.FingerPrintAuthTransparentUI", "startFingerprintAuth failed!");
                        return;
                    }
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "hy: on error: %d", java.lang.Integer.valueOf(i17));
        java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jiv);
        if (i17 == 10308) {
            string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jiw);
            re4.n.g(6, -1000223, -1, "too many trial");
        } else {
            re4.n.g(1000, -1000223, i17, "fingerprint error");
        }
        int i37 = com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI.f136994s;
        fingerPrintAuthTransparentUI.b7(-1, string3);
    }
}
