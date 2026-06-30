package l84;

/* loaded from: classes3.dex */
public class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar f317118d;

    public a(com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar adLandingVideoPlayerToolBar) {
        this.f317118d = adLandingVideoPlayerToolBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar$1");
        java.lang.Float f17 = (java.lang.Float) valueAnimator.getAnimatedValue();
        com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar adLandingVideoPlayerToolBar = this.f317118d;
        android.view.ViewGroup.LayoutParams layoutParams = adLandingVideoPlayerToolBar.getLayoutParams();
        layoutParams.width = (int) f17.floatValue();
        adLandingVideoPlayerToolBar.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar$1");
    }
}
