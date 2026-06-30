package zl2;

/* loaded from: classes3.dex */
public final class x3 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f474023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f474024e;

    public x3(kotlinx.coroutines.r2 r2Var, kotlin.jvm.internal.h0 h0Var) {
        this.f474023d = r2Var;
        this.f474024e = h0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        kotlinx.coroutines.r2 r2Var = this.f474023d;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) this.f474024e.f310123d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }
}
