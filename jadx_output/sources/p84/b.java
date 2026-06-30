package p84;

/* loaded from: classes4.dex */
public final class b extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p84.e f352775e;

    public b(p84.e eVar) {
        this.f352775e = eVar;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$mLabelContentDisappearListener$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        p84.e eVar = this.f352775e;
        java.lang.String str = eVar.f352779a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$startOutViewAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        eVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startOutViewAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        android.view.View view = eVar.f352785g;
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startOutViewAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        } else {
            if (view.getVisibility() == 0) {
                if (eVar.f352786h == null) {
                    android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(eVar.f352785g, "translationX", -i65.a.b(eVar.f352784f.getContext(), 16), 0.0f);
                    ofFloat.setDuration(500L);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
                    android.view.animation.PathInterpolator pathInterpolator = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
                    ofFloat.setInterpolator(pathInterpolator);
                    android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(eVar.f352785g, "alpha", 0.0f, 1.0f);
                    ofFloat2.setDuration(500L);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
                    android.view.animation.PathInterpolator pathInterpolator2 = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
                    ofFloat2.setInterpolator(pathInterpolator2);
                    android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                    animatorSet.play(ofFloat).with(ofFloat2);
                    eVar.f352786h = animatorSet;
                }
                android.animation.AnimatorSet animatorSet2 = eVar.f352786h;
                if (animatorSet2 != null) {
                    animatorSet2.start();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startOutViewAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startOutViewAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$startOutViewAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$mLabelContentDisappearListener$1");
    }
}
