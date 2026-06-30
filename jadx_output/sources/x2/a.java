package x2;

/* loaded from: classes14.dex */
public class a implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout f451475a;

    public a(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout) {
        this.f451475a = coordinatorLayout;
    }

    @Override // n3.k0
    public n3.g3 a(android.view.View view, n3.g3 g3Var) {
        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = this.f451475a;
        if (!m3.c.a(coordinatorLayout.f10999s, g3Var)) {
            coordinatorLayout.f10999s = g3Var;
            boolean z17 = g3Var != null && g3Var.e() > 0;
            coordinatorLayout.f11000t = z17;
            coordinatorLayout.setWillNotDraw(!z17 && coordinatorLayout.getBackground() == null);
            if (!g3Var.f334338a.n()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    android.view.View childAt = coordinatorLayout.getChildAt(i17);
                    java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                    if (n3.u0.b(childAt) && ((androidx.coordinatorlayout.widget.c) childAt.getLayoutParams()).f11006a != null && g3Var.f334338a.n()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return g3Var;
    }
}
