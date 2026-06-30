package dd4;

/* loaded from: classes3.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f229008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView f229009e;

    public i(android.view.View view, com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView) {
        this.f229008d = view;
        this.f229009e = flexibleLivePhotoView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$aniToThumb$1");
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.view.View view = this.f229008d;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "scaleX", 1.05f, 1.0f);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", 1.05f, 1.0f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("aniToThumb >> centerWidth: ");
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView = this.f229009e;
        sb6.append(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.g(flexibleLivePhotoView).getWidth() / 2.0f);
        sb6.append(" centerHeight: ");
        sb6.append(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.g(flexibleLivePhotoView).getHeight() / 2.0f);
        flexibleLivePhotoView.m(sb6.toString());
        view.setPivotX(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.g(flexibleLivePhotoView).getWidth() / 2.0f);
        view.setPivotY(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.g(flexibleLivePhotoView).getHeight() / 2.0f);
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
        animatorSet.addListener(new dd4.h(flexibleLivePhotoView));
        animatorSet.play(ofFloat2).with(ofFloat3).with(ofFloat);
        animatorSet.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$aniToThumb$1");
    }
}
