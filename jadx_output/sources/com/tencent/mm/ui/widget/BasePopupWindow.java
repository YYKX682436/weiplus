package com.tencent.mm.ui.widget;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\r"}, d2 = {"Lcom/tencent/mm/ui/widget/BasePopupWindow;", "Landroid/widget/PopupWindow;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "al5/f", "al5/g", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class BasePopupWindow extends android.widget.PopupWindow {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f211244a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.FrameLayout f211245b;

    /* renamed from: c, reason: collision with root package name */
    public int f211246c;

    /* renamed from: d, reason: collision with root package name */
    public int f211247d;

    /* renamed from: e, reason: collision with root package name */
    public int f211248e;

    /* renamed from: f, reason: collision with root package name */
    public int f211249f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BasePopupWindow(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a(android.view.View view, al5.f horizontalAlign, al5.g verticalAlign, int i17, int i18, yz5.a aVar, yz5.a aVar2) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(horizontalAlign, "horizontalAlign");
        kotlin.jvm.internal.o.g(verticalAlign, "verticalAlign");
        setFocusable(false);
        setOutsideTouchable(true);
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getGlobalVisibleRect(rect);
        setTouchInterceptor(new al5.h(rect, this));
        getContentView().setOnClickListener(new al5.i(this, aVar));
        if (aVar2 != null) {
            setOnDismissListener(new al5.j(this, aVar2));
        }
        if (getBackground() == null) {
            setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.Object[] objArr = {new com.tencent.mm.sdk.platformtools.z3()};
        java.lang.String str = this.f211244a;
        com.tencent.mars.xlog.Log.i(str, "measureContentView: %s", objArr);
        int i19 = com.tencent.mm.ui.bk.t().widthPixels;
        int i27 = com.tencent.mm.ui.bk.t().heightPixels;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        com.tencent.mars.xlog.Log.i(str, "anchorLocation in Window: %d, %d", java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]));
        setWidth(-2);
        setHeight(-2);
        int ordinal = horizontalAlign.ordinal();
        if (ordinal == 0) {
            this.f211248e = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479701cx);
        } else if (ordinal == 1) {
            this.f211248e = iArr[0];
        } else if (ordinal == 2) {
            this.f211248e = (i19 - iArr[0]) - view.getWidth();
        } else if (ordinal == 3) {
            this.f211248e = i19 - iArr[0];
        } else if (ordinal == 4) {
            this.f211248e = iArr[0] + view.getWidth();
        }
        int ordinal2 = verticalAlign.ordinal();
        if (ordinal2 == 0) {
            this.f211249f = i27;
        } else if (ordinal2 == 1) {
            this.f211249f = iArr[1];
        } else if (ordinal2 == 2) {
            this.f211249f = (i27 - iArr[1]) - view.getHeight();
        } else if (ordinal2 == 3) {
            this.f211249f = (i27 - iArr[1]) + view.getHeight();
        } else if (ordinal2 == 4) {
            this.f211249f = iArr[1] + view.getHeight();
        }
        com.tencent.mars.xlog.Log.i(str, "maxWidth: %d, maxHeight: %d", java.lang.Integer.valueOf(this.f211248e), java.lang.Integer.valueOf(this.f211248e));
        android.widget.FrameLayout frameLayout = this.f211245b;
        frameLayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.f211248e, android.view.View.MeasureSpec.getMode(Integer.MIN_VALUE)), android.view.View.MeasureSpec.makeMeasureSpec(this.f211249f, android.view.View.MeasureSpec.getMode(Integer.MIN_VALUE)));
        setWidth(java.lang.Math.min(frameLayout.getMeasuredWidth(), this.f211248e));
        setHeight(java.lang.Math.min(frameLayout.getMeasuredHeight(), this.f211249f));
        com.tencent.mars.xlog.Log.i(str, "computePosition: %s", new com.tencent.mm.sdk.platformtools.z3());
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr2);
        com.tencent.mars.xlog.Log.i(str, "anchorLocation in Window: %d, %d", java.lang.Integer.valueOf(iArr2[0]), java.lang.Integer.valueOf(iArr2[1]));
        this.f211246c = 0;
        this.f211247d = 0;
        int ordinal3 = horizontalAlign.ordinal();
        if (ordinal3 == 0) {
            this.f211246c = (-(frameLayout.getMeasuredWidth() - view.getWidth())) / 2;
        } else if (ordinal3 == 1) {
            this.f211246c = -frameLayout.getMeasuredWidth();
        } else if (ordinal3 == 2) {
            this.f211246c = view.getWidth();
        } else if (ordinal3 == 3) {
            this.f211246c = 0;
        } else if (ordinal3 == 4) {
            this.f211246c = view.getWidth() - frameLayout.getMeasuredWidth();
        }
        int ordinal4 = verticalAlign.ordinal();
        if (ordinal4 == 0) {
            this.f211247d = (-view.getHeight()) - ((frameLayout.getMeasuredHeight() - view.getHeight()) / 2);
        } else if (ordinal4 == 1) {
            this.f211247d = ((-frameLayout.getMeasuredHeight()) - view.getHeight()) + com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479738dv);
        } else if (ordinal4 == 2) {
            this.f211247d -= com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479738dv);
        } else if (ordinal4 == 3) {
            this.f211247d = -view.getHeight();
        } else if (ordinal4 == 4) {
            this.f211247d = -frameLayout.getMeasuredHeight();
        }
        int i28 = this.f211246c + i17;
        this.f211246c = i28;
        this.f211247d += i18;
        com.tencent.mars.xlog.Log.i(str, "res of computePosition: x=%d, y=%d", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(this.f211247d));
        com.tencent.mars.xlog.Log.i(str, "will show at location [" + this.f211246c + ", " + this.f211247d + "], isShowing=" + isShowing());
        if (isShowing()) {
            update(view, this.f211246c, this.f211247d, getWidth(), getHeight());
        } else {
            showAsDropDown(view, this.f211246c, this.f211247d);
        }
    }

    @Override // android.widget.PopupWindow
    public android.view.View getContentView() {
        android.view.View childAt = this.f211245b.getChildAt(0);
        kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
        return childAt;
    }

    @Override // android.widget.PopupWindow
    public void setContentView(android.view.View view) {
        android.widget.FrameLayout frameLayout = this.f211245b;
        frameLayout.removeAllViews();
        frameLayout.addView(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePopupWindow(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f211244a = "MicroMsg.BasePopupWindow";
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.f211245b = frameLayout;
        super.setContentView(frameLayout);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BasePopupWindow(android.view.View r3) {
        /*
            r2 = this;
            java.lang.String r0 = "contentView"
            kotlin.jvm.internal.o.g(r3, r0)
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "getContext(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            r1 = 0
            r2.<init>(r0, r1)
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r2.f211245b = r0
            super.setContentView(r0)
            r2.setContentView(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.BasePopupWindow.<init>(android.view.View):void");
    }
}
