package o3;

/* loaded from: classes14.dex */
public abstract class i {
    public static o3.k a(boolean z17, int i17, int i18, int i19, int i27, boolean z18, java.lang.String str, java.lang.String str2) {
        return new o3.k(new android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z17).setColumnIndex(i17).setRowIndex(i18).setColumnSpan(i19).setRowSpan(i27).setSelected(z18).setRowTitle(str).setColumnTitle(str2).build());
    }

    public static o3.l b(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, int i17, int i18) {
        android.view.accessibility.AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i17, i18);
        if (child != null) {
            return new o3.l((java.lang.Object) child);
        }
        return null;
    }

    public static java.lang.String c(java.lang.Object obj) {
        return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }

    public static java.lang.String d(java.lang.Object obj) {
        return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    public static android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo e(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    public static o3.l f(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, int i17) {
        android.view.accessibility.AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i17);
        if (parent != null) {
            return new o3.l((java.lang.Object) parent);
        }
        return null;
    }

    public static java.lang.String g(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean h(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static void i(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, boolean z17) {
        accessibilityNodeInfo.setTextSelectable(z17);
    }

    public static void j(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }
}
