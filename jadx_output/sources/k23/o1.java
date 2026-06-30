package k23;

/* loaded from: classes12.dex */
public final class o1 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f303637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k23.j2 f303638e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f303639f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f303640g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f303641h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f303642i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f303643m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f303644n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f303645o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f303646p;

    public o1(android.view.View view, k23.j2 j2Var, android.view.ViewGroup viewGroup, android.graphics.Bitmap bitmap, float f17, float f18, android.graphics.Bitmap bitmap2, float f19, float f27, long j17) {
        this.f303637d = view;
        this.f303638e = j2Var;
        this.f303639f = viewGroup;
        this.f303640g = bitmap;
        this.f303641h = f17;
        this.f303642i = f18;
        this.f303643m = bitmap2;
        this.f303644n = f19;
        this.f303645o = f27;
        this.f303646p = j17;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.ui.widget.imageview.WeImageView mikeIcon;
        com.tencent.mm.ui.widget.imageview.WeImageView mikeIcon2;
        com.tencent.mm.ui.widget.imageview.WeImageView mikeIcon3;
        android.graphics.Bitmap r17;
        com.tencent.mm.ui.widget.imageview.WeImageView mikeIcon4;
        android.animation.ValueAnimator valueAnimator;
        com.tencent.mm.ui.widget.imageview.WeImageView mikeIcon5;
        com.tencent.mm.ui.widget.imageview.WeImageView mikeIcon6;
        this.f303637d.getViewTreeObserver().removeOnPreDrawListener(this);
        k23.j2 j2Var = this.f303638e;
        mikeIcon = j2Var.getMikeIcon();
        android.view.ViewGroup viewGroup = this.f303639f;
        jz5.l k17 = j2Var.k(mikeIcon, viewGroup);
        float floatValue = ((java.lang.Number) k17.f302833d).floatValue();
        float floatValue2 = ((java.lang.Number) k17.f302834e).floatValue();
        jz5.l k18 = j2Var.k(j2Var.getStartBtnTv(), viewGroup);
        float floatValue3 = ((java.lang.Number) k18.f302833d).floatValue();
        float floatValue4 = ((java.lang.Number) k18.f302834e).floatValue();
        k23.u2 u2Var = j2Var.getParams().f303552i;
        k23.u2 u2Var2 = k23.u2.f303702e;
        int d17 = u2Var == u2Var2 ? i65.a.d(j2Var.getContext(), com.tencent.mm.R.color.aby) : i65.a.d(j2Var.getContext(), com.tencent.mm.R.color.abw);
        if (j2Var.getParams().f303552i == u2Var2) {
            mikeIcon5 = j2Var.getMikeIcon();
            int width = mikeIcon5.getWidth();
            mikeIcon6 = j2Var.getMikeIcon();
            r17 = com.tencent.mm.sdk.platformtools.x.r(com.tencent.mm.R.raw.mike_on_filled, width, mikeIcon6.getHeight(), d17, 0, 1.0f);
        } else {
            mikeIcon2 = j2Var.getMikeIcon();
            int width2 = mikeIcon2.getWidth();
            mikeIcon3 = j2Var.getMikeIcon();
            r17 = com.tencent.mm.sdk.platformtools.x.r(com.tencent.mm.R.raw.mike_on_medium, width2, mikeIcon3.getHeight(), d17, 0, 1.0f);
        }
        android.graphics.Bitmap m17 = j2Var.m(j2Var.getStartBtnTv());
        mikeIcon4 = j2Var.getMikeIcon();
        mikeIcon4.setAlpha(0.0f);
        j2Var.getStartBtnTv().setAlpha(0.0f);
        android.graphics.Bitmap bitmap = this.f303640g;
        kotlin.jvm.internal.o.d(bitmap);
        float f17 = this.f303641h;
        float f18 = this.f303642i;
        android.widget.ImageView c17 = k23.j2.c(viewGroup, bitmap, f17, f18);
        kotlin.jvm.internal.o.d(r17);
        android.widget.ImageView c18 = k23.j2.c(viewGroup, r17, floatValue, floatValue2);
        c18.setAlpha(0.0f);
        android.widget.ImageView c19 = k23.j2.c(viewGroup, this.f303643m, this.f303644n, this.f303645o);
        android.widget.ImageView c27 = k23.j2.c(viewGroup, m17, floatValue3, floatValue4);
        c27.setAlpha(0.0f);
        float f19 = floatValue - f17;
        float f27 = floatValue2 - f18;
        float f28 = -f19;
        c18.setTranslationX(f28);
        float f29 = -f27;
        c18.setTranslationY(f29);
        int d18 = i65.a.d(j2Var.getContext(), com.tencent.mm.R.color.Brand_120);
        int d19 = i65.a.d(j2Var.getContext(), com.tencent.mm.R.color.f478494f);
        if (j2Var.getParams().f303552i == u2Var2) {
            valueAnimator = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(d19), java.lang.Integer.valueOf(d18));
            valueAnimator.addUpdateListener(new k23.p1(j2Var));
        } else {
            valueAnimator = null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(kz5.c0.i(android.animation.ObjectAnimator.ofFloat(c17, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.TRANSLATION_X, 0.0f, f19), android.animation.ObjectAnimator.ofFloat(c17, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.TRANSLATION_Y, 0.0f, f27), android.animation.ObjectAnimator.ofFloat(c17, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.ALPHA, 1.0f, 0.0f), android.animation.ObjectAnimator.ofFloat(c18, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.TRANSLATION_X, f28, 0.0f), android.animation.ObjectAnimator.ofFloat(c18, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.TRANSLATION_Y, f29, 0.0f), android.animation.ObjectAnimator.ofFloat(c18, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.ALPHA, 0.0f, 1.0f), android.animation.ObjectAnimator.ofFloat(c19, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.ALPHA, 1.0f, 0.0f), android.animation.ObjectAnimator.ofFloat(c27, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.ALPHA, 0.0f, 1.0f)));
        if (valueAnimator != null) {
            arrayList.add(valueAnimator);
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        animatorSet.setDuration(this.f303646p);
        animatorSet.addListener(new k23.q1(this.f303639f, c17, c18, c19, c27, this.f303638e));
        animatorSet.start();
        return true;
    }
}
