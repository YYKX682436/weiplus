package qz2;

/* loaded from: classes9.dex */
public class g0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fingerprint.ui.FingerPrintEntranceUI f367864d;

    public g0(com.tencent.mm.plugin.fingerprint.ui.FingerPrintEntranceUI fingerPrintEntranceUI) {
        this.f367864d = fingerPrintEntranceUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f367864d.finish();
    }
}
