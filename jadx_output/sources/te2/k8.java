package te2;

/* loaded from: classes.dex */
public final class k8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f418171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418172e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnCancelListener f418173f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(boolean z17, te2.p8 p8Var, android.content.DialogInterface.OnCancelListener onCancelListener) {
        super(0);
        this.f418171d = z17;
        this.f418172e = p8Var;
        this.f418173f = onCancelListener;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f418171d;
        te2.p8 p8Var = this.f418172e;
        if (z17) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = p8Var.D1;
            android.content.DialogInterface.OnCancelListener onCancelListener = this.f418173f;
            if (u3Var == null) {
                p8Var.D1 = com.tencent.mm.ui.widget.dialog.u3.f(p8Var.getActivity(), p8Var.getActivity().getString(com.tencent.mm.R.string.f9y), true, 2, onCancelListener);
            } else {
                if (u3Var.isShowing() ? false : true) {
                    com.tencent.mm.ui.widget.dialog.u3 u3Var2 = p8Var.D1;
                    if (u3Var2 != null) {
                        u3Var2.setOnCancelListener(onCancelListener);
                    }
                    com.tencent.mm.ui.widget.dialog.u3 u3Var3 = p8Var.D1;
                    if (u3Var3 != null) {
                        u3Var3.show();
                    }
                }
            }
        } else {
            com.tencent.mm.ui.widget.dialog.u3 u3Var4 = p8Var.D1;
            if (u3Var4 != null) {
                u3Var4.dismiss();
            }
        }
        return jz5.f0.f302826a;
    }
}
