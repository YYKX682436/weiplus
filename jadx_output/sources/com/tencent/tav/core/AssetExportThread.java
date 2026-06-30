package com.tencent.tav.core;

/* loaded from: classes16.dex */
public class AssetExportThread extends android.os.HandlerThread implements android.os.Handler.Callback {
    private static final java.lang.String TAG = "AssetExportThread";
    private static final int msg_done_a = 2;
    private static final int msg_done_v = 1;
    private long MEDIA_AUDIO_NOT_READ_TIMEOUT;
    private long MEDIA_VIDEO_NOT_READ_TIMEOUT;
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
    private com.tencent.tav.core.AssetExportThread.AudioFrameOperateTimeoutCallback audioTimeoutCallback;
    private com.tencent.tav.core.AssetWriterInput audioWriter;
    private volatile boolean audioWriterDone;
    private com.tencent.tav.core.AssetExportSession.ExportCallbackHandler callbackHandler;
    private volatile boolean cancel;
    private int count;
    private final com.tencent.tav.core.ExportConfig encodeOption;
    private android.os.Handler exportHandler;
    private com.tencent.tav.core.AssetExportSession exportSession;
    private volatile boolean isFinishing;
    private boolean isNeedCheckFrameProcessTimeout;
    private volatile long lastHandleAudioTimeStamp;
    private volatile long lastHandleVideoTimeStamp;
    private final com.tencent.tav.decoder.logger.WXLogger logger;
    private long maxTimeoutMs;
    private com.tencent.tav.codec.IMediaFactory mediaFactory;
    private com.tencent.tav.decoder.RenderContextParams renderContextParams;
    private com.tencent.tav.report.ExportReportSession reportSession;
    private final java.lang.Object timeLock;
    private boolean timeoutInterruptWork;
    private android.os.HandlerThread videoExportThread;
    private float videoProgress;
    private boolean videoReadFinish;
    private com.tencent.tav.core.AssetReaderOutput videoReader;
    private long videoTime;
    private volatile boolean videoTimeout;
    private com.tencent.tav.core.AssetExportThread.VideoFrameOperateTimeoutCallback videoTimeoutCallback;
    private com.tencent.tav.core.AssetWriterInput videoWriter;
    private volatile boolean videoWriterDone;

    /* loaded from: classes16.dex */
    public class AudioFrameOperateTimeoutCallback implements java.lang.Runnable {
        private AudioFrameOperateTimeoutCallback() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long currentTimeMillis;
            long j17;
            synchronized (com.tencent.tav.core.AssetExportThread.this.timeLock) {
                currentTimeMillis = java.lang.System.currentTimeMillis();
                j17 = com.tencent.tav.core.AssetExportThread.this.lastHandleAudioTimeStamp;
            }
            long j18 = currentTimeMillis - j17;
            com.tencent.tav.core.AssetExportThread.this.logger.i(com.tencent.tav.core.AssetExportThread.TAG, "check audio timeout , interval: " + j18 + " maxTimeoutMs: " + com.tencent.tav.core.AssetExportThread.this.maxTimeoutMs + " currentTime: " + currentTimeMillis + " lastHandleVideoTimeStamp: " + j17);
            if (j18 >= com.tencent.tav.core.AssetExportThread.this.maxTimeoutMs) {
                if (!com.tencent.tav.core.AssetExportThread.this.timeoutInterruptWork) {
                    com.tencent.tav.core.AssetExportThread.this.exportSession.processErrorStatus = new com.tencent.tav.core.ExportErrorStatus(-204);
                    return;
                }
                try {
                    java.lang.String format = new java.text.SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(java.lang.Long.valueOf(currentTimeMillis));
                    com.tencent.tav.core.AssetExportThread.this.logger.e(com.tencent.tav.core.AssetExportThread.TAG, "audioTimeout, interval: " + j18 + " maxTimeoutMs: " + com.tencent.tav.core.AssetExportThread.this.maxTimeoutMs + " currentTime: " + currentTimeMillis + "(" + format + ") lastHandleAudioTimeStamp: " + j17);
                } catch (java.lang.Exception e17) {
                    e17.getStackTrace();
                }
                com.tencent.tav.core.AssetExportThread.this.audioTimeout = true;
                com.tencent.tav.core.AssetExportThread.this.exportError(new com.tencent.tav.core.ExportErrorStatus(com.tencent.tav.coremedia.CMSampleState.fromExportError(-3L, -207, "audio handle frame timeout", null)));
                com.tencent.tav.core.AssetExportThread.this.finish();
            }
        }
    }

    /* loaded from: classes16.dex */
    public class AudioRequestMediaDataCallback implements java.lang.Runnable {
        private boolean isReady;
        private long logPrintTime;
        private java.lang.String notReadyReason;
        private long notReadyStart;

        private AudioRequestMediaDataCallback() {
            this.notReadyStart = 0L;
            this.logPrintTime = 0L;
            this.isReady = true;
            this.notReadyReason = "";
        }

        private void onAudioRequestMediaData() {
            while (true) {
                if (com.tencent.tav.core.AssetExportThread.this.audioWriterDone || com.tencent.tav.core.AssetExportThread.this.cancel || com.tencent.tav.core.AssetExportThread.this.audioWriter == null) {
                    break;
                }
                long j17 = com.tencent.tav.core.AssetExportThread.this.lastHandleAudioTimeStamp;
                synchronized (com.tencent.tav.core.AssetExportThread.this.timeLock) {
                    com.tencent.tav.core.AssetExportThread.this.lastHandleAudioTimeStamp = java.lang.System.currentTimeMillis();
                }
                long j18 = com.tencent.tav.core.AssetExportThread.this.lastHandleAudioTimeStamp;
                if (com.tencent.tav.core.AssetExportThread.this.isNeedCheckFrameProcessTimeout) {
                    com.tencent.tav.core.AssetExportThread.this.exportHandler.removeCallbacks(com.tencent.tav.core.AssetExportThread.this.audioTimeoutCallback);
                    com.tencent.tav.core.AssetExportThread.this.exportHandler.postDelayed(com.tencent.tav.core.AssetExportThread.this.audioTimeoutCallback, com.tencent.tav.core.AssetExportThread.this.maxTimeoutMs);
                    if (this.isReady) {
                        com.tencent.tav.core.AssetExportThread.this.logger.frame(com.tencent.tav.core.AssetExportThread.TAG, "post audio timeout callback, lastTime: " + j17 + " currentTime: " + j18);
                    }
                }
                if (com.tencent.tav.core.AssetExportThread.this.audioReader == null || !com.tencent.tav.core.AssetExportThread.this.audioWriter.isReadyForMoreMediaData()) {
                    java.lang.String logStatus = com.tencent.tav.core.AssetExportThread.this.audioWriter.getLogStatus();
                    if (!this.notReadyReason.equals(logStatus) || java.lang.System.currentTimeMillis() - this.logPrintTime > 1000) {
                        this.logPrintTime = java.lang.System.currentTimeMillis();
                        this.notReadyReason = logStatus;
                        com.tencent.tav.decoder.logger.WXLogger wXLogger = com.tencent.tav.core.AssetExportThread.this.logger;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("not ReadyForMoreAudioMediaData, ");
                        sb6.append(com.tencent.tav.core.AssetExportThread.this.audioWriter.getLogStatus());
                        sb6.append(" audioReader: ");
                        sb6.append(com.tencent.tav.core.AssetExportThread.this.audioWriter != null);
                        wXLogger.frame(com.tencent.tav.core.AssetExportThread.TAG, sb6.toString());
                    }
                    if (this.isReady) {
                        this.isReady = false;
                        this.notReadyStart = java.lang.System.currentTimeMillis();
                    } else if (java.lang.System.currentTimeMillis() - this.notReadyStart > com.tencent.tav.core.AssetExportThread.this.MEDIA_AUDIO_NOT_READ_TIMEOUT) {
                        com.tencent.tav.core.AssetExportThread.this.exportError(new com.tencent.tav.core.ExportErrorStatus(com.tencent.tav.coremedia.CMSampleState.fromExportError(-3L, -131, "audio ready timeout", null)));
                        com.tencent.tav.core.AssetExportThread.this.logger.e(com.tencent.tav.core.AssetExportThread.TAG, "onAudioRequestMediaData wait for ready timeout");
                        break;
                    }
                } else {
                    this.isReady = true;
                    com.tencent.tav.core.AssetExportThread.this.audioReader.duration();
                    com.tencent.tav.coremedia.CMSampleBuffer copyNextSampleBuffer = com.tencent.tav.core.AssetExportThread.this.audioReader.copyNextSampleBuffer(true);
                    com.tencent.tav.coremedia.CMSampleState state = copyNextSampleBuffer.getState();
                    long stateCode = state.getStateCode();
                    com.tencent.tav.core.AssetExportThread.this.logger.frame(com.tencent.tav.core.AssetExportThread.TAG, "onAudioRequestMediaData stateCode:" + stateCode + " lastTime: " + j17 + " currentTime: " + j18);
                    if (stateCode >= 0) {
                        com.tencent.tav.core.ExportErrorStatus appendSampleBuffer = com.tencent.tav.core.AssetExportThread.this.audioWriter.appendSampleBuffer(copyNextSampleBuffer);
                        if (appendSampleBuffer != null) {
                            com.tencent.tav.core.AssetExportThread.this.exportError(appendSampleBuffer);
                        }
                        if (copyNextSampleBuffer.getTime().getTimeUs() >= com.tencent.tav.core.AssetExportThread.this.exportSession.timeRange.getDuration().getTimeUs()) {
                            com.tencent.tav.core.AssetExportThread.this.audioWriter.markAsFinished();
                            break;
                        }
                    } else if (state.getStateCode() == -1) {
                        com.tencent.tav.core.AssetExportThread.this.audioWriter.markAsFinished();
                        break;
                    } else if (state.getStateCode() != -4) {
                        com.tencent.tav.core.AssetExportThread.this.exportError(new com.tencent.tav.core.ExportErrorStatus(state));
                        break;
                    }
                }
            }
            com.tencent.tav.core.AssetExportThread assetExportThread = com.tencent.tav.core.AssetExportThread.this;
            assetExportThread.audioReadFinish = true ^ assetExportThread.cancel;
            com.tencent.tav.core.AssetExportThread.this.exportHandler.removeCallbacks(com.tencent.tav.core.AssetExportThread.this.audioTimeoutCallback);
            com.tencent.tav.core.AssetExportThread.this.exportHandler.sendEmptyMessage(2);
            com.tencent.tav.core.AssetExportThread.this.logger.d(com.tencent.tav.core.AssetExportThread.TAG, "onAudioRequestMediaData finish");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                onAudioRequestMediaData();
            } catch (java.lang.Throwable th6) {
                com.tencent.tav.core.AssetExportThread.this.logger.e(com.tencent.tav.core.AssetExportThread.TAG, "AudioRequestMediaDateCallback run: ", th6);
                com.tencent.tav.core.AssetExportThread.this.exportError(-15, th6);
            }
        }
    }

    /* loaded from: classes16.dex */
    public class AudioWriterProgressListener implements com.tencent.tav.core.AssetWriterInput.WriterProgressListener {
        private AudioWriterProgressListener() {
        }

        @Override // com.tencent.tav.core.AssetWriterInput.WriterProgressListener
        public void onError(com.tencent.tav.core.ExportErrorStatus exportErrorStatus) {
            com.tencent.tav.core.AssetExportThread.this.logger.e(com.tencent.tav.core.AssetExportThread.TAG, "AudioWriterProgressListener onError: ", exportErrorStatus.throwable);
            com.tencent.tav.core.AssetExportThread.this.exportError(exportErrorStatus);
        }

        @Override // com.tencent.tav.core.AssetWriterInput.WriterProgressListener
        public void onProgressChanged(com.tencent.tav.core.AssetWriterInput assetWriterInput, long j17) {
            com.tencent.tav.core.AssetExportThread.this.logger.frame("AssetExportSession", "onProgressChanged: audioWriter " + j17 + "  / " + com.tencent.tav.core.AssetExportThread.this.getDuration());
            if (j17 == -1) {
                com.tencent.tav.core.AssetExportThread assetExportThread = com.tencent.tav.core.AssetExportThread.this;
                assetExportThread.audioTime = assetExportThread.exportSession.timeRange.getDuration().getTimeUs();
                com.tencent.tav.core.AssetExportThread.this.audioProgress = 1.0f;
                com.tencent.tav.core.AssetExportThread.this.audioWriterDone = true;
                com.tencent.tav.core.AssetExportThread.this.exportHandler.sendEmptyMessage(2);
                return;
            }
            com.tencent.tav.core.AssetExportThread.this.audioTime = j17;
            long timeUs = com.tencent.tav.core.AssetExportThread.this.exportSession.timeRange != null ? com.tencent.tav.core.AssetExportThread.this.exportSession.timeRange.getDuration().getTimeUs() : com.tencent.tav.core.AssetExportThread.this.audioReader != null ? com.tencent.tav.core.AssetExportThread.this.audioReader.duration() : 0L;
            if (timeUs != 0) {
                com.tencent.tav.core.AssetExportThread assetExportThread2 = com.tencent.tav.core.AssetExportThread.this;
                assetExportThread2.audioProgress = (((float) assetExportThread2.videoTime) * 1.0f) / ((float) timeUs);
            } else {
                com.tencent.tav.core.AssetExportThread.this.audioProgress = 1.0f;
            }
            com.tencent.tav.core.AssetExportThread.this.exportSession.progress = java.lang.Math.min(com.tencent.tav.core.AssetExportThread.this.videoProgress, com.tencent.tav.core.AssetExportThread.this.audioProgress);
            if (com.tencent.tav.core.AssetExportThread.this.callbackHandler != null) {
                com.tencent.tav.core.AssetExportThread.this.callbackHandler.handlerCallback(com.tencent.tav.core.AssetExportThread.this.exportSession);
            }
            if ((com.tencent.tav.core.AssetExportThread.this.audioTime <= com.tencent.tav.core.AssetExportThread.this.videoTime || !com.tencent.tav.core.AssetExportThread.this.videoWriterDone) && com.tencent.tav.core.AssetExportThread.this.audioTime < com.tencent.tav.core.AssetExportThread.this.exportSession.timeRange.getDuration().getTimeUs()) {
                return;
            }
            com.tencent.tav.core.AssetExportThread assetExportThread3 = com.tencent.tav.core.AssetExportThread.this;
            assetExportThread3.audioTime = assetExportThread3.exportSession.timeRange.getDuration().getTimeUs();
            com.tencent.tav.core.AssetExportThread.this.audioWriterDone = true;
            com.tencent.tav.core.AssetExportThread.this.exportHandler.sendEmptyMessage(2);
        }
    }

    /* loaded from: classes16.dex */
    public class VideoFrameOperateTimeoutCallback implements java.lang.Runnable {
        private VideoFrameOperateTimeoutCallback() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long currentTimeMillis;
            long j17;
            synchronized (com.tencent.tav.core.AssetExportThread.this.timeLock) {
                currentTimeMillis = java.lang.System.currentTimeMillis();
                j17 = com.tencent.tav.core.AssetExportThread.this.lastHandleVideoTimeStamp;
            }
            long j18 = currentTimeMillis - j17;
            com.tencent.tav.core.AssetExportThread.this.logger.i(com.tencent.tav.core.AssetExportThread.TAG, "check video timeout , interval: " + j18 + " maxTimeoutMs: " + com.tencent.tav.core.AssetExportThread.this.maxTimeoutMs + " currentTime: " + currentTimeMillis + " lastHandleVideoTimeStamp: " + j17);
            if (j18 >= com.tencent.tav.core.AssetExportThread.this.maxTimeoutMs) {
                if (!com.tencent.tav.core.AssetExportThread.this.timeoutInterruptWork) {
                    com.tencent.tav.core.AssetExportThread.this.exportSession.processErrorStatus = new com.tencent.tav.core.ExportErrorStatus(-203);
                    return;
                }
                com.tencent.tav.core.AssetExportThread.this.videoTimeout = true;
                try {
                    java.lang.String format = new java.text.SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(java.lang.Long.valueOf(currentTimeMillis));
                    com.tencent.tav.core.AssetExportThread.this.logger.e(com.tencent.tav.core.AssetExportThread.TAG, "videoTimeout, interval: " + j18 + " maxTimeoutMs: " + com.tencent.tav.core.AssetExportThread.this.maxTimeoutMs + " currentTime: " + currentTimeMillis + "(" + format + ") lastHandleVideoTimeStamp: " + j17);
                } catch (java.lang.Exception e17) {
                    e17.getStackTrace();
                }
                com.tencent.tav.core.AssetExportThread.this.exportError(new com.tencent.tav.core.ExportErrorStatus(com.tencent.tav.coremedia.CMSampleState.fromExportError(-3L, -206, "video handle frame timeout", null)));
                com.tencent.tav.core.AssetExportThread.this.finish();
            }
        }
    }

    /* loaded from: classes16.dex */
    public class VideoRequestMediaDataCallback implements java.lang.Runnable {
        private long cost;
        private long frame;
        private boolean isReady;
        private long logPrintTime;
        private java.lang.String notReadyReason;
        private long notReadyStart;

        private VideoRequestMediaDataCallback() {
            this.isReady = true;
            this.notReadyStart = 0L;
            this.logPrintTime = 0L;
            this.frame = 1L;
            this.cost = 0L;
            this.notReadyReason = "";
        }

        private void onRequestMediaData() {
            while (true) {
                if (com.tencent.tav.core.AssetExportThread.this.videoWriterDone || com.tencent.tav.core.AssetExportThread.this.cancel) {
                    break;
                }
                long j17 = com.tencent.tav.core.AssetExportThread.this.lastHandleVideoTimeStamp;
                synchronized (com.tencent.tav.core.AssetExportThread.this.timeLock) {
                    com.tencent.tav.core.AssetExportThread.this.lastHandleVideoTimeStamp = java.lang.System.currentTimeMillis();
                }
                long j18 = com.tencent.tav.core.AssetExportThread.this.lastHandleVideoTimeStamp;
                if (com.tencent.tav.core.AssetExportThread.this.isNeedCheckFrameProcessTimeout) {
                    com.tencent.tav.core.AssetExportThread.this.exportHandler.removeCallbacks(com.tencent.tav.core.AssetExportThread.this.videoTimeoutCallback);
                    com.tencent.tav.core.AssetExportThread.this.exportHandler.postDelayed(com.tencent.tav.core.AssetExportThread.this.videoTimeoutCallback, com.tencent.tav.core.AssetExportThread.this.maxTimeoutMs);
                    if (this.isReady) {
                        com.tencent.tav.core.AssetExportThread.this.logger.frame(com.tencent.tav.core.AssetExportThread.TAG, "post video timeout callback, lastTime: " + j17 + " currentTime: " + j18);
                    }
                }
                if (com.tencent.tav.core.AssetExportThread.this.videoReader == null || !com.tencent.tav.core.AssetExportThread.this.videoWriter.isReadyForMoreMediaData()) {
                    java.lang.String logStatus = com.tencent.tav.core.AssetExportThread.this.videoWriter.getLogStatus();
                    if (!this.notReadyReason.equals(logStatus) || java.lang.System.currentTimeMillis() - this.logPrintTime > 1000) {
                        this.logPrintTime = java.lang.System.currentTimeMillis();
                        this.notReadyReason = logStatus;
                        com.tencent.tav.decoder.logger.WXLogger wXLogger = com.tencent.tav.core.AssetExportThread.this.logger;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("not ReadyForMoreMediaData, ");
                        sb6.append(com.tencent.tav.core.AssetExportThread.this.audioWriter.getLogStatus());
                        sb6.append(" audioReader: ");
                        sb6.append(com.tencent.tav.core.AssetExportThread.this.audioWriter != null);
                        wXLogger.frame(com.tencent.tav.core.AssetExportThread.TAG, sb6.toString());
                    }
                    if (this.isReady) {
                        this.isReady = false;
                        this.notReadyStart = java.lang.System.currentTimeMillis();
                    } else if (java.lang.System.currentTimeMillis() - this.notReadyStart > com.tencent.tav.core.AssetExportThread.this.MEDIA_VIDEO_NOT_READ_TIMEOUT) {
                        com.tencent.tav.core.AssetExportThread.this.exportError(new com.tencent.tav.core.ExportErrorStatus(com.tencent.tav.coremedia.CMSampleState.fromExportError(-3L, -130, "video ready timeout", null)));
                        com.tencent.tav.core.AssetExportThread.this.logger.e(com.tencent.tav.core.AssetExportThread.TAG, "onVideoRequestMediaData wait for ready timeout");
                        break;
                    }
                } else {
                    this.isReady = true;
                    long nanoTime = java.lang.System.nanoTime();
                    com.tencent.tav.coremedia.CMSampleBuffer copyNextSampleBuffer = com.tencent.tav.core.AssetExportThread.this.videoReader.copyNextSampleBuffer(true);
                    if (com.tencent.tav.core.AssetExportThread.this.reportSession != null) {
                        com.tencent.tav.core.AssetExportThread.this.reportSession.tickDecode(java.lang.System.nanoTime() - nanoTime);
                    }
                    com.tencent.tav.coremedia.CMSampleState state = copyNextSampleBuffer.getState();
                    com.tencent.tav.core.AssetExportThread.this.logger.frame(com.tencent.tav.core.AssetExportThread.TAG, "onRequestMediaData stateCode: " + state.getStateCode() + " lastTime: " + j17 + " currentTime: " + j18);
                    if (state.getStateCode() >= 0) {
                        com.tencent.tav.core.ExportErrorStatus appendSampleBuffer = com.tencent.tav.core.AssetExportThread.this.videoWriter.appendSampleBuffer(copyNextSampleBuffer);
                        if (appendSampleBuffer != null) {
                            com.tencent.tav.core.AssetExportThread.this.exportError(appendSampleBuffer);
                        }
                        if (com.tencent.tav.core.AssetExportThread.this.reportSession != null) {
                            com.tencent.tav.core.AssetExportThread.this.reportSession.tickExport(java.lang.System.nanoTime() - nanoTime);
                        }
                    } else if (state.stateMatchingTo(-1)) {
                        com.tencent.tav.core.AssetExportThread.this.videoWriter.markAsFinished();
                        break;
                    } else if (state.getStateCode() != -4) {
                        com.tencent.tav.core.AssetExportThread.this.exportError(new com.tencent.tav.core.ExportErrorStatus(state));
                        break;
                    }
                }
            }
            if (com.tencent.tav.core.AssetExportThread.this.videoWriter.matrixFilter != null) {
                com.tencent.tav.core.AssetExportThread.this.videoWriter.matrixFilter.release();
            }
            if (com.tencent.tav.core.AssetExportThread.this.exportSession.videoCompositing != null) {
                com.tencent.tav.core.AssetExportThread.this.exportSession.videoCompositing.release();
            }
            com.tencent.tav.core.AssetExportThread.this.videoReadFinish = !r0.cancel;
            com.tencent.tav.core.AssetExportThread.this.exportHandler.removeCallbacks(com.tencent.tav.core.AssetExportThread.this.videoTimeoutCallback);
            com.tencent.tav.core.AssetExportThread.this.exportHandler.sendEmptyMessage(1);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                onRequestMediaData();
            } catch (java.lang.Throwable th6) {
                com.tencent.tav.core.AssetExportThread.this.logger.e(com.tencent.tav.core.AssetExportThread.TAG, "VideoRequestMediaDateCallback run: ", th6);
                com.tencent.tav.core.AssetExportThread.this.exportError(-14, th6);
            }
        }
    }

    /* loaded from: classes16.dex */
    public class VideoWriterProgressListener implements com.tencent.tav.core.AssetWriterInput.WriterProgressListener {
        private VideoWriterProgressListener() {
        }

        @Override // com.tencent.tav.core.AssetWriterInput.WriterProgressListener
        public void onError(com.tencent.tav.core.ExportErrorStatus exportErrorStatus) {
            com.tencent.tav.core.AssetExportThread.this.logger.e(com.tencent.tav.core.AssetExportThread.TAG, "VideoWriterProgressListener onError: ", exportErrorStatus.throwable);
            com.tencent.tav.core.AssetExportThread.this.exportError(exportErrorStatus);
        }

        @Override // com.tencent.tav.core.AssetWriterInput.WriterProgressListener
        public void onProgressChanged(com.tencent.tav.core.AssetWriterInput assetWriterInput, long j17) {
            com.tencent.tav.core.AssetExportThread.this.logger.frame("AssetExportSession", "onProgressChanged: videoWriter " + j17 + "  / " + com.tencent.tav.core.AssetExportThread.this.getDuration());
            if (j17 == -1) {
                com.tencent.tav.core.AssetExportThread assetExportThread = com.tencent.tav.core.AssetExportThread.this;
                assetExportThread.videoTime = assetExportThread.exportSession.timeRange.getDuration().getTimeUs();
                com.tencent.tav.core.AssetExportThread.this.videoProgress = 1.0f;
                com.tencent.tav.core.AssetExportThread.this.videoWriterDone = true;
                com.tencent.tav.core.AssetExportThread.this.exportHandler.sendEmptyMessage(1);
                return;
            }
            com.tencent.tav.core.AssetExportThread.this.videoTime = j17;
            long timeUs = com.tencent.tav.core.AssetExportThread.this.exportSession.timeRange != null ? com.tencent.tav.core.AssetExportThread.this.exportSession.timeRange.getDuration().getTimeUs() : com.tencent.tav.core.AssetExportThread.this.videoReader != null ? com.tencent.tav.core.AssetExportThread.this.videoReader.duration() : 0L;
            if (timeUs != 0) {
                com.tencent.tav.core.AssetExportThread assetExportThread2 = com.tencent.tav.core.AssetExportThread.this;
                assetExportThread2.videoProgress = (((float) assetExportThread2.videoTime) * 1.0f) / ((float) timeUs);
            } else {
                com.tencent.tav.core.AssetExportThread.this.videoProgress = 1.0f;
            }
            com.tencent.tav.core.AssetExportThread.this.exportSession.progress = java.lang.Math.min(com.tencent.tav.core.AssetExportThread.this.videoProgress, com.tencent.tav.core.AssetExportThread.this.audioProgress);
            if (com.tencent.tav.core.AssetExportThread.this.callbackHandler != null) {
                com.tencent.tav.core.AssetExportThread.this.callbackHandler.handlerCallback(com.tencent.tav.core.AssetExportThread.this.exportSession);
            }
        }
    }

    public AssetExportThread(com.tencent.tav.core.AssetExportSession assetExportSession, com.tencent.tav.core.AssetExportSession.ExportCallbackHandler exportCallbackHandler, com.tencent.tav.core.AudioMix audioMix, com.tencent.tav.core.ExportConfig exportConfig) {
        super("ExportThread");
        this.videoWriterDone = false;
        this.audioWriterDone = false;
        this.videoReadFinish = false;
        this.audioReadFinish = false;
        this.videoTime = 0L;
        this.audioTime = 0L;
        this.cancel = false;
        this.videoTimeout = false;
        this.audioTimeout = false;
        this.reportSession = new com.tencent.tav.report.ExportReportSession();
        this.videoTimeoutCallback = new com.tencent.tav.core.AssetExportThread.VideoFrameOperateTimeoutCallback();
        this.audioTimeoutCallback = new com.tencent.tav.core.AssetExportThread.AudioFrameOperateTimeoutCallback();
        this.lastHandleVideoTimeStamp = 0L;
        this.lastHandleAudioTimeStamp = 0L;
        this.isNeedCheckFrameProcessTimeout = true;
        this.timeoutInterruptWork = false;
        this.MEDIA_VIDEO_NOT_READ_TIMEOUT = 3000L;
        this.MEDIA_AUDIO_NOT_READ_TIMEOUT = androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS;
        this.maxTimeoutMs = com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT;
        this.timeLock = new java.lang.Object();
        this.logger = new com.tencent.tav.decoder.logger.WXLogger();
        this.count = 0;
        this.exportSession = assetExportSession;
        this.callbackHandler = exportCallbackHandler;
        this.audioMix = audioMix;
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
        com.tencent.tav.core.AssetWriterInput assetWriterInput = new com.tencent.tav.core.AssetWriterInput(2, this.exportSession.isEnableNewTextureBlitting());
        assetWriterInput.setLoggerConfig(this.logger.getConfig());
        return assetWriterInput;
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
        assetReaderVideoCompositionOutput.setVideoCompositing(this.exportSession.videoCompositing);
        assetReaderVideoCompositionOutput.setVideoRevertMode(this.exportSession.isRevertMode());
        assetReaderVideoCompositionOutput.setEnableOptimizedVideoFrameSampling(this.exportSession.isEnableOptimizedVideoFrameSampling());
        return assetReaderVideoCompositionOutput;
    }

    private com.tencent.tav.core.AssetWriterInput createVideoWriterInput() {
        com.tencent.tav.report.ExportReportSession exportReportSession = this.reportSession;
        if (exportReportSession != null) {
            exportReportSession.setFramePerSecond(this.encodeOption.getVideoFrameRate());
        }
        com.tencent.tav.core.AssetWriterInput assetWriterInput = new com.tencent.tav.core.AssetWriterInput(1, this.exportSession.isEnableNewTextureBlitting());
        assetWriterInput.setLoggerConfig(this.logger.getConfig());
        return assetWriterInput;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void exportError(int i17, java.lang.Throwable th6) {
        exportError(new com.tencent.tav.core.ExportErrorStatus(i17, th6));
    }

    private synchronized void exportSuccess() {
        synchronized (this) {
            com.tencent.tav.core.AssetExportSession assetExportSession = this.exportSession;
            com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus assetExportSessionStatus = assetExportSession.status;
            com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus assetExportSessionStatus2 = com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusCompleted;
            if (assetExportSessionStatus == assetExportSessionStatus2) {
                return;
            }
            assetExportSession.progress = 1.0f;
            assetExportSession.status = assetExportSessionStatus2;
            com.tencent.tav.report.ExportReportSession exportReportSession = this.reportSession;
            if (exportReportSession != null) {
                exportReportSession.onExportSuccess();
            }
            com.tencent.tav.core.AssetExportSession.ExportCallbackHandler exportCallbackHandler = this.callbackHandler;
            if (exportCallbackHandler != null) {
                exportCallbackHandler.handlerCallback(this.exportSession);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void exporting() {
        initReaderAndWriter();
        this.exportSession.status = com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusExporting;
        this.videoExportThread = new android.os.HandlerThread("VideoWriter");
        this.videoWriter.setWriterProgressListener(new com.tencent.tav.core.AssetExportThread.VideoWriterProgressListener());
        this.videoWriter.requestMediaDataWhenReadyOnQueue(this.videoExportThread, new com.tencent.tav.core.AssetExportThread.VideoRequestMediaDataCallback());
        if (this.audioWriter == null) {
            this.audioReadFinish = true;
            this.audioWriterDone = true;
        } else {
            this.audioExportThread = new android.os.HandlerThread("AudioWriter");
            this.audioWriter.setWriterProgressListener(new com.tencent.tav.core.AssetExportThread.AudioWriterProgressListener());
            this.audioWriter.requestMediaDataWhenReadyOnQueue(this.audioExportThread, new com.tencent.tav.core.AssetExportThread.AudioRequestMediaDataCallback());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finish() {
        this.logger.i(TAG, "finish");
        if (this.videoExportThread == null) {
            this.logger.w(TAG, "videoExportThread is null");
            return;
        }
        if (this.isFinishing) {
            this.logger.w(TAG, "already finished");
            return;
        }
        this.isFinishing = true;
        this.logger.i(TAG, "post finish, timeoutInterruptWork: " + this.timeoutInterruptWork + " audioTimeout: " + this.audioTimeout + " videoTimeout: " + this.videoTimeout);
        android.os.Handler handler = this.exportHandler;
        if (handler != null) {
            handler.removeCallbacks(this.videoTimeoutCallback);
            this.exportHandler.removeCallbacks(this.audioTimeoutCallback);
            this.logger.i(TAG, "post finish, remove timeout callback");
        }
        android.os.Handler handler2 = new android.os.Handler(this.videoExportThread.getLooper());
        this.logger.i(TAG, "finish, with videoExportThread");
        handler2.post(new java.lang.Runnable() { // from class: com.tencent.tav.core.AssetExportThread.1
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.tav.core.AssetExportThread.this.finishImpl();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishImpl() {
        this.logger.i(TAG, "quit thread start: " + java.lang.Thread.currentThread().getId());
        android.os.HandlerThread handlerThread = this.videoExportThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.videoExportThread = null;
        }
        android.os.HandlerThread handlerThread2 = this.audioExportThread;
        if (handlerThread2 != null) {
            handlerThread2.quitSafely();
            this.audioExportThread = null;
        }
        com.tencent.tav.core.AssetReader assetReader = this.assetReader;
        if (assetReader != null) {
            assetReader.cancelReading();
            this.assetReader = null;
        }
        com.tencent.tav.report.ExportReportSession exportReportSession = this.reportSession;
        if (exportReportSession != null) {
            com.tencent.tav.core.AssetReaderOutput assetReaderOutput = this.videoReader;
            long j17 = 0;
            exportReportSession.setTotalRealDecodeUs((assetReaderOutput == null || assetReaderOutput.getDecodePerformance() == null) ? 0L : this.videoReader.getDecodePerformance().getTotal() * 1000);
            com.tencent.tav.report.ExportReportSession exportReportSession2 = this.reportSession;
            com.tencent.tav.core.AssetWriter assetWriter = this.assetWriter;
            if (assetWriter != null && assetWriter.getEncodePerformance() != null) {
                j17 = this.assetWriter.getEncodePerformance().getTotal() * 1000;
            }
            exportReportSession2.setTotalEncodeUs(j17);
        }
        com.tencent.tav.core.AssetWriter assetWriter2 = this.assetWriter;
        boolean z17 = false;
        if (assetWriter2 != null) {
            try {
                assetWriter2.finishWriting(this.cancel);
                z17 = true;
            } catch (java.lang.Exception e17) {
                this.logger.e("AssetExportSession", "code = -10 run: finishWriting error", e17);
                exportError(-10, e17);
            }
            this.assetWriter = null;
        }
        com.tencent.tav.core.AssetWriterInput assetWriterInput = this.videoWriter;
        if (assetWriterInput != null) {
            assetWriterInput.close();
            this.videoWriter = null;
        }
        com.tencent.tav.core.AssetWriterInput assetWriterInput2 = this.audioWriter;
        if (assetWriterInput2 != null) {
            assetWriterInput2.close();
            this.audioWriter = null;
        }
        if (this.audioTimeout) {
            com.tencent.tav.core.AssetExportSession assetExportSession = this.exportSession;
            assetExportSession.status = com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusTimeout;
            assetExportSession.exportErrorStatus = new com.tencent.tav.core.ExportErrorStatus(-204, null, "handle audio timeout");
            this.logger.e(TAG, "exportError modified when finish, audioTimeout, internal exportErrorStatus: " + this.exportSession.exportErrorStatus);
            com.tencent.tav.core.AssetExportSession.ExportCallbackHandler exportCallbackHandler = this.callbackHandler;
            if (exportCallbackHandler != null) {
                exportCallbackHandler.handlerCallback(this.exportSession);
            }
        } else if (this.videoTimeout) {
            com.tencent.tav.core.AssetExportSession assetExportSession2 = this.exportSession;
            assetExportSession2.status = com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusTimeout;
            assetExportSession2.exportErrorStatus = new com.tencent.tav.core.ExportErrorStatus(-203, null, "handle video timeout");
            this.logger.e(TAG, "exportError modified when finish, videoTimeout, internal exportErrorStatus: " + this.exportSession.exportErrorStatus);
            com.tencent.tav.core.AssetExportSession.ExportCallbackHandler exportCallbackHandler2 = this.callbackHandler;
            if (exportCallbackHandler2 != null) {
                exportCallbackHandler2.handlerCallback(this.exportSession);
            }
        } else {
            if (this.cancel) {
                com.tencent.tav.core.AssetExportSession assetExportSession3 = this.exportSession;
                if (assetExportSession3.status != com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusFailed) {
                    assetExportSession3.status = com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusCancelled;
                    com.tencent.tav.core.AssetExportSession.ExportCallbackHandler exportCallbackHandler3 = this.callbackHandler;
                    if (exportCallbackHandler3 != null) {
                        exportCallbackHandler3.handlerCallback(assetExportSession3);
                    }
                }
            }
            if (this.videoWriterDone && this.audioWriterDone && z17 && !this.cancel) {
                exportSuccess();
            }
        }
        quitSafely();
        com.tencent.tav.core.AssetExportSession assetExportSession4 = this.exportSession;
        if (assetExportSession4 != null) {
            assetExportSession4.release();
        }
        this.logger.i(TAG, "quit thread finish");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getDuration() {
        com.tencent.tav.coremedia.CMTimeRange cMTimeRange;
        com.tencent.tav.core.AssetExportSession assetExportSession = this.exportSession;
        if (assetExportSession != null && (cMTimeRange = assetExportSession.timeRange) != null) {
            return cMTimeRange.getDuration().getTimeUs() * 2;
        }
        com.tencent.tav.core.AssetReaderOutput assetReaderOutput = this.audioReader;
        long duration = assetReaderOutput != null ? assetReaderOutput.duration() : 0L;
        com.tencent.tav.core.AssetReaderOutput assetReaderOutput2 = this.videoReader;
        return duration + (assetReaderOutput2 != null ? assetReaderOutput2.duration() : 0L);
    }

    private void initReaderAndWriter() {
        android.graphics.Matrix preferMatrix;
        com.tencent.tav.core.AssetReader assetReader = new com.tencent.tav.core.AssetReader(this.exportSession.asset);
        this.assetReader = assetReader;
        assetReader.setTimeRange(this.exportSession.timeRange);
        this.videoReader = createVideoTrackOutput();
        com.tencent.tav.core.AssetReaderOutput createAudioTrackOutput = createAudioTrackOutput();
        this.audioReader = createAudioTrackOutput;
        createAudioTrackOutput.setLoggerConfig(this.logger.getConfig());
        this.videoReader.setLoggerConfig(this.logger.getConfig());
        if (this.assetReader.canAddOutput(this.videoReader)) {
            this.assetReader.addOutput(this.videoReader);
        }
        com.tencent.tav.core.AssetReaderOutput assetReaderOutput = this.audioReader;
        if (!(assetReaderOutput instanceof com.tencent.tav.core.EmptyReaderOutput) && this.assetReader.canAddOutput(assetReaderOutput)) {
            this.assetReader.addOutput(this.audioReader);
        }
        com.tencent.tav.core.AssetExportSession assetExportSession = this.exportSession;
        com.tencent.tav.core.AssetWriter assetWriter = new com.tencent.tav.core.AssetWriter(assetExportSession.outputFilePath, assetExportSession.outputFileType);
        this.assetWriter = assetWriter;
        assetWriter.setRenderContextParams(this.renderContextParams);
        this.assetWriter.loggerConfig = this.logger.getConfig();
        com.tencent.tav.coremedia.CMTimeRange cMTimeRange = this.exportSession.timeRange;
        if (cMTimeRange != null) {
            this.assetWriter.startSessionAtSourceTime(cMTimeRange.getStart());
            this.assetWriter.endSessionAtSourceTime(this.exportSession.timeRange.getEnd());
            com.tencent.tav.report.ExportReportSession exportReportSession = this.reportSession;
            if (exportReportSession != null) {
                exportReportSession.setFileDurationUs(this.exportSession.timeRange.getDurationUs());
            }
        }
        this.assetWriter.setEncodeOption(this.encodeOption);
        com.tencent.tav.core.AssetWriterInput createVideoWriterInput = createVideoWriterInput();
        this.videoWriter = createVideoWriterInput;
        com.tencent.tav.core.composition.VideoComposition videoComposition = this.exportSession.videoComposition;
        if (videoComposition != null) {
            createVideoWriterInput.setEnableLut(videoComposition.getLutBitmap());
        }
        if (!(this.audioReader instanceof com.tencent.tav.core.EmptyReaderOutput)) {
            this.audioWriter = createAudioWriterInput();
        }
        if (this.assetWriter.canAddInput(this.videoWriter)) {
            com.tencent.tav.core.AssetExportSession assetExportSession2 = this.exportSession;
            if (assetExportSession2.calculateBfsTransform) {
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                com.tencent.tav.coremedia.CGSize naturalSize = this.exportSession.asset.getNaturalSize();
                if (this.exportSession.appliesPreferredTrackTransform) {
                    preferMatrix = new android.graphics.Matrix();
                    com.tencent.tav.decoder.DecoderUtils.getMatrixAndCropRect(this.exportSession.asset.getNaturalSize(), this.exportSession.asset.getPreferRotation(), 1.0f, 0.0f, new android.graphics.Point(0, 0), preferMatrix);
                    if (this.exportSession.asset.getPreferRotation() == 1 || this.exportSession.asset.getPreferRotation() == 3) {
                        matrix.setScale(this.encodeOption.getRenderWidth() / naturalSize.height, this.encodeOption.getRenderHeight() / naturalSize.width);
                    } else {
                        matrix.setScale(this.encodeOption.getRenderWidth() / naturalSize.width, this.encodeOption.getRenderHeight() / naturalSize.height);
                    }
                } else {
                    preferMatrix = new android.graphics.Matrix();
                    matrix.setScale((this.encodeOption.getRenderWidth() * 1.0f) / this.encodeOption.getOutputWidth(), (this.encodeOption.getRenderHeight() * 1.0f) / this.encodeOption.getOutputHeight());
                }
                preferMatrix.postConcat(matrix);
            } else {
                preferMatrix = assetExportSession2.appliesPreferredTrackTransform ? com.tencent.tav.decoder.DecoderUtils.getPreferMatrix(new com.tencent.tav.coremedia.CGSize(this.encodeOption.getRenderWidth(), this.encodeOption.getRenderHeight()), this.exportSession.asset.getNaturalSize(), this.exportSession.asset.getPreferRotation()) : null;
            }
            this.videoWriter.setTransform(preferMatrix);
            this.assetWriter.addInput(this.videoWriter);
        }
        com.tencent.tav.core.AssetWriterInput assetWriterInput = this.audioWriter;
        if (assetWriterInput != null && this.assetWriter.canAddInput(assetWriterInput)) {
            this.assetWriter.addInput(this.audioWriter);
        }
        this.assetWriter.startWriting(this.mediaFactory);
        this.assetReader.startReading(this.assetWriter);
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
            handler.post(new java.lang.Runnable() { // from class: com.tencent.tav.core.AssetExportThread.2
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.tav.core.AssetExportThread.this.finish();
                }
            });
        }
    }

    public com.tencent.tav.report.ExportReportSession getReportSession() {
        return this.reportSession;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int i17 = message.what;
        if ((i17 == 1 || i17 == 2) && !this.isFinishing) {
            if (this.cancel) {
                finish();
            }
            if (this.videoWriterDone && this.audioWriterDone && this.audioReadFinish && this.videoReadFinish) {
                finish();
            }
        }
        return true;
    }

    public void setLoggerConfig(com.tencent.tav.decoder.logger.WXLoggerConfig wXLoggerConfig) {
        this.logger.setConfig(wXLoggerConfig);
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
        this.logger.i(TAG, "setNeedCheckFrameProcessTimeout:%b timeoutInterruptWork:%b maxTimeoutMs: %d", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Long.valueOf(this.maxTimeoutMs));
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
        handler.post(new java.lang.Runnable() { // from class: com.tencent.tav.core.AssetExportThread.3
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.tav.core.AssetExportThread.this.exporting();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void exportError(com.tencent.tav.core.ExportErrorStatus exportErrorStatus) {
        int i17;
        com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus assetExportSessionStatus = this.exportSession.status;
        com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus assetExportSessionStatus2 = com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusFailed;
        if (assetExportSessionStatus != assetExportSessionStatus2) {
            this.cancel = true;
            this.exportSession.status = assetExportSessionStatus2;
            this.logger.e(TAG, "exportError message: " + exportErrorStatus.msg);
            com.tencent.tav.core.AssetExportSession assetExportSession = this.exportSession;
            assetExportSession.exportErrorStatus = exportErrorStatus;
            com.tencent.tav.core.ExportErrorStatus exportErrorStatus2 = assetExportSession.processErrorStatus;
            if (exportErrorStatus2 != null && ((i17 = exportErrorStatus2.code) == -206 || i17 == -207)) {
                assetExportSession.exportErrorStatus = exportErrorStatus2;
                this.logger.e(TAG, "exportError modified, internal exportErrorStatus: " + exportErrorStatus + " change to timeout: " + this.exportSession.exportErrorStatus);
            }
            com.tencent.tav.report.ExportReportSession exportReportSession = this.reportSession;
            if (exportReportSession != null) {
                exportReportSession.onExportError();
            }
            com.tencent.tav.core.AssetExportSession.ExportCallbackHandler exportCallbackHandler = this.callbackHandler;
            if (exportCallbackHandler != null) {
                exportCallbackHandler.handlerCallback(this.exportSession);
                return;
            }
            return;
        }
        this.logger.e(TAG, "export message: " + exportErrorStatus.msg);
    }
}
