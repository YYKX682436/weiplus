package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class m2 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f151899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView f151900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f151901f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f151902g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f151903h;

    public m2(int i17, com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView musicMvLyricPreludeView, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.c0 c0Var2, kotlin.jvm.internal.c0 c0Var3) {
        this.f151899d = i17;
        this.f151900e = musicMvLyricPreludeView;
        this.f151901f = c0Var;
        this.f151902g = c0Var2;
        this.f151903h = c0Var3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        android.animation.ValueAnimator alphaAnimator;
        android.animation.ValueAnimator alphaAnimator2;
        android.animation.ValueAnimator alphaAnimator3;
        android.animation.ValueAnimator alphaAnimator4;
        android.animation.ValueAnimator alphaAnimator5;
        android.animation.ValueAnimator alphaAnimator6;
        android.animation.ValueAnimator alphaAnimator7;
        android.animation.ValueAnimator alphaAnimator8;
        android.animation.ValueAnimator alphaAnimator9;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        int i17 = this.f151899d;
        int i18 = i17 + org.chromium.net.NetError.ERR_INVALID_URL;
        com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView musicMvLyricPreludeView = this.f151900e;
        if (intValue >= i18) {
            musicMvLyricPreludeView.f151673n = 2;
            alphaAnimator7 = musicMvLyricPreludeView.getAlphaAnimator();
            if (alphaAnimator7.isStarted()) {
                return;
            }
            kotlin.jvm.internal.c0 c0Var = this.f151901f;
            if (c0Var.f310112d) {
                return;
            }
            c0Var.f310112d = true;
            alphaAnimator8 = musicMvLyricPreludeView.getAlphaAnimator();
            alphaAnimator8.cancel();
            alphaAnimator9 = musicMvLyricPreludeView.getAlphaAnimator();
            alphaAnimator9.start();
            return;
        }
        float f17 = intValue;
        float f18 = 300;
        if (f17 >= ((i17 * 2.0f) / 3.0f) - f18) {
            musicMvLyricPreludeView.f151673n = 1;
            alphaAnimator4 = musicMvLyricPreludeView.getAlphaAnimator();
            if (alphaAnimator4.isStarted()) {
                return;
            }
            kotlin.jvm.internal.c0 c0Var2 = this.f151902g;
            if (c0Var2.f310112d) {
                return;
            }
            c0Var2.f310112d = true;
            alphaAnimator5 = musicMvLyricPreludeView.getAlphaAnimator();
            alphaAnimator5.cancel();
            alphaAnimator6 = musicMvLyricPreludeView.getAlphaAnimator();
            alphaAnimator6.start();
            return;
        }
        if (f17 >= (i17 / 3.0f) - f18) {
            musicMvLyricPreludeView.f151673n = 0;
            alphaAnimator = musicMvLyricPreludeView.getAlphaAnimator();
            if (alphaAnimator.isStarted()) {
                return;
            }
            kotlin.jvm.internal.c0 c0Var3 = this.f151903h;
            if (c0Var3.f310112d) {
                return;
            }
            c0Var3.f310112d = true;
            alphaAnimator2 = musicMvLyricPreludeView.getAlphaAnimator();
            alphaAnimator2.cancel();
            alphaAnimator3 = musicMvLyricPreludeView.getAlphaAnimator();
            alphaAnimator3.start();
        }
    }
}
