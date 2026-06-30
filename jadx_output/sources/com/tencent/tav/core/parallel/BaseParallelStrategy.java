package com.tencent.tav.core.parallel;

/* loaded from: classes16.dex */
public abstract class BaseParallelStrategy implements com.tencent.tav.core.parallel.IParallelStrategy {
    protected static final java.lang.String TAG = "SimpleParallelStrategy";

    public void addPipelineIndicator(int i17, long j17, long j18, java.util.ArrayList<com.tencent.tav.core.parallel.info.PipelineIndicatorInfo> arrayList) {
        if (j17 < 0 || j17 >= j18) {
            return;
        }
        com.tencent.tav.decoder.logger.Logger.i(TAG, "index:%d  CMRange[%d %d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        arrayList.add(new com.tencent.tav.core.parallel.info.PipelineIndicatorInfo(1, i17, new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.fromMs(j17), com.tencent.tav.coremedia.CMTime.fromMs(j18 - j17))));
    }
}
