package com.tencent.mm.ui.widget;

/* loaded from: classes5.dex */
public class InputPanelFrameLayout extends android.widget.FrameLayout implements al5.e0 {

    /* renamed from: d, reason: collision with root package name */
    public al5.f0 f211264d;

    /* renamed from: e, reason: collision with root package name */
    public al5.e0 f211265e;

    public InputPanelFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void J2(boolean z17, int i17) {
        al5.e0 e0Var = this.f211265e;
        if (e0Var != null) {
            e0Var.J2(z17, i17);
        }
    }

    public al5.f0 getInputPanelHelper() {
        return this.f211264d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f211264d.c();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        this.f211264d.d(i18);
        super.onMeasure(i17, i18);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17) {
            this.f211264d.g();
        } else {
            this.f211264d.c();
        }
    }

    public void setExternalListener(al5.e0 e0Var) {
        this.f211265e = e0Var;
    }

    public InputPanelFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f211264d = new al5.f0(this, this, false);
    }
}
