package com.tencent.mm.ui.chatting.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bB#\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002J\u0010\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0007R$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/ui/chatting/view/FoldableCellLayout;", "Landroid/widget/FrameLayout;", "", "getPaddingLeftWithForeground", "getPaddingRightWithForeground", "getPaddingTopWithForeground", "getPaddingBottomWithForeground", "num", "Ljz5/f0;", "setBackgroundFillCardNum", "layoutId", "setBackgroundCardLayout", "height", "setHeightForAnim", "Landroid/view/View$OnClickListener;", "w", "Landroid/view/View$OnClickListener;", "getOnBackgroundCardClickListener", "()Landroid/view/View$OnClickListener;", "setOnBackgroundCardClickListener", "(Landroid/view/View$OnClickListener;)V", "OnBackgroundCardClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ViewWrapperForAnim", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class FoldableCellLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f202824d;

    /* renamed from: e, reason: collision with root package name */
    public final long f202825e;

    /* renamed from: f, reason: collision with root package name */
    public final long f202826f;

    /* renamed from: g, reason: collision with root package name */
    public final int f202827g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f202828h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f202829i;

    /* renamed from: m, reason: collision with root package name */
    public final int f202830m;

    /* renamed from: n, reason: collision with root package name */
    public final float f202831n;

    /* renamed from: o, reason: collision with root package name */
    public final int f202832o;

    /* renamed from: p, reason: collision with root package name */
    public final int f202833p;

    /* renamed from: q, reason: collision with root package name */
    public final int f202834q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f202835r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f202836s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f202837t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f202838u;

    /* renamed from: v, reason: collision with root package name */
    public int f202839v;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public android.view.View.OnClickListener OnBackgroundCardClickListener;

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\t"}, d2 = {"Lcom/tencent/mm/ui/chatting/view/FoldableCellLayout$ViewWrapperForAnim;", "", "", "width", "Ljz5/f0;", "setWidthForAnim", "", "scaleX", "setScaleX", "app_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class ViewWrapperForAnim {

        /* renamed from: a, reason: collision with root package name */
        public final android.view.View f202841a;

        public ViewWrapperForAnim(android.view.View targetView) {
            kotlin.jvm.internal.o.g(targetView, "targetView");
            this.f202841a = targetView;
        }

        public final void setScaleX(float f17) {
            this.f202841a.setScaleX(f17);
        }

        public final void setWidthForAnim(int i17) {
            android.view.View view = this.f202841a;
            view.getLayoutParams().width = i17;
            view.requestLayout();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoldableCellLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f202824d = "MicroMsg.CardCellLayout";
        this.f202825e = 150L;
        this.f202826f = 200L;
        this.f202827g = 2;
        this.f202835r = new java.util.ArrayList();
        this.f202836s = new java.util.ArrayList();
        this.f202837t = new java.util.ArrayList();
        this.f202838u = new java.util.ArrayList(1);
        setForegroundGravity(1);
        this.f202830m = getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479924j3);
        this.f202831n = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480242sb);
        this.f202832o = getContext().getResources().getColor(com.tencent.mm.R.color.f478819i4);
        this.f202833p = getContext().getResources().getColor(com.tencent.mm.R.color.f478818i3);
        this.f202834q = getContext().getResources().getColor(android.R.color.transparent);
    }

    private final int getPaddingBottomWithForeground() {
        int paddingBottom = getPaddingBottom();
        if (paddingBottom < 0) {
            return 0;
        }
        return paddingBottom;
    }

    private final int getPaddingLeftWithForeground() {
        int paddingLeft = getPaddingLeft();
        if (paddingLeft < 0) {
            return 0;
        }
        return paddingLeft;
    }

    private final int getPaddingRightWithForeground() {
        int paddingRight = getPaddingRight();
        if (paddingRight < 0) {
            return 0;
        }
        return paddingRight;
    }

    private final int getPaddingTopWithForeground() {
        int paddingTop = getPaddingTop();
        if (paddingTop < 0) {
            return 0;
        }
        return paddingTop;
    }

    public final void a(android.view.View contentView, android.widget.FrameLayout.LayoutParams params) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        kotlin.jvm.internal.o.g(params, "params");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        android.view.View inflate = android.view.View.inflate(frameLayout.getContext(), this.f202839v, null);
        int i17 = this.f202830m * 2;
        float f17 = this.f202831n;
        frameLayout.addView(inflate, new android.widget.FrameLayout.LayoutParams(-1, i17 + ((int) f17)));
        params.topMargin = (int) f17;
        frameLayout.addView(contentView, params);
        frameLayout.setTag(contentView.getTag());
        frameLayout.setId(com.tencent.mm.R.id.bqv);
        addView(frameLayout, new android.widget.FrameLayout.LayoutParams(-2, -2));
    }

    public final boolean b(android.view.View view, int i17) {
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.bo6);
        if (findViewById == null) {
            return false;
        }
        if (i17 == this.f202834q) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/chatting/view/FoldableCellLayout", "changeCardShadow", "(Landroid/view/View;I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/view/FoldableCellLayout", "changeCardShadow", "(Landroid/view/View;I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/ui/chatting/view/FoldableCellLayout", "changeCardShadow", "(Landroid/view/View;I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/view/FoldableCellLayout", "changeCardShadow", "(Landroid/view/View;I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.graphics.drawable.Drawable background = findViewById.getBackground();
        if (background != null) {
            background.setTintMode(android.graphics.PorterDuff.Mode.MULTIPLY);
            background.setTint(i17);
        }
        ((java.util.ArrayList) this.f202836s).add(findViewById);
        return true;
    }

    public final void c(android.view.View view, int i17, int i18, int i19, int i27, int i28, boolean z17) {
        int i29;
        int i37;
        int paddingLeftWithForeground = getPaddingLeftWithForeground();
        int paddingRightWithForeground = (i19 - i17) - getPaddingRightWithForeground();
        int paddingTopWithForeground = getPaddingTopWithForeground();
        getPaddingBottomWithForeground();
        if (view.getVisibility() != 8) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int absoluteGravity = android.view.Gravity.getAbsoluteGravity(1, getLayoutDirection()) & 7;
            if (absoluteGravity != 1) {
                if (absoluteGravity == 3) {
                    i37 = layoutParams2.leftMargin;
                } else if (absoluteGravity != 5) {
                    i37 = layoutParams2.leftMargin;
                } else if (z17) {
                    i37 = layoutParams2.leftMargin;
                } else {
                    i29 = (paddingRightWithForeground - measuredWidth) - layoutParams2.rightMargin;
                }
                i29 = paddingLeftWithForeground + i37;
            } else {
                i29 = ((paddingLeftWithForeground + (((paddingRightWithForeground - paddingLeftWithForeground) - measuredWidth) / 2)) + layoutParams2.leftMargin) - layoutParams2.rightMargin;
            }
            int i38 = paddingTopWithForeground + layoutParams2.topMargin + i28;
            view.layout(i29, i38, measuredWidth + i29, measuredHeight + i38);
        }
    }

    public final void d(android.view.View view, int i17, int i18, int i19, int i27) {
        int childMeasureSpec;
        int childMeasureSpec2;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams.width == -1) {
            int measuredWidth = (((((getMeasuredWidth() - getPaddingLeftWithForeground()) - getPaddingRightWithForeground()) - marginLayoutParams.leftMargin) - i19) - marginLayoutParams.rightMargin) - i19;
            if (measuredWidth <= 0) {
                measuredWidth = 0;
            }
            childMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        } else {
            childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(i17, getPaddingLeftWithForeground() + getPaddingRightWithForeground() + marginLayoutParams.leftMargin + i19 + marginLayoutParams.rightMargin + i19, marginLayoutParams.width);
        }
        if (marginLayoutParams.height == -1) {
            int measuredHeight = ((((getMeasuredHeight() - getPaddingTopWithForeground()) - getPaddingBottomWithForeground()) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin) - i27;
            childMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight > 0 ? measuredHeight : 0, 1073741824);
        } else {
            childMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(i18, getPaddingTopWithForeground() + getPaddingBottomWithForeground() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i27, marginLayoutParams.height);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void e(yz5.a aVar) {
        android.animation.ObjectAnimator ofFloat;
        com.tencent.mars.xlog.Log.i(this.f202824d, "prepare to pull down, exported: " + this.f202829i + ", isExcuting: " + this.f202828h);
        if (this.f202829i || this.f202828h) {
            return;
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(this, "heightForAnim", getMeasuredHeight(), getMeasuredHeight() * getChildCount());
        if (getChildCount() <= 1) {
            return;
        }
        android.animation.AnimatorSet.Builder play = animatorSet.play(ofInt);
        android.view.View childAt = getChildAt(0);
        int childCount = getChildCount();
        int i17 = this.f202830m;
        if (childCount > 2) {
            kotlin.jvm.internal.o.d(childAt);
            ofFloat = android.animation.ObjectAnimator.ofFloat(new com.tencent.mm.ui.chatting.view.FoldableCellLayout.ViewWrapperForAnim(childAt), "scaleX", childAt.getMeasuredWidth() / (childAt.getMeasuredWidth() + ((i17 * 2) * 2.0f)), 1.0f);
        } else {
            kotlin.jvm.internal.o.d(childAt);
            ofFloat = android.animation.ObjectAnimator.ofFloat(new com.tencent.mm.ui.chatting.view.FoldableCellLayout.ViewWrapperForAnim(childAt), "scaleX", childAt.getMeasuredWidth() / (childAt.getMeasuredWidth() + (i17 * 2.0f)), 1.0f);
        }
        play.with(ofFloat);
        android.view.View childAt2 = getChildAt(1);
        if (getChildCount() > 2) {
            kotlin.jvm.internal.o.d(childAt2);
            play.with(android.animation.ObjectAnimator.ofFloat(new com.tencent.mm.ui.chatting.view.FoldableCellLayout.ViewWrapperForAnim(childAt2), "scaleX", childAt2.getMeasuredWidth() / (childAt2.getMeasuredWidth() + (i17 * 2.0f)), 1.0f));
        }
        android.view.View childAt3 = getChildAt(0);
        float f17 = 0.0f;
        float f18 = this.f202831n;
        play.with(android.animation.ObjectAnimator.ofFloat(childAt3, "translationY", 0.0f, -f18));
        int childCount2 = getChildCount();
        int i18 = 0;
        int i19 = 1;
        while (i19 < childCount2) {
            android.view.View childAt4 = getChildAt(i19);
            i18 += getChildAt(i19 - 1).getMeasuredHeight();
            float[] fArr = new float[2];
            fArr[0] = f17;
            int i27 = 2 > i19 ? i19 : 2;
            i19++;
            int i28 = (i18 - (i27 * i17)) - (((int) f18) * i19);
            if (i28 <= 0) {
                i28 = 0;
            }
            fArr[1] = i28;
            play.with(android.animation.ObjectAnimator.ofFloat(childAt4, "translationY", fArr));
            f17 = 0.0f;
        }
        animatorSet.setDuration(getChildCount() >= 5 ? this.f202826f : this.f202825e);
        animatorSet.addListener(new com.tencent.mm.ui.chatting.view.c0(this, aVar, animatorSet));
        if (getChildCount() > 2) {
            int childCount3 = getChildCount() - 1;
            for (int i29 = 2; i29 < childCount3; i29++) {
                android.view.View childAt5 = getChildAt(i29);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(childAt5, arrayList.toArray(), "com/tencent/mm/ui/chatting/view/FoldableCellLayout", "pullDownContent", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt5.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(childAt5, "com/tencent/mm/ui/chatting/view/FoldableCellLayout", "pullDownContent", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        animatorSet.start();
    }

    public final boolean f(android.view.View view, boolean z17) {
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.bo7);
        if (findViewById == null) {
            return false;
        }
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/chatting/view/FoldableCellLayout", "setElevation", "(Landroid/view/View;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/view/FoldableCellLayout", "setElevation", "(Landroid/view/View;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }

    public final android.view.View.OnClickListener getOnBackgroundCardClickListener() {
        return this.OnBackgroundCardClickListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f202837t.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f202837t.clear();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        if (getChildCount() <= 2) {
            if (getChildCount() > 1) {
                android.view.View childAt = getChildAt(0);
                kotlin.jvm.internal.o.d(childAt);
                c(childAt, i17, i18, i19, i27, 0, false);
                android.view.View childAt2 = getChildAt(1);
                kotlin.jvm.internal.o.d(childAt2);
                c(childAt2, i17, i18, i19, i27, this.f202830m, false);
                return;
            }
            return;
        }
        android.view.View childAt3 = getChildAt(0);
        kotlin.jvm.internal.o.d(childAt3);
        c(childAt3, i17, i18, i19, i27, 0, false);
        android.view.View childAt4 = getChildAt(1);
        kotlin.jvm.internal.o.d(childAt4);
        c(childAt4, i17, i18, i19, i27, this.f202830m, false);
        int childCount = getChildCount();
        for (int i28 = 2; i28 < childCount; i28++) {
            android.view.View childAt5 = getChildAt(i28);
            kotlin.jvm.internal.o.d(childAt5);
            c(childAt5, i17, i18, i19, i27, this.f202830m * 2, false);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        if (this.f202828h || this.f202829i) {
            super.onMeasure(i17, i18);
            return;
        }
        int childCount = getChildCount();
        int i27 = this.f202834q;
        int i28 = this.f202832o;
        if (childCount > 2) {
            android.view.View childAt = getChildAt(0);
            kotlin.jvm.internal.o.d(childAt);
            b(childAt, this.f202833p);
            f(childAt, false);
            android.view.View childAt2 = getChildAt(1);
            kotlin.jvm.internal.o.d(childAt2);
            b(childAt2, i28);
            f(childAt2, true);
            android.view.View childAt3 = getChildAt(childCount - 1);
            kotlin.jvm.internal.o.d(childAt3);
            b(childAt3, i27);
            f(childAt3, true);
        } else if (childCount > 1) {
            android.view.View childAt4 = getChildAt(0);
            kotlin.jvm.internal.o.d(childAt4);
            b(childAt4, i28);
            f(childAt4, false);
            android.view.View childAt5 = getChildAt(1);
            kotlin.jvm.internal.o.d(childAt5);
            b(childAt5, i27);
            f(childAt5, true);
        }
        boolean z17 = (android.view.View.MeasureSpec.getMode(i17) == 1073741824 && android.view.View.MeasureSpec.getMode(i18) == 1073741824) ? false : true;
        java.util.ArrayList arrayList = this.f202838u;
        arrayList.clear();
        int i29 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        while (true) {
            i19 = this.f202830m;
            if (i37 >= childCount) {
                break;
            }
            android.view.View childAt6 = getChildAt(i37);
            if (childAt6.getVisibility() != 8) {
                int i47 = i29;
                measureChildWithMargins(childAt6, i17, 0, i18, 0);
                android.view.ViewGroup.LayoutParams layoutParams = childAt6.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                int measuredWidth = childAt6.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin;
                if (i38 < measuredWidth) {
                    i38 = measuredWidth;
                }
                int measuredHeight = childAt6.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin + (i19 * (2 > i37 ? i37 : 2));
                if (i39 < measuredHeight) {
                    i39 = measuredHeight;
                }
                i29 = android.view.View.combineMeasuredStates(i47, childAt6.getMeasuredState());
                if (z17 && (layoutParams2.width == -1 || layoutParams2.height == -1)) {
                    arrayList.add(childAt6);
                }
            }
            i37++;
        }
        int i48 = i29;
        int paddingLeftWithForeground = i38 + getPaddingLeftWithForeground() + getPaddingRightWithForeground();
        int max = java.lang.Math.max(i39 + getPaddingTopWithForeground() + getPaddingBottomWithForeground(), getSuggestedMinimumHeight());
        int max2 = java.lang.Math.max(paddingLeftWithForeground, getSuggestedMinimumWidth());
        android.graphics.drawable.Drawable foreground = getForeground();
        if (foreground != null) {
            int minimumHeight = foreground.getMinimumHeight();
            if (max < minimumHeight) {
                max = minimumHeight;
            }
            int minimumWidth = foreground.getMinimumWidth();
            if (max2 < minimumWidth) {
                max2 = minimumWidth;
            }
        }
        setMeasuredDimension(android.view.View.resolveSizeAndState(max2, i17, i48), android.view.View.resolveSizeAndState(max, i18, i48 << 16));
        float f17 = this.f202831n;
        if (childCount <= 2) {
            if (childCount > 1) {
                android.view.View childAt7 = getChildAt(0);
                kotlin.jvm.internal.o.d(childAt7);
                d(childAt7, i17, i18, this.f202830m, (int) f17);
                android.view.View childAt8 = getChildAt(1);
                kotlin.jvm.internal.o.d(childAt8);
                d(childAt8, i17, i18, 0, 0);
                return;
            }
            return;
        }
        android.view.View childAt9 = getChildAt(0);
        kotlin.jvm.internal.o.d(childAt9);
        d(childAt9, i17, i18, i19 * 2, (int) f17);
        android.view.View childAt10 = getChildAt(1);
        kotlin.jvm.internal.o.d(childAt10);
        d(childAt10, i17, i18, this.f202830m, (int) f17);
        for (int i49 = 2; i49 < childCount; i49++) {
            android.view.View childAt11 = getChildAt(i49);
            kotlin.jvm.internal.o.d(childAt11);
            d(childAt11, i17, i18, 0, 0);
            if (i49 != childCount - 1) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(childAt11, arrayList2.toArray(), "com/tencent/mm/ui/chatting/view/FoldableCellLayout", "onMeasure", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt11.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(childAt11, "com/tencent/mm/ui/chatting/view/FoldableCellLayout", "onMeasure", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public final void setBackgroundCardLayout(int i17) {
        this.f202839v = i17;
        java.util.List list = this.f202837t;
        if (list.isEmpty()) {
            android.view.View inflate = android.view.View.inflate(getContext(), this.f202839v, null);
            inflate.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, this.f202830m * 2));
            inflate.setOnClickListener(this.OnBackgroundCardClickListener);
            list.add(inflate);
        }
    }

    public final void setBackgroundFillCardNum(int i17) {
        int i18 = this.f202827g;
        int i19 = i17;
        if (i18 <= i19) {
            i19 = i18;
        }
        boolean z17 = this.f202829i;
        java.util.List list = this.f202837t;
        if (z17 || this.f202828h) {
            removeAllViews();
            getLayoutParams().height = -2;
            ((java.util.ArrayList) list).clear();
        }
        int i27 = i19 + 1;
        int childCount = getChildCount();
        int i28 = 0;
        for (int i29 = childCount - 1; i28 < i29; i29 = i29) {
            android.view.View childAt = getChildAt(i28);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/ui/chatting/view/FoldableCellLayout", "setBackgroundFillCardNum", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(childAt, "com/tencent/mm/ui/chatting/view/FoldableCellLayout", "setBackgroundFillCardNum", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i28++;
        }
        if (childCount < i27) {
            int i37 = findViewById(com.tencent.mm.R.id.bqv) == null ? i19 - childCount : i27 - childCount;
            for (int i38 = 0; i38 < i37; i38++) {
                boolean z18 = !list.isEmpty();
                float f17 = this.f202831n;
                int i39 = this.f202830m;
                if (z18) {
                    android.view.View view = (android.view.View) ((java.util.ArrayList) list).remove(0);
                    view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, (i39 * 2) + ((int) f17)));
                    view.setOnClickListener(this.OnBackgroundCardClickListener);
                    addView(view, 0);
                } else {
                    android.view.View inflate = android.view.View.inflate(getContext(), this.f202839v, null);
                    inflate.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, (i39 * 2) + ((int) f17)));
                    inflate.setOnClickListener(this.OnBackgroundCardClickListener);
                    addView(inflate, 0);
                }
            }
        } else if (childCount > i27) {
            if (findViewById(com.tencent.mm.R.id.bqv) != null) {
                i19 = i27;
            }
            while (i19 < childCount) {
                if (((java.util.ArrayList) list).size() < i18) {
                    android.view.View childAt2 = getChildAt(0);
                    kotlin.jvm.internal.o.f(childAt2, "getChildAt(...)");
                    ((java.util.ArrayList) list).add(childAt2);
                }
                removeViewAt(0);
                i19++;
            }
        }
        this.f202829i = false;
        this.f202828h = false;
    }

    public final void setHeightForAnim(int i17) {
        getLayoutParams().height = i17;
        requestLayout();
    }

    public final void setOnBackgroundCardClickListener(android.view.View.OnClickListener onClickListener) {
        this.OnBackgroundCardClickListener = onClickListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoldableCellLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f202824d = "MicroMsg.CardCellLayout";
        this.f202825e = 150L;
        this.f202826f = 200L;
        this.f202827g = 2;
        this.f202835r = new java.util.ArrayList();
        this.f202836s = new java.util.ArrayList();
        this.f202837t = new java.util.ArrayList();
        this.f202838u = new java.util.ArrayList(1);
        setForegroundGravity(1);
        this.f202830m = getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479924j3);
        this.f202831n = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480242sb);
        this.f202832o = getContext().getResources().getColor(com.tencent.mm.R.color.f478819i4);
        this.f202833p = getContext().getResources().getColor(com.tencent.mm.R.color.f478818i3);
        this.f202834q = getContext().getResources().getColor(android.R.color.transparent);
    }
}
