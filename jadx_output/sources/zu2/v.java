package zu2;

/* loaded from: classes3.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zu2.a0 f475751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(zu2.a0 a0Var) {
        super(0);
        this.f475751d = a0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view;
        android.view.View view2;
        zu2.a0 a0Var = this.f475751d;
        if (java.lang.Math.max(a0Var.f475699n - a0Var.f475701p, 0) > 0) {
            a0Var.f475700o = false;
            android.widget.TextView textView = a0Var.f475695g;
            if (textView != null) {
                textView.setText(a0Var.getResources().getString(com.tencent.mm.R.string.f491259ck1, java.lang.String.valueOf(java.lang.Math.max(a0Var.f475699n - a0Var.f475701p, 0))));
            }
        } else {
            a0Var.f475700o = true;
            android.widget.TextView textView2 = a0Var.f475695g;
            if (textView2 != null) {
                textView2.setText(a0Var.getResources().getString(com.tencent.mm.R.string.f491260ck2));
            }
        }
        jx2.j jVar = a0Var.f475696h;
        if (jVar != null && (view = a0Var.f475697i) != null && (view2 = a0Var.f475698m) != null && jVar.isShowing()) {
            view2.post(new zu2.z(view, view2, jVar));
        }
        return jz5.f0.f302826a;
    }
}
