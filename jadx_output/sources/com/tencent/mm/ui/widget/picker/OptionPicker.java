package com.tencent.mm.ui.widget.picker;

/* loaded from: classes15.dex */
public class OptionPicker extends android.widget.NumberPicker {

    /* renamed from: d, reason: collision with root package name */
    public int f212234d;

    /* renamed from: e, reason: collision with root package name */
    public int f212235e;

    /* renamed from: f, reason: collision with root package name */
    public int f212236f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f212237g;

    public OptionPicker(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f212237g = context;
        a();
    }

    public final void a() {
        android.content.Context context = this.f212237g;
        this.f212234d = com.tencent.mm.ui.zk.a(context, 120);
        this.f212236f = com.tencent.mm.ui.zk.a(context, 20);
        com.tencent.mm.ui.widget.picker.q0.c(this, getResources().getDrawable(com.tencent.mm.R.drawable.auc));
        setDescendantFocusability(393216);
        com.tencent.mm.ui.widget.picker.q0.f(this, context.getResources().getColor(com.tencent.mm.R.color.a0c));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.widget.NumberPicker, android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        if (android.view.View.MeasureSpec.getMode(i17) == Integer.MIN_VALUE || android.view.View.MeasureSpec.getMode(i17) == 1073741824) {
            this.f212235e = android.view.View.MeasureSpec.getSize(i17);
        }
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), i18);
        int measuredWidth = getMeasuredWidth();
        int i27 = this.f212234d;
        if (measuredWidth <= i27 && ((i19 = this.f212235e) <= 0 || i27 <= i19)) {
            setMeasuredDimension(i27, getMeasuredHeight());
            return;
        }
        int measuredWidth2 = getMeasuredWidth() + (this.f212236f * 2);
        int i28 = this.f212235e;
        if (i28 > 0 && i28 <= measuredWidth2) {
            measuredWidth2 = i28;
        }
        setMeasuredDimension(measuredWidth2, getMeasuredHeight());
    }

    @Override // android.widget.NumberPicker
    @java.lang.Deprecated
    public void setDisplayedValues(java.lang.String[] strArr) {
        super.setDisplayedValues(strArr);
    }

    public final void setExtraPadding(int i17) {
        this.f212236f = java.lang.Math.max(i17, 0);
    }

    public final void setMaxWidth(int i17) {
        this.f212235e = i17;
    }

    public final void setMinWidth(int i17) {
        this.f212234d = i17;
    }

    public void setOptionsArray(java.lang.String[] strArr) {
        if (strArr == null) {
            return;
        }
        setDisplayedValues(null);
        setMinValue(0);
        setMaxValue(java.lang.Math.max(strArr.length - 1, 0));
        setWrapSelectorWheel(false);
        if (strArr.length <= 0) {
            strArr = null;
        }
        super.setDisplayedValues(strArr);
    }

    public OptionPicker(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f212237g = context;
        a();
    }
}
