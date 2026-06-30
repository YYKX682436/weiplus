package s84;

/* loaded from: classes4.dex */
public class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer f404898d;

    public e(com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer adDragViewContainer) {
        this.f404898d = adDragViewContainer;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$3");
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer adDragViewContainer = this.f404898d;
        com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer.a(adDragViewContainer).setX(intValue);
        adDragViewContainer.invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$3");
    }
}
