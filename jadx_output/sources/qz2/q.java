package qz2;

/* loaded from: classes9.dex */
public class q implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f367902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI f367903e;

    public q(com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI, android.widget.CheckBox checkBox) {
        this.f367903e = fingerPrintAuthTransparentUI;
        this.f367902d = checkBox;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI.V6(this.f367903e, this.f367902d.isChecked());
    }
}
