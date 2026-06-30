package dz4;

/* loaded from: classes5.dex */
public final class v1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f245436d;

    public v1(kotlin.jvm.internal.h0 h0Var) {
        this.f245436d = h0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        kotlin.jvm.internal.h0 h0Var = this.f245436d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) h0Var.f310123d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        h0Var.f310123d = null;
    }
}
