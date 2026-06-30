package n3;

/* loaded from: classes14.dex */
public class o2 extends n3.r2 {

    /* renamed from: e, reason: collision with root package name */
    public static final android.view.animation.Interpolator f334379e = new android.view.animation.PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final android.view.animation.Interpolator f334380f = new y3.a();

    /* renamed from: g, reason: collision with root package name */
    public static final android.view.animation.Interpolator f334381g = new android.view.animation.DecelerateInterpolator();

    public static void e(android.view.View view, n3.s2 s2Var) {
        n3.j2 j17 = j(view);
        if (j17 != null) {
            j17.b(s2Var);
            if (j17.f334348b == 0) {
                return;
            }
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i17 = 0; i17 < viewGroup.getChildCount(); i17++) {
                e(viewGroup.getChildAt(i17), s2Var);
            }
        }
    }

    public static void f(android.view.View view, n3.s2 s2Var, android.view.WindowInsets windowInsets, boolean z17) {
        n3.j2 j17 = j(view);
        if (j17 != null) {
            j17.f334347a = windowInsets;
            if (!z17) {
                j17.c(s2Var);
                z17 = j17.f334348b == 0;
            }
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i17 = 0; i17 < viewGroup.getChildCount(); i17++) {
                f(viewGroup.getChildAt(i17), s2Var, windowInsets, z17);
            }
        }
    }

    public static void g(android.view.View view, n3.g3 g3Var, java.util.List list) {
        n3.j2 j17 = j(view);
        if (j17 != null) {
            g3Var = j17.d(g3Var, list);
            if (j17.f334348b == 0) {
                return;
            }
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i17 = 0; i17 < viewGroup.getChildCount(); i17++) {
                g(viewGroup.getChildAt(i17), g3Var, list);
            }
        }
    }

    public static void h(android.view.View view, n3.s2 s2Var, n3.i2 i2Var) {
        n3.j2 j17 = j(view);
        if (j17 != null) {
            j17.e(s2Var, i2Var);
            if (j17.f334348b == 0) {
                return;
            }
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i17 = 0; i17 < viewGroup.getChildCount(); i17++) {
                h(viewGroup.getChildAt(i17), s2Var, i2Var);
            }
        }
    }

    public static android.view.WindowInsets i(android.view.View view, android.view.WindowInsets windowInsets) {
        return view.getTag(com.tencent.mm.R.id.f487214nx0) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static n3.j2 j(android.view.View view) {
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.nxg);
        if (tag instanceof n3.n2) {
            return ((n3.n2) tag).f334376d;
        }
        return null;
    }
}
