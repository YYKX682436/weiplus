package fc4;

/* loaded from: classes4.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc4.f0 f261121d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(fc4.f0 f0Var) {
        super(0);
        this.f261121d = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView mediaControlBar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC$initSeekBar$7");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC$initSeekBar$7");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSeekBarView$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        fc4.f0 f0Var = this.f261121d;
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView = f0Var.f261139f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSeekBarView$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        boolean z17 = false;
        if (heroSeekBarView != null) {
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView O6 = fc4.f0.O6(f0Var);
            com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView.i(heroSeekBarView, O6 != null ? O6.getVideoSpeedRatio() : 1.0f, false, 2, null);
        }
        if (pc4.d.f353410a.w()) {
            com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView = (com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView) f0Var.findViewById(com.tencent.mm.R.id.ncv);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setExpandableBarView$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            f0Var.f261138e = expandableHeroSeekBarView;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setExpandableBarView$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getExpandableBarView$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView2 = f0Var.f261138e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getExpandableBarView$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            if (expandableHeroSeekBarView2 != null && (mediaControlBar = expandableHeroSeekBarView2.getMediaControlBar()) != null) {
                com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView O62 = fc4.f0.O6(f0Var);
                if (O62 != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView");
                    boolean z18 = O62.f169232r;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView");
                    z17 = z18;
                }
                mediaControlBar.n(z17);
            }
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView O63 = fc4.f0.O6(f0Var);
            if (O63 != null) {
                fc4.c0 c0Var = new fc4.c0(f0Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addPlayerStateChangeListener", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView");
                ik4.g gVar = O63.f169228n.f291957e;
                if (gVar != null) {
                    java.util.HashSet hashSet = gVar.f291928w;
                    hashSet.add(c0Var);
                    if (hashSet.size() == 1) {
                        gVar.f308541q = new ik4.d(gVar);
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addPlayerStateChangeListener", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC$initSeekBar$7");
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC$initSeekBar$7");
        return f0Var2;
    }
}
