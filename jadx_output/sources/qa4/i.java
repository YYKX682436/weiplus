package qa4;

/* loaded from: classes4.dex */
public final class i implements xd4.g0 {
    @Override // xd4.g0
    public com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.VideoRptStruct b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("provideUiReport", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp$getSnsVideoTask$1");
        com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.VideoRptStruct videoRptStruct = new com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.VideoRptStruct();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("provideUiReport", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp$getSnsVideoTask$1");
        return videoRptStruct;
    }

    @Override // xd4.g0
    public long c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("providePlayVideoDurationByResume", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp$getSnsVideoTask$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("providePlayVideoDurationByResume", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp$getSnsVideoTask$1");
        return 0L;
    }
}
