package hr3;

/* loaded from: classes4.dex */
public class ri extends android.view.View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f283958a = null;

    public ri(hr3.oi oiVar) {
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setContentDescription(this.f283958a);
        accessibilityNodeInfo.setClassName(android.widget.Button.class.getName());
        accessibilityNodeInfo.setFocusable(true);
        accessibilityNodeInfo.setClickable(true);
    }
}
