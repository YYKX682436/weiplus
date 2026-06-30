package com.tencent.tav.core;

/* loaded from: classes16.dex */
public class AssetWriter implements com.tencent.tav.core.AssetWriterInput.StatusListener, com.tencent.tav.core.IAssetWriter {
    public static final int MAX_BIT_RATE = 8000000;
    private static final java.lang.String TAG = "AssetWriter";
    private java.util.List<java.lang.Integer> availableMediaTypes;
    private java.lang.String directoryForTemporaryFiles;
    private com.tencent.tav.core.ExportConfig encodeOption;
    private com.tencent.tav.decoder.EncoderWriter encoderWriter;
    private int errCode;
    private java.util.List<com.tencent.tav.asset.MetadataItem> metadata;
    private java.lang.String outputFileType;
    private android.view.Surface rendSurface;
    private com.tencent.tav.decoder.RenderContext renderContext;
    private com.tencent.tav.decoder.RenderContextParams renderContextParams;
    private boolean shouldOptimizeForNetworkUse;
    private com.tencent.tav.core.AssetWriterStatus status;
    private java.lang.String videoOutputPath;
    private java.util.List<com.tencent.tav.core.AssetWriterInput> inputs = new java.util.ArrayList();
    private java.util.HashMap<com.tencent.tav.core.AssetWriterInput, com.tencent.tav.core.AssetWriterStatus> inputStatusHashMap = new java.util.HashMap<>();
    private com.tencent.tav.coremedia.CMTime startTime = new com.tencent.tav.coremedia.CMTime(0L);
    private com.tencent.tav.coremedia.CMTime endTime = new com.tencent.tav.coremedia.CMTime(com.tencent.wcdb.core.Database.DictDefaultMatchValue);
    public com.tencent.tav.decoder.logger.WXLoggerConfig loggerConfig = com.tencent.tav.decoder.logger.WXLoggerFactory.INSTANCE.defaultConfig();

    public AssetWriter(java.lang.String str, java.lang.String str2) {
        this.videoOutputPath = str;
        this.outputFileType = str2;
    }

    private void updateAssetStatus() {
        java.util.Iterator<com.tencent.tav.core.AssetWriterInput> it = this.inputs.iterator();
        boolean z17 = true;
        while (true) {
            boolean z18 = false;
            if (!it.hasNext()) {
                break;
            }
            if (this.inputStatusHashMap.get(it.next()) == com.tencent.tav.core.AssetWriterStatus.AssetWriterStatusCompleted) {
                z18 = true;
            }
            z17 &= z18;
        }
        if (z17) {
            this.status = com.tencent.tav.core.AssetWriterStatus.AssetWriterStatusCancelled;
            return;
        }
        boolean z19 = true;
        for (com.tencent.tav.core.AssetWriterInput assetWriterInput : this.inputs) {
            z19 &= this.inputStatusHashMap.get(assetWriterInput) == com.tencent.tav.core.AssetWriterStatus.AssetWriterStatusWriting || this.inputStatusHashMap.get(assetWriterInput) == com.tencent.tav.core.AssetWriterStatus.AssetWriterStatusCompleted;
        }
        if (z19) {
            this.status = com.tencent.tav.core.AssetWriterStatus.AssetWriterStatusWriting;
            return;
        }
        java.util.Iterator<com.tencent.tav.core.AssetWriterInput> it6 = this.inputs.iterator();
        while (it6.hasNext()) {
            com.tencent.tav.core.AssetWriterStatus assetWriterStatus = this.inputStatusHashMap.get(it6.next());
            com.tencent.tav.core.AssetWriterStatus assetWriterStatus2 = com.tencent.tav.core.AssetWriterStatus.AssetWriterStatusFailed;
            if (assetWriterStatus == assetWriterStatus2) {
                this.status = assetWriterStatus2;
                return;
            }
        }
        java.util.Iterator<com.tencent.tav.core.AssetWriterInput> it7 = this.inputs.iterator();
        while (it7.hasNext()) {
            com.tencent.tav.core.AssetWriterStatus assetWriterStatus3 = this.inputStatusHashMap.get(it7.next());
            com.tencent.tav.core.AssetWriterStatus assetWriterStatus4 = com.tencent.tav.core.AssetWriterStatus.AssetWriterStatusCancelled;
            if (assetWriterStatus3 == assetWriterStatus4) {
                this.status = assetWriterStatus4;
                return;
            }
        }
    }

    public void addInput(com.tencent.tav.core.AssetWriterInput assetWriterInput) {
        if (canAddInput(assetWriterInput)) {
            this.inputs.add(assetWriterInput);
            assetWriterInput.addStatusListener(this);
        }
    }

    public boolean canAddInput(com.tencent.tav.core.AssetWriterInput assetWriterInput) {
        java.util.Iterator<com.tencent.tav.core.AssetWriterInput> it = this.inputs.iterator();
        while (it.hasNext()) {
            if (it.next().getMediaType() == assetWriterInput.getMediaType()) {
                return false;
            }
        }
        return true;
    }

    public boolean canApplyOutputSettings(java.util.HashMap<java.lang.String, java.lang.Object> hashMap, int i17) {
        if (i17 == 1) {
            return com.tencent.tav.decoder.CodecHelper.checkVideoOutSupported(hashMap.containsKey("width") ? ((java.lang.Integer) hashMap.get("width")).intValue() : -1, hashMap.containsKey("height") ? ((java.lang.Integer) hashMap.get("height")).intValue() : -1, hashMap.containsKey("frame-rate") ? ((java.lang.Integer) hashMap.get("frame-rate")).intValue() : 30, hashMap.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE) ? ((java.lang.Integer) hashMap.get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE)).intValue() : 8000000, hashMap.containsKey("mime") ? (java.lang.String) hashMap.get("mime") : "video/avc");
        }
        if (i17 != 2) {
            return false;
        }
        java.lang.String str = hashMap.containsKey("mime") ? (java.lang.String) hashMap.get("mime") : "audio/mp4a-latm";
        if (hashMap.containsKey("aac-profile")) {
            ((java.lang.Integer) hashMap.get("aac-profile")).intValue();
        }
        return com.tencent.tav.decoder.CodecHelper.checkAudioOutSupported(hashMap.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE) ? ((java.lang.Integer) hashMap.get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE)).intValue() : 8000000, hashMap.containsKey("channel-count") ? ((java.lang.Integer) hashMap.get("channel-count")).intValue() : 1, hashMap.containsKey("sample-rate") ? ((java.lang.Integer) hashMap.get("sample-rate")).intValue() : 44100, str);
    }

    public void cancelWriting() {
        com.tencent.tav.decoder.EncoderWriter encoderWriter = this.encoderWriter;
        if (encoderWriter != null) {
            encoderWriter.stop();
            this.encoderWriter = null;
        }
        java.util.Iterator<com.tencent.tav.core.AssetWriterInput> it = this.inputs.iterator();
        while (it.hasNext()) {
            this.inputStatusHashMap.put(it.next(), com.tencent.tav.core.AssetWriterStatus.AssetWriterStatusCancelled);
        }
        this.status = com.tencent.tav.core.AssetWriterStatus.AssetWriterStatusCancelled;
    }

    public android.view.Surface createInputSurface() {
        com.tencent.tav.decoder.EncoderWriter encoderWriter = this.encoderWriter;
        if (encoderWriter != null) {
            return encoderWriter.createInputSurface();
        }
        return null;
    }

    @Override // com.tencent.tav.core.IAssetWriter
    public com.tencent.tav.decoder.EncoderWriter encoderWriter() {
        return this.encoderWriter;
    }

    public void endSessionAtSourceTime(com.tencent.tav.coremedia.CMTime cMTime) {
        this.endTime = cMTime;
    }

    public boolean finishWriting() {
        com.tencent.tav.decoder.EncoderWriter encoderWriter = this.encoderWriter;
        boolean stop = encoderWriter != null ? encoderWriter.stop() : false;
        this.status = com.tencent.tav.core.AssetWriterStatus.AssetWriterStatusCompleted;
        com.tencent.tav.decoder.RenderContext renderContext = this.renderContext;
        if (renderContext != null) {
            renderContext.release();
            this.renderContext = null;
        }
        android.view.Surface surface = this.rendSurface;
        if (surface != null) {
            surface.release();
            this.rendSurface = null;
        }
        return stop;
    }

    public java.util.List<java.lang.Integer> getAvailableMediaTypes() {
        return this.availableMediaTypes;
    }

    public java.lang.String getDirectoryForTemporaryFiles() {
        return this.directoryForTemporaryFiles;
    }

    public com.tencent.tav.report.AverageTimeReporter getEncodePerformance() {
        com.tencent.tav.decoder.EncoderWriter encoderWriter = this.encoderWriter;
        if (encoderWriter != null) {
            return encoderWriter.getPerformance();
        }
        return null;
    }

    public int getErrCode() {
        return this.errCode;
    }

    public java.util.List<com.tencent.tav.core.AssetWriterInput> getInputs() {
        return this.inputs;
    }

    public java.util.List<com.tencent.tav.asset.MetadataItem> getMetadata() {
        return this.metadata;
    }

    public java.lang.String getOutputFileType() {
        return this.outputFileType;
    }

    public com.tencent.tav.decoder.RenderContextParams getRenderContextParams() {
        return this.renderContextParams;
    }

    public com.tencent.tav.core.AssetWriterStatus getStatus() {
        return this.status;
    }

    public java.lang.String getVideoOutputPath() {
        return this.videoOutputPath;
    }

    public boolean isShouldOptimizeForNetworkUse() {
        return this.shouldOptimizeForNetworkUse;
    }

    public boolean prepareParallelSegmentInfo(com.tencent.tav.core.parallel.info.PipelineIndicatorInfo pipelineIndicatorInfo) {
        com.tencent.tav.decoder.EncoderWriter encoderWriter = this.encoderWriter;
        if (encoderWriter == null || pipelineIndicatorInfo == null) {
            return false;
        }
        int index = pipelineIndicatorInfo.getIndex();
        com.tencent.tav.coremedia.CMTimeRange cMTimeRange = pipelineIndicatorInfo.timeRange;
        encoderWriter.prepareParallelSegmentInfo(index, cMTimeRange, cMTimeRange);
        return true;
    }

    @Override // com.tencent.tav.core.IContextCreate
    public com.tencent.tav.decoder.RenderContext renderContext() {
        com.tencent.tav.decoder.EncoderWriter encoderWriter;
        if (this.renderContext == null && (encoderWriter = this.encoderWriter) != null) {
            this.rendSurface = encoderWriter.createInputSurface();
            com.tencent.tav.decoder.RenderContext renderContext = new com.tencent.tav.decoder.RenderContext(this.encoderWriter.getOutWidth(), this.encoderWriter.getOutHeight(), this.rendSurface);
            this.renderContext = renderContext;
            renderContext.setParams(this.renderContextParams);
        }
        return this.renderContext;
    }

    public void reset() {
        try {
            this.encoderWriter.reset();
            this.renderContext = null;
        } catch (java.io.IOException unused) {
        }
    }

    public void setDirectoryForTemporaryFiles(java.lang.String str) {
        this.directoryForTemporaryFiles = str;
    }

    public void setEncodeOption(com.tencent.tav.core.ExportConfig exportConfig) {
        this.encodeOption = exportConfig;
    }

    public void setMetadata(java.util.List<com.tencent.tav.asset.MetadataItem> list) {
        this.metadata = list;
    }

    public void setRenderContextParams(com.tencent.tav.decoder.RenderContextParams renderContextParams) {
        this.renderContextParams = renderContextParams;
        com.tencent.tav.decoder.RenderContext renderContext = this.renderContext;
        if (renderContext != null) {
            renderContext.setParams(renderContextParams);
        }
    }

    public void setShouldOptimizeForNetworkUse(boolean z17) {
        this.shouldOptimizeForNetworkUse = z17;
    }

    public void startSessionAtSourceTime(com.tencent.tav.coremedia.CMTime cMTime) {
        this.startTime = cMTime;
    }

    public boolean startWriting(com.tencent.tav.decoder.IEncoderFactory iEncoderFactory) {
        if (this.videoOutputPath == null) {
            return false;
        }
        cancelWriting();
        try {
            com.tencent.tav.decoder.EncoderWriter encoderWriter = new com.tencent.tav.decoder.EncoderWriter(this.videoOutputPath, iEncoderFactory);
            this.encoderWriter = encoderWriter;
            encoderWriter.setLoggerConfig(this.loggerConfig);
            this.encoderWriter.setEncodeOption(this.encodeOption);
            java.util.Iterator<com.tencent.tav.core.AssetWriterInput> it = this.inputs.iterator();
            while (it.hasNext()) {
                it.next().initConfig(this);
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(TAG, "startWriting", e17);
            this.inputStatusHashMap.clear();
            com.tencent.tav.decoder.EncoderWriter encoderWriter2 = this.encoderWriter;
            if (encoderWriter2 != null) {
                encoderWriter2.stop();
                this.encoderWriter = null;
            }
            return false;
        }
    }

    @Override // com.tencent.tav.core.AssetWriterInput.StatusListener
    public void statusChanged(com.tencent.tav.core.AssetWriterInput assetWriterInput, com.tencent.tav.core.AssetWriterStatus assetWriterStatus) {
        this.inputStatusHashMap.put(assetWriterInput, assetWriterStatus);
        com.tencent.tav.core.AssetWriterStatus assetWriterStatus2 = this.status;
        updateAssetStatus();
        com.tencent.tav.core.AssetWriterStatus assetWriterStatus3 = this.status;
        if (assetWriterStatus2 == assetWriterStatus3 || assetWriterStatus3 != com.tencent.tav.core.AssetWriterStatus.AssetWriterStatusWriting) {
            return;
        }
        for (com.tencent.tav.core.AssetWriterInput assetWriterInput2 : this.inputs) {
        }
    }

    public boolean finishWriting(boolean z17) {
        com.tencent.tav.decoder.EncoderWriter encoderWriter = this.encoderWriter;
        boolean stop = encoderWriter != null ? encoderWriter.stop(z17) : false;
        this.status = com.tencent.tav.core.AssetWriterStatus.AssetWriterStatusCompleted;
        com.tencent.tav.decoder.RenderContext renderContext = this.renderContext;
        if (renderContext != null) {
            renderContext.release();
            this.renderContext = null;
        }
        android.view.Surface surface = this.rendSurface;
        if (surface != null) {
            surface.release();
            this.rendSurface = null;
        }
        return stop;
    }

    public boolean startWriting() {
        java.util.Iterator<com.tencent.tav.core.AssetWriterInput> it = this.inputs.iterator();
        while (it.hasNext()) {
            it.next().initConfig(this);
        }
        return true;
    }
}
