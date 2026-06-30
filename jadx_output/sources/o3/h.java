package o3;

/* loaded from: classes14.dex */
public abstract class h {
    public static java.lang.Object a(int i17, float f17, float f18, float f19) {
        return new android.view.accessibility.AccessibilityNodeInfo.RangeInfo(i17, f17, f18, f19);
    }

    public static java.lang.CharSequence b(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void c(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
