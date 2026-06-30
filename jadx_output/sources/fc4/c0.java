package fc4;

/* loaded from: classes4.dex */
public final class c0 implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc4.f0 f261110d;

    public c0(fc4.f0 f0Var) {
        this.f261110d = f0Var;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener
    public final void onStateChange(int i17, int i18) {
        com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView mediaControlBar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStateChange", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC$initSeekBar$7$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getExpandableBarView$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView = this.f261110d.f261138e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getExpandableBarView$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        if (expandableHeroSeekBarView != null && (mediaControlBar = expandableHeroSeekBarView.getMediaControlBar()) != null) {
            mediaControlBar.n(i18 == 5);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStateChange", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC$initSeekBar$7$1");
    }
}
