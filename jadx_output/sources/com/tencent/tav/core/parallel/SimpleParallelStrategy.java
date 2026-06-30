package com.tencent.tav.core.parallel;

/* loaded from: classes16.dex */
public class SimpleParallelStrategy extends com.tencent.tav.core.parallel.BaseParallelStrategy {
    com.tencent.tav.extractor.AssetExtractor extractor = new com.tencent.tav.extractor.AssetExtractor();
    private int parallelSize;

    public SimpleParallelStrategy(com.tencent.tav.core.AssetParallelExportSession assetParallelExportSession) {
        this.parallelSize = 1;
        this.extractor.setDataSource(((com.tencent.tav.asset.CompositionTrackSegment) ((com.tencent.tav.asset.AssetTrack) assetParallelExportSession.asset.getTracks().get(0)).getSegments().get(0)).getSourcePath());
        int firstTrackIndex = com.tencent.tav.decoder.DecoderUtils.getFirstTrackIndex(this.extractor, "video/");
        this.extractor.selectTrack(firstTrackIndex);
        android.media.MediaFormat trackFormat = this.extractor.getTrackFormat(firstTrackIndex);
        try {
            int supportMaxParallelCount = com.tencent.tav.decoder.CodecHelper.getSupportMaxParallelCount(trackFormat.containsKey("width") ? trackFormat.getInteger("width") : 0, trackFormat.containsKey("height") ? trackFormat.getInteger("height") : 0, trackFormat.containsKey("frame-rate") ? trackFormat.getInteger("frame-rate") : 30, trackFormat.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE) ? trackFormat.getInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE) : 0L, trackFormat.getString("mime"));
            this.parallelSize = supportMaxParallelCount;
            com.tencent.tav.decoder.logger.Logger.i("SimpleParallelStrategy", "parallelSize %d", java.lang.Integer.valueOf(supportMaxParallelCount));
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.tencent.tav.core.parallel.IParallelStrategy
    public void calculateSubsection(com.tencent.tav.core.AssetParallelExportSession assetParallelExportSession, java.util.ArrayList<com.tencent.tav.core.parallel.info.PipelineIndicatorInfo> arrayList) {
        long durationUs = assetParallelExportSession.getTimeRange().getDurationUs() / this.parallelSize;
        long startUs = assetParallelExportSession.timeRange.getStartUs();
        if (this.parallelSize == 1) {
            addPipelineIndicator(0, startUs / 1000, assetParallelExportSession.timeRange.getEndUs() / 1000, arrayList);
        } else {
            long j17 = startUs;
            int i17 = 0;
            while (true) {
                long j18 = j17 + durationUs;
                if (j18 >= assetParallelExportSession.getTimeRange().getEndUs() || i17 >= this.parallelSize - 1) {
                    break;
                }
                this.extractor.seekTo(j18, 1);
                long sampleTime = this.extractor.getSampleTime();
                int i18 = i17 + 1;
                addPipelineIndicator(i17, j17 / 1000, sampleTime / 1000, arrayList);
                if (sampleTime <= j17) {
                    i17 = i18;
                    break;
                } else {
                    j17 = sampleTime;
                    i17 = i18;
                }
            }
            if (j17 < assetParallelExportSession.timeRange.getEndUs()) {
                addPipelineIndicator(i17, j17 / 1000, assetParallelExportSession.timeRange.getEndUs() / 1000, arrayList);
            }
            this.extractor.release();
        }
        int size = arrayList.size();
        this.parallelSize = size;
        com.tencent.tav.decoder.logger.Logger.i("SimpleParallelStrategy", "calculateSubsection final parallelSize:%d", java.lang.Integer.valueOf(size));
    }

    @Override // com.tencent.tav.core.parallel.IParallelStrategy
    public int parallelSize() {
        return this.parallelSize;
    }
}
