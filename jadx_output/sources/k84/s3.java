package k84;

/* loaded from: classes3.dex */
public final class s3 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f305240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f305241e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f305242f;

    public s3(com.tencent.mm.view.MMPAGView mMPAGView, kotlinx.coroutines.q qVar, k84.d4 d4Var) {
        this.f305240d = mMPAGView;
        this.f305241e = qVar;
        this.f305242f = d4Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        k84.d4 d4Var = this.f305242f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startFullScreenPag$4$1$2");
        com.tencent.mm.view.MMPAGView mMPAGView = this.f305240d;
        mMPAGView.n();
        mMPAGView.setVisibility(8);
        try {
            kotlinx.coroutines.q qVar = this.f305241e;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(d4Var.j(), e17, "onDismissListener resume error!", new java.lang.Object[0]);
        }
        k84.r1 r1Var = k84.d4.V;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$startAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        d4Var.d0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$startAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startFullScreenPag$4$1$2");
    }
}
