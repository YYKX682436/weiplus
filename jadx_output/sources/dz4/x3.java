package dz4;

/* loaded from: classes11.dex */
public final class x3 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.h4 f245459d;

    public x3(dz4.h4 h4Var) {
        this.f245459d = h4Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        dz4.h4 h4Var = this.f245459d;
        kotlinx.coroutines.r2 r2Var = h4Var.f245289g;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = h4Var.f245287e;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        h4Var.f245287e = null;
    }
}
