package xd4;

/* loaded from: classes4.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView f453629d;

    public b0(com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView) {
        this.f453629d = snsTimelineVideoView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView$1");
        this.f453629d.B();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView$1");
    }
}
