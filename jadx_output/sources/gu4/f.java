package gu4;

/* loaded from: classes9.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI f275948d;

    public f(com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI fingerprintWalletLockUI) {
        this.f275948d = fingerprintWalletLockUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        fu4.a.b();
        fu4.a.a(this.f275948d.f181300s);
        fu4.a.f266884a = -1L;
        com.tencent.mm.plugin.walletlock.model.l.instance.l(true);
    }
}
