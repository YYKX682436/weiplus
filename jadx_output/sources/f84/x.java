package f84;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f260220a;

    /* renamed from: b, reason: collision with root package name */
    public f84.u f260221b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f260222c;

    public x(int i17) {
        this.f260220a = i17;
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicLogic");
        com.tencent.mars.xlog.Log.i("AdBrandTopicLogic", "mAdBrandTopicComponent, resetUI");
        f84.u uVar = this.f260221b;
        if (uVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            android.widget.FrameLayout frameLayout = uVar.f260210t;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            uVar.G = false;
            uVar.H = false;
            uVar.I = false;
            uVar.f260204J.removeCallbacksAndMessages(null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicLogic");
    }
}
