package com.tencent.tavkit.component;

/* loaded from: classes10.dex */
public class TAVExporter {
    public static final int VIDEO_EXPORT_HEIGHT = 1280;
    public static final int VIDEO_EXPORT_WIDTH = 720;
    private final java.lang.String TAG = "GameTemplateExporter@" + java.lang.Integer.toHexString(hashCode());
    private com.tencent.tav.decoder.EncoderWriter.OutputConfig defaultOutputConfig;
    private com.tencent.tavkit.component.TAVExporter.ExportListener exportListener;
    private com.tencent.tav.core.AssetExportSession exportSession;
    private volatile boolean isCanceled;
    private volatile boolean isExporting;

    /* renamed from: com.tencent.tavkit.component.TAVExporter$2, reason: invalid class name */
    /* loaded from: classes10.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$tav$core$AssetExportSession$AssetExportSessionStatus;

        static {
            int[] iArr = new int[com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.values().length];
            $SwitchMap$com$tencent$tav$core$AssetExportSession$AssetExportSessionStatus = iArr;
            try {
                iArr[com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusExporting.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$tav$core$AssetExportSession$AssetExportSessionStatus[com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusCompleted.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$tav$core$AssetExportSession$AssetExportSessionStatus[com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusFailed.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$tav$core$AssetExportSession$AssetExportSessionStatus[com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusUnknown.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$tencent$tav$core$AssetExportSession$AssetExportSessionStatus[com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusCancelled.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes10.dex */
    public interface ExportListener {
        void onExportCancel();

        void onExportCompleted(java.lang.String str);

        void onExportError(int i17, java.lang.Throwable th6);

        void onExportStart();

        void onExporting(float f17);
    }

    public TAVExporter() {
        com.tencent.tav.decoder.EncoderWriter.OutputConfig outputConfig = new com.tencent.tav.decoder.EncoderWriter.OutputConfig();
        this.defaultOutputConfig = outputConfig;
        outputConfig.VIDEO_TARGET_WIDTH = VIDEO_EXPORT_WIDTH;
        outputConfig.VIDEO_TARGET_HEIGHT = 1280;
        outputConfig.VIDEO_FRAME_RATE = 25;
    }

    private java.io.File newOutputFile(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        if (file.exists()) {
            return file;
        }
        try {
            if (file.createNewFile()) {
                return file;
            }
            throw new java.lang.RuntimeException("创建输出文件失败");
        } catch (java.io.IOException e17) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "export: ", e17);
            throw new java.lang.RuntimeException("创建输出文件失败", e17);
        }
    }

    public void cancelExport() {
        if (this.exportSession != null) {
            this.isCanceled = true;
            this.exportSession.cancelExport();
        }
        this.isExporting = false;
    }

    public void export(com.tencent.tavkit.composition.TAVComposition tAVComposition, final java.lang.String str, com.tencent.tav.decoder.EncoderWriter.OutputConfig outputConfig) {
        if (tAVComposition == null) {
            return;
        }
        com.tencent.tav.core.AssetExportSession assetExportSession = this.exportSession;
        if (assetExportSession != null) {
            assetExportSession.cancelExport();
            this.exportSession = null;
        }
        if (outputConfig == null) {
            outputConfig = this.defaultOutputConfig;
        }
        com.tencent.tavkit.composition.builder.TAVCompositionBuilder tAVCompositionBuilder = new com.tencent.tavkit.composition.builder.TAVCompositionBuilder(tAVComposition);
        tAVCompositionBuilder.setVideoTracksMerge(false);
        com.tencent.tavkit.composition.TAVSource buildSource = tAVCompositionBuilder.buildSource();
        com.tencent.tav.asset.Asset asset = buildSource.getAsset();
        com.tencent.tav.core.AssetExportSession assetExportSession2 = new com.tencent.tav.core.AssetExportSession(asset, outputConfig);
        this.exportSession = assetExportSession2;
        assetExportSession2.setTimeRange(new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, asset.getDuration()));
        this.exportSession.setAudioMix(buildSource.getAudioMix());
        com.tencent.tav.decoder.logger.Logger.i(this.TAG, "export composition duration: " + asset.getDuration());
        this.exportSession.setOutputFilePath(newOutputFile(str).getAbsolutePath());
        this.exportSession.setOutputFileType("mp4");
        this.exportSession.setVideoComposition(buildSource.getVideoComposition());
        this.exportSession.exportAsynchronouslyWithCompletionHandler(new com.tencent.tav.core.AssetExportSession.ExportCallbackHandler() { // from class: com.tencent.tavkit.component.TAVExporter.1
            @Override // com.tencent.tav.core.AssetExportSession.ExportCallbackHandler
            public void handlerCallback(com.tencent.tav.core.AssetExportSession assetExportSession3) {
                int i17 = com.tencent.tavkit.component.TAVExporter.AnonymousClass2.$SwitchMap$com$tencent$tav$core$AssetExportSession$AssetExportSessionStatus[assetExportSession3.getStatus().ordinal()];
                if (i17 == 1) {
                    if (com.tencent.tavkit.component.TAVExporter.this.exportListener != null) {
                        com.tencent.tav.decoder.logger.Logger.i(com.tencent.tavkit.component.TAVExporter.this.TAG, "export progress: " + assetExportSession3.getProgress());
                        if (!com.tencent.tavkit.component.TAVExporter.this.isExporting) {
                            com.tencent.tavkit.component.TAVExporter.this.exportListener.onExportStart();
                        }
                        com.tencent.tavkit.component.TAVExporter.this.exportListener.onExporting(assetExportSession3.getProgress());
                    }
                    com.tencent.tavkit.component.TAVExporter.this.isExporting = true;
                    return;
                }
                if (i17 == 2) {
                    com.tencent.tav.decoder.logger.Logger.i(com.tencent.tavkit.component.TAVExporter.this.TAG, "export progress finished");
                    if (com.tencent.tavkit.component.TAVExporter.this.exportListener != null) {
                        com.tencent.tavkit.component.TAVExporter.this.exportListener.onExportCompleted(str);
                    }
                    com.tencent.tavkit.component.TAVExporter.this.isExporting = false;
                    return;
                }
                if (i17 == 3 || i17 == 4) {
                    com.tencent.tav.decoder.logger.Logger.i(com.tencent.tavkit.component.TAVExporter.this.TAG, "export error");
                    if (com.tencent.tavkit.component.TAVExporter.this.exportListener != null) {
                        com.tencent.tavkit.component.TAVExporter.this.exportListener.onExportError(assetExportSession3.getErrCode(), assetExportSession3.getThrowable());
                    }
                    com.tencent.tavkit.component.TAVExporter.this.isExporting = false;
                    return;
                }
                if (i17 != 5) {
                    return;
                }
                com.tencent.tav.decoder.logger.Logger.i(com.tencent.tavkit.component.TAVExporter.this.TAG, "export cancel");
                if (com.tencent.tavkit.component.TAVExporter.this.exportListener != null && com.tencent.tavkit.component.TAVExporter.this.isCanceled) {
                    com.tencent.tavkit.component.TAVExporter.this.isCanceled = false;
                    com.tencent.tavkit.component.TAVExporter.this.exportListener.onExportCancel();
                }
                com.tencent.tavkit.component.TAVExporter.this.isExporting = false;
            }
        });
    }

    public com.tencent.tav.core.AssetExportSession getExportSession() {
        return this.exportSession;
    }

    public boolean isExporting() {
        return this.isExporting;
    }

    public void setExportListener(com.tencent.tavkit.component.TAVExporter.ExportListener exportListener) {
        this.exportListener = exportListener;
    }

    public void setOutputConfig(com.tencent.tav.decoder.EncoderWriter.OutputConfig outputConfig) {
        this.defaultOutputConfig = outputConfig;
    }

    public void export(com.tencent.tavkit.composition.TAVComposition tAVComposition, java.lang.String str) {
        export(tAVComposition, str, this.defaultOutputConfig);
    }
}
