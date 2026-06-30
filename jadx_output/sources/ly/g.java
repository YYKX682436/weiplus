package ly;

/* loaded from: classes13.dex */
public abstract class g {
    public static final int a(int i17, android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return (int) android.util.TypedValue.applyDimension(1, i17, context.getResources().getDisplayMetrics());
    }

    public static final com.tencent.mm.ui.MMActivity b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "<this>");
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof com.tencent.mm.ui.MMActivity) {
                return (com.tencent.mm.ui.MMActivity) context;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
            kotlin.jvm.internal.o.f(context, "getBaseContext(...)");
        }
        return null;
    }

    public static void c(android.view.ViewGroup viewGroup, long j17, android.view.animation.Interpolator interpolator, yz5.a aVar, yz5.a aVar2, yz5.l lVar, java.util.List excludeViews, yz5.a action, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = 300;
        }
        if ((i17 & 2) != 0) {
            interpolator = new android.view.animation.AccelerateDecelerateInterpolator();
        }
        if ((i17 & 4) != 0) {
            aVar = null;
        }
        if ((i17 & 8) != 0) {
            aVar2 = null;
        }
        if ((i17 & 16) != 0) {
            lVar = null;
        }
        if ((i17 & 32) != 0) {
            excludeViews = kz5.p0.f313996d;
        }
        kotlin.jvm.internal.o.g(viewGroup, "<this>");
        kotlin.jvm.internal.o.g(interpolator, "interpolator");
        kotlin.jvm.internal.o.g(excludeViews, "excludeViews");
        kotlin.jvm.internal.o.g(action, "action");
        try {
            androidx.transition.ChangeBounds changeBounds = new androidx.transition.ChangeBounds();
            changeBounds.f12383f = j17;
            changeBounds.f12384g = interpolator;
            java.util.Iterator it = excludeViews.iterator();
            while (it.hasNext()) {
                changeBounds.r((android.view.View) it.next(), true);
            }
            changeBounds.a(new ly.f(aVar, lVar, aVar2, changeBounds));
            u4.g1.a(viewGroup, changeBounds);
            action.invoke();
        } catch (java.lang.Exception e17) {
            if (lVar != null) {
                lVar.invoke(e17);
            }
            action.invoke();
        }
    }

    public static final void d(android.view.View view, int i17, int i18) {
        kotlin.jvm.internal.o.g(view, "<this>");
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        kotlin.jvm.internal.o.f(view.getContext(), "getContext(...)");
        gradientDrawable.setCornerRadius(a(i17, r1));
        gradientDrawable.setColor(i18);
        view.setBackground(gradientDrawable);
    }
}
