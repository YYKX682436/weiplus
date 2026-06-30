package u84;

/* loaded from: classes4.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f425657a;

    /* renamed from: b, reason: collision with root package name */
    public u84.m1 f425658b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f425659c;

    public q1(int i17) {
        this.f425657a = i17;
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarLogic");
        com.tencent.mars.xlog.Log.i("AdStateSettingBarLogic", "adStateSettingBarLogic, from not ad to resetUI");
        u84.m1 m1Var = this.f425658b;
        if (m1Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
            m1Var.M.removeCallbacksAndMessages(null);
            android.widget.FrameLayout frameLayout = m1Var.f425601v;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            m1Var.C();
            m1Var.L = false;
            kotlinx.coroutines.r2 r2Var = m1Var.K;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            m1Var.K = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarLogic");
    }
}
