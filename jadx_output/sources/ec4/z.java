package ec4;

/* loaded from: classes10.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec4.d0 f251193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f251194e;

    public z(ec4.d0 d0Var, boolean z17) {
        this.f251193d = d0Var;
        this.f251194e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runExitAni$1$1$onAnimationEnd$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isPreview$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        ec4.d0 d0Var = this.f251193d;
        boolean z17 = d0Var.f251130p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isPreview$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        if (z17) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("sns_update_preview_video_del", this.f251194e);
            d0Var.getActivity().setResult(-1, intent);
        }
        d0Var.getActivity().finish();
        d0Var.getActivity().overridePendingTransition(0, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runExitAni$1$1$onAnimationEnd$1");
    }
}
