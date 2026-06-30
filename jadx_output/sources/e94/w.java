package e94;

/* loaded from: classes4.dex */
public class w implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e94.x f250391d;

    public w(e94.x xVar) {
        this.f250391d = xVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView$1$1");
        e94.x xVar = this.f250391d;
        xVar.f250392d.f163949t = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        xVar.f250392d.invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView$1$1");
    }
}
