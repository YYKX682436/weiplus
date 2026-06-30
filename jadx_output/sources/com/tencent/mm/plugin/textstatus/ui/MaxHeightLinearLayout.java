package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes4.dex */
public class MaxHeightLinearLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f173455d;

    /* renamed from: e, reason: collision with root package name */
    public int f173456e;

    public MaxHeightLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f173456e = -1;
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, zh4.o.f472985b, 0, 0);
        try {
            int integer = obtainStyledAttributes.getInteger(0, -1);
            this.f173455d = integer;
            if (integer != -1) {
                this.f173456e = i65.a.b(getContext(), this.f173455d);
            } else {
                this.f173456e = -1;
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(this.f173456e, Integer.MIN_VALUE));
    }

    public void setMaxHeightDp(int i17) {
        this.f173455d = i17;
        if (i17 != -1) {
            this.f173456e = i65.a.b(getContext(), this.f173455d);
        } else {
            this.f173456e = -1;
        }
        invalidate();
    }

    public void setMaxHeightPx(int i17) {
        this.f173456e = i17;
        invalidate();
    }

    public MaxHeightLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f173456e = -1;
    }
}
