package v74;

/* loaded from: classes4.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v74.s0 f433883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f433884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f433885f;

    public r0(v74.s0 s0Var, kotlin.jvm.internal.g0 g0Var, com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f433883d = s0Var;
        this.f433884e = g0Var;
        this.f433885f = mMPAGView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic$startPlayThemePag$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMIsThemePagNeedReplay$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
        v74.s0 s0Var = this.f433883d;
        s0Var.f433902l = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMIsThemePagNeedReplay$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$showThemePagView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
        s0Var.g(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$showThemePagView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doPlay themePag, needReplay=true, progress=");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMThemePagPlayProgress$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
        double d17 = s0Var.f433901k;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMThemePagPlayProgress$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
        sb6.append(d17);
        sb6.append(", delay=");
        sb6.append(this.f433884e.f310121d);
        com.tencent.mars.xlog.Log.i("AdLookbookPagAnimLogic", sb6.toString());
        try {
            this.f433885f.g();
        } catch (java.lang.Throwable th6) {
            ca4.q.c("AdLookbookPagAnimLogic", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic$startPlayThemePag$2$1");
    }
}
