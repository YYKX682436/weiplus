package dd4;

/* loaded from: classes3.dex */
public final class h extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView f229005d;

    public h(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView) {
        this.f229005d = flexibleLivePhotoView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$aniToThumb$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView = this.f229005d;
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.g(flexibleLivePhotoView).setVisibility(8);
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.g(flexibleLivePhotoView).k(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$aniToThumb$1$1");
    }
}
