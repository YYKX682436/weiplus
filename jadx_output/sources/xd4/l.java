package xd4;

/* loaded from: classes4.dex */
public final class l implements z35.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xd4.z f453665a;

    public l(xd4.z zVar) {
        this.f453665a = zVar;
    }

    @Override // z35.f0
    public void a(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoSpeedChanged", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBar$4");
        com.tencent.mm.plugin.sns.ui.OnlineVideoView f18 = xd4.z.f(this.f453665a);
        if (f18 != null) {
            f18.setVideoSpeedRatio(f17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoSpeedChanged", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$initControlBar$4");
    }
}
