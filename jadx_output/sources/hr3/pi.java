package hr3;

/* loaded from: classes4.dex */
public class pi extends android.view.View.AccessibilityDelegate {
    public pi(com.tencent.mm.plugin.profile.ui.WxaBindBizInfoUI wxaBindBizInfoUI) {
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClickable(false);
    }
}
