package qz2;

/* loaded from: classes9.dex */
public class e0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fingerprint.ui.FingerPrintEntranceUI f367855d;

    public e0(com.tencent.mm.plugin.fingerprint.ui.FingerPrintEntranceUI fingerPrintEntranceUI) {
        this.f367855d = fingerPrintEntranceUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f367855d.finish();
    }
}
