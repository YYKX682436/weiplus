package e32;

/* loaded from: classes10.dex */
public final class a extends androidx.recyclerview.widget.o1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // androidx.recyclerview.widget.o1
    public int h(android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(view, "view");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f12051c;
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            return 0;
        }
        return (layoutManager.getWidth() / 2) - ((view.getLeft() + view.getRight()) / 2);
    }

    @Override // androidx.recyclerview.widget.o1
    public int i(android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(view, "view");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f12051c;
        if (layoutManager == null || !layoutManager.getF123307r()) {
            return 0;
        }
        return (layoutManager.getHeight() / 2) - ((view.getTop() + view.getBottom()) / 2);
    }

    @Override // androidx.recyclerview.widget.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        kotlin.jvm.internal.o.g(displayMetrics, "displayMetrics");
        return 50.0f / displayMetrics.densityDpi;
    }
}
