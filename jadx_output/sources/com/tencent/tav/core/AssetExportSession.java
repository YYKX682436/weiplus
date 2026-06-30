package com.tencent.tav.core;

/* loaded from: classes10.dex */
public class AssetExportSession {
    public static final java.lang.String TAG = "AssetExportSession";
    boolean appliesPreferredTrackTransform;
    com.tencent.tav.asset.Asset asset;
    com.tencent.tav.core.AssetExtension assetExtension;
    private com.tencent.tav.core.AudioMix audioMix;
    boolean calculateBfsTransform;
    private final com.tencent.tav.core.ExportConfig exportConfig;
    com.tencent.tav.core.ExportErrorStatus exportErrorStatus;
    private com.tencent.tav.core.AssetExportThread exportThread;
    private boolean isEnableNewTextureBlitting;
    private boolean isEnableOptimizedVideoFrameSampling;
    private boolean isNeedCheckFrameProcessTimeout;
    private com.tencent.tav.decoder.logger.WXLoggerConfig loggerConfig;
    private long maxTimeoutMs;
    private com.tencent.tav.codec.IMediaFactory mediaFactory;
    private java.util.List<com.tencent.tav.asset.MetadataItem> metadata;
    java.lang.String outputFilePath;
    java.lang.String outputFileType;
    private java.lang.String presetName;
    public com.tencent.tav.core.ExportErrorStatus processErrorStatus;
    float progress;
    private com.tencent.tav.decoder.RenderContextParams renderContextParams;
    private boolean revertMode;
    com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus status;
    private java.util.List<java.lang.String> supportedFileTypes;
    com.tencent.tav.coremedia.CMTimeRange timeRange;
    private boolean timeoutInterruptWork;
    com.tencent.tav.core.compositing.VideoCompositing videoCompositing;
    com.tencent.tav.core.composition.VideoComposition videoComposition;

    /* loaded from: classes10.dex */
    public enum AssetExportSessionStatus {
        AssetExportSessionStatusUnknown,
        AssetExportSessionStatusExporting,
        AssetExportSessionStatusCompleted,
        AssetExportSessionStatusFailed,
        AssetExportSessionStatusCancelled,
        AssetExportSessionStatusTimeout
    }

    /* loaded from: classes16.dex */
    public interface ExportCallbackHandler {
        void handlerCallback(com.tencent.tav.core.AssetExportSession assetExportSession);
    }

    @java.lang.Deprecated
    public AssetExportSession(com.tencent.tav.asset.Asset asset, com.tencent.tav.decoder.EncoderWriter.OutputConfig outputConfig) {
        this(asset, new com.tencent.tav.core.ExportConfig(outputConfig), new com.tencent.tav.core.AssetExtension(com.tencent.tav.core.AssetExtension.SCENE_EXPORT));
    }

    public void cancelExport() {
        com.tencent.tav.decoder.logger.Logger.i("AssetExportSession", "cancelExport");
        com.tencent.tav.core.AssetExportThread assetExportThread = this.exportThread;
        if (assetExportThread != null) {
            assetExportThread.cancel();
        }
    }

    public void exportAsynchronouslyWithCompletionHandler(com.tencent.tav.core.AssetExportSession.ExportCallbackHandler exportCallbackHandler) {
        com.tencent.tav.core.AssetExportThread assetExportThread = new com.tencent.tav.core.AssetExportThread(this, exportCallbackHandler, this.audioMix, this.exportConfig);
        this.exportThread = assetExportThread;
        assetExportThread.setRenderContextParams(this.renderContextParams);
        this.exportThread.setMediaFactory(this.mediaFactory);
        this.exportThread.setTimeoutParameter(this.isNeedCheckFrameProcessTimeout, this.timeoutInterruptWork, this.maxTimeoutMs);
        this.exportThread.setLoggerConfig(this.loggerConfig);
        this.exportThread.startExport();
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

    public com.tencent.tav.report.ExportReportSession getReportSession() {
        com.tencent.tav.core.AssetExportThread assetExportThread = this.exportThread;
        if (assetExportThread != null) {
            return assetExportThread.getReportSession();
        }
        return null;
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

    public void setCalculateBfsTransform(boolean z17) {
        this.calculateBfsTransform = z17;
    }

    public void setEnableNewTextureBlitting(boolean z17) {
        this.isEnableNewTextureBlitting = z17;
    }

    public void setEnableOptimizedVideoFrameSampling(boolean z17) {
        this.isEnableOptimizedVideoFrameSampling = z17;
    }

    @java.lang.Deprecated
    public void setEncoderFactory(com.tencent.tav.decoder.IEncoderFactory iEncoderFactory) {
        this.mediaFactory = new com.tencent.tav.codec.DefaultMediaFactory(iEncoderFactory, null);
    }

    public void setLoggerConfig(com.tencent.tav.decoder.logger.WXLoggerConfig wXLoggerConfig) {
        this.loggerConfig = wXLoggerConfig;
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
        com.tencent.tav.core.AssetExportThread assetExportThread = this.exportThread;
        if (assetExportThread != null) {
            assetExportThread.setRenderContextParams(renderContextParams);
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
        if (videoComposition != null) {
            this.videoCompositing = videoComposition.getCustomVideoCompositor();
        }
    }

    public AssetExportSession(com.tencent.tav.asset.Asset asset, com.tencent.tav.core.ExportConfig exportConfig) {
        this(asset, exportConfig, new com.tencent.tav.core.AssetExtension(com.tencent.tav.core.AssetExtension.SCENE_EXPORT));
    }

    public AssetExportSession(com.tencent.tav.asset.Asset asset, com.tencent.tav.core.ExportConfig exportConfig, com.tencent.tav.core.AssetExtension assetExtension) {
        this.outputFileType = "mp4";
        this.revertMode = false;
        this.isEnableOptimizedVideoFrameSampling = false;
        this.isEnableNewTextureBlitting = false;
        this.isNeedCheckFrameProcessTimeout = true;
        this.timeoutInterruptWork = false;
        this.maxTimeoutMs = com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT;
        this.loggerConfig = com.tencent.tav.decoder.logger.WXLogger.INSTANCE.defaultLogger();
        this.appliesPreferredTrackTransform = false;
        this.calculateBfsTransform = false;
        this.asset = asset;
        this.assetExtension = assetExtension;
        if (exportConfig == null || !exportConfig.available()) {
            com.tencent.tav.decoder.logger.Logger.e("AssetExportSession", "AssetExportSession: encodeOption 不合法");
            exportConfig = new com.tencent.tav.core.ExportConfig((int) asset.getNaturalSize().width, (int) asset.getNaturalSize().height);
        }
        this.exportConfig = exportConfig;
    }
}
