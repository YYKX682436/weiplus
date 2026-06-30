package fc4;

/* loaded from: classes4.dex */
public final class t implements al5.x3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fc4.v f261204a;

    public t(fc4.v vVar) {
        this.f261204a = vVar;
    }

    @Override // al5.x3
    public void a(int i17, float f17) {
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView O6;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scaleEnd", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC$onCreate$3");
        if (!pc4.d.f353410a.w()) {
            if (ca4.z0.g0() && (O6 = fc4.v.O6(this.f261204a)) != null) {
                O6.setInitVisible(true);
            }
            ta4.f1.f416743a.a(i17, f17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scaleEnd", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC$onCreate$3");
    }
}
