package v74;

/* loaded from: classes4.dex */
public final class m0 implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v74.s0 f433871d;

    public m0(v74.s0 s0Var) {
        this.f433871d = s0Var;
    }

    @Override // ym5.w1
    public void d(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic$addThemePagView$pagView$1$1");
        double progress = mMPAGView != null ? mMPAGView.getProgress() : 0.0d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMThemePagPlayProgress$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
        this.f433871d.f433901k = progress;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMThemePagPlayProgress$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic$addThemePagView$pagView$1$1");
    }
}
