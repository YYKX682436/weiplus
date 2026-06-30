package p84;

/* loaded from: classes4.dex */
public final class f extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView f352792e;

    public f(com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView animLabelView) {
        this.f352792e = animLabelView;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView$startArrowAnim$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        int i17 = com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView.f163508r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        java.lang.String str = this.f352792e.f163509d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        if (!this.f39706d) {
            animation.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView$startArrowAnim$1$1");
    }
}
