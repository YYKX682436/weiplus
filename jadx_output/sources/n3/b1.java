package n3;

/* loaded from: classes14.dex */
public abstract class b1 {
    public static n3.g3 a(android.view.View view) {
        android.view.WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        n3.g3 i17 = n3.g3.i(rootWindowInsets, null);
        n3.d3 d3Var = i17.f334338a;
        d3Var.s(i17);
        d3Var.d(view.getRootView());
        return i17;
    }

    public static int b(android.view.View view) {
        return view.getScrollIndicators();
    }

    public static void c(android.view.View view, int i17) {
        view.setScrollIndicators(i17);
    }

    public static void d(android.view.View view, int i17, int i18) {
        view.setScrollIndicators(i17, i18);
    }
}
