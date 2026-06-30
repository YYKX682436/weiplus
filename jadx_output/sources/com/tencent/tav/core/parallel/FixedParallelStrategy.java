package com.tencent.tav.core.parallel;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/tencent/tav/core/parallel/FixedParallelStrategy;", "Lcom/tencent/tav/core/parallel/BaseParallelStrategy;", "", "parallelSize", "Lcom/tencent/tav/core/AssetParallelExportSession;", "exportSession", "Ljava/util/ArrayList;", "Lcom/tencent/tav/core/parallel/info/PipelineIndicatorInfo;", "list", "Ljz5/f0;", "calculateSubsection", "Lcom/tencent/tav/core/AssetParallelExportSession;", "getExportSession", "()Lcom/tencent/tav/core/AssetParallelExportSession;", "setExportSession", "(Lcom/tencent/tav/core/AssetParallelExportSession;)V", "I", "<init>", "Companion", "tav-foundation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes16.dex */
public final class FixedParallelStrategy extends com.tencent.tav.core.parallel.BaseParallelStrategy {
    private static final java.lang.String TAG = "MicroMsg.FixedParallelStrategy";
    private com.tencent.tav.core.AssetParallelExportSession exportSession;
    private int parallelSize;

    public FixedParallelStrategy(com.tencent.tav.core.AssetParallelExportSession exportSession) {
        kotlin.jvm.internal.o.g(exportSession, "exportSession");
        this.exportSession = exportSession;
        this.parallelSize = 5;
        int i17 = com.tencent.tav.decoder.CodecHelper.HARD_CODE_PARALLEL_COUNT;
        if (i17 > 0) {
            this.parallelSize = i17;
            com.tencent.tav.decoder.logger.Logger.i(TAG, "CodecHelper set debug suggestParallelCount:" + this.parallelSize);
            return;
        }
        if (exportSession.getExportConfig().getSuggestParallelCount() > 0) {
            this.parallelSize = this.exportSession.getExportConfig().getSuggestParallelCount();
            com.tencent.tav.decoder.logger.Logger.i(TAG, "exportSession set suggestParallelCount:" + this.parallelSize);
        }
    }

    @Override // com.tencent.tav.core.parallel.IParallelStrategy
    public void calculateSubsection(com.tencent.tav.core.AssetParallelExportSession assetParallelExportSession, java.util.ArrayList<com.tencent.tav.core.parallel.info.PipelineIndicatorInfo> arrayList) {
        kotlin.jvm.internal.o.d(assetParallelExportSession);
        int durationUs = (int) (assetParallelExportSession.getTimeRange().getDurationUs() / 10000000);
        int i17 = this.parallelSize;
        if (durationUs > i17) {
            durationUs = i17;
        }
        this.parallelSize = durationUs;
        long startUs = assetParallelExportSession.timeRange.getStartUs();
        if (this.parallelSize <= 1) {
            long j17 = 1000;
            addPipelineIndicator(0, startUs / j17, assetParallelExportSession.timeRange.getEndUs() / j17, arrayList);
            com.tencent.tav.decoder.logger.Logger.i(TAG, "parallel size is 1");
            return;
        }
        long durationUs2 = assetParallelExportSession.getTimeRange().getDurationUs() / this.parallelSize;
        com.tencent.tav.decoder.logger.Logger.i(TAG, "calculateSubsection offset:%d currentPts:%d", java.lang.Long.valueOf(durationUs2), java.lang.Long.valueOf(startUs));
        int i18 = 0;
        if (this.parallelSize == 1) {
            long j18 = 1000;
            addPipelineIndicator(0, startUs / j18, assetParallelExportSession.timeRange.getEndUs() / j18, arrayList);
        } else {
            com.tencent.tav.extractor.AssetExtractor assetExtractor = new com.tencent.tav.extractor.AssetExtractor();
            java.lang.Object obj = assetParallelExportSession.asset.getTracks().get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.tav.asset.AssetTrack<*>");
            java.lang.Object obj2 = ((com.tencent.tav.asset.AssetTrack) obj).getSegments().get(0);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.tav.asset.CompositionTrackSegment");
            assetExtractor.setDataSource(((com.tencent.tav.asset.CompositionTrackSegment) obj2).getSourcePath());
            assetExtractor.selectTrack(com.tencent.tav.decoder.DecoderUtils.getFirstTrackIndex(assetExtractor, "video/"));
            long j19 = durationUs2;
            while (true) {
                long j27 = startUs + j19;
                if (j27 >= assetParallelExportSession.getTimeRange().getEndUs() || i18 >= this.parallelSize - 1) {
                    break;
                }
                assetExtractor.seekTo(j27, 1);
                long sampleTime = assetExtractor.getSampleTime();
                com.tencent.tav.decoder.logger.Logger.i(TAG, "currentPts:%d sampleTime:%d", java.lang.Long.valueOf(startUs), java.lang.Long.valueOf(sampleTime));
                if (sampleTime <= 0 && startUs == 0) {
                    int i19 = this.parallelSize;
                    if (i19 <= 1) {
                        break;
                    }
                    this.parallelSize = i19 - 1;
                    j19 = assetParallelExportSession.getTimeRange().getDurationUs() / this.parallelSize;
                    com.tencent.tav.decoder.logger.Logger.i(TAG, "update parallel size:" + this.parallelSize + " offset:" + j19);
                } else {
                    if (sampleTime <= startUs) {
                        break;
                    }
                    long j28 = 1000;
                    addPipelineIndicator(i18, startUs / j28, sampleTime / j28, arrayList);
                    startUs = sampleTime;
                    i18++;
                }
            }
            if (startUs < assetParallelExportSession.timeRange.getEndUs()) {
                long j29 = 1000;
                com.tencent.tav.decoder.logger.Logger.i(TAG, "add last currentPts:%d sampleTime:%d", java.lang.Long.valueOf(startUs), java.lang.Long.valueOf(assetParallelExportSession.timeRange.getEndUs()));
                addPipelineIndicator(i18, startUs / j29, assetParallelExportSession.timeRange.getEndUs() / j29, arrayList);
            }
            assetExtractor.release();
        }
        kotlin.jvm.internal.o.d(arrayList);
        int size = arrayList.size();
        this.parallelSize = size;
        com.tencent.tav.decoder.logger.Logger.i(TAG, "calculateSubsection final parallelSize:%d", java.lang.Integer.valueOf(size));
    }

    public final com.tencent.tav.core.AssetParallelExportSession getExportSession() {
        return this.exportSession;
    }

    @Override // com.tencent.tav.core.parallel.IParallelStrategy
    /* renamed from: parallelSize, reason: from getter */
    public int getParallelSize() {
        return this.parallelSize;
    }

    public final void setExportSession(com.tencent.tav.core.AssetParallelExportSession assetParallelExportSession) {
        kotlin.jvm.internal.o.g(assetParallelExportSession, "<set-?>");
        this.exportSession = assetParallelExportSession;
    }
}
