package qz2;

/* loaded from: classes9.dex */
public class s implements pz2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI f367908d;

    public s(com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI) {
        this.f367908d = fingerPrintAuthTransparentUI;
    }

    @Override // pz2.b
    public void h(int i17, java.lang.String str) {
        com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI = this.f367908d;
        fingerPrintAuthTransparentUI.a7(false);
        if (i17 != 0) {
            fingerPrintAuthTransparentUI.b7(-1, str);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "cert ready and do openFP");
        com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI.W6(fingerPrintAuthTransparentUI);
        fingerPrintAuthTransparentUI.Z6();
    }
}
