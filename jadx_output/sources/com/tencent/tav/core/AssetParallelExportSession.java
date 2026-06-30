package com.tencent.tav.core;

/* loaded from: classes10.dex */
public class AssetParallelExportSession {
    public static final java.lang.String TAG = "AssetExportSession";
    public boolean appliesPreferredTrackTransform;
    public com.tencent.tav.asset.Asset asset;
    public com.tencent.tav.core.AssetExtension assetExtension;
    private com.tencent.tav.core.AudioMix audioMix;
    private final com.tencent.tav.core.ExportConfig exportConfig;
    public com.tencent.tav.core.ExportErrorStatus exportErrorStatus;
    private com.tencent.tav.core.parallel.newversion.AssetParallelExportWork exportWork;
    private java.util.ArrayList<com.tencent.tav.core.parallel.info.PipelineIndicatorInfo> indicatorInfo;
    private boolean isEnableNewTextureBlitting;
    private boolean isEnableOptimizedVideoFrameSampling;
    private boolean isNeedCheckFrameProcessTimeout;
    private long maxTimeoutMs;
    private com.tencent.tav.codec.IMediaFactory mediaFactory;
    private java.util.List<com.tencent.tav.asset.MetadataItem> metadata;
    public java.lang.String outputFilePath;
    public java.lang.String outputFileType;
    private java.lang.String presetName;
    public com.tencent.tav.core.ExportErrorStatus processErrorStatus;
    public float progress;
    private com.tencent.tav.decoder.RenderContextParams renderContextParams;
    private boolean revertMode;
    public com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus status;
    private java.util.List<java.lang.String> supportedFileTypes;
    public com.tencent.tav.coremedia.CMTimeRange timeRange;
    private boolean timeoutInterruptWork;
    public com.tencent.tav.core.compositing.VideoCompositing videoCompositing;
    public com.tencent.tav.core.composition.VideoComposition videoComposition;

    /* loaded from: classes10.dex */
    public interface ExportCallbackHandler {
        void handlerCallback(com.tencent.tav.core.AssetParallelExportSession assetParallelExportSession);
    }

    @java.lang.Deprecated
    public AssetParallelExportSession(com.tencent.tav.asset.Asset asset, com.tencent.tav.decoder.EncoderWriter.OutputConfig outputConfig) {
        this(asset, new com.tencent.tav.core.ExportConfig(outputConfig), new com.tencent.tav.core.AssetExtension(com.tencent.tav.core.AssetExtension.SCENE_EXPORT));
    }

    public void cancelExport() {
        com.tencent.tav.decoder.logger.Logger.i("AssetExportSession", "cancelExport");
        com.tencent.tav.core.parallel.newversion.AssetParallelExportWork assetParallelExportWork = this.exportWork;
        if (assetParallelExportWork != null) {
            assetParallelExportWork.cancel();
        }
    }

    public void exportAsynchronouslyWithCompletionHandler(com.tencent.tav.core.AssetParallelExportSession.ExportCallbackHandler exportCallbackHandler) {
        com.tencent.tav.core.parallel.newversion.AssetParallelExportWork assetParallelExportWork = new com.tencent.tav.core.parallel.newversion.AssetParallelExportWork(this, exportCallbackHandler, this.audioMix, this.exportConfig);
        this.exportWork = assetParallelExportWork;
        assetParallelExportWork.setRenderContextParams(this.renderContextParams);
        this.exportWork.setMediaFactory(this.mediaFactory);
        this.exportWork.setTimeoutParameter(this.isNeedCheckFrameProcessTimeout, this.timeoutInterruptWork, this.maxTimeoutMs);
        this.exportWork.startExport();
    }

    public com.tencent.tav.asset.Asset getAsset() {
        return this.asset;
    }

    public com.tencent.tav.core.AudioMix getAudioMix() {
        return this.audioMix;
    }

    public int getErrCode() {
        com.tencent.tav.core.ExportErrorStatus exportErrorStatus = this.exportErrorStatus;
        if (exportErrorStatus != null) {
            return exportErrorStatus.code;
        }
        return 0;
    }

    public com.tencent.tav.core.ExportConfig getExportConfig() {
        return this.exportConfig;
    }

    public com.tencent.tav.core.ExportErrorStatus getExportErrorStatus() {
        return this.exportErrorStatus;
    }

    public java.util.ArrayList<com.tencent.tav.core.parallel.info.PipelineIndicatorInfo> getIndicatorInfo() {
        return this.indicatorInfo;
    }

    public java.util.List<com.tencent.tav.asset.MetadataItem> getMetadata() {
        return this.metadata;
    }

    public java.lang.String getOutputFilePath() {
        return this.outputFilePath;
    }

    public java.lang.String getOutputFileType() {
        return this.outputFileType;
    }

    public java.lang.String getPresetName() {
        return this.presetName;
    }

    public float getProgress() {
        return this.progress;
    }

    public com.tencent.tav.decoder.RenderContextParams getRenderContextParams() {
        return this.renderContextParams;
    }

    public com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus getStatus() {
        return this.status;
    }

    public java.util.List<java.lang.String> getSupportedFileTypes() {
        return this.supportedFileTypes;
    }

    public java.lang.Throwable getThrowable() {
        com.tencent.tav.core.ExportErrorStatus exportErrorStatus = this.exportErrorStatus;
        if (exportErrorStatus != null) {
            return exportErrorStatus.throwable;
        }
        return null;
    }

    public com.tencent.tav.coremedia.CMTimeRange getTimeRange() {
        return this.timeRange;
    }

    public com.tencent.tav.core.compositing.VideoCompositing getVideoCompositing() {
        if (this.videoCompositing == null) {
            this.videoCompositing = newVideoCompositing();
        }
        return this.videoCompositing;
    }

    public com.tencent.tav.core.composition.VideoComposition getVideoComposition() {
        return this.videoComposition;
    }

    public boolean isEnableNewTextureBlitting() {
        return this.isEnableNewTextureBlitting;
    }

    public boolean isEnableOptimizedVideoFrameSampling() {
        return this.isEnableOptimizedVideoFrameSampling;
    }

    public boolean isRevertMode() {
        return this.revertMode;
    }

    public com.tencent.tav.core.compositing.VideoCompositing newVideoCompositing() {
        return this.videoComposition.getCustomVideoCompositor();
    }

    public int parallelSize() {
        com.tencent.tav.core.parallel.newversion.AssetParallelExportWork assetParallelExportWork = this.exportWork;
        if (assetParallelExportWork != null) {
            return assetParallelExportWork.getMaxParallelCount();
        }
        return 0;
    }

    public void release() {
        com.tencent.tav.core.AudioMix audioMix = this.audioMix;
        if (audioMix != null) {
            audioMix.release();
            this.audioMix = null;
        }
    }

    public void setAppliesPreferredTrackTransform(boolean z17) {
        this.appliesPreferredTrackTransform = z17;
    }

    public void setAudioMix(com.tencent.tav.core.AudioMix audioMix) {
        this.audioMix = audioMix;
    }

    public void setEnableNewTextureBlitting(boolean z17) {
        this.isEnableNewTextureBlitting = z17;
    }

    public void setEnableOptimizedVideoFrameSampling(boolean z17) {
        this.isEnableOptimizedVideoFrameSampling = z17;
    }

    public void setIndicatorInfo(java.util.ArrayList<com.tencent.tav.core.parallel.info.PipelineIndicatorInfo> arrayList) {
        this.indicatorInfo.clear();
        this.indicatorInfo.addAll(arrayList);
    }

    public void setMediaFactory(com.tencent.tav.codec.IMediaFactory iMediaFactory) {
        this.mediaFactory = iMediaFactory;
    }

    public void setMetadata(java.util.List<com.tencent.tav.asset.MetadataItem> list) {
        this.metadata = list;
    }

    public void setOutputFilePath(java.lang.String str) {
        this.outputFilePath = str;
    }

    public void setOutputFileType(java.lang.String str) {
        this.outputFileType = str;
    }

    public void setRenderContextParams(com.tencent.tav.decoder.RenderContextParams renderContextParams) {
        this.renderContextParams = renderContextParams;
        com.tencent.tav.core.parallel.newversion.AssetParallelExportWork assetParallelExportWork = this.exportWork;
        if (assetParallelExportWork != null) {
            assetParallelExportWork.setRenderContextParams(renderContextParams);
        }
    }

    public void setRevertMode(boolean z17) {
        this.revertMode = z17;
    }

    public void setTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        this.timeRange = cMTimeRange;
    }

    public void setTimeoutParameter(boolean z17, boolean z18, long j17) {
        this.isNeedCheckFrameProcessTimeout = z17;
        this.timeoutInterruptWork = z18;
        this.maxTimeoutMs = j17;
        com.tencent.tav.decoder.logger.Logger.i("AssetExportSession", "setNeedCheckFrameProcessTimeout:%b timeoutInterruptWork:%b timeoutMs:%d", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Long.valueOf(j17));
    }

    public void setVideoComposition(com.tencent.tav.core.composition.VideoComposition videoComposition) {
        this.videoComposition = videoComposition;
    }

    public AssetParallelExportSession(com.tencent.tav.asset.Asset asset, com.tencent.tav.core.ExportConfig exportConfig) {
        this(asset, exportConfig, new com.tencent.tav.core.AssetExtension(com.tencent.tav.core.AssetExtension.SCENE_EXPORT));
    }

    public AssetParallelExportSession(com.tencent.tav.asset.Asset asset, com.tencent.tav.core.ExportConfig exportConfig, com.tencent.tav.core.AssetExtension assetExtension) {
        this.outputFileType = "mp4";
        this.revertMode = false;
        this.indicatorInfo = new java.util.ArrayList<>();
        this.isEnableOptimizedVideoFrameSampling = false;
        this.isEnableNewTextureBlitting = false;
        this.appliesPreferredTrackTransform = false;
        this.isNeedCheckFrameProcessTimeout = true;
        this.timeoutInterruptWork = false;
        this.maxTimeoutMs = com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT;
        this.asset = asset;
        this.assetExtension = assetExtension;
        if (exportConfig == null || !exportConfig.available()) {
            com.tencent.tav.decoder.logger.Logger.e("AssetExportSession", "AssetExportSession: encodeOption 不合法");
            exportConfig = new com.tencent.tav.core.ExportConfig((int) asset.getNaturalSize().width, (int) asset.getNaturalSize().height);
        }
        this.exportConfig = exportConfig;
    }
}
