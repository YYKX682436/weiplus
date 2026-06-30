package tc4;

/* loaded from: classes4.dex */
public final class j4 implements com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewFirstFrameRenderCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tc4.k4 f417386a;

    public j4(tc4.k4 k4Var) {
        this.f417386a = k4Var;
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewFirstFrameRenderCallback
    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("readerFirstFrame", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$play$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getThumbImg$p", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.MaskImageView maskImageView = this.f417386a.A1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getThumbImg$p", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        if (maskImageView != null) {
            maskImageView.setVisibility(4);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readerFirstFrame", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$play$1");
    }
}
