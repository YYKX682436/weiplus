package ms4;

/* loaded from: classes8.dex */
public final class i0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f331042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ms4.j0 f331043e;

    public i0(android.app.Activity activity, ms4.j0 j0Var) {
        this.f331042d = activity;
        this.f331043e = j0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        android.app.Activity activity = this.f331042d;
        boolean isFinishing = activity.isFinishing();
        ms4.j0 j0Var = this.f331043e;
        if (!isFinishing && !activity.isDestroyed()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinMidasInitializer", "cancelPrepareRecharge, mPrepareCgi: " + j0Var.f331050d);
            ks4.h hVar = j0Var.f331050d;
            if (hVar != null) {
                hVar.j();
            }
            activity.finish();
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = j0Var.f331049c;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        u3Var.dismiss();
        j0Var.f331049c = null;
    }
}
