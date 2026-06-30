package com.tencent.tav.core.parallel;

/* loaded from: classes16.dex */
public interface IParallelStrategy {
    void calculateSubsection(com.tencent.tav.core.AssetParallelExportSession assetParallelExportSession, java.util.ArrayList<com.tencent.tav.core.parallel.info.PipelineIndicatorInfo> arrayList);

    int parallelSize();
}
