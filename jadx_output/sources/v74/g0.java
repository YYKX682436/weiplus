package v74;

/* loaded from: classes4.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v74.k0 f433796d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(v74.k0 k0Var) {
        super(0);
        this.f433796d = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$onSplashCardAnimEnd$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$onSplashCardAnimEnd$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSplashCardAnimEnd, isPaused=");
        v74.k0 k0Var = this.f433796d;
        sb6.append(v74.k0.b(k0Var));
        com.tencent.mars.xlog.Log.i("AdLookbookLogic", sb6.toString());
        if (!v74.k0.b(k0Var)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$triggerVideoPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            k0Var.p();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$triggerVideoPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$triggerPlayThemePag", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("triggerPlayThemePag", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            k0Var.f433844j.postDelayed(new v74.i0(k0Var), 150L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerPlayThemePag", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$triggerPlayThemePag", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isShowCharmImage", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        boolean e17 = k0Var.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isShowCharmImage", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        if (e17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMLookbookContext$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            v74.t tVar = k0Var.f433852r;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMLookbookContext$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            android.widget.ImageView a17 = tVar != null ? tVar.a() : null;
            if (a17 != null) {
                a17.setVisibility(0);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$onSplashCardAnimEnd$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$onSplashCardAnimEnd$1");
        return f0Var;
    }
}
