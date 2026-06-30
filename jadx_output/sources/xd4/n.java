package xd4;

/* loaded from: classes4.dex */
public final class n implements n34.b3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView f453683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xd4.z f453684b;

    public n(com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView suspendableHeroSeekBarView, xd4.z zVar) {
        this.f453683a = suspendableHeroSeekBarView;
        this.f453684b = zVar;
    }

    @Override // n34.b3
    public void a(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableDrag", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBar$6");
        this.f453683a.setEnableDrag(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableDrag", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBar$6");
    }

    @Override // n34.b3
    public void reset() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBar$6");
        this.f453683a.g();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBar$6");
    }

    @Override // n34.b3
    public void startPlay() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBar$6");
        xd4.z.h(this.f453684b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBar$6");
    }

    @Override // n34.b3
    public void u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBar$6");
        xd4.z.h(this.f453684b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBar$6");
    }
}
