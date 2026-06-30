package gu4;

/* loaded from: classes9.dex */
public class m implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI f275954d;

    public m(com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI fingerprintWalletLockUI) {
        this.f275954d = fingerprintWalletLockUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI.C;
        com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI fingerprintWalletLockUI = this.f275954d;
        fingerprintWalletLockUI.X6();
        fingerprintWalletLockUI.Y6(-1, 4, "need set finger print in system");
    }
}
