package qz2;

/* loaded from: classes9.dex */
public class d0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fingerprint.ui.FingerPrintEntranceUI f367851d;

    public d0(com.tencent.mm.plugin.fingerprint.ui.FingerPrintEntranceUI fingerPrintEntranceUI) {
        this.f367851d = fingerPrintEntranceUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerPrintEntranceUI", "user click the button to set system fingerprint");
        int i18 = com.tencent.mm.plugin.fingerprint.ui.FingerPrintEntranceUI.f137016d;
        com.tencent.mm.plugin.fingerprint.ui.FingerPrintEntranceUI fingerPrintEntranceUI = this.f367851d;
        fingerPrintEntranceUI.getClass();
        ((pz2.a) gm0.j1.s(pz2.a.class)).dc(fingerPrintEntranceUI);
        fingerPrintEntranceUI.finish();
    }
}
