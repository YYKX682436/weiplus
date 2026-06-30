package n34;

/* loaded from: classes4.dex */
public final class r3 implements z35.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.OnlineVideoView f334721a;

    public r3(com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView) {
        this.f334721a = onlineVideoView;
    }

    @Override // z35.f0
    public void a(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoSpeedChanged", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$init$3");
        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = this.f334721a;
        if (onlineVideoView != null) {
            onlineVideoView.setVideoSpeedRatio(f17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoSpeedChanged", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$init$3");
    }
}
