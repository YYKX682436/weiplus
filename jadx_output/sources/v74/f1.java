package v74;

/* loaded from: classes4.dex */
public final class f1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f433781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f433782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f433783f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v74.h1 f433784g;

    public f1(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, kotlin.jvm.internal.h0 h0Var3, v74.h1 h1Var) {
        this.f433781d = h0Var;
        this.f433782e = h0Var2;
        this.f433783f = h0Var3;
        this.f433784g = h1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic$startAnim$1");
        kotlin.jvm.internal.o.g(anim, "anim");
        java.lang.Object animatedValue = anim.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        kotlin.jvm.internal.h0 h0Var = this.f433781d;
        float ceil = (float) java.lang.Math.ceil(((v74.s) h0Var.f310123d).b() - ((((v74.s) h0Var.f310123d).b() - ((v74.s) h0Var.f310123d).a()) * floatValue));
        kotlin.jvm.internal.h0 h0Var2 = this.f433782e;
        android.view.ViewGroup.LayoutParams layoutParams = ((com.tencent.mm.ui.widget.RoundedCornerFrameLayout) h0Var2.f310123d).getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) ceil;
        }
        ((com.tencent.mm.ui.widget.RoundedCornerFrameLayout) h0Var2.f310123d).setLayoutParams(layoutParams);
        com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView overScrollRecyclerView = (com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView) this.f433783f.f310123d;
        v74.s sVar = (v74.s) h0Var.f310123d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getInitTranslationX", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        v74.h1 h1Var = this.f433784g;
        h1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInitTranslationX", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        int a17 = (h1Var.f433817q - sVar.a()) - h1Var.f433811k;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInitTranslationX", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getInitTranslationX", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        overScrollRecyclerView.setTranslationX(a17 * (1 - floatValue));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic$startAnim$1");
    }
}
