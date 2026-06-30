package xd4;

/* loaded from: classes4.dex */
public final class t implements z35.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView f453705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xd4.z f453706e;

    public t(com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView suspendableHeroSeekBarView, xd4.z zVar) {
        this.f453705d = suspendableHeroSeekBarView;
        this.f453706e = zVar;
    }

    @Override // z35.d0
    public void D0(android.widget.SeekBar seekBar, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStopTrackingTouch", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBarWithRootView$5");
        xd4.z zVar = this.f453706e;
        com.tencent.mm.plugin.sns.ui.OnlineVideoView f17 = xd4.z.f(zVar);
        if (f17 != null) {
            f17.Z((int) (this.f453705d.c(i17) / 1000), true);
        }
        com.tencent.mm.plugin.sns.ui.OnlineVideoView f18 = xd4.z.f(zVar);
        if (f18 != null) {
            f18.setAllowStart(true);
        }
        xd4.h e17 = xd4.z.e(zVar);
        e17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispose", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$DelaySeekTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getUiMainHandler$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        com.tencent.mm.sdk.platformtools.n3 n3Var = e17.f453644f.f453729j;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getUiMainHandler$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        n3Var.removeCallbacks(e17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispose", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$DelaySeekTask");
        com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView g17 = xd4.z.g(zVar);
        if (g17 != null) {
            g17.setBarVisibleExcludeControlArea(0);
        }
        com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView g18 = xd4.z.g(zVar);
        if (g18 != null) {
            g18.setCollapseEnable(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStopTrackingTouch", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBarWithRootView$5");
    }

    @Override // z35.d0
    public void g6(android.widget.SeekBar seekBar, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartTrackingTouch", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBarWithRootView$5");
        xd4.z zVar = this.f453706e;
        com.tencent.mm.plugin.sns.ui.OnlineVideoView f17 = xd4.z.f(zVar);
        if (f17 != null) {
            f17.F();
        }
        com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView g17 = xd4.z.g(zVar);
        if (g17 != null) {
            g17.setBarVisibleExcludeControlArea(4);
        }
        com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView g18 = xd4.z.g(zVar);
        if (g18 != null) {
            g18.setCollapseEnable(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartTrackingTouch", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBarWithRootView$5");
    }

    @Override // z35.d0
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProgressChanged", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBarWithRootView$5");
        if (z17) {
            xd4.z.e(this.f453706e).a((int) (this.f453705d.c(i17) / 1000));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgressChanged", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBarWithRootView$5");
    }
}
