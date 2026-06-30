package fl1;

/* loaded from: classes5.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public static final fl1.i2 f263792a = new fl1.i2();

    public final void a(android.content.Context context, android.view.View rootView, android.view.View view, int i17, xi1.g window, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(window, "window");
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        int i18 = com.tencent.mm.R.dimen.f480117oi;
        if (i17 == 1 || i17 == 3) {
            if ((view != null ? view.getParent() : null) instanceof android.widget.RelativeLayout) {
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
                android.content.res.Resources resources = context.getResources();
                if (!z17) {
                    i18 = com.tencent.mm.R.dimen.f480115og;
                }
                layoutParams2.bottomMargin = resources.getDimensionPixelSize(i18);
            }
            if (rootView.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) {
                android.view.ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).topMargin = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480120ol);
            }
            if (window.shouldInLargeScreenCompatMode()) {
                return;
            }
            android.view.ViewGroup.LayoutParams layoutParams4 = rootView.getLayoutParams();
            layoutParams4.width = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480119ok);
            rootView.setLayoutParams(layoutParams4);
            return;
        }
        if ((view != null ? view.getParent() : null) instanceof android.widget.RelativeLayout) {
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams5 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            android.content.res.Resources resources2 = context.getResources();
            if (!z17) {
                i18 = com.tencent.mm.R.dimen.f480116oh;
            }
            layoutParams5.bottomMargin = resources2.getDimensionPixelSize(i18);
        }
        if (!window.shouldInLargeScreenCompatMode()) {
            if ((context.getResources().getConfiguration().screenLayout & 15) >= 3) {
                if ((view != null ? view.getParent() : null) instanceof android.widget.RelativeLayout) {
                    kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    ((android.widget.RelativeLayout.LayoutParams) layoutParams).bottomMargin = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480115og);
                    return;
                }
                return;
            }
        }
        android.view.ViewGroup.LayoutParams layoutParams6 = rootView.getLayoutParams();
        layoutParams6.width = -1;
        rootView.setLayoutParams(layoutParams6);
    }
}
