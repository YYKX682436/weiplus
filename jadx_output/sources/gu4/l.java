package gu4;

/* loaded from: classes9.dex */
public class l implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI f275953d;

    public l(com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI fingerprintWalletLockUI) {
        this.f275953d = fingerprintWalletLockUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI.C;
        com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI fingerprintWalletLockUI = this.f275953d;
        fingerprintWalletLockUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_wallet_lock_setting_scene", 1);
        ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().a(fingerprintWalletLockUI, intent, 3);
    }
}
