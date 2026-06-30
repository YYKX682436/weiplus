package xd4;

/* loaded from: classes4.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView f453682d;

    public m0(xd4.o0 o0Var, com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView) {
        this.f453682d = snsTimelineVideoView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr$1");
        this.f453682d.O1 = true;
        this.f453682d.B();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr$1");
    }
}
