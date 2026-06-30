package qz2;

/* loaded from: classes9.dex */
public class c extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI f367846d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI) {
        super(false);
        this.f367846d = fingerPrintAuthTransparentUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI = this.f367846d;
        com.tencent.mm.ui.widget.dialog.k2 k2Var = fingerPrintAuthTransparentUI.f136996e;
        if (k2Var != null) {
            k2Var.cancel();
        }
        fingerPrintAuthTransparentUI.c7();
        fingerPrintAuthTransparentUI.finish();
    }
}
