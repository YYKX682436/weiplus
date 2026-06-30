package qw3;

/* loaded from: classes14.dex */
public class j0 extends android.view.View.AccessibilityDelegate {
    public j0(qw3.k0 k0Var) {
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        if (view instanceof android.widget.EditText) {
            android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain(view);
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                obtain.setHintText("");
            } else {
                o3.g.c(obtain).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", "");
            }
        }
    }
}
