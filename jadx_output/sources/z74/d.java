package z74;

/* loaded from: classes4.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView f470589d;

    public d(com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView cardOnlineVideoView) {
        this.f470589d = cardOnlineVideoView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView$1");
        this.f470589d.B();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView$1");
    }
}
