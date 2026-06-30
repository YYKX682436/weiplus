package qw3;

/* loaded from: classes9.dex */
public class f0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qw3.g0 f367155d;

    public f0(qw3.g0 g0Var) {
        this.f367155d = g0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitBankcardInputUI", "coperationTipDialogNoTransparent onCancel()");
        qw3.g0 g0Var = this.f367155d;
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI = g0Var.f367159e;
        bankRemitBankcardInputUI.T = false;
        bankRemitBankcardInputUI.S = false;
        android.app.Dialog dialog = bankRemitBankcardInputUI.D;
        if (dialog != null && dialog.isShowing()) {
            g0Var.f367159e.D.dismiss();
        }
        if (g0Var.f367159e.getContentView().getVisibility() == 8 || g0Var.f367159e.getContentView().getVisibility() == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitBankcardInputUI", "usr cancel, & visibility not visiable, so finish");
            g0Var.f367159e.finish();
        }
        g0Var.f367159e.forceCancel();
    }
}
