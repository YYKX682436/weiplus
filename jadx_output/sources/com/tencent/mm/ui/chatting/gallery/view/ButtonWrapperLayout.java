package com.tencent.mm.ui.chatting.gallery.view;

/* loaded from: classes4.dex */
public class ButtonWrapperLayout extends android.widget.FrameLayout {
    public ButtonWrapperLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(android.widget.Button.class.getName());
        accessibilityNodeInfo.setClickable(true);
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    public ButtonWrapperLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
