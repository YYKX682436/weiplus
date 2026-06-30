package k84;

/* loaded from: classes4.dex */
public final class w5 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.c6 f305314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f305315e;

    public w5(k84.c6 c6Var, com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f305314d = c6Var;
        this.f305315e = mMPAGView;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startFullScreenPag$1");
        java.lang.String str = this.f305314d.j() + "dialog_dismissCallback";
        com.tencent.mm.view.MMPAGView mMPAGView = this.f305315e;
        k84.c6 c6Var = this.f305314d;
        try {
            mMPAGView.n();
            mMPAGView.setVisibility(8);
            ((ku5.t0) ku5.t0.f312615d).g(new k84.v5(c6Var, mMPAGView));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMVibrateJob$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            kotlinx.coroutines.r2 r2Var = c6Var.N;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMVibrateJob$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c(str, th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startFullScreenPag$1");
    }
}
