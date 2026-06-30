package p84;

/* loaded from: classes4.dex */
public final class d extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p84.e f352777e;

    public d(p84.e eVar) {
        this.f352777e = eVar;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$startOutViewDisappearAnim$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        if (!this.f39706d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMLabelView$p", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
            com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView animLabelView = this.f352777e.f352784f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMLabelView$p", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
            animLabelView.a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$startOutViewDisappearAnim$1$1");
    }
}
