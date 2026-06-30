package k84;

/* loaded from: classes4.dex */
public final class a2 implements ym5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f304940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f304941b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f304942c;

    public a2(k84.d4 d4Var, kotlin.jvm.internal.h0 h0Var, kotlinx.coroutines.q qVar) {
        this.f304940a = d4Var;
        this.f304941b = h0Var;
        this.f304942c = qVar;
    }

    @Override // ym5.v1
    public void onFlush() {
        com.tencent.mm.view.MMPAGView cheerPAGView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$5$2$1$1$1");
        k84.d4 d4Var = this.f304940a;
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView J2 = d4Var.J();
        if (J2 != null && (cheerPAGView = J2.getCheerPAGView()) != null) {
            cheerPAGView.j((ym5.v1) this.f304941b.f310123d);
        }
        try {
            kotlinx.coroutines.q qVar = this.f304942c;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(d4Var.j(), e17, "resumeWith error", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$5$2$1$1$1");
    }
}
