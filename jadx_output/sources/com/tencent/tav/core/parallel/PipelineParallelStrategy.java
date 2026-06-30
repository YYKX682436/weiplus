package com.tencent.tav.core.parallel;

/* loaded from: classes16.dex */
public class PipelineParallelStrategy extends com.tencent.tav.core.parallel.BaseParallelStrategy {
    public static final int SEGMENT_DURATION_MS = 5000;

    @Override // com.tencent.tav.core.parallel.IParallelStrategy
    public void calculateSubsection(com.tencent.tav.core.AssetParallelExportSession assetParallelExportSession, java.util.ArrayList<com.tencent.tav.core.parallel.info.PipelineIndicatorInfo> arrayList) {
        int i17;
        com.tencent.tav.extractor.AssetExtractor assetExtractor = new com.tencent.tav.extractor.AssetExtractor();
        assetExtractor.setDataSource(((com.tencent.tav.asset.CompositionTrackSegment) ((com.tencent.tav.asset.AssetTrack) assetParallelExportSession.asset.getTracks().get(0)).getSegments().get(0)).getSourcePath());
        assetExtractor.selectTrack(com.tencent.tav.decoder.DecoderUtils.getFirstTrackIndex(assetExtractor, "video/"));
        long startUs = assetParallelExportSession.timeRange.getStartUs();
        int i18 = 0;
        while (true) {
            long j17 = 5000000 + startUs;
            if (j17 >= assetParallelExportSession.timeRange.getEndUs()) {
                i17 = i18;
                break;
            }
            assetExtractor.seekTo(j17, 1);
            long sampleTime = assetExtractor.getSampleTime();
            int i19 = i18 + 1;
            addPipelineIndicator(i18, startUs / 1000, sampleTime / 1000, arrayList);
            if (sampleTime <= startUs) {
                i17 = i19;
                break;
            } else {
                startUs = sampleTime;
                i18 = i19;
            }
        }
        if (startUs < assetParallelExportSession.timeRange.getEndUs()) {
            addPipelineIndicator(i17, startUs / 1000, assetParallelExportSession.timeRange.getEndUs() / 1000, arrayList);
        }
        assetExtractor.release();
    }

    @Override // com.tencent.tav.core.parallel.IParallelStrategy
    public int parallelSize() {
        return 2;
    }
}
