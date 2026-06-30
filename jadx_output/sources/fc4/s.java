package fc4;

/* loaded from: classes4.dex */
public final class s implements al5.v3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fc4.v f261202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView f261203b;

    public s(fc4.v vVar, com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView) {
        this.f261202a = vVar;
        this.f261203b = flexibleVideoView;
    }

    @Override // al5.v3
    public android.graphics.Rect a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRect", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC$onCreate$2");
        boolean w17 = pc4.d.f353410a.w();
        fc4.v vVar = this.f261202a;
        if (w17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$findExpandableSeekBarView", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC");
            vVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findExpandableSeekBarView", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC");
            com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView = (com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView) vVar.findViewById(com.tencent.mm.R.id.ncv);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findExpandableSeekBarView", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$findExpandableSeekBarView", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC");
            if (expandableHeroSeekBarView != null) {
                expandableHeroSeekBarView.d(false, true);
            }
        } else {
            com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView O6 = fc4.v.O6(vVar);
            if (O6 != null) {
                O6.setInitVisible(false);
            }
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        this.f261203b.getGlobalVisibleRect(rect);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRect", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC$onCreate$2");
        return rect;
    }
}
