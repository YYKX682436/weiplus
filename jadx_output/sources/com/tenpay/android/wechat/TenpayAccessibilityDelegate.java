package com.tenpay.android.wechat;

/* loaded from: classes9.dex */
public class TenpayAccessibilityDelegate extends android.view.View.AccessibilityDelegate {
    @Override // android.view.View.AccessibilityDelegate
    public boolean dispatchPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // android.view.View.AccessibilityDelegate
    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View view) {
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean performAccessibilityAction(android.view.View view, int i17, android.os.Bundle bundle) {
        return false;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEvent(android.view.View view, int i17) {
        java.lang.CharSequence contentDescription;
        com.tenpay.bankcard.LogUtil.d("CFT", "sendAccessibilityEvent eventType=" + i17);
        if (view == null || i17 != 128) {
            return;
        }
        if (view instanceof android.widget.EditText) {
            com.tenpay.bankcard.LogUtil.d("CFT", "EditText");
            android.widget.EditText editText = (android.widget.EditText) view;
            contentDescription = !android.text.TextUtils.isEmpty(editText.getContentDescription()) ? editText.getContentDescription() : editText.getHint() != null ? editText.getHint() : null;
            if (!android.text.TextUtils.isEmpty(contentDescription)) {
                for (int i18 = 0; i18 < contentDescription.length(); i18++) {
                    com.tenpay.android.wechat.TenpayTTSUtil.speak(java.lang.String.valueOf(contentDescription.charAt(i18)));
                }
            }
        } else {
            com.tenpay.bankcard.LogUtil.d("CFT", "not EditText");
            contentDescription = view.getContentDescription();
            com.tenpay.android.wechat.TenpayTTSUtil.speak(contentDescription);
        }
        com.tenpay.bankcard.LogUtil.d("CFT", "content = " + ((java.lang.Object) contentDescription));
        com.tenpay.bankcard.LogUtil.d("CFT", "host.getContentDescription() = " + ((java.lang.Object) view.getContentDescription()));
        if (android.text.TextUtils.isEmpty(contentDescription)) {
            return;
        }
        try {
            java.lang.reflect.Method method = android.view.View.class.getMethod("clearAccessibilityFocus", new java.lang.Class[0]);
            method.setAccessible(true);
            method.invoke(view, new java.lang.Object[0]);
            java.lang.reflect.Method method2 = android.view.View.class.getMethod("requestAccessibilityFocus", new java.lang.Class[0]);
            method2.setAccessible(true);
            method2.invoke(view, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEventUnchecked(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
    }
}
