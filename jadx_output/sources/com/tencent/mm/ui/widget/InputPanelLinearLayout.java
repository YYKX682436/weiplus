package com.tencent.mm.ui.widget;

/* loaded from: classes4.dex */
public class InputPanelLinearLayout extends android.widget.LinearLayout implements al5.e0 {

    /* renamed from: d, reason: collision with root package name */
    public al5.f0 f211266d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f211267e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f211268f;

    public InputPanelLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void J2(boolean z17, int i17) {
        int i18 = 0;
        while (true) {
            java.util.List list = this.f211267e;
            if (i18 >= ((java.util.LinkedList) list).size()) {
                return;
            }
            al5.e0 e0Var = (al5.e0) ((java.util.LinkedList) list).get(i18);
            if (e0Var != null) {
                e0Var.J2(z17, i17);
            }
            i18++;
        }
    }

    public void e(al5.e0 e0Var) {
        java.util.List list = this.f211267e;
        if (((java.util.LinkedList) list).contains(e0Var)) {
            return;
        }
        ((java.util.LinkedList) list).add(e0Var);
    }

    public al5.f0 getInputPanelHelper() {
        return this.f211266d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f211268f) {
            this.f211266d.c();
            ((java.util.LinkedList) this.f211267e).clear();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        this.f211266d.d(i18);
        super.onMeasure(i17, i18);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (this.f211268f) {
            if (z17) {
                this.f211266d.g();
            } else {
                this.f211266d.c();
                ((java.util.LinkedList) this.f211267e).clear();
            }
        }
    }

    public InputPanelLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f211267e = new java.util.LinkedList();
        this.f211268f = true;
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f447193k, i17, 0);
            try {
                this.f211268f = obtainStyledAttributes.getBoolean(0, true);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f211266d = new al5.f0(this, this, false);
    }
}
