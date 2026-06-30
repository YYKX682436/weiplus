package xd4;

/* loaded from: classes4.dex */
public final class s implements z35.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xd4.z f453700a;

    public s(xd4.z zVar) {
        this.f453700a = zVar;
    }

    @Override // z35.f0
    public void a(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoSpeedChanged", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBarWithRootView$4");
        com.tencent.mm.plugin.sns.ui.OnlineVideoView f18 = xd4.z.f(this.f453700a);
        if (f18 != null) {
            f18.setVideoSpeedRatio(f17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoSpeedChanged", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBarWithRootView$4");
    }
}
