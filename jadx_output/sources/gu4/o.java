package gu4;

/* loaded from: classes9.dex */
public class o implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI f275956d;

    public o(com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI fingerprintWalletLockUI) {
        this.f275956d = fingerprintWalletLockUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "user click set gesture");
        ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().d(this.f275956d, 1, 4);
    }
}
