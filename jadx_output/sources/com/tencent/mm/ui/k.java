package com.tencent.mm.ui;

/* loaded from: classes13.dex */
public class k extends n3.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.AddressView f209012e;

    public k(com.tencent.mm.ui.AddressView addressView) {
        this.f209012e = addressView;
    }

    @Override // n3.c
    public void onInitializeAccessibilityNodeInfo(android.view.View view, o3.l lVar) {
        super.onInitializeAccessibilityNodeInfo(view, lVar);
        com.tencent.mm.ui.AddressView addressView = this.f209012e;
        java.lang.CharSequence contentDescription = addressView.getContentDescription();
        if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) contentDescription)) {
            contentDescription = addressView.nickName;
        }
        lVar.v(contentDescription);
    }

    @Override // n3.c
    public void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        com.tencent.mm.ui.AddressView addressView = this.f209012e;
        java.lang.CharSequence contentDescription = addressView.getContentDescription();
        if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) contentDescription)) {
            contentDescription = addressView.nickName;
        }
        accessibilityEvent.getText().add(contentDescription);
    }
}
