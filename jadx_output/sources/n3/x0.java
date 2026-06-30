package n3;

/* loaded from: classes14.dex */
public abstract class x0 {
    public static int a(android.view.View view) {
        return view.getAccessibilityLiveRegion();
    }

    public static boolean b(android.view.View view) {
        return view.isAttachedToWindow();
    }

    public static boolean c(android.view.View view) {
        return view.isLaidOut();
    }

    public static boolean d(android.view.View view) {
        return view.isLayoutDirectionResolved();
    }

    public static void e(android.view.ViewParent viewParent, android.view.View view, android.view.View view2, int i17) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i17);
    }

    public static void f(android.view.View view, int i17) {
        view.setAccessibilityLiveRegion(i17);
    }

    public static void g(android.view.accessibility.AccessibilityEvent accessibilityEvent, int i17) {
        accessibilityEvent.setContentChangeTypes(i17);
    }
}
