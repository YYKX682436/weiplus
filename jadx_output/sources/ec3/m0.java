package ec3;

/* loaded from: classes2.dex */
public final class m0 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f251056d;

    public m0(ec3.g1 g1Var) {
        this.f251056d = g1Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        ec3.g1 g1Var = this.f251056d;
        android.widget.LinearLayout Y6 = g1Var.Y6();
        if (Y6 != null) {
            Y6.setPressed(true);
        }
        android.widget.LinearLayout Y62 = g1Var.Y6();
        if (Y62 != null) {
            Y62.performClick();
        }
        android.widget.LinearLayout Y63 = g1Var.Y6();
        if (Y63 != null) {
            Y63.postDelayed(new ec3.l0(g1Var), 120L);
        }
    }
}
