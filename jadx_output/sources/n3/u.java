package n3;

/* loaded from: classes13.dex */
public abstract class u {
    public static int a(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getLayoutDirection();
    }

    public static int b(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    public static int c(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    public static boolean d(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.isMarginRelative();
    }

    public static void e(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i17) {
        marginLayoutParams.resolveLayoutDirection(i17);
    }

    public static void f(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i17) {
        marginLayoutParams.setLayoutDirection(i17);
    }

    public static void g(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i17) {
        marginLayoutParams.setMarginEnd(i17);
    }

    public static void h(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i17) {
        marginLayoutParams.setMarginStart(i17);
    }
}
