package u84;

/* loaded from: classes4.dex */
public final class y1 implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView f425692d;

    public y1(com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView snsAdInteractionTagView) {
        this.f425692d = snsAdInteractionTagView;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView$mPAGViewListener$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView$mPAGViewListener$1");
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView$mPAGViewListener$1");
        if (mMPAGView != null) {
            int i17 = com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView.A;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPAGFlushListener$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView");
            u84.x1 x1Var = this.f425692d.f163618x;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPAGFlushListener$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView");
            mMPAGView.b(x1Var);
        }
        com.tencent.mars.xlog.Log.i("SnsAdInteractionTagView", "PAG onAnimationStart");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView$mPAGViewListener$1");
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView$mPAGViewListener$1");
        com.tencent.mars.xlog.Log.i("SnsAdInteractionTagView", "PAG onAnimationEnd");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView$mPAGViewListener$1");
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView$mPAGViewListener$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView$mPAGViewListener$1");
    }
}
