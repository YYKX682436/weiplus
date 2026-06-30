package s84;

/* loaded from: classes4.dex */
public class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer f404900d;

    public g(com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer adDragViewContainer) {
        this.f404900d = adDragViewContainer;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$5");
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer adDragViewContainer = this.f404900d;
        com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer.a(adDragViewContainer).setY(intValue);
        adDragViewContainer.invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$5");
    }
}
