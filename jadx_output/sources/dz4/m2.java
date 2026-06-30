package dz4;

/* loaded from: classes11.dex */
public final class m2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.u2 f245351d;

    public m2(dz4.u2 u2Var) {
        this.f245351d = u2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        dz4.u2 u2Var = this.f245351d;
        kotlinx.coroutines.r2 r2Var = u2Var.f245429d;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = u2Var.f245427b;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        u2Var.f245427b = null;
    }
}
