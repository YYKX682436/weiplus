package mx0;

/* loaded from: classes10.dex */
public final class z9 extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ mx0.aa f332478n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(mx0.aa aaVar, android.content.Context context) {
        super(context);
        this.f332478n = aaVar;
    }

    @Override // androidx.recyclerview.widget.o1, androidx.recyclerview.widget.g3
    public void e(android.view.View targetView, androidx.recyclerview.widget.h3 state, androidx.recyclerview.widget.e3 action) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
        int[] c17;
        java.lang.Integer S;
        kotlin.jvm.internal.o.g(targetView, "targetView");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        mx0.aa aaVar = this.f332478n;
        androidx.recyclerview.widget.RecyclerView recyclerView = aaVar.f331839f;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (S = kz5.z.S((c17 = aaVar.c(layoutManager, targetView)), 0)) == null) {
            return;
        }
        int intValue = S.intValue();
        java.lang.Integer S2 = kz5.z.S(c17, 1);
        if (S2 != null) {
            int intValue2 = S2.intValue();
            int abs = java.lang.Math.abs(intValue);
            int abs2 = java.lang.Math.abs(intValue2);
            if (abs < abs2) {
                abs = abs2;
            }
            int k17 = k(abs);
            android.view.animation.DecelerateInterpolator decelerateInterpolator = this.f12176i;
            if (k17 > 0) {
                action.b(intValue, intValue2, k17, decelerateInterpolator);
            } else {
                action.b(intValue, intValue2, 1, decelerateInterpolator);
            }
        }
    }
}
