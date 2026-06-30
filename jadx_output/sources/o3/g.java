package o3;

/* loaded from: classes14.dex */
public abstract class g {
    public static o3.k a(int i17, int i18, int i19, int i27, boolean z17) {
        return new o3.k(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i17, i18, i19, i27, z17));
    }

    public static java.lang.Object b(int i17, float f17, float f18, float f19) {
        return android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(i17, f17, f18, f19);
    }

    public static android.os.Bundle c(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtras();
    }
}
