package p84;

/* loaded from: classes4.dex */
public final class h extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView f352794e;

    public h(com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView animLabelView) {
        this.f352794e = animLabelView;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView$startContentDisappearAnim$1$1");
        kotlin.jvm.internal.o.g(animation, "animation");
        int i17 = com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView.f163508r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView animLabelView = this.f352794e;
        java.lang.String str = animLabelView.f163509d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        if (!this.f39706d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMContentDisappearListener$p", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
            c84.f fVar = animLabelView.f163519q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMContentDisappearListener$p", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
            if (fVar != null) {
                fVar.onAnimationEnd(animation);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView$startContentDisappearAnim$1$1");
    }
}
