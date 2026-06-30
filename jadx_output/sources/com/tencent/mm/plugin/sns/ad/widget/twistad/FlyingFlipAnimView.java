package com.tencent.mm.plugin.sns.ad.widget.twistad;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\nB\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\u0010\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/widget/twistad/FlyingFlipAnimView;", "Landroid/widget/FrameLayout;", "Landroid/view/View;", "targetView", "Ljz5/f0;", "setAnimCardView", "", "status", "setPickStatus", "getPickStatus", "Le94/c;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnCardAnimListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class FlyingFlipAnimView extends android.widget.FrameLayout {
    public static final /* synthetic */ int F = 0;
    public float A;
    public float B;
    public final android.view.ViewOutlineProvider C;
    public final java.util.HashMap D;
    public e94.c E;

    /* renamed from: d, reason: collision with root package name */
    public int f163881d;

    /* renamed from: e, reason: collision with root package name */
    public int f163882e;

    /* renamed from: f, reason: collision with root package name */
    public final float f163883f;

    /* renamed from: g, reason: collision with root package name */
    public final int f163884g;

    /* renamed from: h, reason: collision with root package name */
    public final float f163885h;

    /* renamed from: i, reason: collision with root package name */
    public final float f163886i;

    /* renamed from: m, reason: collision with root package name */
    public final int f163887m;

    /* renamed from: n, reason: collision with root package name */
    public final int f163888n;

    /* renamed from: o, reason: collision with root package name */
    public float f163889o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f163890p;

    /* renamed from: q, reason: collision with root package name */
    public int f163891q;

    /* renamed from: r, reason: collision with root package name */
    public android.animation.AnimatorSet f163892r;

    /* renamed from: s, reason: collision with root package name */
    public android.animation.AnimatorSet f163893s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f163894t;

    /* renamed from: u, reason: collision with root package name */
    public int f163895u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f163896v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f163897w;

    /* renamed from: x, reason: collision with root package name */
    public final int f163898x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f163899y;

    /* renamed from: z, reason: collision with root package name */
    public final android.graphics.drawable.ShapeDrawable f163900z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlyingFlipAnimView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.Resources resources;
        kotlin.jvm.internal.o.g(context, "context");
        this.f163883f = i65.a.b(getContext(), 16);
        this.f163884g = i65.a.b(getContext(), 3);
        android.content.Context context2 = getContext();
        this.f163898x = (context2 == null || (resources = context2.getResources()) == null) ? 0 : resources.getColor(com.tencent.mm.R.color.ama);
        this.f163885h = i65.a.b(getContext(), 72);
        this.f163886i = i65.a.b(getContext(), 89);
        int[] c17 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.c(getContext());
        int i17 = c17[0];
        int i18 = c17[1];
        this.f163887m = i17 / 2;
        this.f163888n = (int) (i18 * 0.46f);
        d();
        setCameraDistance(this.f163889o);
        e94.f fVar = new e94.f();
        android.graphics.drawable.PaintDrawable paintDrawable = new android.graphics.drawable.PaintDrawable();
        paintDrawable.setShape(new android.graphics.drawable.shapes.RectShape());
        paintDrawable.setShaderFactory(fVar);
        this.f163900z = paintDrawable;
        this.C = new e94.e(this);
        this.D = new java.util.HashMap();
    }

    public final android.animation.AnimatorSet a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("alphaAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        android.view.View view = this.f163896v;
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("alphaAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
            return null;
        }
        if (this.f163897w == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("alphaAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
            return null;
        }
        kotlin.jvm.internal.o.d(view);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 0.33f, 1.0f);
        ofFloat.setDuration(384L);
        ofFloat.setInterpolator(new android.view.animation.PathInterpolator(0.58f, 0.0f, 0.09f, 1.0f));
        android.view.View view2 = this.f163896v;
        kotlin.jvm.internal.o.d(view2);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view2, "alpha", 1.0f, 0.0f);
        ofFloat2.setDuration(150L);
        android.view.View view3 = this.f163897w;
        kotlin.jvm.internal.o.d(view3);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view3, "alpha", 0.33f, 1.0f);
        ofFloat3.setDuration(384L);
        ofFloat3.setInterpolator(new android.view.animation.PathInterpolator(0.58f, 0.0f, 0.09f, 1.0f));
        android.view.View view4 = this.f163897w;
        kotlin.jvm.internal.o.d(view4);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(view4, "alpha", 1.0f, 0.0f);
        ofFloat4.setDuration(150L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.playSequentially(ofFloat3, ofFloat4);
        android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
        animatorSet3.setStartDelay(1466L);
        animatorSet3.playTogether(animatorSet, animatorSet2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("alphaAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        return animatorSet3;
    }

    public final android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createAnimView", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        if (getContext() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createAnimView", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
            return null;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(this.f163881d, this.f163882e);
        layoutParams.gravity = 17;
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        imageView.setBackgroundColor(this.f163891q);
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.sns.ad.widget.twistad.RoundBorderView roundBorderView = new com.tencent.mm.plugin.sns.ad.widget.twistad.RoundBorderView(context);
        roundBorderView.setClipToOutline(true);
        android.view.ViewOutlineProvider viewOutlineProvider = this.C;
        roundBorderView.setOutlineProvider(viewOutlineProvider);
        float f17 = this.f163884g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBorderParams", "com.tencent.mm.plugin.sns.ad.widget.twistad.RoundBorderView");
        int i17 = this.f163898x;
        roundBorderView.f163913e = i17;
        roundBorderView.f163914f = f17;
        float f18 = this.f163883f;
        roundBorderView.f163912d = f18;
        roundBorderView.postInvalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBorderParams", "com.tencent.mm.plugin.sns.ad.widget.twistad.RoundBorderView");
        roundBorderView.setAlpha(0.33f);
        this.f163896v = roundBorderView;
        h(imageView, this.f163890p, this.f163881d, this.f163882e);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        frameLayout.addView(imageView);
        frameLayout.addView(this.f163896v);
        frameLayout.setRotationY(180.0f);
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(this.f163881d, this.f163882e));
        android.widget.ImageView imageView2 = new android.widget.ImageView(getContext());
        imageView2.setLayoutParams(layoutParams);
        imageView2.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        imageView2.setBackgroundColor(this.f163891q);
        h(imageView2, this.f163890p, this.f163881d, this.f163882e);
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.sns.ad.widget.twistad.RoundBorderView roundBorderView2 = new com.tencent.mm.plugin.sns.ad.widget.twistad.RoundBorderView(context2);
        roundBorderView2.setClipToOutline(true);
        roundBorderView2.setOutlineProvider(viewOutlineProvider);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBorderParams", "com.tencent.mm.plugin.sns.ad.widget.twistad.RoundBorderView");
        roundBorderView2.f163913e = i17;
        roundBorderView2.f163914f = f17;
        roundBorderView2.f163912d = f18;
        roundBorderView2.postInvalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBorderParams", "com.tencent.mm.plugin.sns.ad.widget.twistad.RoundBorderView");
        roundBorderView2.setAlpha(0.33f);
        this.f163897w = roundBorderView2;
        float f19 = this.f163881d;
        this.A = 2.69f * f19;
        this.B = f19 * 0.78f;
        android.view.View view = new android.view.View(getContext());
        view.setLayoutParams(new android.widget.FrameLayout.LayoutParams((int) this.A, (int) this.B));
        view.setBackground(this.f163900z);
        view.setRotation(45.0f);
        float f27 = this.A;
        float f28 = this.f163881d;
        view.setTranslationX(((-(f27 - f28)) * 0.5f) - (f28 * 0.86f));
        view.setTranslationY(((this.f163882e - this.B) * 0.5f) + (this.f163881d * 1.07f));
        this.f163899y = view;
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(getContext());
        frameLayout2.addView(imageView2);
        frameLayout2.addView(this.f163897w);
        frameLayout2.addView(this.f163899y);
        frameLayout2.setRotationY(0.0f);
        frameLayout2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(this.f163881d, this.f163882e));
        android.widget.FrameLayout frameLayout3 = new android.widget.FrameLayout(getContext());
        frameLayout3.setClipToOutline(true);
        frameLayout3.setOutlineProvider(viewOutlineProvider);
        frameLayout3.addView(frameLayout);
        frameLayout3.addView(frameLayout2);
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(this.f163881d, this.f163882e);
        layoutParams2.leftMargin = this.f163887m - (this.f163881d / 2);
        layoutParams2.topMargin = this.f163888n - (this.f163882e / 2);
        frameLayout3.setLayoutParams(layoutParams2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createAnimView", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        return frameLayout3;
    }

    public final android.animation.AnimatorSet c() {
        android.animation.Animator animator;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doEggCardFlipAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        if (this.f163894t == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doEggCardFlipAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
            return null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepareFlipAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        android.view.View view = this.f163894t;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/twistad/FlyingFlipAnimView", "prepareFlipAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/twistad/FlyingFlipAnimView", "prepareFlipAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view2 = this.f163894t;
        if (view2 != null) {
            view2.setRotationY(-90.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareFlipAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        int i17 = this.f163895u;
        if (i17 == 3 || i17 == 0) {
            android.view.View view3 = this.f163894t;
            kotlin.jvm.internal.o.d(view3);
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view3, "rotationY", -90.0f, 7.0f);
            ofFloat.setInterpolator(new android.view.animation.PathInterpolator(0.37f, 0.82f, 0.64f, 1.0f));
            android.view.View view4 = this.f163894t;
            kotlin.jvm.internal.o.d(view4);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view4, "rotationY", 7.0f, 0.0f);
            ofFloat2.setInterpolator(new android.view.animation.PathInterpolator(0.28f, 0.0f, 0.58f, 1.0f));
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.playSequentially(ofFloat, ofFloat2);
            animator = animatorSet;
        } else {
            android.view.View view5 = this.f163894t;
            kotlin.jvm.internal.o.d(view5);
            animator = android.animation.ObjectAnimator.ofFloat(view5, "rotationY", -90.0f, 0.0f);
            animator.setInterpolator(new android.view.animation.PathInterpolator(0.26f, 0.99f, 0.52f, 1.0f));
        }
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.setDuration(667L);
        animatorSet2.addListener(new e94.d(this));
        animatorSet2.play(animator);
        animatorSet2.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doEggCardFlipAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        return animatorSet2;
    }

    public final void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initCameraDistance", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        this.f163889o = getContext().getResources().getDisplayMetrics().density * (-8000);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCameraDistance", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
    }

    public final android.animation.AnimatorSet e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("moveLightAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        android.view.View view = this.f163899y;
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("moveLightAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
            return null;
        }
        kotlin.jvm.internal.o.d(view);
        android.view.View view2 = this.f163899y;
        kotlin.jvm.internal.o.d(view2);
        android.view.View view3 = this.f163899y;
        kotlin.jvm.internal.o.d(view3);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationX", view2.getTranslationX(), view3.getTranslationX() + (this.f163881d * 1.72f));
        ofFloat.setDuration(700L);
        android.view.View view4 = this.f163899y;
        kotlin.jvm.internal.o.d(view4);
        android.view.View view5 = this.f163899y;
        kotlin.jvm.internal.o.d(view5);
        android.view.View view6 = this.f163899y;
        kotlin.jvm.internal.o.d(view6);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view4, "translationY", view5.getTranslationY(), view6.getTranslationY() - (this.f163881d * 2.14f));
        ofFloat2.setDuration(700L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setStartDelay(1133L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("moveLightAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        return animatorSet;
    }

    public final android.animation.AnimatorSet f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("rotationAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, "rotation", 6.3f, 4.7f);
        ofFloat.setDuration(1383L);
        ofFloat.setInterpolator(new android.view.animation.PathInterpolator(0.15f, 0.0f, 0.64f, 1.0f));
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this, "rotationY", -110.0f, 360.0f);
        ofFloat2.setDuration(1350L);
        ofFloat2.setInterpolator(new android.view.animation.PathInterpolator(0.2f, 0.5f, 0.27f, 1.0f));
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(this, "rotationY", 360.0f, 450.0f);
        ofFloat3.setDuration(650L);
        ofFloat3.setInterpolator(new android.view.animation.PathInterpolator(0.76f, 0.0f, 0.77f, 0.31f));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.playSequentially(ofFloat2, ofFloat3);
        animatorSet.playTogether(ofFloat, animatorSet2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("rotationAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        return animatorSet;
    }

    public final android.animation.AnimatorSet g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scaleAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, "scaleX", 0.27f, 1.0f);
        ofFloat.setDuration(1350L);
        ofFloat.setInterpolator(new android.view.animation.PathInterpolator(0.5f, 0.0f, 0.3f, 1.0f));
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this, "scaleY", 0.27f, 1.0f);
        ofFloat2.setDuration(1350L);
        ofFloat2.setInterpolator(new android.view.animation.PathInterpolator(0.5f, 0.0f, 0.3f, 1.0f));
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(this, "scaleX", 1.0f, 0.91f);
        ofFloat3.setDuration(417L);
        ofFloat3.setInterpolator(new android.view.animation.PathInterpolator(0.47f, 0.0f, 0.57f, 0.96f));
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(this, "scaleY", 1.0f, 0.91f);
        ofFloat4.setDuration(417L);
        ofFloat4.setInterpolator(new android.view.animation.PathInterpolator(0.47f, 0.0f, 0.57f, 0.96f));
        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(this, "scaleX", 0.91f, 0.96f);
        ofFloat5.setDuration(233L);
        ofFloat5.setInterpolator(new android.view.animation.PathInterpolator(0.35f, 0.0f, 0.75f, 0.82f));
        android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(this, "scaleY", 0.91f, 0.96f);
        ofFloat6.setDuration(233L);
        ofFloat6.setInterpolator(new android.view.animation.PathInterpolator(0.35f, 0.0f, 0.75f, 0.82f));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.playTogether(ofFloat3, ofFloat4);
        android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
        animatorSet3.playTogether(ofFloat5, ofFloat6);
        android.animation.AnimatorSet animatorSet4 = new android.animation.AnimatorSet();
        animatorSet4.playSequentially(animatorSet, animatorSet2, animatorSet3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scaleAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        return animatorSet4;
    }

    public final int getPickStatus() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPickStatus", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        int i17 = this.f163895u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPickStatus", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        return i17;
    }

    public final void h(android.widget.ImageView imageView, java.lang.String str, int i17, int i18) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCardBackgroundImg", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCardBackgroundImg", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
            return;
        }
        java.util.HashMap hashMap = this.D;
        try {
            bitmap = (android.graphics.Bitmap) hashMap.get(str);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FlyingFlipAnimView", "setCardBackgroundImg, exp=" + th6);
        }
        if (bitmap != null) {
            com.tencent.mars.xlog.Log.i("FlyingFlipAnimView", "setCardBackgroundImg, hit memCache");
            imageView.setImageBitmap(bitmap);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCardBackgroundImg", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
            return;
        }
        java.lang.String l17 = za4.t0.l("adId", str);
        if (com.tencent.mm.vfs.w6.j(l17) && (L = com.tencent.mm.sdk.platformtools.x.L(l17, i17, i18)) != null && !L.isRecycled()) {
            com.tencent.mars.xlog.Log.i("FlyingFlipAnimView", "setCardBackgroundImg, hit diskCache");
            imageView.setImageBitmap(L);
            kotlin.jvm.internal.o.d(str);
            hashMap.put(str, L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCardBackgroundImg", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
            return;
        }
        com.tencent.mars.xlog.Log.i("FlyingFlipAnimView", "setCardBackgroundImg, download img");
        a84.z.c(str, imageView);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCardBackgroundImg", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
    }

    public final android.animation.AnimatorSet i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("translationAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        float f17 = this.f163886i;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, "translationX", this.f163885h, -f17);
        ofFloat.setDuration(443L);
        ofFloat.setInterpolator(new android.view.animation.PathInterpolator(0.5f, 0.11f, 0.63f, 1.0f));
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this, "translationX", -f17, 0.0f);
        ofFloat2.setDuration(917L);
        ofFloat2.setInterpolator(new android.view.animation.PathInterpolator(0.38f, 0.0f, 0.34f, 1.0f));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("translationAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        return animatorSet;
    }

    public final void setAnimCardView(android.view.View targetView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        kotlin.jvm.internal.o.g(targetView, "targetView");
        this.f163894t = targetView;
        targetView.setCameraDistance(this.f163889o);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
    }

    public final void setOnCardAnimListener(e94.c cVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        this.E = cVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
    }

    public final void setPickStatus(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPickStatus", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
        this.f163895u = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPickStatus", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlyingFlipAnimView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.content.res.Resources resources;
        kotlin.jvm.internal.o.g(context, "context");
        this.f163883f = i65.a.b(getContext(), 16);
        this.f163884g = i65.a.b(getContext(), 3);
        android.content.Context context2 = getContext();
        this.f163898x = (context2 == null || (resources = context2.getResources()) == null) ? 0 : resources.getColor(com.tencent.mm.R.color.ama);
        this.f163885h = i65.a.b(getContext(), 72);
        this.f163886i = i65.a.b(getContext(), 89);
        int[] c17 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.c(getContext());
        int i18 = c17[0];
        int i19 = c17[1];
        this.f163887m = i18 / 2;
        this.f163888n = (int) (i19 * 0.46f);
        d();
        setCameraDistance(this.f163889o);
        e94.f fVar = new e94.f();
        android.graphics.drawable.PaintDrawable paintDrawable = new android.graphics.drawable.PaintDrawable();
        paintDrawable.setShape(new android.graphics.drawable.shapes.RectShape());
        paintDrawable.setShaderFactory(fVar);
        this.f163900z = paintDrawable;
        this.C = new e94.e(this);
        this.D = new java.util.HashMap();
    }
}
