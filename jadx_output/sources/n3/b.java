package n3;

/* loaded from: classes14.dex */
public abstract class b {
    public static android.view.accessibility.AccessibilityNodeProvider a(android.view.View.AccessibilityDelegate accessibilityDelegate, android.view.View view) {
        return accessibilityDelegate.getAccessibilityNodeProvider(view);
    }

    public static boolean b(android.view.View.AccessibilityDelegate accessibilityDelegate, android.view.View view, int i17, android.os.Bundle bundle) {
        return accessibilityDelegate.performAccessibilityAction(view, i17, bundle);
    }
}
