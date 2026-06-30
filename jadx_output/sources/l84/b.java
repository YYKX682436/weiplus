package l84;

/* loaded from: classes3.dex */
public class b implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar f317119d;

    public b(com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar adLandingVideoPlayerToolBar) {
        this.f317119d = adLandingVideoPlayerToolBar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar$2");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar$2");
        android.widget.ImageView imageView = this.f317119d.f163470f;
        if (imageView != null) {
            imageView.setClickable(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar$2");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar$2");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar$2");
        android.widget.ImageView imageView = this.f317119d.f163470f;
        if (imageView != null) {
            imageView.setClickable(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar$2");
    }
}
