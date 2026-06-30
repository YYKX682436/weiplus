package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class sl extends android.widget.PopupWindow {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f119797a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f119798b;

    /* renamed from: c, reason: collision with root package name */
    public long f119799c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f119800d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f119801e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f119802f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f119803g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f119804h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f119805i;

    /* renamed from: j, reason: collision with root package name */
    public int f119806j;

    /* renamed from: k, reason: collision with root package name */
    public int f119807k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.kl f119808l;

    /* renamed from: m, reason: collision with root package name */
    public int f119809m;

    /* renamed from: n, reason: collision with root package name */
    public int f119810n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f119811o;

    /* renamed from: p, reason: collision with root package name */
    public int f119812p;

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.r2 f119813q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f119799c = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        this.f119801e = com.tencent.mm.plugin.finder.live.widget.ol.f119307d;
        this.f119802f = com.tencent.mm.plugin.finder.live.widget.ml.f119080d;
        this.f119803g = com.tencent.mm.plugin.finder.live.widget.nl.f119192d;
        this.f119804h = com.tencent.mm.plugin.finder.live.widget.ll.f118950d;
        this.f119806j = context.getColor(com.tencent.mm.R.color.f479549ab0);
        this.f119807k = context.getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9);
        this.f119808l = com.tencent.mm.plugin.finder.live.widget.kl.f118845e;
        this.f119812p = -1;
        java.lang.Object systemService = context.getSystemService("layout_inflater");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        android.view.View inflate = ((android.view.LayoutInflater) systemService).inflate(com.tencent.mm.R.layout.do9, (android.view.ViewGroup) null);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.r9g);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f119797a = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.r1i);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f119798b = (android.widget.TextView) findViewById2;
        setBackgroundDrawable(null);
        setContentView(inflate);
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(false);
        update();
    }

    public final jz5.l a(android.view.View view, int[] location) {
        int height;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(location, "location");
        int i17 = this.f119809m + 4;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        int a17 = com.tencent.mm.plugin.appbrand.ui.u5.a(context, i17);
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int i18 = location[0];
        int i19 = location[1];
        int ordinal = this.f119808l.ordinal();
        android.widget.TextView textView = this.f119798b;
        android.view.View view2 = this.f119797a;
        if (ordinal == 0) {
            view2.setRotation(0.0f);
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.f10893h = 0;
            layoutParams2.f10906q = 0;
            textView.setLayoutParams(layoutParams2);
            if (this.f119811o) {
                getContentView().measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = getContentView().getMeasuredWidth();
                int i27 = view.getContext().getResources().getDisplayMetrics().widthPixels;
                int i28 = this.f119812p;
                if (i28 < 0) {
                    i28 = (i27 - measuredWidth) / 2;
                }
                int width = location[0] + (view.getWidth() / 2);
                android.content.Context context2 = view.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                int a18 = (width - i28) - com.tencent.mm.plugin.appbrand.ui.u5.a(context2, 4);
                int i29 = a18 >= 0 ? a18 : 0;
                android.view.ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams4 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams3;
                layoutParams4.setMarginStart(i29);
                layoutParams4.f10895i = com.tencent.mm.R.id.r1i;
                layoutParams4.f10906q = com.tencent.mm.R.id.r1i;
                view2.setLayoutParams(layoutParams4);
                i18 = i28;
            } else {
                android.view.ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
                if (layoutParams5 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams6 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams5;
                android.content.Context context3 = view.getContext();
                kotlin.jvm.internal.o.f(context3, "getContext(...)");
                layoutParams6.setMarginStart(com.tencent.mm.plugin.appbrand.ui.u5.a(context3, this.f119809m + this.f119810n));
                layoutParams6.f10895i = com.tencent.mm.R.id.r1i;
                layoutParams6.f10906q = com.tencent.mm.R.id.r1i;
                view2.setLayoutParams(layoutParams6);
                android.view.ViewGroup.LayoutParams layoutParams7 = textView.getLayoutParams();
                if (layoutParams7 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                android.content.Context context4 = view.getContext();
                kotlin.jvm.internal.o.f(context4, "getContext(...)");
                this.f119810n = com.tencent.mm.plugin.appbrand.ui.u5.a(context4, this.f119810n);
                textView.setLayoutParams((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams7);
                i18 -= (this.f119810n + a17) - (view.getWidth() / 2);
            }
            getContentView().measure(makeMeasureSpec, makeMeasureSpec);
            i19 -= getContentView().getMeasuredHeight();
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                android.view.ViewGroup.LayoutParams layoutParams8 = view2.getLayoutParams();
                if (layoutParams8 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams9 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams8;
                android.content.Context context5 = view.getContext();
                kotlin.jvm.internal.o.f(context5, "getContext(...)");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams9).topMargin = com.tencent.mm.plugin.appbrand.ui.u5.a(context5, this.f119809m);
                layoutParams9.f10905p = com.tencent.mm.R.id.r1i;
                layoutParams9.f10893h = com.tencent.mm.R.id.r1i;
                view2.setLayoutParams(layoutParams9);
                view2.setRotation(270.0f);
                android.view.ViewGroup.LayoutParams layoutParams10 = textView.getLayoutParams();
                if (layoutParams10 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams11 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams10;
                layoutParams11.f10893h = 0;
                layoutParams11.f10906q = 0;
                textView.setLayoutParams(layoutParams11);
                getContentView().measure(makeMeasureSpec, makeMeasureSpec);
                i18 -= getContentView().getMeasuredWidth();
                height = view.getHeight() / 2;
            } else if (ordinal == 3) {
                android.view.ViewGroup.LayoutParams layoutParams12 = view2.getLayoutParams();
                if (layoutParams12 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams13 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams12;
                android.content.Context context6 = view.getContext();
                kotlin.jvm.internal.o.f(context6, "getContext(...)");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams13).topMargin = com.tencent.mm.plugin.appbrand.ui.u5.a(context6, this.f119809m);
                layoutParams13.f10906q = 0;
                layoutParams13.f10893h = com.tencent.mm.R.id.r1i;
                view2.setLayoutParams(layoutParams13);
                view2.setRotation(90.0f);
                android.view.ViewGroup.LayoutParams layoutParams14 = textView.getLayoutParams();
                if (layoutParams14 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams15 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams14;
                layoutParams15.f10893h = 0;
                layoutParams15.f10905p = com.tencent.mm.R.id.r9g;
                textView.setLayoutParams(layoutParams15);
                i18 += view.getWidth();
                height = view.getHeight() / 2;
            }
            i19 -= a17 - height;
        } else {
            view2.setRotation(180.0f);
            android.view.ViewGroup.LayoutParams layoutParams16 = textView.getLayoutParams();
            if (layoutParams16 == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams17 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams16;
            layoutParams17.f10895i = com.tencent.mm.R.id.r9g;
            layoutParams17.f10906q = 0;
            textView.setLayoutParams(layoutParams17);
            if (this.f119811o) {
                getContentView().measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth2 = getContentView().getMeasuredWidth();
                int i37 = view.getContext().getResources().getDisplayMetrics().widthPixels;
                i18 = this.f119812p;
                if (i18 < 0) {
                    i18 = (i37 - measuredWidth2) / 2;
                }
                int width2 = location[0] + (view.getWidth() / 2);
                android.content.Context context7 = view.getContext();
                kotlin.jvm.internal.o.f(context7, "getContext(...)");
                int a19 = (width2 - i18) - com.tencent.mm.plugin.appbrand.ui.u5.a(context7, 4);
                if (a19 < 0) {
                    a19 = 0;
                }
                android.view.ViewGroup.LayoutParams layoutParams18 = view2.getLayoutParams();
                if (layoutParams18 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams19 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams18;
                layoutParams19.setMarginStart(a19);
                layoutParams19.f10893h = 0;
                layoutParams19.f10906q = com.tencent.mm.R.id.r1i;
                view2.setLayoutParams(layoutParams19);
            } else {
                android.view.ViewGroup.LayoutParams layoutParams20 = view2.getLayoutParams();
                if (layoutParams20 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams21 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams20;
                android.content.Context context8 = view.getContext();
                kotlin.jvm.internal.o.f(context8, "getContext(...)");
                layoutParams21.setMarginStart(com.tencent.mm.plugin.appbrand.ui.u5.a(context8, this.f119809m + this.f119810n));
                layoutParams21.f10893h = 0;
                layoutParams21.f10906q = com.tencent.mm.R.id.r1i;
                view2.setLayoutParams(layoutParams21);
                android.view.ViewGroup.LayoutParams layoutParams22 = textView.getLayoutParams();
                if (layoutParams22 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                android.content.Context context9 = view.getContext();
                kotlin.jvm.internal.o.f(context9, "getContext(...)");
                this.f119810n = com.tencent.mm.plugin.appbrand.ui.u5.a(context9, this.f119810n);
                textView.setLayoutParams((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams22);
                i18 -= (this.f119810n + a17) - (view.getWidth() / 2);
            }
            i19 += view.getHeight();
        }
        return new jz5.l(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    public final com.tencent.mm.plugin.finder.live.widget.sl b() {
        int i17 = this.f119806j;
        android.widget.TextView textView = this.f119798b;
        android.graphics.drawable.Drawable drawable = textView.getResources().getDrawable(com.tencent.mm.R.drawable.f481693v2);
        android.graphics.drawable.GradientDrawable gradientDrawable = drawable instanceof android.graphics.drawable.GradientDrawable ? (android.graphics.drawable.GradientDrawable) drawable : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i17);
        }
        textView.setBackground(gradientDrawable);
        android.view.View view = this.f119797a;
        android.graphics.drawable.Drawable drawable2 = view.getResources().getDrawable(com.tencent.mm.R.drawable.f481692v1);
        android.graphics.drawable.RotateDrawable rotateDrawable = drawable2 instanceof android.graphics.drawable.RotateDrawable ? (android.graphics.drawable.RotateDrawable) drawable2 : null;
        if (rotateDrawable != null) {
            android.graphics.drawable.Drawable drawable3 = rotateDrawable.getDrawable();
            android.graphics.drawable.GradientDrawable gradientDrawable2 = drawable3 instanceof android.graphics.drawable.GradientDrawable ? (android.graphics.drawable.GradientDrawable) drawable3 : null;
            if (gradientDrawable2 != null) {
                gradientDrawable2.setColor(i17);
            }
            view.setBackground(rotateDrawable);
        }
        textView.setTextColor(this.f119807k);
        return this;
    }

    public final com.tencent.mm.plugin.finder.live.widget.sl c(java.lang.String message) {
        kotlin.jvm.internal.o.g(message, "message");
        this.f119798b.setText(message);
        return this;
    }

    public final com.tencent.mm.plugin.finder.live.widget.sl d(kotlinx.coroutines.y0 scope) {
        kotlin.jvm.internal.o.g(scope, "scope");
        android.view.View view = this.f119800d;
        if (view != null) {
            if (!view.isAttachedToWindow()) {
                view = null;
            }
            if (view != null) {
                android.content.Context context = view.getContext();
                android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                if ((activity == null) || activity.isFinishing() || activity.isDestroyed()) {
                    this.f119803g.invoke();
                    return this;
                }
                kotlinx.coroutines.r2 r2Var = this.f119813q;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                this.f119813q = kotlinx.coroutines.l.d(scope, null, null, new com.tencent.mm.plugin.finder.live.widget.rl(view, this, null), 3, null);
                return this;
            }
        }
        this.f119803g.invoke();
        return this;
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        kotlinx.coroutines.r2 r2Var = this.f119813q;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        super.dismiss();
    }
}
