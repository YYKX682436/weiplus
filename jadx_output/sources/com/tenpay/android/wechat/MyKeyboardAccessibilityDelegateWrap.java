package com.tenpay.android.wechat;

/* loaded from: classes14.dex */
class MyKeyboardAccessibilityDelegateWrap extends android.view.View.AccessibilityDelegate {
    private static final java.lang.String TAG = "MicroMsg.MyKeyboardAccessibilityDelegateWrap";
    private android.view.View.AccessibilityDelegate origin;
    private java.lang.String viewTypeName;

    public MyKeyboardAccessibilityDelegateWrap() {
        this.viewTypeName = null;
        this.origin = null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void addExtraDataToAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.String str, android.os.Bundle bundle) {
        try {
            android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
            if (accessibilityDelegate == null) {
                super.addExtraDataToAccessibilityNodeInfo(view, accessibilityNodeInfo, str, bundle);
            } else if (android.os.Build.VERSION.SDK_INT >= 26) {
                accessibilityDelegate.addExtraDataToAccessibilityNodeInfo(view, accessibilityNodeInfo, str, bundle);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, e17.getMessage());
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean dispatchPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
        return accessibilityDelegate == null ? super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : accessibilityDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View view) {
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
        return accessibilityDelegate == null ? super.getAccessibilityNodeProvider(view) : accessibilityDelegate.getAccessibilityNodeProvider(view);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate == null) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            accessibilityDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        java.lang.String str;
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate == null) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
        if (accessibilityNodeInfo == null || (str = this.viewTypeName) == null) {
            return;
        }
        accessibilityNodeInfo.setClassName(str);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate == null) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        } else {
            accessibilityDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
        return accessibilityDelegate == null ? super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : accessibilityDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean performAccessibilityAction(android.view.View view, int i17, android.os.Bundle bundle) {
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
        return accessibilityDelegate == null ? super.performAccessibilityAction(view, i17, bundle) : accessibilityDelegate.performAccessibilityAction(view, i17, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEvent(android.view.View view, int i17) {
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate == null) {
            super.sendAccessibilityEvent(view, i17);
        } else {
            accessibilityDelegate.sendAccessibilityEvent(view, i17);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEventUnchecked(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate == null) {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        } else {
            accessibilityDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    public void setViewTypeName(java.lang.String str) {
        this.viewTypeName = str;
    }

    public MyKeyboardAccessibilityDelegateWrap(android.view.View.AccessibilityDelegate accessibilityDelegate) {
        this.viewTypeName = null;
        this.origin = accessibilityDelegate;
    }
}
