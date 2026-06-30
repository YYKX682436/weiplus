package gu4;

/* loaded from: classes9.dex */
public class n implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI f275955d;

    public n(com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI fingerprintWalletLockUI) {
        this.f275955d = fingerprintWalletLockUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "cancel not support fingerprint dialog");
        int i17 = com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI.C;
        com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI fingerprintWalletLockUI = this.f275955d;
        fingerprintWalletLockUI.X6();
        fingerprintWalletLockUI.Y6(0, 4, "user cancel reset wallet lock");
    }
}
