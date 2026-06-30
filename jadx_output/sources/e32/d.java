package e32;

/* loaded from: classes10.dex */
public final class d extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e32.e f247102n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e32.e eVar, android.content.Context context) {
        super(context);
        this.f247102n = eVar;
    }

    @Override // androidx.recyclerview.widget.o1, androidx.recyclerview.widget.g3
    public void e(android.view.View targetView, androidx.recyclerview.widget.h3 state, androidx.recyclerview.widget.e3 action) {
        kotlin.jvm.internal.o.g(targetView, "targetView");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        e32.e eVar = this.f247102n;
        androidx.recyclerview.widget.RecyclerView recyclerView = eVar.f247103f;
        if (recyclerView != null) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
            kotlin.jvm.internal.o.d(layoutManager);
            int[] c17 = eVar.c(layoutManager, targetView);
            int i17 = c17[0];
            int i18 = c17[1];
            int k17 = k(java.lang.Math.max(java.lang.Math.abs(i17), java.lang.Math.abs(i18)));
            android.view.animation.DecelerateInterpolator decelerateInterpolator = this.f12176i;
            if (k17 > 0) {
                action.b(i17, i18, k17, decelerateInterpolator);
            } else {
                action.b(i17, i18, 1, decelerateInterpolator);
            }
        }
    }
}
