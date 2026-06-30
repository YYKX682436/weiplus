package n3;

/* loaded from: classes14.dex */
public abstract class u0 {
    public static android.view.accessibility.AccessibilityNodeProvider a(android.view.View view) {
        return view.getAccessibilityNodeProvider();
    }

    public static boolean b(android.view.View view) {
        return view.getFitsSystemWindows();
    }

    public static int c(android.view.View view) {
        return view.getImportantForAccessibility();
    }

    public static int d(android.view.View view) {
        return view.getMinimumHeight();
    }

    public static int e(android.view.View view) {
        return view.getMinimumWidth();
    }

    public static android.view.ViewParent f(android.view.View view) {
        return view.getParentForAccessibility();
    }

    public static int g(android.view.View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static boolean h(android.view.View view) {
        return view.hasOverlappingRendering();
    }

    public static boolean i(android.view.View view) {
        return view.hasTransientState();
    }

    public static boolean j(android.view.View view, int i17, android.os.Bundle bundle) {
        return view.performAccessibilityAction(i17, bundle);
    }

    public static void k(android.view.View view) {
        view.postInvalidateOnAnimation();
    }

    public static void l(android.view.View view, int i17, int i18, int i19, int i27) {
        view.postInvalidateOnAnimation(i17, i18, i19, i27);
    }

    public static void m(android.view.View view, java.lang.Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void n(android.view.View view, java.lang.Runnable runnable, long j17) {
        view.postOnAnimationDelayed(runnable, j17);
    }

    public static void o(android.view.ViewTreeObserver viewTreeObserver, android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void p(android.view.View view) {
        view.requestFitSystemWindows();
    }

    public static void q(android.view.View view, android.graphics.drawable.Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void r(android.view.View view, boolean z17) {
        view.setHasTransientState(z17);
    }

    public static void s(android.view.View view, int i17) {
        view.setImportantForAccessibility(i17);
    }
}
