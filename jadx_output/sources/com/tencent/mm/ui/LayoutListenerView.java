package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public class LayoutListenerView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f196864d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.f9 f196865e;

    public LayoutListenerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f196864d = new byte[0];
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        synchronized (this.f196864d) {
            this.f196865e = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        synchronized (this.f196864d) {
        }
        super.onLayout(z17, i17, i18, i19, i27);
        synchronized (this.f196864d) {
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        synchronized (this.f196864d) {
            com.tencent.mm.ui.f9 f9Var = this.f196865e;
            if (f9Var != null) {
                com.tencent.mm.ui.ab abVar = (com.tencent.mm.ui.ab) f9Var;
                com.tencent.mm.ui.ga gaVar = abVar.f197129b;
                if (!((gaVar.x().getWindow().getAttributes().flags & 1024) != 0) && i17 != 0 && i18 != 0 && i19 != 0 && i27 != 0 && i17 == i19) {
                    int i28 = abVar.f197128a;
                    if (i18 > i27 && i18 - i27 > i28) {
                        gaVar.f208655l0 = 2;
                        gaVar.i0();
                    } else if (i27 > i18 && i27 - i18 > i28) {
                        gaVar.f208655l0 = 1;
                        gaVar.i0();
                    }
                }
            }
        }
    }

    public void setOnLayoutListener(com.tencent.mm.ui.d9 d9Var) {
        synchronized (this.f196864d) {
        }
    }

    public void setOnPreLayoutListener(com.tencent.mm.ui.e9 e9Var) {
        synchronized (this.f196864d) {
        }
    }

    public void setOnResizedListener(com.tencent.mm.ui.f9 f9Var) {
        synchronized (this.f196864d) {
            this.f196865e = f9Var;
        }
    }

    public LayoutListenerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f196864d = new byte[0];
    }
}
