package com.tencent.mm.ui.widget;

/* loaded from: classes4.dex */
public abstract class SnsUploadInputPanelLinearLayout extends android.widget.LinearLayout implements al5.e0 {

    /* renamed from: d, reason: collision with root package name */
    public al5.f0 f211421d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f211422e;

    public SnsUploadInputPanelLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void J2(boolean z17, int i17) {
        int i18 = 0;
        while (true) {
            java.util.List list = this.f211422e;
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

    public al5.f0 getInputPanelHelper() {
        return this.f211421d;
    }

    public abstract int getSoftInputMode();

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f211421d.c();
        ((java.util.LinkedList) this.f211422e).clear();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        this.f211421d.d(i18);
        super.onMeasure(i17, i18);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17) {
            this.f211421d.g();
        } else {
            this.f211421d.c();
            ((java.util.LinkedList) this.f211422e).clear();
        }
    }

    public SnsUploadInputPanelLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f211422e = new java.util.LinkedList();
    }
}
