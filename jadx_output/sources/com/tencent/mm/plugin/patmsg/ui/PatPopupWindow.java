package com.tencent.mm.plugin.patmsg.ui;

/* loaded from: classes5.dex */
public class PatPopupWindow extends android.widget.PopupWindow {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f152896a;

    /* renamed from: b, reason: collision with root package name */
    public int f152897b;

    /* renamed from: c, reason: collision with root package name */
    public int f152898c;

    /* renamed from: d, reason: collision with root package name */
    public int f152899d;

    /* renamed from: e, reason: collision with root package name */
    public int f152900e;

    /* renamed from: f, reason: collision with root package name */
    public int f152901f;

    /* renamed from: g, reason: collision with root package name */
    public int f152902g;

    /* renamed from: h, reason: collision with root package name */
    public int f152903h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnGlobalLayoutListener f152904i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f152905j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.View f152906k;

    public PatPopupWindow(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public void a(android.view.View view, int i17, int i18, android.widget.FrameLayout.LayoutParams layoutParams, boolean z17, boolean z18, boolean z19) {
        this.f152906k = view;
        if (z19) {
            setAnimationStyle(com.tencent.mm.R.style.f494449yy);
        } else if (i18 == 2) {
            if (z17) {
                setAnimationStyle(com.tencent.mm.R.style.f494448oo);
            } else {
                setAnimationStyle(com.tencent.mm.R.style.f494446nc);
            }
        } else if (z17) {
            setAnimationStyle(com.tencent.mm.R.style.f494447om);
        }
        if (getBackground() == null) {
            setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        }
        android.view.View contentView = getContentView();
        if (contentView == null) {
            return;
        }
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = layoutParams.leftMargin;
        layoutParams2.rightMargin = layoutParams.rightMargin;
        layoutParams2.topMargin = layoutParams.topMargin;
        layoutParams2.bottomMargin = layoutParams.bottomMargin;
        contentView.setLayoutParams(layoutParams2);
        int i19 = com.tencent.mm.ui.bk.t().widthPixels;
        int i27 = com.tencent.mm.ui.bk.t().heightPixels;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        setWidth(-2);
        setHeight(-2);
        if (i17 == 0) {
            this.f152899d = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479701cx);
        } else if (i17 == 1) {
            this.f152899d = iArr[0];
        } else if (i17 == 2) {
            this.f152899d = (i19 - iArr[0]) - view.getWidth();
        } else if (i17 == 3) {
            this.f152899d = i19 - iArr[0];
        } else if (i17 == 4) {
            this.f152899d = iArr[0] + view.getWidth();
        }
        if (i18 == 0) {
            this.f152900e = i27;
        } else if (i18 == 1) {
            this.f152900e = iArr[1];
        } else if (i18 == 2) {
            this.f152900e = (i27 - iArr[1]) - view.getHeight();
        } else if (i18 == 3) {
            this.f152900e = (i27 - iArr[1]) + view.getHeight();
        } else if (i18 == 4) {
            this.f152900e = iArr[1] + view.getHeight();
        }
        android.widget.FrameLayout frameLayout = this.f152896a;
        frameLayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.f152899d, android.view.View.MeasureSpec.getMode(Integer.MIN_VALUE)), android.view.View.MeasureSpec.makeMeasureSpec(this.f152900e, android.view.View.MeasureSpec.getMode(Integer.MIN_VALUE)));
        setWidth(java.lang.Math.min(frameLayout.getMeasuredWidth(), this.f152899d));
        setHeight(java.lang.Math.min(frameLayout.getMeasuredHeight(), this.f152900e));
        frameLayout.getMeasuredWidth();
        frameLayout.getMeasuredHeight();
        view.getLocationInWindow(new int[2]);
        this.f152897b = 0;
        this.f152898c = 0;
        if (i17 == 0) {
            this.f152897b = (-(frameLayout.getMeasuredWidth() - view.getWidth())) / 2;
        } else if (i17 == 1) {
            this.f152897b = -frameLayout.getMeasuredWidth();
        } else if (i17 == 2) {
            this.f152897b = view.getWidth();
        } else if (i17 == 4) {
            this.f152897b = view.getWidth() - frameLayout.getMeasuredWidth();
        }
        if (i18 == 0) {
            this.f152898c = (-view.getHeight()) - ((frameLayout.getMeasuredHeight() - view.getHeight()) / 2);
        } else if (i18 == 1) {
            this.f152898c = ((-frameLayout.getMeasuredHeight()) - view.getHeight()) + com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479738dv);
        } else if (i18 == 2) {
            this.f152898c -= com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479738dv);
        } else if (i18 == 3) {
            this.f152898c = -view.getHeight();
        } else if (i18 == 4) {
            this.f152898c = -frameLayout.getMeasuredHeight();
        }
        if (z18) {
            this.f152903h = 0;
            this.f152904i = new pp3.l(this, view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.f152904i);
        }
        if (isShowing()) {
            update(view, this.f152897b, this.f152898c, getWidth(), getHeight());
        } else {
            showAsDropDown(view, this.f152897b, this.f152898c);
        }
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        super.dismiss();
        this.f152903h = 0;
        android.view.View view = this.f152906k;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f152904i);
        }
    }

    @Override // android.widget.PopupWindow
    public android.view.View getContentView() {
        return this.f152896a.getChildAt(0);
    }

    @Override // android.widget.PopupWindow
    public void setContentView(android.view.View view) {
        android.widget.FrameLayout frameLayout = this.f152896a;
        frameLayout.removeAllViews();
        frameLayout.addView(view);
    }

    @Override // android.widget.PopupWindow
    public void update() {
        super.update();
    }

    public PatPopupWindow(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f152905j = new int[2];
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.f152896a = frameLayout;
        super.setContentView(frameLayout);
    }

    public PatPopupWindow(android.view.View view) {
        this(view.getContext(), null);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(view.getContext());
        this.f152896a = frameLayout;
        super.setContentView(frameLayout);
        setContentView(view);
    }
}
