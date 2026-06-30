package xa4;

/* loaded from: classes3.dex */
public final class f implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f452828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.animation.ScaleAnimation f452829b;

    public f(android.widget.ImageView imageView, android.view.animation.ScaleAnimation scaleAnimation) {
        this.f452828a = imageView;
        this.f452829b = scaleAnimation;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic$doSpringLikeAnim$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f452828a.startAnimation(this.f452829b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic$doSpringLikeAnim$1");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic$doSpringLikeAnim$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic$doSpringLikeAnim$1");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic$doSpringLikeAnim$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic$doSpringLikeAnim$1");
    }
}
