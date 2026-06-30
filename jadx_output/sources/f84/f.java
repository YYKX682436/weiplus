package f84;

/* loaded from: classes4.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f84.u f260184d;

    public f(f84.u uVar) {
        this.f260184d = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$handleInteractType$1$1$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doInitAnim", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        f84.u uVar = this.f260184d;
        uVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doInitAnim", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(uVar.B(), "translationX", 0.0f, -uVar.E);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(uVar.B(), "alpha", 1.0f, 0.0f);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(uVar.D(), "translationX", uVar.E, 0.0f);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(uVar.D(), "alpha", 0.0f, 1.0f);
        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(uVar.C(), "alpha", 1.0f, 0.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(900L);
        animatorSet.setInterpolator(new android.view.animation.PathInterpolator(0.51f, 0.05f, 0.34f, 0.94f));
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5);
        animatorSet.addListener(new f84.e(uVar));
        animatorSet.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInitAnim", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doInitAnim", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$handleInteractType$1$1$1$1");
    }
}
