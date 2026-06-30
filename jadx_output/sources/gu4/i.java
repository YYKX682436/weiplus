package gu4;

/* loaded from: classes9.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI f275951d;

    public i(com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI fingerprintWalletLockUI) {
        this.f275951d = fingerprintWalletLockUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/walletlock/fingerprint/ui/FingerprintWalletLockUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI.C;
        this.f275951d.f7(1);
        yj0.a.h(this, "com/tencent/mm/plugin/walletlock/fingerprint/ui/FingerprintWalletLockUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
