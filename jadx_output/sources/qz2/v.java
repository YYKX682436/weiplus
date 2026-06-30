package qz2;

/* loaded from: classes9.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f367915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI f367916e;

    public v(com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI fingerPrintAuthUI, boolean z17) {
        this.f367916e = fingerPrintAuthUI;
        this.f367915d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f367915d;
        com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI fingerPrintAuthUI = this.f367916e;
        if (z17) {
            fingerPrintAuthUI.f137009e = com.tencent.mm.wallet_core.ui.b2.e(fingerPrintAuthUI, false, false, null);
            return;
        }
        android.app.Dialog dialog = fingerPrintAuthUI.f137009e;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        fingerPrintAuthUI.f137009e.dismiss();
        fingerPrintAuthUI.f137009e = null;
    }
}
