package te2;

/* loaded from: classes.dex */
public final class gc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f418045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.hc f418046e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnCancelListener f418047f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc(boolean z17, te2.hc hcVar, android.content.DialogInterface.OnCancelListener onCancelListener) {
        super(0);
        this.f418045d = z17;
        this.f418046e = hcVar;
        this.f418047f = onCancelListener;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f418045d;
        te2.hc hcVar = this.f418046e;
        if (z17) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = hcVar.K;
            android.content.DialogInterface.OnCancelListener onCancelListener = this.f418047f;
            if (u3Var == null) {
                hcVar.K = com.tencent.mm.ui.widget.dialog.u3.f(hcVar.getActivity(), hcVar.getActivity().getString(com.tencent.mm.R.string.f9y), true, 2, onCancelListener);
            } else {
                if (u3Var.isShowing() ? false : true) {
                    com.tencent.mm.ui.widget.dialog.u3 u3Var2 = hcVar.K;
                    if (u3Var2 != null) {
                        u3Var2.setOnCancelListener(onCancelListener);
                    }
                    com.tencent.mm.ui.widget.dialog.u3 u3Var3 = hcVar.K;
                    if (u3Var3 != null) {
                        u3Var3.show();
                    }
                }
            }
        } else {
            com.tencent.mm.ui.widget.dialog.u3 u3Var4 = hcVar.K;
            if (u3Var4 != null) {
                u3Var4.dismiss();
            }
        }
        return jz5.f0.f302826a;
    }
}
