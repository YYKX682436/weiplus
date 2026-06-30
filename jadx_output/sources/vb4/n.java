package vb4;

/* loaded from: classes4.dex */
public class n extends vb4.b {

    /* renamed from: n, reason: collision with root package name */
    public float f434823n;

    /* renamed from: o, reason: collision with root package name */
    public float f434824o;

    /* renamed from: p, reason: collision with root package name */
    public android.animation.AnimatorSet f434825p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f434826q;

    public n(android.app.Activity activity, android.view.View view, android.os.Bundle bundle, boolean z17) {
        super(activity, view, false);
        float f17;
        float f18;
        int i17;
        vb4.m mVar = new vb4.m(this);
        a(bundle);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation");
        float b17 = i65.a.b(activity, 8);
        this.f434823n = b17;
        this.f434824o = b17;
        this.f434826q = z17;
        view.setClipToOutline(true);
        view.setOutlineProvider(mVar);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        long j17 = 400;
        ofFloat.setDuration(j17);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "rotation", this.f434826q ? -90 : 90, 0.0f);
        ofFloat2.setDuration(j17);
        int i18 = this.f434804k;
        if (i18 == 0 || (i17 = this.f434803j) == 0) {
            f17 = 1.0f;
            f18 = 1.0f;
        } else {
            f17 = (this.f434800g * 1.0f) / i18;
            f18 = (this.f434799f * 1.0f) / i17;
        }
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view, "scaleX", f17, 1.0f);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", f18, 1.0f);
        ofFloat3.setDuration(j17);
        ofFloat4.setDuration(j17);
        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(view, "translationX", (this.f434797d + (this.f434799f / 2.0f)) - (this.f434804k / 2.0f), 0.0f);
        android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(view, "translationY", (this.f434798e + (this.f434800g / 2.0f)) - (this.f434803j / 2.0f), 0.0f);
        ofFloat5.setDuration(j17);
        ofFloat6.setDuration(j17);
        android.animation.ValueAnimator ofFloat7 = android.animation.ValueAnimator.ofFloat(this.f434823n, 0.0f);
        ofFloat7.setDuration(200L);
        ofFloat7.setStartDelay(300L);
        ofFloat7.addUpdateListener(new vb4.j(this, view));
        android.animation.ValueAnimator ofFloat8 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat8.setDuration(200L);
        ofFloat8.setStartDelay(300L);
        ofFloat8.addUpdateListener(new vb4.k(this, ofFloat8));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.f434825p = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8);
        this.f434825p.addListener(new vb4.l(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation");
    }

    @Override // vb4.b
    public void d(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation");
        android.animation.AnimatorSet animatorSet = this.f434825p;
        if (animatorSet != null && !animatorSet.isStarted()) {
            this.f434825p.setStartDelay(j17);
            this.f434825p.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeSimpleTwistAnimation");
    }
}
