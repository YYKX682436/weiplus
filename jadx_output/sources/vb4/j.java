package vb4;

/* loaded from: classes4.dex */
public class j implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f434817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vb4.n f434818e;

    public j(vb4.n nVar, android.view.View view) {
        this.f434818e = nVar;
        this.f434817d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation$1");
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation");
        this.f434818e.f434824o = floatValue;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation");
        this.f434817d.invalidateOutline();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation$1");
    }
}
