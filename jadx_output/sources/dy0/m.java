package dy0;

/* loaded from: classes10.dex */
public final class m extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final int f244558n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context, int i17) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f244558n = i17;
    }

    @Override // androidx.recyclerview.widget.o1, androidx.recyclerview.widget.g3
    public void e(android.view.View targetView, androidx.recyclerview.widget.h3 state, androidx.recyclerview.widget.e3 action) {
        int e17;
        kotlin.jvm.internal.o.g(targetView, "targetView");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f12051c;
        if (layoutManager == null) {
            return;
        }
        androidx.recyclerview.widget.w1 v1Var = layoutManager.getF123307r() ? new androidx.recyclerview.widget.v1(layoutManager) : layoutManager.getF98486n() ? new androidx.recyclerview.widget.u1(layoutManager) : null;
        if (v1Var == null) {
            e17 = 0;
        } else {
            e17 = (v1Var.e(targetView) + (v1Var.c(targetView) / 2)) - (layoutManager.getClipToPadding() ? v1Var.k() + (v1Var.l() / 2) : v1Var.f() / 2);
        }
        int i17 = this.f244558n;
        int max = i17 <= 0 ? 1 : java.lang.Math.max(k(e17), i17);
        boolean f123307r = layoutManager.getF123307r();
        android.view.animation.DecelerateInterpolator decelerateInterpolator = this.f12176i;
        if (f123307r) {
            action.b(0, e17, max, decelerateInterpolator);
        } else {
            action.b(e17, 0, max, decelerateInterpolator);
        }
    }
}
