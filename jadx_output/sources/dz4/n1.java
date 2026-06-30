package dz4;

/* loaded from: classes5.dex */
public final class n1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.o1 f245355d;

    public n1(dz4.o1 o1Var) {
        this.f245355d = o1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        dz4.o1 o1Var = this.f245355d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = o1Var.f245362c;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        o1Var.f245362c = null;
    }
}
