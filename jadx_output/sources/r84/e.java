package r84;

/* loaded from: classes4.dex */
public final class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView f393326d;

    public e(com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView adBulletScreenRecyclerView) {
        this.f393326d = adBulletScreenRecyclerView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$doAnim$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView adBulletScreenRecyclerView = this.f393326d;
        adBulletScreenRecyclerView.scrollBy(0, intValue - adBulletScreenRecyclerView.getCurrentScrollY());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$doAnim$1");
    }
}
