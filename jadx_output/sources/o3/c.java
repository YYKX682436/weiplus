package o3;

/* loaded from: classes14.dex */
public abstract class c {
    public static boolean a(android.view.accessibility.AccessibilityManager accessibilityManager, o3.d dVar) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new o3.e(dVar));
    }

    public static boolean b(android.view.accessibility.AccessibilityManager accessibilityManager, o3.d dVar) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new o3.e(dVar));
    }
}
