package vb4;

/* loaded from: classes4.dex */
public class k implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f434819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vb4.n f434820e;

    public k(vb4.n nVar, android.animation.ValueAnimator valueAnimator) {
        this.f434820e = nVar;
        this.f434819d = valueAnimator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation$2");
        vb4.n nVar = this.f434820e;
        if (nVar.f434796c != null) {
            nVar.f434796c.b(((java.lang.Float) this.f434819d.getAnimatedValue()).floatValue());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation$2");
    }
}
