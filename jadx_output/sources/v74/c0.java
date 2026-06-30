package v74;

/* loaded from: classes4.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v74.k0 f433770d;

    public c0(v74.k0 k0Var) {
        this.f433770d = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$mOnScrollListener$1$onScrollStateChanged$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$triggerVideoPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        this.f433770d.p();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$triggerVideoPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$mOnScrollListener$1$onScrollStateChanged$1");
    }
}
