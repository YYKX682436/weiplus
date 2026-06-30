package mr;

/* loaded from: classes10.dex */
public final class d extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ mr.i f330812n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.LayoutManager f330813o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(mr.i iVar, androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, android.content.Context context) {
        super(context);
        this.f330812n = iVar;
        this.f330813o = layoutManager;
    }

    @Override // androidx.recyclerview.widget.o1, androidx.recyclerview.widget.g3
    public void e(android.view.View targetView, androidx.recyclerview.widget.h3 state, androidx.recyclerview.widget.e3 action) {
        kotlin.jvm.internal.o.g(targetView, "targetView");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        mr.i iVar = this.f330812n;
        if (iVar.f330820h != null) {
            int[] c17 = iVar.c(this.f330813o, targetView);
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

    @Override // androidx.recyclerview.widget.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        kotlin.jvm.internal.o.g(displayMetrics, "displayMetrics");
        return this.f330812n.f330821i / displayMetrics.densityDpi;
    }
}
