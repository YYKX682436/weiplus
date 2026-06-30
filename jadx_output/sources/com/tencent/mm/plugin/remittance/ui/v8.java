package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class v8 extends android.view.View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.SelectRemittanceContactUI f158001a;

    public v8(com.tencent.mm.plugin.remittance.ui.SelectRemittanceContactUI selectRemittanceContactUI) {
        this.f158001a = selectRemittanceContactUI;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(android.widget.TextView.class.getName());
        accessibilityNodeInfo.setContentDescription(this.f158001a.getString(com.tencent.mm.R.string.kz8));
    }
}
