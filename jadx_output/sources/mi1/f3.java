package mi1;

/* loaded from: classes7.dex */
public abstract class f3 {
    public static final void a(android.view.View view, android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(view, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("Luggage.WAGameCapsuleBarStyleApplier", "setupCapsuleContainerMarginForGame, this:" + view.getClass().getSimpleName() + ", context:" + context.getClass().getSimpleName() + ", density:" + context.getResources().getDisplayMetrics().density);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480049ml);
            marginLayoutParams.height = context.getResources().getDimensionPixelSize(z17 ? com.tencent.mm.R.dimen.ank : com.tencent.mm.R.dimen.f479621aw);
            view.requestLayout();
        }
    }

    public static final void b(android.view.View view, boolean z17) {
        kotlin.jvm.internal.o.g(view, "<this>");
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        a(view, context, z17);
    }

    public static final void c(android.view.View view, android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(view, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("Luggage.WAGameCapsuleBarStyleApplier", "setupCapsuleMarginsForGame, this:" + view.getClass().getSimpleName() + ", context:" + context.getClass().getSimpleName() + ", density:" + context.getResources().getDisplayMetrics().density);
        if (view instanceof mi1.i) {
            view = ((mi1.i) view).getCapsuleContentAreaView();
        } else if (!(view instanceof com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarPlaceHolderView)) {
            throw new java.lang.IllegalStateException("Unrecognized View class".toString());
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            if (z17) {
                marginLayoutParams.rightMargin = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480021lu);
            } else {
                marginLayoutParams.rightMargin = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480019ls) + context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480048mk);
            }
            view.requestLayout();
        }
    }
}
