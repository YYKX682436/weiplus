package xd4;

/* loaded from: classes4.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f453630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView f453631e;

    public c0(com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView, java.lang.String str) {
        this.f453631e = snsTimelineVideoView;
        this.f453630d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView = this.f453631e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView$2");
        try {
            int i17 = com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView.f170638t2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
            xd4.e0 e0Var = snsTimelineVideoView.f170647s2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
            e0Var.a(this.f453630d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
            snsTimelineVideoView.f170647s2 = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Sns.SnsOnlineVideoView", e17, "doUICallback", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView$2");
    }
}
