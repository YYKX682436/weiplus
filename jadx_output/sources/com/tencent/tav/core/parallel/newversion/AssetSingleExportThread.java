package com.tencent.tav.core.parallel.newversion;

/* loaded from: classes16.dex */
public class AssetSingleExportThread extends android.os.HandlerThread implements android.os.Handler.Callback {
    private static final int msg_done_a = 2;
    private static final int msg_done_v = 1;
    private final java.lang.String TAG;
    private com.tencent.tav.core.AssetReader assetReader;
    private com.tencent.tav.core.AssetWriter assetWriter;
    private android.os.HandlerThread audioExportThread;
    private com.tencent.tav.decoder.AudioInfo audioInfo;
    private com.tencent.tav.core.AudioMix audioMix;
    private float audioProgress;
    private boolean audioReadFinish;
    private com.tencent.tav.core.AssetReaderOutput audioReader;
    private long audioTime;
    private volatile boolean audioTimeout;
    private com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.AudioFrameOperateTimeoutCallback audioTimeoutCallback;
    private com.tencent.tav.core.AssetWriterInput audioWriter;
    private volatile boolean audioWriterDone;
    private volatile boolean cancel;
    private final com.tencent.tav.core.ExportConfig encodeOption;
    private android.os.Handler exportHandler;
    private com.tencent.tav.core.AssetParallelExportSession exportSession;
    private volatile boolean hasError;
    public com.tencent.tav.core.parallel.info.PipelineIndicatorInfo indicatorInfo;
    private volatile boolean isFinishing;
    private boolean isNeedCheckFrameProcessTimeout;
    private volatile boolean isReleased;
    private long lastHandleAudioTimeStamp;
    private long lastHandleVideoTimeStamp;
    private long maxTimeoutMs;
    private com.tencent.tav.codec.IMediaFactory mediaFactory;
    private androidx.lifecycle.k0 observer;
    private com.tencent.tav.decoder.RenderContextParams renderContextParams;
    private com.tencent.tav.report.ExportReportSession reportSession;
    private boolean timeoutInterruptWork;
    private android.os.HandlerThread videoExportThread;
    private float videoProgress;
    private boolean videoReadFinish;
    private com.tencent.tav.core.AssetReaderOutput videoReader;
    private long videoTime;
    private volatile boolean videoTimeout;
    private com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.VideoFrameOperateTimeoutCallback videoTimeoutCallback;
    private com.tencent.tav.core.AssetWriterInput videoWriter;
    private volatile boolean videoWriterDone;

    /* loaded from: classes16.dex */
    public class AudioFrameOperateTimeoutCallback implements java.lang.Runnable {
        private AudioFrameOperateTimeoutCallback() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (android.os.SystemClock.uptimeMillis() - com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.lastHandleAudioTimeStamp < com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.maxTimeoutMs) {
                com.tencent.tav.decoder.logger.Logger.i(com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.TAG, "Maybe app into background audio");
                return;
            }
            com.tencent.tav.decoder.logger.Logger.i(com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.TAG, "audioTimeout");
            com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.audioTimeout = true;
            com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.indicatorInfo.setSegmentStatus(com.tencent.tav.core.AssetParallelSegmentStatus.AssetParallelStatusTimeout);
            com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.indicatorInfo.errorStatus = new com.tencent.tav.core.ExportErrorStatus(-204, null, "handle audio timeout");
            if (com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.observer != null) {
                com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.observer.onChanged(com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.indicatorInfo);
            }
        }
    }

    /* loaded from: classes16.dex */
    public class AudioRequestMediaDataCallback implements java.lang.Runnable {
        private AudioRequestMediaDataCallback() {
        }

        private void onAudioRequestMediaData() {
            while (true) {
                if (com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.audioWriterDone || com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.cancel || com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.audioWriter == null || com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.hasError) {
                    break;
                }
                com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.lastHandleAudioTimeStamp = android.os.SystemClock.uptimeMillis();
                if (com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.isNeedCheckFrameProcessTimeout) {
                    com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.exportHandler.removeCallbacks(com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.audioTimeoutCallback);
                    com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.exportHandler.postDelayed(com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.audioTimeoutCallback, com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.maxTimeoutMs);
                }
                if (com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.audioReader != null && com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.audioWriter.isReadyForMoreMediaData()) {
                    com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.audioReader.duration();
                    com.tencent.tav.coremedia.CMSampleBuffer copyNextSampleBuffer = com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.audioReader.copyNextSampleBuffer(false);
                    com.tencent.tav.coremedia.CMSampleState state = copyNextSampleBuffer.getState();
                    if (state.getStateCode() >= 0) {
                        com.tencent.tav.core.ExportErrorStatus appendSampleBuffer = com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.audioWriter.appendSampleBuffer(copyNextSampleBuffer, false);
                        if (appendSampleBuffer != null) {
                            com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.exportError(appendSampleBuffer);
                        }
                        if (copyNextSampleBuffer.getTime().getTimeUs() >= com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.indicatorInfo.timeRange.getDuration().getTimeUs()) {
                            com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.audioWriter.markAsFinished();
                            break;
                        }
                    } else if (state.getStateCode() == -1) {
                        com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.audioWriter.markAsFinished();
                        break;
                    } else if (state.getStateCode() != -4) {
                        com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.exportError(new com.tencent.tav.core.ExportErrorStatus(state));
                        break;
                    }
                }
            }
            com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.audioReadFinish = !r0.cancel;
            com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.exportHandler.removeCallbacks(com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.audioTimeoutCallback);
            com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.exportHandler.sendEmptyMessage(2);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                onAudioRequestMediaData();
            } catch (java.lang.Throwable th6) {
                com.tencent.tav.decoder.logger.Logger.e(com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.TAG, "AudioRequestMediaDateCallback run: ", th6);
                com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.exportError(-15, th6);
            }
        }
    }

    /* loaded from: classes16.dex */
    public class AudioWriterProgressListener implements com.tencent.tav.core.AssetWriterInput.WriterProgressListener {
        private AudioWriterProgressListener() {
        }

        @Override // com.tencent.tav.core.AssetWriterInput.WriterProgressListener
        public void onError(com.tencent.tav.core.ExportErrorStatus exportErrorStatus) {
            com.tencent.tav.decoder.logger.Logger.e(com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.TAG, "AudioWriterProgressListener onError: ", exportErrorStatus.throwable);
            com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.exportError(exportErrorStatus);
        }

        @Override // com.tencent.tav.core.AssetWriterInput.WriterProgressListener
        public void onProgressChanged(com.tencent.tav.core.AssetWriterInput assetWriterInput, long j17) {
            com.tencent.tav.decoder.logger.Logger.d("AssetExportSession", "onProgressChanged: audioWriter " + j17 + "  / " + com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.getDuration());
            if (j17 == -1) {
                com.tencent.tav.core.parallel.newversion.AssetSingleExportThread assetSingleExportThread = com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this;
                assetSingleExportThread.audioTime = assetSingleExportThread.indicatorInfo.timeRange.getDuration().getTimeUs();
                com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.audioProgress = 1.0f;
                com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.audioWriterDone = true;
                com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.exportHandler.sendEmptyMessage(2);
                return;
            }
            com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.audioTime = j17;
            com.tencent.tav.core.parallel.newversion.AssetSingleExportThread assetSingleExportThread2 = com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this;
            com.tencent.tav.coremedia.CMTimeRange cMTimeRange = assetSingleExportThread2.indicatorInfo.timeRange;
            long timeUs = cMTimeRange != null ? cMTimeRange.getDuration().getTimeUs() : assetSingleExportThread2.audioReader != null ? com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.audioReader.duration() : 0L;
            if (timeUs != 0) {
                com.tencent.tav.core.parallel.newversion.AssetSingleExportThread assetSingleExportThread3 = com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this;
                assetSingleExportThread3.audioProgress = (((float) assetSingleExportThread3.videoTime) * 1.0f) / ((float) timeUs);
            } else {
                com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.audioProgress = 1.0f;
            }
            com.tencent.tav.core.parallel.newversion.AssetSingleExportThread assetSingleExportThread4 = com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this;
            assetSingleExportThread4.indicatorInfo.setProgress(assetSingleExportThread4.audioProgress);
            if (com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.observer != null) {
                com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.observer.onChanged(com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.indicatorInfo);
            }
            if (com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.audioTime >= com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.indicatorInfo.timeRange.getDuration().getTimeUs()) {
                com.tencent.tav.core.parallel.newversion.AssetSingleExportThread assetSingleExportThread5 = com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this;
                assetSingleExportThread5.audioTime = assetSingleExportThread5.indicatorInfo.timeRange.getDuration().getTimeUs();
                com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.audioWriterDone = true;
                com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.exportHandler.sendEmptyMessage(2);
            }
        }
    }

    /* loaded from: classes16.dex */
    public class VideoFrameOperateTimeoutCallback implements java.lang.Runnable {
        private VideoFrameOperateTimeoutCallback() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (android.os.SystemClock.uptimeMillis() - com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.lastHandleVideoTimeStamp >= com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.maxTimeoutMs) {
                if (!com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.timeoutInterruptWork) {
                    com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.exportSession.processErrorStatus = new com.tencent.tav.core.ExportErrorStatus(-203);
                    return;
                }
                com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoTimeout = true;
                com.tencent.tav.decoder.logger.Logger.i(com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.TAG, "videoTimeout");
                com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.indicatorInfo.setSegmentStatus(com.tencent.tav.core.AssetParallelSegmentStatus.AssetParallelStatusTimeout);
                com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.indicatorInfo.errorStatus = new com.tencent.tav.core.ExportErrorStatus(-203, null, "handle video timeout");
                if (com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.observer != null) {
                    com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.observer.onChanged(com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.indicatorInfo);
                }
            }
        }
    }

    /* loaded from: classes16.dex */
    public class VideoRequestMediaDataCallback implements java.lang.Runnable {
        private long cost;
        private long frame;

        private VideoRequestMediaDataCallback() {
            this.frame = 1L;
            this.cost = 0L;
        }

        private void onRequestMediaData() {
            while (true) {
                if (com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoWriterDone || com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.cancel || com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.hasError) {
                    break;
                }
                com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.lastHandleVideoTimeStamp = android.os.SystemClock.uptimeMillis();
                if (com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.isNeedCheckFrameProcessTimeout) {
                    com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.exportHandler.removeCallbacks(com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoTimeoutCallback);
                    com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.exportHandler.postDelayed(com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoTimeoutCallback, com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.maxTimeoutMs);
                }
                java.lang.System.currentTimeMillis();
                if (com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoReader == null || !com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoWriter.isReadyForMoreMediaData()) {
                    com.tencent.tav.decoder.logger.Logger.i(com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.TAG, "leex not ReadyForMoreMediaData");
                } else {
                    long nanoTime = java.lang.System.nanoTime();
                    com.tencent.tav.coremedia.CMSampleBuffer copyNextSampleBuffer = com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoReader.copyNextSampleBuffer(false);
                    if (com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.reportSession != null) {
                        com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.reportSession.tickDecode(java.lang.System.nanoTime() - nanoTime);
                    }
                    com.tencent.tav.coremedia.CMSampleState state = copyNextSampleBuffer.getState();
                    if (state.getStateCode() < 0) {
                        com.tencent.tav.decoder.logger.Logger.i(com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.TAG, "onRequestMediaData stateCode: " + state.getStateCode());
                    }
                    if (state.getStateCode() >= 0) {
                        com.tencent.tav.core.ExportErrorStatus appendSampleBuffer = com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoWriter.appendSampleBuffer(copyNextSampleBuffer, true);
                        if (appendSampleBuffer != null) {
                            com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.exportError(appendSampleBuffer);
                        }
                        if (com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.reportSession != null) {
                            com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.reportSession.tickExport(java.lang.System.nanoTime() - nanoTime);
                        }
                    } else if (state.stateMatchingTo(-1)) {
                        com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoWriter.markAsFinished();
                        com.tencent.tav.decoder.logger.Logger.i(com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.TAG, "markAsFinished");
                        break;
                    } else if (state.getStateCode() != -4) {
                        com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.exportError(new com.tencent.tav.core.ExportErrorStatus(state));
                        break;
                    }
                }
            }
            if (com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoWriter.matrixFilter != null) {
                com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoWriter.matrixFilter.release();
            }
            if (com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.exportSession.videoCompositing != null) {
                com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.exportSession.videoCompositing.release();
            }
            com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoReadFinish = !r0.cancel;
            com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.exportHandler.removeCallbacks(com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoTimeoutCallback);
            com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.exportHandler.sendEmptyMessage(1);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                onRequestMediaData();
            } catch (java.lang.Throwable th6) {
                com.tencent.tav.decoder.logger.Logger.e(com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.TAG, "VideoRequestMediaDateCallback run: ", th6);
                com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.exportError(-14, th6);
            }
        }
    }

    /* loaded from: classes16.dex */
    public class VideoWriterProgressListener implements com.tencent.tav.core.AssetWriterInput.WriterProgressListener {
        private VideoWriterProgressListener() {
        }

        @Override // com.tencent.tav.core.AssetWriterInput.WriterProgressListener
        public void onError(com.tencent.tav.core.ExportErrorStatus exportErrorStatus) {
            com.tencent.tav.decoder.logger.Logger.e(com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.TAG, "VideoWriterProgressListener onError: ", exportErrorStatus.throwable);
            com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.exportError(exportErrorStatus);
        }

        @Override // com.tencent.tav.core.AssetWriterInput.WriterProgressListener
        public void onProgressChanged(com.tencent.tav.core.AssetWriterInput assetWriterInput, long j17) {
            com.tencent.tav.decoder.logger.Logger.d(com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.TAG, "onProgressChanged: videoWriter " + j17 + "  / " + com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.getDuration());
            if (j17 == -1) {
                com.tencent.tav.core.parallel.newversion.AssetSingleExportThread assetSingleExportThread = com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this;
                assetSingleExportThread.videoTime = assetSingleExportThread.indicatorInfo.timeRange.getDuration().getTimeUs();
                com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoProgress = 1.0f;
                com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoWriterDone = true;
                com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.exportHandler.sendEmptyMessage(1);
                return;
            }
            com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoTime = j17;
            com.tencent.tav.core.parallel.newversion.AssetSingleExportThread assetSingleExportThread2 = com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this;
            com.tencent.tav.coremedia.CMTimeRange cMTimeRange = assetSingleExportThread2.indicatorInfo.timeRange;
            long timeUs = cMTimeRange != null ? cMTimeRange.getDuration().getTimeUs() : assetSingleExportThread2.videoReader != null ? com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoReader.duration() : 0L;
            if (timeUs != 0) {
                com.tencent.tav.core.parallel.newversion.AssetSingleExportThread assetSingleExportThread3 = com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this;
                assetSingleExportThread3.videoProgress = (((float) assetSingleExportThread3.videoTime) * 1.0f) / ((float) timeUs);
            } else {
                com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoProgress = 1.0f;
            }
            com.tencent.tav.core.parallel.newversion.AssetSingleExportThread assetSingleExportThread4 = com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this;
            assetSingleExportThread4.indicatorInfo.setProgress(assetSingleExportThread4.videoProgress);
            if (com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.observer != null) {
                com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.observer.onChanged(com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.indicatorInfo);
            }
        }
    }

    public AssetSingleExportThread(com.tencent.tav.core.parallel.info.PipelineIndicatorInfo pipelineIndicatorInfo, com.tencent.tav.core.AssetParallelExportSession assetParallelExportSession, com.tencent.tav.core.AudioMix audioMix, com.tencent.tav.core.ExportConfig exportConfig) {
        super("ExportThread");
        this.TAG = "AssetExportThread-" + hashCode();
        this.videoWriterDone = false;
        this.audioWriterDone = false;
        this.videoReadFinish = false;
        this.audioReadFinish = false;
        this.videoTime = 0L;
        this.audioTime = 0L;
        this.cancel = false;
        this.hasError = false;
        this.videoTimeout = false;
        this.audioTimeout = false;
        this.isReleased = false;
        this.reportSession = new com.tencent.tav.report.ExportReportSession();
        this.videoTimeoutCallback = new com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.VideoFrameOperateTimeoutCallback();
        this.audioTimeoutCallback = new com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.AudioFrameOperateTimeoutCallback();
        this.lastHandleVideoTimeStamp = android.os.SystemClock.uptimeMillis();
        this.lastHandleAudioTimeStamp = android.os.SystemClock.uptimeMillis();
        this.isNeedCheckFrameProcessTimeout = true;
        this.timeoutInterruptWork = false;
        this.maxTimeoutMs = com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT;
        this.indicatorInfo = pipelineIndicatorInfo;
        this.audioMix = audioMix;
        this.exportSession = assetParallelExportSession;
        this.audioInfo = new com.tencent.tav.decoder.AudioInfo(exportConfig.getAudioSampleRateHz(), exportConfig.getAudioChannelCount(), 2);
        this.encodeOption = exportConfig;
    }

    private com.tencent.tav.core.AssetReaderOutput createAudioTrackOutput() {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.exportSession.asset.tracksWithMediaType(2);
        if (arrayList == null || arrayList.size() <= 0) {
            return new com.tencent.tav.core.EmptyReaderOutput();
        }
        com.tencent.tav.core.AssetReaderAudioMixOutput assetReaderAudioMixOutput = new com.tencent.tav.core.AssetReaderAudioMixOutput(arrayList, null, this.mediaFactory);
        assetReaderAudioMixOutput.setAudioMix(this.audioMix);
        assetReaderAudioMixOutput.setAudioInfo(this.audioInfo);
        return assetReaderAudioMixOutput;
    }

    private com.tencent.tav.core.AssetWriterInput createAudioWriterInput() {
        return new com.tencent.tav.core.AssetWriterInput(2, this.exportSession.isEnableNewTextureBlitting());
    }

    private com.tencent.tav.core.AssetReaderOutput createVideoTrackOutput() {
        java.util.List<com.tencent.tav.asset.AssetTrack> tracksWithMediaType = this.exportSession.asset.tracksWithMediaType(1);
        if (tracksWithMediaType == null || tracksWithMediaType.size() <= 0) {
            return new com.tencent.tav.core.EmptyReaderOutput();
        }
        java.util.HashMap hashMap = new java.util.HashMap(4);
        hashMap.put("frame-rate", java.lang.Integer.valueOf(this.encodeOption.getVideoFrameRate()));
        com.tencent.tav.core.AssetReaderVideoCompositionOutput assetReaderVideoCompositionOutput = new com.tencent.tav.core.AssetReaderVideoCompositionOutput(tracksWithMediaType, hashMap, this.exportSession.assetExtension, this.mediaFactory);
        assetReaderVideoCompositionOutput.setVideoComposition(this.exportSession.videoComposition);
        assetReaderVideoCompositionOutput.setVideoCompositing(this.exportSession.newVideoCompositing());
        assetReaderVideoCompositionOutput.setVideoRevertMode(this.exportSession.isRevertMode());
        assetReaderVideoCompositionOutput.setEnableOptimizedVideoFrameSampling(this.exportSession.isEnableOptimizedVideoFrameSampling());
        return assetReaderVideoCompositionOutput;
    }

    private com.tencent.tav.core.AssetWriterInput createVideoWriterInput() {
        com.tencent.tav.report.ExportReportSession exportReportSession = this.reportSession;
        if (exportReportSession != null) {
            exportReportSession.setFramePerSecond(this.encodeOption.getVideoFrameRate());
        }
        return new com.tencent.tav.core.AssetWriterInput(1, this.exportSession.isEnableNewTextureBlitting());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void exportError(int i17, java.lang.Throwable th6) {
        exportError(new com.tencent.tav.core.ExportErrorStatus(i17, th6));
    }

    private synchronized void exportSuccess() {
        synchronized (this) {
            com.tencent.tav.core.AssetParallelSegmentStatus segmentStatus = this.indicatorInfo.getSegmentStatus();
            com.tencent.tav.core.AssetParallelSegmentStatus assetParallelSegmentStatus = com.tencent.tav.core.AssetParallelSegmentStatus.AssetExportStatusCompleted;
            if (segmentStatus == assetParallelSegmentStatus) {
                return;
            }
            this.indicatorInfo.setProgress(1.0f);
            this.indicatorInfo.setSegmentStatus(assetParallelSegmentStatus);
            com.tencent.tav.report.ExportReportSession exportReportSession = this.reportSession;
            if (exportReportSession != null) {
                exportReportSession.onExportSuccess();
            }
            androidx.lifecycle.k0 k0Var = this.observer;
            if (k0Var != null) {
                k0Var.onChanged(this.indicatorInfo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void exporting() {
        initReaderAndWriter();
        this.indicatorInfo.setSegmentStatus(com.tencent.tav.core.AssetParallelSegmentStatus.AssetParallelStatusStarted);
        if (this.videoWriter != null) {
            this.videoExportThread = new android.os.HandlerThread("VideoWriter");
            this.videoWriter.setWriterProgressListener(new com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.VideoWriterProgressListener());
            this.videoWriter.requestMediaDataWhenReadyOnQueue(this.videoExportThread, new com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.VideoRequestMediaDataCallback());
        } else {
            this.videoReadFinish = true;
            this.videoWriterDone = true;
        }
        if (this.audioWriter != null) {
            this.audioExportThread = new android.os.HandlerThread("AudioWriter");
            this.audioWriter.setWriterProgressListener(new com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.AudioWriterProgressListener());
            this.audioWriter.requestMediaDataWhenReadyOnQueue(this.audioExportThread, new com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.AudioRequestMediaDataCallback());
        } else {
            this.audioReadFinish = true;
            this.audioWriterDone = true;
        }
        com.tencent.tav.decoder.logger.Logger.i(this.TAG, "[%d]exporting", java.lang.Integer.valueOf(hashCode()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getDuration() {
        com.tencent.tav.coremedia.CMTimeRange cMTimeRange;
        com.tencent.tav.core.parallel.info.PipelineIndicatorInfo pipelineIndicatorInfo = this.indicatorInfo;
        if (pipelineIndicatorInfo != null && (cMTimeRange = pipelineIndicatorInfo.timeRange) != null) {
            return cMTimeRange.getDuration().getTimeUs() * 2;
        }
        com.tencent.tav.core.AssetReaderOutput assetReaderOutput = this.audioReader;
        long duration = assetReaderOutput != null ? assetReaderOutput.duration() : 0L;
        com.tencent.tav.core.AssetReaderOutput assetReaderOutput2 = this.videoReader;
        return duration + (assetReaderOutput2 != null ? assetReaderOutput2.duration() : 0L);
    }

    private void initReaderAndWriter() {
        com.tencent.tav.core.AssetReader assetReader = new com.tencent.tav.core.AssetReader(this.exportSession.asset);
        this.assetReader = assetReader;
        assetReader.setTimeRange(this.indicatorInfo.timeRange);
        com.tencent.tav.core.AssetParallelExportSession assetParallelExportSession = this.exportSession;
        com.tencent.tav.core.AssetWriter assetWriter = new com.tencent.tav.core.AssetWriter(assetParallelExportSession.outputFilePath, assetParallelExportSession.outputFileType);
        this.assetWriter = assetWriter;
        assetWriter.setRenderContextParams(this.renderContextParams);
        com.tencent.tav.coremedia.CMTimeRange cMTimeRange = this.indicatorInfo.timeRange;
        if (cMTimeRange != null) {
            this.assetWriter.startSessionAtSourceTime(cMTimeRange.getStart());
            this.assetWriter.endSessionAtSourceTime(this.indicatorInfo.timeRange.getEnd());
            com.tencent.tav.report.ExportReportSession exportReportSession = this.reportSession;
            if (exportReportSession != null) {
                exportReportSession.setFileDurationUs(this.indicatorInfo.timeRange.getDurationUs());
            }
        }
        this.assetWriter.setEncodeOption(this.encodeOption);
        int i17 = this.indicatorInfo.type;
        if (i17 == 1) {
            com.tencent.tav.core.AssetReaderOutput createVideoTrackOutput = createVideoTrackOutput();
            this.videoReader = createVideoTrackOutput;
            if (this.assetReader.canAddOutput(createVideoTrackOutput)) {
                this.assetReader.addOutput(this.videoReader);
            }
            com.tencent.tav.core.AssetWriterInput createVideoWriterInput = createVideoWriterInput();
            this.videoWriter = createVideoWriterInput;
            com.tencent.tav.core.composition.VideoComposition videoComposition = this.exportSession.videoComposition;
            if (videoComposition != null) {
                createVideoWriterInput.setEnableLut(videoComposition.getLutBitmap());
            }
            if (this.assetWriter.canAddInput(this.videoWriter)) {
                this.videoWriter.setTransform(this.exportSession.appliesPreferredTrackTransform ? com.tencent.tav.decoder.DecoderUtils.getPreferMatrix(new com.tencent.tav.coremedia.CGSize(this.encodeOption.getOutputWidth(), this.encodeOption.getOutputHeight()), this.exportSession.asset.getNaturalSize(), this.exportSession.asset.getPreferRotation()) : null);
                this.assetWriter.addInput(this.videoWriter);
            }
        } else if (i17 == 2) {
            com.tencent.tav.core.AssetReaderOutput createAudioTrackOutput = createAudioTrackOutput();
            this.audioReader = createAudioTrackOutput;
            if (!(createAudioTrackOutput instanceof com.tencent.tav.core.EmptyReaderOutput) && this.assetReader.canAddOutput(createAudioTrackOutput)) {
                this.assetReader.addOutput(this.audioReader);
            }
            if (!(this.audioReader instanceof com.tencent.tav.core.EmptyReaderOutput)) {
                this.audioWriter = createAudioWriterInput();
            }
            com.tencent.tav.core.AssetWriterInput assetWriterInput = this.audioWriter;
            if (assetWriterInput != null && this.assetWriter.canAddInput(assetWriterInput)) {
                this.assetWriter.addInput(this.audioWriter);
            }
        }
        this.assetWriter.startWriting(this.mediaFactory);
        this.assetWriter.prepareParallelSegmentInfo(this.indicatorInfo);
        this.assetWriter.prepareParallelSegmentInfo(this.indicatorInfo);
        this.assetReader.startReading(this.assetWriter);
    }

    private void releaseAudio(final java.lang.Runnable runnable) {
        if (this.audioExportThread == null) {
            com.tencent.tav.decoder.logger.Logger.w(this.TAG, "releaseAudio is null");
        } else {
            com.tencent.tav.decoder.logger.Logger.i(this.TAG, "releaseAudio");
            new android.os.Handler(this.audioExportThread.getLooper()).post(new java.lang.Runnable() { // from class: com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.2
                @Override // java.lang.Runnable
                public void run() {
                    if (com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.assetReader != null) {
                        com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.assetReader.cancelReading();
                        com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.assetReader = null;
                    }
                    if (com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.reportSession != null) {
                        long j17 = 0;
                        com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.reportSession.setTotalRealDecodeUs((com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoReader == null || com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoReader.getDecodePerformance() == null) ? 0L : com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoReader.getDecodePerformance().getTotal() * 1000);
                        com.tencent.tav.report.ExportReportSession exportReportSession = com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.reportSession;
                        if (com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.assetWriter != null && com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.assetWriter.getEncodePerformance() != null) {
                            j17 = com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.assetWriter.getEncodePerformance().getTotal() * 1000;
                        }
                        exportReportSession.setTotalEncodeUs(j17);
                    }
                    if (com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.assetWriter != null) {
                        try {
                            com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.assetWriter.finishWriting();
                        } catch (java.lang.Exception e17) {
                            com.tencent.tav.decoder.logger.Logger.e("AssetExportSession", "code = -10 run: finishWriting error", e17);
                            com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.exportError(-10, e17);
                        }
                    }
                    if (com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.audioWriter != null) {
                        com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.audioWriter.close();
                    }
                    java.lang.Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    if (com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.audioExportThread != null) {
                        com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.audioExportThread.quitSafely();
                        com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.audioExportThread = null;
                    }
                }
            });
        }
    }

    private void releaseVideo(final java.lang.Runnable runnable) {
        if (this.videoExportThread == null) {
            com.tencent.tav.decoder.logger.Logger.w(this.TAG, "videoExportThread is null");
        } else {
            com.tencent.tav.decoder.logger.Logger.i(this.TAG, "releaseVideo");
            new android.os.Handler(this.videoExportThread.getLooper()).post(new java.lang.Runnable() { // from class: com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.1
                @Override // java.lang.Runnable
                public void run() {
                    if (com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.assetReader != null) {
                        com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.assetReader.cancelReading();
                        com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.assetReader = null;
                    }
                    if (com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.reportSession != null) {
                        long j17 = 0;
                        com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.reportSession.setTotalRealDecodeUs((com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoReader == null || com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoReader.getDecodePerformance() == null) ? 0L : com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoReader.getDecodePerformance().getTotal() * 1000);
                        com.tencent.tav.report.ExportReportSession exportReportSession = com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.reportSession;
                        if (com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.assetWriter != null && com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.assetWriter.getEncodePerformance() != null) {
                            j17 = com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.assetWriter.getEncodePerformance().getTotal() * 1000;
                        }
                        exportReportSession.setTotalEncodeUs(j17);
                    }
                    if (com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.assetWriter != null) {
                        try {
                            com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.assetWriter.finishWriting();
                        } catch (java.lang.Exception e17) {
                            com.tencent.tav.decoder.logger.Logger.e("AssetExportSession", "code = -10 run: finishWriting error", e17);
                            com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.exportError(-10, e17);
                        }
                    }
                    if (com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoWriter != null) {
                        com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoWriter.close();
                    }
                    if ((com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoReader instanceof com.tencent.tav.core.AssetReaderVideoCompositionOutput) && ((com.tencent.tav.core.AssetReaderVideoCompositionOutput) com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoReader).getVideoCompositing() != null) {
                        ((com.tencent.tav.core.AssetReaderVideoCompositionOutput) com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoReader).getVideoCompositing().release();
                    }
                    java.lang.Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    if (com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoExportThread != null) {
                        com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoExportThread.quitSafely();
                        com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.videoExportThread = null;
                    }
                }
            });
        }
    }

    public synchronized void cancel() {
        this.cancel = true;
        com.tencent.tav.report.ExportReportSession exportReportSession = this.reportSession;
        if (exportReportSession != null) {
            exportReportSession.reset();
            this.reportSession = null;
        }
        android.os.Handler handler = this.exportHandler;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.3
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.release(null);
                }
            });
        }
    }

    public void clearResource() {
        if (getMuxer() != null) {
            getMuxer().clearResource();
        }
    }

    public com.tencent.tav.decoder.muxer.IMediaMuxer getMuxer() {
        com.tencent.tav.core.AssetWriter assetWriter = this.assetWriter;
        if (assetWriter == null || assetWriter.encoderWriter() == null) {
            return null;
        }
        return this.assetWriter.encoderWriter().getMuxer();
    }

    public com.tencent.tav.report.ExportReportSession getReportSession() {
        return this.reportSession;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int i17 = message.what;
        if (i17 == 1 || i17 == 2) {
            com.tencent.tav.decoder.logger.Logger.i(this.TAG, "handleMessage:%d", java.lang.Integer.valueOf(i17));
            if (!this.isFinishing) {
                if (this.cancel) {
                    com.tencent.tav.decoder.logger.Logger.i(this.TAG, "setSegmentStatus AssetParallelStatusCancelled");
                    this.isFinishing = true;
                    this.indicatorInfo.setSegmentStatus(com.tencent.tav.core.AssetParallelSegmentStatus.AssetParallelStatusCancelled);
                    androidx.lifecycle.k0 k0Var = this.observer;
                    if (k0Var != null) {
                        k0Var.onChanged(this.indicatorInfo);
                    }
                    return true;
                }
                if (this.videoWriterDone && this.audioWriterDone && this.audioReadFinish && this.videoReadFinish) {
                    com.tencent.tav.decoder.logger.Logger.i(this.TAG, "setSegmentStatus AssetExportStatusCompleted");
                    this.isFinishing = true;
                    this.indicatorInfo.setSegmentStatus(com.tencent.tav.core.AssetParallelSegmentStatus.AssetExportStatusCompleted);
                    androidx.lifecycle.k0 k0Var2 = this.observer;
                    if (k0Var2 != null) {
                        k0Var2.onChanged(this.indicatorInfo);
                    }
                }
            }
        }
        return true;
    }

    public void observe(androidx.lifecycle.k0 k0Var) {
        this.observer = k0Var;
    }

    public void release(java.lang.Runnable runnable) {
        com.tencent.tav.decoder.logger.Logger.i(this.TAG, "finish");
        if (this.isReleased) {
            com.tencent.tav.decoder.logger.Logger.w(this.TAG, "already release");
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        this.isReleased = true;
        releaseVideo(runnable);
        releaseAudio(runnable);
        quitSafely();
    }

    public void setMediaFactory(com.tencent.tav.codec.IMediaFactory iMediaFactory) {
        this.mediaFactory = iMediaFactory;
    }

    public void setRenderContextParams(com.tencent.tav.decoder.RenderContextParams renderContextParams) {
        this.renderContextParams = renderContextParams;
        com.tencent.tav.core.AssetWriter assetWriter = this.assetWriter;
        if (assetWriter != null) {
            assetWriter.setRenderContextParams(renderContextParams);
        }
    }

    public void setTimeoutParameter(boolean z17, boolean z18, long j17) {
        this.isNeedCheckFrameProcessTimeout = z17;
        this.timeoutInterruptWork = z18;
        this.maxTimeoutMs = j17;
        com.tencent.tav.decoder.logger.Logger.i(this.TAG, "setNeedCheckFrameProcessTimeout:%b timeoutInterruptWork:%b, maxTimeoutMs: %d", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Long.valueOf(this.maxTimeoutMs));
    }

    public void startExport() {
        start();
        this.cancel = false;
        com.tencent.tav.report.ExportReportSession exportReportSession = this.reportSession;
        if (exportReportSession != null) {
            exportReportSession.onExportStart(java.lang.System.nanoTime());
        }
        android.os.Handler handler = new android.os.Handler(getLooper(), this);
        this.exportHandler = handler;
        handler.post(new java.lang.Runnable() { // from class: com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.4
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.tav.core.parallel.newversion.AssetSingleExportThread.this.exporting();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void exportError(com.tencent.tav.core.ExportErrorStatus exportErrorStatus) {
        com.tencent.tav.decoder.logger.Logger.i(this.TAG, "exportError:%s", exportErrorStatus.toString());
        com.tencent.tav.core.AssetParallelSegmentStatus segmentStatus = this.indicatorInfo.getSegmentStatus();
        com.tencent.tav.core.AssetParallelSegmentStatus assetParallelSegmentStatus = com.tencent.tav.core.AssetParallelSegmentStatus.AssetParallelStatusFailed;
        if (segmentStatus != assetParallelSegmentStatus) {
            this.hasError = true;
            this.indicatorInfo.setSegmentStatus(assetParallelSegmentStatus);
            this.indicatorInfo.errorStatus = exportErrorStatus;
            com.tencent.tav.report.ExportReportSession exportReportSession = this.reportSession;
            if (exportReportSession != null) {
                exportReportSession.onExportError();
            }
            androidx.lifecycle.k0 k0Var = this.observer;
            if (k0Var != null) {
                k0Var.onChanged(this.indicatorInfo);
            }
        }
    }
}
