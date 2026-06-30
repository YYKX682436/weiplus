package xd4;

/* loaded from: classes4.dex */
public final class u implements n34.b3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView f453712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xd4.z f453713b;

    public u(com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView suspendableHeroSeekBarView, xd4.z zVar) {
        this.f453712a = suspendableHeroSeekBarView;
        this.f453713b = zVar;
    }

    @Override // n34.b3
    public void a(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableDrag", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBarWithRootView$6");
        this.f453712a.setEnableDrag(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableDrag", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBarWithRootView$6");
    }

    @Override // n34.b3
    public void reset() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBarWithRootView$6");
        this.f453712a.g();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBarWithRootView$6");
    }

    @Override // n34.b3
    public void startPlay() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBarWithRootView$6");
        xd4.z.h(this.f453713b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBarWithRootView$6");
    }

    @Override // n34.b3
    public void u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBarWithRootView$6");
        xd4.z.h(this.f453713b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBarWithRootView$6");
    }
}
