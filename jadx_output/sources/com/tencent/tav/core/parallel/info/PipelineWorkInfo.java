package com.tencent.tav.core.parallel.info;

/* loaded from: classes15.dex */
public class PipelineWorkInfo {
    public static final int PIPELINE_TYPE_AUDIO = 2;
    public static final int PIPELINE_TYPE_VIDEO = 1;
    public com.tencent.tav.core.AssetWriter assetWriter;
    private com.tencent.tav.core.parallel.info.PipelineIndicatorInfo indicator;
    public com.tencent.tav.core.AssetReaderOutput readerOutput;
    public android.os.HandlerThread thread;
    public int type;
    public com.tencent.tav.core.AssetWriterInput writerInput;

    public PipelineWorkInfo(int i17, com.tencent.tav.core.AssetReaderOutput assetReaderOutput, com.tencent.tav.core.AssetWriterInput assetWriterInput, android.os.HandlerThread handlerThread, com.tencent.tav.core.parallel.info.PipelineIndicatorInfo pipelineIndicatorInfo) {
        this.type = i17;
        this.readerOutput = assetReaderOutput;
        this.writerInput = assetWriterInput;
        this.thread = handlerThread;
        setIndicator(pipelineIndicatorInfo);
    }

    public com.tencent.tav.core.parallel.info.PipelineIndicatorInfo getIndicator() {
        return this.indicator;
    }

    public void reuseWork(com.tencent.tav.core.parallel.info.PipelineWorkInfo pipelineWorkInfo) {
        com.tencent.tav.core.parallel.info.PipelineIndicatorInfo pipelineIndicatorInfo = pipelineWorkInfo.indicator;
        pipelineWorkInfo.indicator = this.indicator;
        this.indicator = pipelineIndicatorInfo;
        pipelineIndicatorInfo.setSegmentStatus(com.tencent.tav.core.AssetParallelSegmentStatus.AssetParallelStatusStarted);
    }

    public void setIndicator(com.tencent.tav.core.parallel.info.PipelineIndicatorInfo pipelineIndicatorInfo) {
        this.indicator = pipelineIndicatorInfo;
        pipelineIndicatorInfo.setSegmentStatus(com.tencent.tav.core.AssetParallelSegmentStatus.AssetParallelStatusPrepared);
    }

    public java.lang.String toString() {
        java.util.Locale locale = java.util.Locale.ENGLISH;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(hashCode());
        objArr[1] = this.type == 1 ? "video" : "audio";
        objArr[2] = java.lang.Integer.valueOf(this.indicator.getIndex());
        objArr[3] = java.lang.Long.valueOf(this.indicator.timeRange.getStartUs() / 1000);
        objArr[4] = java.lang.Long.valueOf(this.indicator.timeRange.getEndUs() / 1000);
        return java.lang.String.format(locale, "[hash:%d]type:%s  segment index:%d  time[%d,%d]", objArr);
    }
}
