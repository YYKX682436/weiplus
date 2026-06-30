package qz2;

/* loaded from: classes9.dex */
public class f0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fingerprint.ui.FingerPrintEntranceUI f367859d;

    public f0(com.tencent.mm.plugin.fingerprint.ui.FingerPrintEntranceUI fingerPrintEntranceUI) {
        this.f367859d = fingerPrintEntranceUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintEntranceUI", "user click the button to open fingerprint pay");
        com.tencent.mm.plugin.fingerprint.ui.FingerPrintEntranceUI fingerPrintEntranceUI = this.f367859d;
        j45.l.h(fingerPrintEntranceUI, "wallet", ".pwd.ui.WalletPasswordSettingUI");
        fingerPrintEntranceUI.finish();
    }
}
