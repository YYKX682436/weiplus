package qz2;

/* loaded from: classes9.dex */
public class u implements pz2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI f367912d;

    public u(com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI fingerPrintAuthUI) {
        this.f367912d = fingerPrintAuthUI;
    }

    @Override // pz2.b
    public void h(int i17, java.lang.String str) {
        com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI fingerPrintAuthUI = this.f367912d;
        fingerPrintAuthUI.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new qz2.v(fingerPrintAuthUI, false));
        if (i17 != 0) {
            fingerPrintAuthUI.U6(str, i17);
            return;
        }
        fingerPrintAuthUI.f137010f = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthUI", "hy: is screen on: %b", java.lang.Boolean.valueOf(!fingerPrintAuthUI.f137015n));
        if (true ^ fingerPrintAuthUI.f137015n) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintAuthUI", "request Identify2");
            fingerPrintAuthUI.f137013i.c(fingerPrintAuthUI.getContext(), new qz2.w(fingerPrintAuthUI));
        }
    }
}
