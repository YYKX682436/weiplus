package im2;

/* loaded from: classes.dex */
public final class q3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f292506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292507e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnCancelListener f292508f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(boolean z17, im2.z3 z3Var, android.content.DialogInterface.OnCancelListener onCancelListener) {
        super(0);
        this.f292506d = z17;
        this.f292507e = z3Var;
        this.f292508f = onCancelListener;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f292506d;
        im2.z3 z3Var = this.f292507e;
        if (z17) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = z3Var.B1;
            android.content.DialogInterface.OnCancelListener onCancelListener = this.f292508f;
            if (u3Var == null) {
                z3Var.B1 = com.tencent.mm.ui.widget.dialog.u3.f(z3Var.getActivity(), z3Var.getActivity().getString(com.tencent.mm.R.string.f9y), true, 2, onCancelListener);
            } else {
                if (u3Var.isShowing() ? false : true) {
                    com.tencent.mm.ui.widget.dialog.u3 u3Var2 = z3Var.B1;
                    if (u3Var2 != null) {
                        u3Var2.setOnCancelListener(onCancelListener);
                    }
                    com.tencent.mm.ui.widget.dialog.u3 u3Var3 = z3Var.B1;
                    if (u3Var3 != null) {
                        u3Var3.show();
                    }
                }
            }
        } else {
            com.tencent.mm.ui.widget.dialog.u3 u3Var4 = z3Var.B1;
            if (u3Var4 != null) {
                u3Var4.dismiss();
            }
        }
        return jz5.f0.f302826a;
    }
}
