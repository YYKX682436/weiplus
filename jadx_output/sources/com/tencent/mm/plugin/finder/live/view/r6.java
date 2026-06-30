package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class r6 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f116631a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.s6 f116632b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f116633c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f116634d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f116635e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f116636f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f116637g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f116638h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f116639i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f116640j;

    /* renamed from: k, reason: collision with root package name */
    public final int f116641k;

    /* renamed from: l, reason: collision with root package name */
    public final int f116642l;

    /* renamed from: m, reason: collision with root package name */
    public final int f116643m;

    /* renamed from: n, reason: collision with root package name */
    public final int f116644n;

    /* renamed from: o, reason: collision with root package name */
    public final int f116645o;

    /* renamed from: p, reason: collision with root package name */
    public android.animation.ValueAnimator f116646p;

    /* renamed from: q, reason: collision with root package name */
    public android.animation.ValueAnimator f116647q;

    /* renamed from: r, reason: collision with root package name */
    public android.animation.ValueAnimator f116648r;

    /* renamed from: s, reason: collision with root package name */
    public android.animation.ValueAnimator f116649s;

    /* renamed from: t, reason: collision with root package name */
    public android.animation.ValueAnimator f116650t;

    public r6(android.view.View rootView, android.content.Context context, com.tencent.mm.plugin.finder.live.view.s6 s6Var) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(context, "context");
        this.f116631a = rootView;
        this.f116632b = s6Var;
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.ug_);
        this.f116633c = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.ugd);
        this.f116634d = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.ugg);
        this.f116635e = findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.ug8);
        this.f116636f = findViewById4;
        android.view.View findViewById5 = rootView.findViewById(com.tencent.mm.R.id.ugb);
        this.f116637g = findViewById5;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) rootView.findViewById(com.tencent.mm.R.id.ug9);
        this.f116638h = (com.tencent.mm.ui.widget.imageview.WeImageView) rootView.findViewById(com.tencent.mm.R.id.ugc);
        this.f116639i = (com.tencent.mm.ui.widget.imageview.WeImageView) rootView.findViewById(com.tencent.mm.R.id.ugf);
        this.f116640j = (com.tencent.mm.ui.widget.imageview.WeImageView) rootView.findViewById(com.tencent.mm.R.id.ug7);
        this.f116641k = context.getResources().getColor(com.tencent.mm.R.color.akj);
        this.f116642l = context.getResources().getColor(com.tencent.mm.R.color.f479039ak1);
        this.f116643m = context.getResources().getColor(com.tencent.mm.R.color.f479104q3);
        this.f116644n = context.getResources().getColor(com.tencent.mm.R.color.f479102q1);
        this.f116645o = context.getResources().getColor(com.tencent.mm.R.color.akj);
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.view.h6(this));
        }
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.live.view.i6(this));
        }
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new com.tencent.mm.plugin.finder.live.view.j6(this));
        }
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new com.tencent.mm.plugin.finder.live.view.k6(this));
        }
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new com.tencent.mm.plugin.finder.live.view.l6(this));
        }
        if (weImageView != null) {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_down_arrow);
        }
        rootView.setOnTouchListener(new com.tencent.mm.plugin.finder.live.view.m6(this));
    }

    public final int a(com.tencent.mm.plugin.finder.live.view.nc ncVar) {
        int ordinal = ncVar.ordinal();
        if (ordinal == 0) {
            return this.f116641k;
        }
        if (ordinal == 1) {
            return this.f116642l;
        }
        if (ordinal == 2) {
            return this.f116643m;
        }
        throw new jz5.j();
    }

    public final android.animation.ValueAnimator b(android.view.View view, int i17, android.animation.ValueAnimator valueAnimator, boolean z17) {
        if (view == null) {
            return null;
        }
        android.graphics.drawable.Drawable background = view.getBackground();
        android.graphics.drawable.GradientDrawable gradientDrawable = background instanceof android.graphics.drawable.GradientDrawable ? (android.graphics.drawable.GradientDrawable) background : null;
        if (gradientDrawable == null) {
            return null;
        }
        java.lang.Object animatedValue = valueAnimator != null ? valueAnimator.getAnimatedValue() : null;
        java.lang.Integer num = animatedValue instanceof java.lang.Integer ? (java.lang.Integer) animatedValue : null;
        int intValue = num != null ? num.intValue() : this.f116644n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z17 || intValue == i17) {
            gradientDrawable.setColor(i17);
            return null;
        }
        android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(i17));
        ofObject.setDuration(150L);
        ofObject.addUpdateListener(new com.tencent.mm.plugin.finder.live.view.p6(gradientDrawable));
        ofObject.start();
        return ofObject;
    }

    public final android.animation.ValueAnimator c(com.tencent.mm.ui.widget.imageview.WeImageView weImageView, int i17, android.animation.ValueAnimator valueAnimator, boolean z17) {
        if (weImageView == null) {
            return null;
        }
        java.lang.Object animatedValue = valueAnimator != null ? valueAnimator.getAnimatedValue() : null;
        java.lang.Integer num = animatedValue instanceof java.lang.Integer ? (java.lang.Integer) animatedValue : null;
        int intValue = num != null ? num.intValue() : this.f116641k;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z17 || intValue == i17) {
            weImageView.setIconColor(i17);
            return null;
        }
        android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(i17));
        ofObject.setDuration(150L);
        ofObject.addUpdateListener(new com.tencent.mm.plugin.finder.live.view.q6(weImageView));
        ofObject.start();
        return ofObject;
    }
}
