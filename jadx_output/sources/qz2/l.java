package qz2;

/* loaded from: classes9.dex */
public class l implements pz2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI f367885d;

    public l(com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI) {
        this.f367885d = fingerPrintAuthTransparentUI;
    }

    @Override // pz2.b
    public void h(int i17, java.lang.String str) {
        com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI = this.f367885d;
        if (i17 == 0) {
            int i18 = com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI.f136994s;
            fingerPrintAuthTransparentUI.Y6();
            return;
        }
        if (i17 == -1) {
            com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI.U6(fingerPrintAuthTransparentUI);
            return;
        }
        if (i17 != -3) {
            int i19 = com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI.f136994s;
            fingerPrintAuthTransparentUI.b7(com.tencent.mm.R.string.f_k, str);
            return;
        }
        int i27 = com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI.f136994s;
        fingerPrintAuthTransparentUI.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = fingerPrintAuthTransparentUI.getString(com.tencent.mm.R.string.f_k);
        }
        db5.e1.C(fingerPrintAuthTransparentUI, str, "", fingerPrintAuthTransparentUI.getString(com.tencent.mm.R.string.f493629l14), fingerPrintAuthTransparentUI.getString(com.tencent.mm.R.string.kmf), false, new qz2.g(fingerPrintAuthTransparentUI), new qz2.h(fingerPrintAuthTransparentUI));
    }
}
