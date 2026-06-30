package o3;

/* loaded from: classes14.dex */
public abstract class q {
    public static int a(android.view.accessibility.AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }

    public static int b(android.view.accessibility.AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }

    public static void c(android.view.accessibility.AccessibilityRecord accessibilityRecord, int i17) {
        accessibilityRecord.setMaxScrollX(i17);
    }

    public static void d(android.view.accessibility.AccessibilityRecord accessibilityRecord, int i17) {
        accessibilityRecord.setMaxScrollY(i17);
    }
}
