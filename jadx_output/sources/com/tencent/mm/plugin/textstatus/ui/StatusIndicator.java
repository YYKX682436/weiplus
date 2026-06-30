package com.tencent.mm.plugin.textstatus.ui;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB%\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/StatusIndicator;", "Landroid/widget/LinearLayout;", "Landroid/view/View;", "getCacheView", "", "select", "Ljz5/f0;", "setSelect", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class StatusIndicator extends android.widget.LinearLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f173471i = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f173472d;

    /* renamed from: e, reason: collision with root package name */
    public final int f173473e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f173474f;

    /* renamed from: g, reason: collision with root package name */
    public int f173475g;

    /* renamed from: h, reason: collision with root package name */
    public float f173476h;

    public StatusIndicator(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f173472d = i65.a.b(getContext(), 94);
        this.f173473e = com.tencent.mm.R.layout.dx9;
        this.f173476h = -1.0f;
    }

    private final android.view.View getCacheView() {
        if (this.f173474f == null) {
            this.f173474f = android.view.View.inflate(getContext(), this.f173473e, null);
        }
        android.view.View view = this.f173474f;
        if (view != null) {
            view.clearAnimation();
            view.setScaleY(1.0f);
            view.setScaleX(1.0f);
        }
        android.view.View view2 = this.f173474f;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/StatusIndicator", "getCacheView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/textstatus/ui/StatusIndicator", "getCacheView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = this.f173474f;
        kotlin.jvm.internal.o.d(view3);
        return view3;
    }

    public final void a(boolean z17, int i17) {
        this.f173476h = 0.0f;
        android.view.View cacheView = getCacheView();
        if (cacheView.getParent() != null) {
            cacheView.clearAnimation();
            android.view.ViewParent parent = cacheView.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(cacheView);
        }
        if (z17) {
            java.lang.Object tag = getChildAt(getChildCount() - 1).getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
            cacheView.setTag(java.lang.Integer.valueOf(((java.lang.Integer) tag).intValue() + 1));
            addView(cacheView);
            this.f173474f = getChildAt(0);
            android.view.View childAt = getChildAt(1);
            kotlin.jvm.internal.o.d(childAt);
            b(childAt, true);
        } else {
            java.lang.Object tag2 = getChildAt(0).getTag();
            kotlin.jvm.internal.o.e(tag2, "null cannot be cast to non-null type kotlin.Int");
            cacheView.setTag(java.lang.Integer.valueOf(((java.lang.Integer) tag2).intValue() - 1));
            addView(cacheView, 0);
            this.f173474f = getChildAt(getChildCount() - 1);
            android.view.View childAt2 = getChildAt(getChildCount() - 2);
            kotlin.jvm.internal.o.d(childAt2);
            b(childAt2, true);
        }
        java.lang.Object tag3 = cacheView.getTag();
        kotlin.jvm.internal.o.e(tag3, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) tag3).intValue();
        if ((intValue == this.f173475g - 1 || intValue == 0) ? false : true) {
            b(cacheView, false);
        }
        android.view.View view = this.f173474f;
        if (view != null) {
            sa5.d.b(view, new com.tencent.mm.plugin.textstatus.ui.f4(new com.tencent.mm.plugin.textstatus.ui.r3(this)), 300L, new com.tencent.mm.plugin.textstatus.ui.s3(this));
        }
    }

    public final void b(android.view.View view, boolean z17) {
        if (view.getWidth() <= 0) {
            n3.m0.a(view, new com.tencent.mm.plugin.textstatus.ui.t3(view, z17, this, view));
        } else if (z17) {
            d(view);
        } else {
            c(view);
        }
    }

    public final void c(android.view.View view) {
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        view.setScaleX(0.75f);
        view.setScaleY(0.75f);
    }

    public final void d(android.view.View view) {
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(1.0f, 0.75f, 1.0f, 0.75f, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
        scaleAnimation.setDuration(300L);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setAnimationListener(new com.tencent.mm.plugin.textstatus.ui.u3(view));
        view.startAnimation(scaleAnimation);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int indexOfChild = indexOfChild(this.f173474f);
        if (indexOfChild < 0 || this.f173476h < 0.0f) {
            super.onLayout(z17, i17, i18, i19, i27);
            return;
        }
        int i28 = 0;
        int measuredWidth = getChildAt(0).getMeasuredWidth();
        int measuredHeight = getChildAt(0).getMeasuredHeight();
        if (indexOfChild == 0) {
            float measuredWidth2 = ((getMeasuredWidth() - (measuredWidth * 5)) / 2) - (measuredWidth * this.f173476h);
            int childCount = getChildCount();
            while (i28 < childCount) {
                int i29 = (int) ((measuredWidth * i28) + measuredWidth2);
                getChildAt(i28).layout(i29, getPaddingTop(), i29 + measuredWidth, getPaddingTop() + measuredHeight);
                i28++;
            }
            return;
        }
        float width = ((getWidth() - (measuredWidth * 5)) / 2) - (measuredWidth * (1 - this.f173476h));
        int childCount2 = getChildCount();
        while (i28 < childCount2) {
            int i37 = (int) ((measuredWidth * i28) + width);
            getChildAt(i28).layout(i37, getPaddingTop(), i37 + measuredWidth, getPaddingTop() + measuredHeight);
            i28++;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(this.f173472d, Integer.MIN_VALUE), i18);
    }

    public final void setSelect(int i17) {
        android.view.View view;
        if (this.f173475g <= 5) {
            int childCount = getChildCount();
            int i18 = 0;
            while (i18 < childCount) {
                getChildAt(i18).setSelected(i18 == i17);
                i18++;
            }
            return;
        }
        int i19 = 0;
        while (true) {
            if (!(i19 < getChildCount())) {
                view = null;
                break;
            }
            int i27 = i19 + 1;
            view = getChildAt(i19);
            if (view == null) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            if (view.isSelected()) {
                break;
            } else {
                i19 = i27;
            }
        }
        java.lang.Integer num = (java.lang.Integer) (view != null ? view.getTag() : null);
        if (i17 == (num != null ? num.intValue() : -1)) {
            return;
        }
        java.lang.Object tag = getChildAt(0).getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) tag).intValue();
        java.lang.Object tag2 = getChildAt(getChildCount() - 1).getTag();
        kotlin.jvm.internal.o.e(tag2, "null cannot be cast to non-null type kotlin.Int");
        int intValue2 = ((java.lang.Integer) tag2).intValue();
        if (intValue <= i17 && i17 <= intValue2) {
            int childCount2 = getChildCount();
            for (int i28 = 0; i28 < childCount2; i28++) {
                android.view.View childAt = getChildAt(i28);
                java.lang.Object tag3 = childAt.getTag();
                kotlin.jvm.internal.o.e(tag3, "null cannot be cast to non-null type kotlin.Int");
                childAt.setSelected(((java.lang.Integer) tag3).intValue() == i17);
                if (childAt.isSelected()) {
                    if (!(childAt.getScaleX() == 1.0f)) {
                        childAt.clearAnimation();
                        childAt.setScaleY(1.0f);
                        childAt.setScaleX(1.0f);
                        sa5.d.a(childAt, new sa5.t(0.75f, 0.75f, null, 4, null), 300L, null);
                    }
                }
            }
            if (i17 == intValue2 && i17 != this.f173475g - 1) {
                a(true, i17);
                return;
            } else {
                if (i17 != intValue || intValue == 0) {
                    return;
                }
                a(false, i17);
                return;
            }
        }
        if (i17 == 0) {
            int childCount3 = getChildCount();
            int i29 = 0;
            while (i29 < childCount3) {
                android.view.View childAt2 = getChildAt(i29);
                kotlin.jvm.internal.o.d(childAt2);
                childAt2.clearAnimation();
                childAt2.setScaleY(1.0f);
                childAt2.setScaleX(1.0f);
                childAt2.setTag(java.lang.Integer.valueOf(i29));
                childAt2.setSelected(i17 == i29);
                i29++;
            }
            android.view.View childAt3 = getChildAt(4);
            kotlin.jvm.internal.o.f(childAt3, "getChildAt(...)");
            b(childAt3, false);
            return;
        }
        if (i17 == this.f173475g - 1) {
            for (int childCount4 = getChildCount() - 1; -1 < childCount4; childCount4--) {
                android.view.View childAt4 = getChildAt(childCount4);
                kotlin.jvm.internal.o.d(childAt4);
                childAt4.clearAnimation();
                childAt4.setScaleY(1.0f);
                childAt4.setScaleX(1.0f);
                childAt4.setTag(java.lang.Integer.valueOf(i17 - ((getChildCount() - 1) - childCount4)));
                java.lang.Object tag4 = childAt4.getTag();
                childAt4.setSelected((tag4 instanceof java.lang.Integer) && i17 == ((java.lang.Number) tag4).intValue());
            }
            android.view.View childAt5 = getChildAt(0);
            kotlin.jvm.internal.o.f(childAt5, "getChildAt(...)");
            b(childAt5, false);
        }
    }

    public StatusIndicator(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f173472d = i65.a.b(getContext(), 94);
        this.f173473e = com.tencent.mm.R.layout.dx9;
        this.f173476h = -1.0f;
    }
}
