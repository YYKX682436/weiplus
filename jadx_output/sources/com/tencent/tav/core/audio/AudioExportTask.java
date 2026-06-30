package com.tencent.tav.core.audio;

/* loaded from: classes16.dex */
public class AudioExportTask implements com.tencent.tav.core.audio.IAudioExportTask {
    private static final java.lang.String TAG = "AudioEncoderTask";
    private com.tencent.tav.core.audio.IAudioSource<? extends com.tencent.tav.decoder.IDecoderTrack> mAsset;
    private com.tencent.tav.core.audio.ExportCallback mCallback;
    private java.lang.String mOutSavePath;
    private int mSegmentCount = 0;
    private java.lang.String mSessionId = new java.util.Random().nextLong() + "";
    private java.util.List<com.tencent.tav.core.audio.AudioExportRunner> mEncoderList = new java.util.ArrayList();
    private java.util.HashMap<java.lang.Integer, com.tencent.tav.core.audio.AudioExportTask.SegmentStatus> mProgressMap = new java.util.HashMap<>();

    /* loaded from: classes16.dex */
    public static class SegmentStatus {
        private float mProgress;
        private int mStatus;
        private com.tencent.tav.coremedia.CMTimeRange mTimeRange;

        public SegmentStatus(int i17, float f17) {
            this.mStatus = i17;
            this.mProgress = f17;
        }

        public com.tencent.tav.coremedia.CMTimeRange getTimeRange() {
            return this.mTimeRange;
        }

        public void setTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
            this.mTimeRange = cMTimeRange;
        }
    }

    public AudioExportTask(com.tencent.tav.core.audio.IAudioSource<? extends com.tencent.tav.decoder.IDecoderTrack> iAudioSource, java.lang.String str) {
        this.mAsset = iAudioSource;
        this.mOutSavePath = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.tav.core.audio.AudioExportTask.SegmentStatus createOrUpdateSegmentStatus(int i17, int i18, float f17) {
        com.tencent.tav.decoder.logger.Logger.d(TAG, "createOrUpdateSegmentStatus index = " + i17 + " mStatus = " + i18 + " mProgress = " + f17);
        if (!this.mProgressMap.containsKey(java.lang.Integer.valueOf(i17))) {
            com.tencent.tav.core.audio.AudioExportTask.SegmentStatus segmentStatus = new com.tencent.tav.core.audio.AudioExportTask.SegmentStatus(i18, f17);
            this.mProgressMap.put(java.lang.Integer.valueOf(i17), segmentStatus);
            return segmentStatus;
        }
        com.tencent.tav.core.audio.AudioExportTask.SegmentStatus segmentStatus2 = this.mProgressMap.get(java.lang.Integer.valueOf(i17));
        segmentStatus2.mProgress = f17;
        segmentStatus2.mStatus = i18;
        return segmentStatus2;
    }

    private com.tencent.tav.core.audio.AudioExportTask.SegmentStatus createSegmentStatus(int i17, com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        com.tencent.tav.core.audio.AudioExportTask.SegmentStatus segmentStatus = new com.tencent.tav.core.audio.AudioExportTask.SegmentStatus(0, 0.0f);
        segmentStatus.mTimeRange = cMTimeRange;
        this.mProgressMap.put(java.lang.Integer.valueOf(i17), segmentStatus);
        return segmentStatus;
    }

    private void exportAudio(com.tencent.tav.coremedia.CMTimeRange cMTimeRange, final int i17) {
        com.tencent.tav.decoder.logger.Logger.d(TAG, "exportAudio timeRange = " + cMTimeRange + " index = " + i17);
        com.tencent.tav.core.audio.AudioExportRunner audioExportRunner = new com.tencent.tav.core.audio.AudioExportRunner(this.mAsset, cMTimeRange);
        audioExportRunner.setSavePath(com.tencent.tav.core.audio.EncoderUtils.getAudioOutSaveFilePath(this.mOutSavePath, i17, this.mSessionId));
        audioExportRunner.setCallback(new com.tencent.tav.core.audio.ExportCallback() { // from class: com.tencent.tav.core.audio.AudioExportTask.1
            @Override // com.tencent.tav.core.audio.ExportCallback
            public void onProgress(int i18, float f17) {
                synchronized (com.tencent.tav.core.audio.AudioExportTask.this) {
                    com.tencent.tav.core.audio.AudioExportTask.this.createOrUpdateSegmentStatus(i17, i18, f17);
                    com.tencent.tav.core.audio.AudioExportTask.this.notifyProgressAndStatusUpdate();
                }
            }
        });
        try {
            audioExportRunner.prepare();
            audioExportRunner.start();
            this.mEncoderList.add(audioExportRunner);
        } catch (java.io.IOException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyProgressAndStatusUpdate() {
        if (this.mProgressMap.size() == 0) {
            return;
        }
        float f17 = this.mSegmentCount;
        float f18 = 0.0f;
        int i17 = 0;
        for (java.util.Map.Entry<java.lang.Integer, com.tencent.tav.core.audio.AudioExportTask.SegmentStatus> entry : this.mProgressMap.entrySet()) {
            f18 += entry.getValue().mProgress;
            i17 |= entry.getValue().mStatus;
        }
        float f19 = f18 / f17;
        com.tencent.tav.decoder.logger.Logger.i(TAG, " mStatus = " + i17 + " mProgress = " + f19);
        if (i17 == 255) {
            onProgress(255, f19);
            com.tencent.tav.core.audio.EncoderUtils.deleteAllTmpFiles(this.mOutSavePath, this.mSegmentCount, this.mSessionId);
            new java.io.File(this.mOutSavePath).delete();
            return;
        }
        if (i17 >= 4) {
            onProgress(4, f19);
            com.tencent.tav.core.audio.EncoderUtils.deleteAllTmpFiles(this.mOutSavePath, this.mSegmentCount, this.mSessionId);
            new java.io.File(this.mOutSavePath).delete();
        } else {
            if (i17 == 2) {
                if (com.tencent.tav.core.audio.EncoderUtils.mergeAllFiles(this.mOutSavePath, this.mSegmentCount, this.mSessionId)) {
                    onProgress(2, 1.0f);
                } else {
                    onProgress(255, 1.0f);
                }
                com.tencent.tav.core.audio.EncoderUtils.deleteAllTmpFiles(this.mOutSavePath, this.mSegmentCount, this.mSessionId);
                return;
            }
            if (i17 >= 1) {
                onProgress(1, f19);
            } else {
                onProgress(0, f19);
            }
        }
    }

    private void onProgress(int i17, float f17) {
        com.tencent.tav.core.audio.ExportCallback exportCallback = this.mCallback;
        if (exportCallback != null) {
            exportCallback.onProgress(i17, f17);
        }
    }

    @Override // com.tencent.tav.core.audio.IAudioExportTask
    public void cancel() {
        java.util.Iterator<com.tencent.tav.core.audio.AudioExportRunner> it = this.mEncoderList.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    public com.tencent.tav.coremedia.CMTime getDuration() {
        com.tencent.tav.core.audio.IAudioSource<? extends com.tencent.tav.decoder.IDecoderTrack> iAudioSource = this.mAsset;
        return iAudioSource != null ? iAudioSource.getDuration() : com.tencent.tav.coremedia.CMTime.CMTimeZero;
    }

    @Override // com.tencent.tav.core.audio.IAudioExportTask
    public void setExportCallback(com.tencent.tav.core.audio.ExportCallback exportCallback) {
        this.mCallback = exportCallback;
    }

    @Override // com.tencent.tav.core.audio.IAudioExportTask
    public void start() {
        this.mProgressMap.clear();
        this.mEncoderList.clear();
        long timeUs = getDuration().getTimeUs();
        long j17 = com.tencent.tav.core.audio.AudioExportSession.SEGMENT_DURATION_US;
        this.mSessionId = java.lang.System.currentTimeMillis() + "";
        this.mSegmentCount = (int) (((timeUs + j17) - 1) / j17);
        long j18 = 0;
        int i17 = 0;
        int i18 = 1;
        while (i17 < this.mSegmentCount) {
            long j19 = j18 + j17;
            createSegmentStatus(i18, new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.fromUs(j18), com.tencent.tav.coremedia.CMTime.fromUs(j19 > timeUs ? timeUs - j18 : j17)));
            i18++;
            i17++;
            j18 = j19;
        }
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, com.tencent.tav.core.audio.AudioExportTask.SegmentStatus>> it = this.mProgressMap.entrySet().iterator();
        int i19 = 1;
        while (it.hasNext()) {
            exportAudio(it.next().getValue().mTimeRange, i19);
            i19++;
        }
    }

    public AudioExportTask(java.lang.String str) {
        this.mOutSavePath = str;
    }
}
