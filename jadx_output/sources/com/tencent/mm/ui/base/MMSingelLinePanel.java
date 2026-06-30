package com.tencent.mm.ui.base;

/* loaded from: classes3.dex */
public class MMSingelLinePanel extends com.tencent.mm.ui.base.MMTagPanel {
    public final java.util.LinkedList M;
    public int N;
    public int P;
    public boolean Q;
    public android.widget.TextView R;
    public int S;
    public int T;
    public java.lang.Boolean U;

    public MMSingelLinePanel(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.U.booleanValue()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.tencent.mm.ui.base.MMTagPanel
    public void e() {
        super.e();
        android.widget.TextView textView = new android.widget.TextView(getContext());
        this.R = textView;
        textView.setText("...");
        this.R.setTextColor(getResources().getColor(com.tencent.mm.R.color.aaq));
        this.R.setLayoutParams(generateDefaultLayoutParams());
        addView(this.R);
    }

    @Override // com.tencent.mm.ui.base.MMTagPanel, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.U.booleanValue()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.base.FlowLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        boolean z18 = this.Q;
        int i28 = 8;
        java.util.LinkedList linkedList = this.M;
        if (!z18) {
            int childCount = getChildCount();
            int i29 = i19 - i17;
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int i37 = paddingLeft;
            int i38 = 0;
            for (int i39 = 0; i39 < childCount; i39++) {
                android.view.View childAt = getChildAt(i39);
                if (childAt.getVisibility() != 8 && childAt != this.R) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (i37 + measuredWidth + getPaddingRight() > i29) {
                        i37 = getPaddingLeft();
                        paddingTop += ((java.lang.Integer) linkedList.get(i38)).intValue() + this.P;
                        i38++;
                    }
                    int intValue = ((((java.lang.Integer) linkedList.get(i38)).intValue() - measuredHeight) / 2) + paddingTop;
                    childAt.layout(i37, intValue, i37 + measuredWidth, measuredHeight + intValue);
                    i37 += measuredWidth + this.N;
                }
            }
            return;
        }
        int childCount2 = getChildCount();
        int i47 = (i19 - i17) - this.S;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop2 = getPaddingTop();
        int i48 = 0;
        int i49 = 0;
        int i57 = 0;
        int i58 = 0;
        while (i48 < childCount2) {
            android.view.View childAt2 = getChildAt(i48);
            if (childAt2.getVisibility() != i28 && childAt2 != this.R) {
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                if (paddingLeft2 + measuredWidth2 + getPaddingRight() > i47) {
                    paddingLeft2 = getPaddingLeft();
                    paddingTop2 += ((java.lang.Integer) linkedList.get(i49)).intValue() + this.P;
                    i49++;
                }
                if (i49 < 1) {
                    int i59 = paddingTop2 + 0;
                    childAt2.layout(paddingLeft2, i59, paddingLeft2 + measuredWidth2, measuredHeight2 + i59);
                    i57 = paddingLeft2 + measuredWidth2 + this.N;
                    i58 = paddingTop2;
                    paddingLeft2 = i57;
                }
            }
            i48++;
            i28 = 8;
        }
        android.widget.TextView textView = this.R;
        if (textView != null) {
            if (i49 > 0) {
                textView.layout(i57, i58, this.S + i57, this.T + i58);
            } else {
                textView.layout(0, 0, 0, 0);
            }
        }
    }

    @Override // com.tencent.mm.ui.base.FlowLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        android.widget.TextView textView;
        int size = (android.view.View.MeasureSpec.getSize(i17) - getPaddingLeft()) - getPaddingRight();
        int size2 = (android.view.View.MeasureSpec.getSize(i18) - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        java.util.LinkedList linkedList = this.M;
        linkedList.clear();
        int makeMeasureSpec = android.view.View.MeasureSpec.getMode(i18) == Integer.MIN_VALUE ? android.view.View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE) : android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        if (this.Q && (textView = this.R) != null) {
            textView.measure(android.view.View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
            this.S = this.R.getMeasuredWidth();
            this.T = this.R.getMeasuredHeight();
        }
        if (this.Q) {
            size -= this.S;
        }
        int i19 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        for (int i37 = 0; i37 < childCount; i37++) {
            android.view.View childAt = getChildAt(i37);
            if (childAt.getVisibility() != 8) {
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (i28 + measuredWidth > size) {
                    i29 += this.P + i19;
                    linkedList.add(java.lang.Integer.valueOf(i19));
                    i19 = 0;
                    i28 = 0;
                }
                i19 = java.lang.Math.max(i19, childAt.getMeasuredHeight());
                i28 += measuredWidth + this.N;
                i27 = measuredHeight;
            }
        }
        linkedList.add(java.lang.Integer.valueOf(i19));
        if (this.Q) {
            getPaddingTop();
            getPaddingBottom();
        } else if (android.view.View.MeasureSpec.getMode(i18) == 0) {
            getPaddingTop();
            getPaddingBottom();
        } else if (android.view.View.MeasureSpec.getMode(i18) == Integer.MIN_VALUE && i29 + i19 < size2) {
            getPaddingTop();
            getPaddingBottom();
        }
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i17), i27);
    }

    public void setSingleLine(boolean z17) {
        this.Q = z17;
        android.widget.TextView textView = new android.widget.TextView(getContext());
        this.R = textView;
        textView.setText("...");
        this.R.setLayoutParams(generateDefaultLayoutParams());
        addView(this.R);
    }

    public MMSingelLinePanel(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.M = new java.util.LinkedList();
        this.N = 0;
        this.P = 0;
        this.Q = true;
        this.S = 0;
        this.T = 0;
        this.U = java.lang.Boolean.FALSE;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f447190h);
        try {
            this.N = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.P = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
