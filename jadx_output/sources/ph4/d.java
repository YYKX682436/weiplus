package ph4;

/* loaded from: classes8.dex */
public final class d extends androidx.recyclerview.widget.RecyclerView {

    /* renamed from: b2, reason: collision with root package name */
    public int f354470b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ph4.e eVar, android.content.Context context) {
        super(context, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setClipChildren(false);
        android.view.View rootView = getRootView();
        java.lang.Object parent = getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        android.view.View view = (android.view.View) parent;
        while (view != rootView && (view instanceof android.view.ViewGroup)) {
            ((android.view.ViewGroup) view).setClipChildren(false);
            if (view instanceof androidx.recyclerview.widget.RecyclerView) {
                return;
            }
            java.lang.Object parent2 = view.getParent();
            kotlin.jvm.internal.o.e(parent2, "null cannot be cast to non-null type android.view.View");
            view = (android.view.View) parent2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (getMeasuredWidth() != this.f354470b2) {
            this.f354470b2 = getMeasuredWidth();
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            while (getItemDecorationCount() > 0) {
                T0(0);
            }
            N(new ph4.c(context));
        }
    }
}
