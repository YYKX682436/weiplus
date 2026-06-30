package dd4;

/* loaded from: classes3.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f229001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView f229002e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorSet f229003f;

    public g(android.view.View view, com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView, android.animation.AnimatorSet animatorSet) {
        this.f229001d = view;
        this.f229002e = flexibleLivePhotoView;
        this.f229003f = animatorSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$aniToPlayView$1");
        android.view.View view = this.f229001d;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 1.05f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 1.05f);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("aniToPlayView >> centerWidth: ");
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView = this.f229002e;
        sb6.append(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.g(flexibleLivePhotoView).getWidth() / 2.0f);
        sb6.append(" centerHeight: ");
        sb6.append(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.g(flexibleLivePhotoView).getHeight() / 2.0f);
        flexibleLivePhotoView.m(sb6.toString());
        view.setPivotX(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.g(flexibleLivePhotoView).getWidth() / 2.0f);
        view.setPivotY(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.g(flexibleLivePhotoView).getHeight() / 2.0f);
        android.animation.AnimatorSet animatorSet = this.f229003f;
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
        animatorSet.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$aniToPlayView$1");
    }
}
