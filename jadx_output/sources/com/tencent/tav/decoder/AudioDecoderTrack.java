package com.tencent.tav.decoder;

/* loaded from: classes16.dex */
public class AudioDecoderTrack implements com.tencent.tav.decoder.IDecoderTrack {
    private static java.lang.String TAG = "AudioDecoderTrack";
    private float _speed;
    private com.tencent.tav.decoder.AudioInfo audioInfo;
    private com.tencent.tav.decoder.AudioMixer audioMixer;
    private com.tencent.tav.decoder.AudioDecoder currentDecoder;
    private final java.lang.Object currentDecoderLock;
    private com.tencent.tav.coremedia.CMTime currentSegmentStartTime;
    private boolean decodeError;
    private java.lang.Exception decodeException;
    private com.tencent.tav.decoder.IDecoder.DecodeType decodeType;
    private com.tencent.tav.decoder.AudioDecoderTrack.AudioDecoderCreateThread decoderCreateThread;
    private com.tencent.tav.codec.IDecoderFactory decoderFactory;
    private final com.tencent.tav.decoder.AudioDecoderTrack.DecoderThread decoderThread;
    private com.tencent.tav.coremedia.CMTime duration;
    private java.nio.ByteBuffer emptyAudioBuffer;
    private com.tencent.tav.coremedia.CMTime frameDuration;
    private int frameRate;
    private boolean isEmptyFrame;
    private boolean isReleased;
    private com.tencent.tav.coremedia.CMSampleState lastSampleState;
    private com.tencent.tav.decoder.AudioDecoderTrack.DecoderWrapper nextDecoder;
    private final java.lang.Object nextDecoderLock;
    private boolean preRead;
    private int segmentIndex;
    private java.util.ArrayList<com.tencent.tav.decoder.DecoderTrackSegment> segments;
    private boolean started;
    private int trackID;
    private float volume;

    /* loaded from: classes16.dex */
    public class AudioDecoderCreateThread extends java.lang.Thread {
        com.tencent.tav.decoder.DecoderAssetTrack extractor;
        private android.view.Surface outputSurface;
        private int segmentIndex;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v11, types: [com.tencent.tav.decoder.AudioDecoderTrack$1] */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v13, types: [com.tencent.tav.decoder.IDecoder] */
        /* JADX WARN: Type inference failed for: r2v14, types: [com.tencent.tav.decoder.IDecoder] */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v24 */
        private void createDecoder() {
            com.tencent.tav.decoder.AudioDecoderTrack audioDecoderTrack;
            com.tencent.tav.decoder.AudioDecoder audioDecoder;
            if (com.tencent.tav.decoder.AudioDecoderTrack.this.segments == null || this.segmentIndex >= com.tencent.tav.decoder.AudioDecoderTrack.this.segments.size() || com.tencent.tav.decoder.AudioDecoderTrack.this.isReleased || android.text.TextUtils.isEmpty(this.extractor.assetPath)) {
                com.tencent.tav.decoder.logger.Logger.e(com.tencent.tav.decoder.AudioDecoderTrack.TAG, "createDecoder skip - " + this.extractor.assetPath);
                return;
            }
            ?? r27 = 0;
            r27 = 0;
            try {
                try {
                    try {
                        audioDecoder = new com.tencent.tav.decoder.AudioDecoder(this.extractor.assetPath, com.tencent.tav.decoder.AudioDecoderTrack.this.decoderFactory);
                    } catch (java.lang.Exception e17) {
                        e = e17;
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                }
                try {
                    audioDecoder.start(((com.tencent.tav.decoder.DecoderTrackSegment) com.tencent.tav.decoder.AudioDecoderTrack.this.segments.get(this.segmentIndex)).getTimeRange(), ((com.tencent.tav.decoder.DecoderTrackSegment) com.tencent.tav.decoder.AudioDecoderTrack.this.segments.get(this.segmentIndex)).getDecoderStartTime());
                    com.tencent.tav.decoder.AudioDecoderTrack.this.nextDecoder = new com.tencent.tav.decoder.AudioDecoderTrack.DecoderWrapper();
                    com.tencent.tav.decoder.AudioDecoderTrack.this.nextDecoder.decoder = audioDecoder;
                    com.tencent.tav.decoder.AudioDecoderTrack.this.nextDecoder.extractor = this.extractor;
                    com.tencent.tav.decoder.AudioDecoderTrack.this.nextDecoder.segmentIndex = this.segmentIndex;
                    com.tencent.tav.decoder.logger.Logger.d(com.tencent.tav.decoder.AudioDecoderTrack.TAG, "DecoderCreateThread success - " + this.extractor.assetPath);
                } catch (java.lang.Exception e18) {
                    e = e18;
                    r27 = audioDecoder;
                    com.tencent.tav.decoder.logger.Logger.e(com.tencent.tav.decoder.AudioDecoderTrack.TAG, "createDecoder", e);
                    if (r27 != 0) {
                        try {
                            r27.release();
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    if (com.tencent.tav.decoder.AudioDecoderTrack.this.isReleased) {
                        com.tencent.tav.decoder.logger.Logger.d(com.tencent.tav.decoder.AudioDecoderTrack.TAG, "createDecoder: released");
                        if (r27 != 0) {
                            try {
                                r27.release();
                            } catch (java.lang.Exception unused2) {
                            }
                        }
                        if (com.tencent.tav.decoder.AudioDecoderTrack.this.nextDecoder != null) {
                            audioDecoderTrack = com.tencent.tav.decoder.AudioDecoderTrack.this;
                            audioDecoderTrack.nextDecoder.release();
                        }
                        return;
                    }
                    return;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    r27 = audioDecoder;
                    if (com.tencent.tav.decoder.AudioDecoderTrack.this.isReleased) {
                        com.tencent.tav.decoder.logger.Logger.d(com.tencent.tav.decoder.AudioDecoderTrack.TAG, "createDecoder: released");
                        if (r27 != 0) {
                            try {
                                r27.release();
                            } catch (java.lang.Exception unused3) {
                            }
                        }
                        try {
                            if (com.tencent.tav.decoder.AudioDecoderTrack.this.nextDecoder != null) {
                                com.tencent.tav.decoder.AudioDecoderTrack.this.nextDecoder.release();
                            }
                        } catch (java.lang.Exception unused4) {
                        }
                    }
                    throw th;
                }
                if (com.tencent.tav.decoder.AudioDecoderTrack.this.isReleased) {
                    com.tencent.tav.decoder.logger.Logger.d(com.tencent.tav.decoder.AudioDecoderTrack.TAG, "createDecoder: released");
                    try {
                        audioDecoder.release();
                    } catch (java.lang.Exception unused5) {
                    }
                    if (com.tencent.tav.decoder.AudioDecoderTrack.this.nextDecoder != null) {
                        audioDecoderTrack = com.tencent.tav.decoder.AudioDecoderTrack.this;
                        audioDecoderTrack.nextDecoder.release();
                    }
                }
            } catch (java.lang.Exception unused6) {
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            java.lang.String str = com.tencent.tav.decoder.AudioDecoderTrack.TAG;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AudioDecoderCreateThread start - ");
            sb6.append(this.extractor.assetPath);
            sb6.append(" - ");
            sb6.append(this.outputSurface != null);
            com.tencent.tav.decoder.logger.Logger.d(str, sb6.toString());
            if (com.tencent.tav.decoder.AudioDecoderTrack.this.isReleased) {
                com.tencent.tav.decoder.AudioDecoderTrack.this.decoderCreateThread = null;
                return;
            }
            synchronized (com.tencent.tav.decoder.AudioDecoderTrack.this.nextDecoderLock) {
                if (com.tencent.tav.decoder.AudioDecoderTrack.this.nextDecoder == null || !com.tencent.tav.decoder.AudioDecoderTrack.isSameExtractor(com.tencent.tav.decoder.AudioDecoderTrack.this.nextDecoder.extractor, this.extractor)) {
                    if (com.tencent.tav.decoder.AudioDecoderTrack.this.nextDecoder != null) {
                        com.tencent.tav.decoder.logger.Logger.d(com.tencent.tav.decoder.AudioDecoderTrack.TAG, "AudioDecoderCreateThread create - " + this.extractor.assetPath);
                        if (com.tencent.tav.decoder.AudioDecoderTrack.this.nextDecoder.decoder != null && com.tencent.tav.decoder.AudioDecoderTrack.this.nextDecoder.decoder != com.tencent.tav.decoder.AudioDecoderTrack.this.currentDecoder) {
                            com.tencent.tav.decoder.AudioDecoderTrack.this.nextDecoder.release();
                            com.tencent.tav.decoder.AudioDecoderTrack.this.nextDecoder = null;
                        }
                        createDecoder();
                    } else {
                        createDecoder();
                    }
                }
            }
            com.tencent.tav.decoder.AudioDecoderTrack.this.decoderCreateThread = null;
            if (com.tencent.tav.decoder.AudioDecoderTrack.this.isReleased) {
                synchronized (com.tencent.tav.decoder.AudioDecoderTrack.this.nextDecoderLock) {
                    if (com.tencent.tav.decoder.AudioDecoderTrack.this.nextDecoder != null) {
                        com.tencent.tav.decoder.AudioDecoderTrack.this.nextDecoder.release();
                        com.tencent.tav.decoder.AudioDecoderTrack.this.nextDecoder = null;
                    }
                }
            }
            com.tencent.tav.decoder.logger.Logger.d(com.tencent.tav.decoder.AudioDecoderTrack.TAG, "AudioDecoderCreateThread finish - " + this.extractor.assetPath);
        }

        private AudioDecoderCreateThread(com.tencent.tav.decoder.DecoderAssetTrack decoderAssetTrack, android.view.Surface surface, int i17) {
            super("AudioDCreateThread " + decoderAssetTrack.assetPath);
            this.extractor = decoderAssetTrack;
            this.outputSurface = surface;
            this.segmentIndex = i17;
        }
    }

    /* loaded from: classes16.dex */
    public static class CacheBuffer {
        private com.tencent.tav.coremedia.CMTime frameTime;
        private com.tencent.tav.coremedia.CMTime preFrameTime;
        private com.tencent.tav.coremedia.CMSampleBuffer sampleBuffer;

        private CacheBuffer() {
        }
    }

    /* loaded from: classes16.dex */
    public class DecoderThread extends com.tencent.tav.decoder.thread.ReActionHandlerThread {
        private static final java.lang.String NAME = "AudioDecoderThread";
        private final java.lang.Object nextFrameDecoderLock;
        private com.tencent.tav.decoder.AudioDecoderTrack.CacheBuffer pcmFrame;

        public DecoderThread() {
            super(NAME);
            this.nextFrameDecoderLock = new java.lang.Object();
        }

        @Override // com.tencent.tav.decoder.thread.ReActionHandlerThread
        public void doAction() {
            com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer;
            synchronized (this.nextFrameDecoderLock) {
                if (this.pcmFrame != null) {
                    if (com.tencent.tav.decoder.AudioDecoderTrack.this.lastSampleState.getTime() == com.tencent.tav.coremedia.CMTime.CMTimeInvalid) {
                        com.tencent.tav.decoder.logger.Logger.v(com.tencent.tav.decoder.AudioDecoderTrack.TAG, "doAction: CMTime.CMTimeZero");
                        cMSampleBuffer = com.tencent.tav.decoder.AudioDecoderTrack.this.doReadSample(com.tencent.tav.coremedia.CMTime.CMTimeZero);
                    } else if (com.tencent.tav.decoder.AudioDecoderTrack.this.lastSampleState.getTime().smallThan(com.tencent.tav.coremedia.CMTime.CMTimeZero)) {
                        cMSampleBuffer = null;
                    } else {
                        com.tencent.tav.decoder.logger.Logger.v(com.tencent.tav.decoder.AudioDecoderTrack.TAG, "doAction: lastSampleTime.add(frameDuration)");
                        com.tencent.tav.decoder.AudioDecoderTrack audioDecoderTrack = com.tencent.tav.decoder.AudioDecoderTrack.this;
                        cMSampleBuffer = audioDecoderTrack.doReadSample(audioDecoderTrack.lastSampleState.getTime().add(com.tencent.tav.decoder.AudioDecoderTrack.this.frameDuration));
                    }
                    if (cMSampleBuffer != null) {
                        if (cMSampleBuffer.getSampleByteBuffer() != null) {
                            com.tencent.tav.decoder.logger.Logger.v(com.tencent.tav.decoder.AudioDecoderTrack.TAG, "doAction: processFrame [volume " + com.tencent.tav.decoder.AudioDecoderTrack.this.volume + "] [_speed " + com.tencent.tav.decoder.AudioDecoderTrack.this._speed + "]");
                            cMSampleBuffer.setSampleByteBuffer(com.tencent.tav.decoder.AudioDecoderTrack.this.processFrame(cMSampleBuffer.getSampleByteBuffer(), 1.0f, com.tencent.tav.decoder.AudioDecoderTrack.this._speed, com.tencent.tav.decoder.AudioDecoderTrack.this.getAudioInfo()));
                            com.tencent.tav.decoder.logger.Logger.v(com.tencent.tav.decoder.AudioDecoderTrack.TAG, "doAction: processFrame finish [volume " + com.tencent.tav.decoder.AudioDecoderTrack.this.volume + "] [_speed " + com.tencent.tav.decoder.AudioDecoderTrack.this._speed + "]");
                        }
                        com.tencent.tav.decoder.AudioDecoderTrack.CacheBuffer cacheBuffer = new com.tencent.tav.decoder.AudioDecoderTrack.CacheBuffer();
                        this.pcmFrame = cacheBuffer;
                        cacheBuffer.preFrameTime = com.tencent.tav.decoder.AudioDecoderTrack.this.lastSampleState.getTime();
                        this.pcmFrame.frameTime = cMSampleBuffer.getTime();
                    }
                }
            }
        }
    }

    /* loaded from: classes16.dex */
    public static class DecoderWrapper {
        com.tencent.tav.decoder.IDecoder decoder;
        com.tencent.tav.decoder.DecoderAssetTrack extractor;
        int segmentIndex;

        private DecoderWrapper() {
            this.segmentIndex = -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void release() {
            com.tencent.tav.decoder.logger.Logger.d(com.tencent.tav.decoder.AudioDecoderTrack.TAG, "Audio DecoderWrapper release: ");
            try {
                com.tencent.tav.decoder.IDecoder iDecoder = this.decoder;
                if (iDecoder != null) {
                    iDecoder.release();
                }
            } catch (java.lang.Error | java.lang.Exception unused) {
            }
        }
    }

    /* loaded from: classes16.dex */
    public static class ReleaseDecoderThread extends java.lang.Thread {
        private com.tencent.tav.decoder.IDecoder decoder;

        public ReleaseDecoderThread(com.tencent.tav.decoder.IDecoder iDecoder) {
            super("ReleaseDecoderThread");
            this.decoder = iDecoder;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            com.tencent.tav.decoder.IDecoder iDecoder = this.decoder;
            if (iDecoder != null) {
                iDecoder.release();
            }
        }
    }

    public AudioDecoderTrack() {
        this(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0195, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r9.segments.get(r5.segmentIndex) == r10) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        r6.start(r10.getTimeRange(), r10.getDecoderStartTime());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        r9.nextDecoder = null;
        com.tencent.tav.decoder.logger.Logger.d(com.tencent.tav.decoder.AudioDecoderTrack.TAG, "hint decoder - audio  " + r6.getSourcePath());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00da, code lost:
    
        if (r9.segments.get(r5.segmentIndex) == r10) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00dc, code lost:
    
        r6.start(r10.getTimeRange(), r10.getDecoderStartTime());
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00e7, code lost:
    
        com.tencent.tav.decoder.logger.Logger.d(com.tencent.tav.decoder.AudioDecoderTrack.TAG, "hint decoder - audio  " + r6.getSourcePath() + ", segmentIndex: " + r9.segmentIndex + ", nextDecoder.segmentIndex: " + r9.nextDecoder.segmentIndex);
        r9.nextDecoder = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x011b, code lost:
    
        return r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0127 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized com.tencent.tav.decoder.IDecoder createDecoder(com.tencent.tav.decoder.DecoderTrackSegment r10, com.tencent.tav.coremedia.CMTime r11) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.AudioDecoderTrack.createDecoder(com.tencent.tav.decoder.DecoderTrackSegment, com.tencent.tav.coremedia.CMTime):com.tencent.tav.decoder.IDecoder");
    }

    private synchronized void createNextDecoder(int i17) {
        java.util.ArrayList<com.tencent.tav.decoder.DecoderTrackSegment> arrayList = this.segments;
        if (arrayList != null && this.preRead) {
            int i18 = i17 + 1;
            if (i18 >= arrayList.size()) {
                return;
            }
            if (this.decoderCreateThread == null) {
                com.tencent.tav.decoder.DecoderAssetTrack videoAsset = this.segments.get(i18).getVideoAsset();
                if (videoAsset != null) {
                    com.tencent.tav.decoder.AudioDecoderTrack.DecoderWrapper decoderWrapper = this.nextDecoder;
                    if (decoderWrapper == null || !isSameExtractor(decoderWrapper.extractor, videoAsset)) {
                        try {
                            com.tencent.tav.decoder.AudioDecoderTrack.AudioDecoderCreateThread audioDecoderCreateThread = new com.tencent.tav.decoder.AudioDecoderTrack.AudioDecoderCreateThread(videoAsset, null, i18);
                            this.decoderCreateThread = audioDecoderCreateThread;
                            audioDecoderCreateThread.start();
                        } catch (java.lang.Exception e17) {
                            com.tencent.tav.decoder.logger.Logger.e(TAG, "createNextDecoder", e17);
                        }
                    }
                } else if (this.nextDecoder != null && i17 >= 0 && i17 < this.segments.size()) {
                    com.tencent.tav.decoder.AudioDecoderTrack.DecoderWrapper decoderWrapper2 = this.nextDecoder;
                    if (decoderWrapper2.segmentIndex != i17) {
                        decoderWrapper2.decoder.start(this.segments.get(i17).getTimeRange());
                        this.nextDecoder.segmentIndex = i17;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.tav.coremedia.CMSampleBuffer doReadSample(com.tencent.tav.coremedia.CMTime cMTime) {
        synchronized (this) {
            if (this.isReleased) {
                com.tencent.tav.decoder.logger.Logger.e(TAG, "doReadSample: has released");
                return new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-1L));
            }
            com.tencent.tav.coremedia.CMSampleState fromError = com.tencent.tav.coremedia.CMSampleState.fromError(-1L);
            this.isEmptyFrame = false;
            int i17 = this.segmentIndex;
            if (i17 == -1) {
                com.tencent.tav.decoder.logger.Logger.i(TAG, "doReadSample: segmentIndex == -1");
                return this.lastSampleState.getStateCode() < -1 ? new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-100L)) : new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-1L));
            }
            com.tencent.tav.decoder.DecoderTrackSegment decoderTrackSegment = this.segments.get(i17);
            while (true) {
                if (this.currentDecoder == null) {
                    com.tencent.tav.coremedia.CMTime add = this.lastSampleState.getTime().add(this.frameDuration);
                    if (this.lastSampleState.isInvalid()) {
                        add = com.tencent.tav.coremedia.CMTime.CMTimeZero;
                    }
                    if (add.smallThan(this.currentSegmentStartTime.add(decoderTrackSegment.getScaledDuration()))) {
                        this.isEmptyFrame = true;
                        com.tencent.tav.decoder.logger.Logger.v(TAG, "doReadSample: return emptyBuffer currentDecoder == null");
                        return new com.tencent.tav.coremedia.CMSampleBuffer(add, outputBuffer());
                    }
                } else {
                    fromError = this.lastSampleState.getTime().sub(this.currentSegmentStartTime).multi(this._speed).bigThan(decoderTrackSegment.getScaledDuration().multi(this._speed)) ? com.tencent.tav.coremedia.CMSampleState.fromError(-1L) : this.currentDecoder.readSample(com.tencent.tav.coremedia.CMTime.CMTimeInvalid);
                }
                java.nio.ByteBuffer byteBuffer = null;
                if (fromError.getStateCode() != -1) {
                    if (fromError.getStateCode() < 0) {
                        if (fromError.getStateCode() == -3 || fromError.getStateCode() == -100) {
                            return new com.tencent.tav.coremedia.CMSampleBuffer(fromError);
                        }
                        return new com.tencent.tav.coremedia.CMSampleBuffer(this.lastSampleState);
                    }
                    com.tencent.tav.coremedia.CMTime divide = fromError.getTime().sub(decoderTrackSegment.getDecoderStartTime()).divide(this._speed);
                    if (divide.getTimeUs() > decoderTrackSegment.getScaledDuration().getTimeUs()) {
                        divide = decoderTrackSegment.getScaledDuration();
                    }
                    com.tencent.tav.coremedia.CMSampleState cMSampleState = new com.tencent.tav.coremedia.CMSampleState(divide.add(this.currentSegmentStartTime));
                    com.tencent.tav.decoder.logger.Logger.v(TAG, "doReadSample: [success] " + cMSampleState);
                    com.tencent.tav.decoder.AudioDecoder audioDecoder = this.currentDecoder;
                    if (audioDecoder != null) {
                        byteBuffer = audioDecoder.outputBuffer();
                    }
                    return new com.tencent.tav.coremedia.CMSampleBuffer(cMSampleState, byteBuffer);
                }
                com.tencent.tav.coremedia.CMTime add2 = decoderTrackSegment.getScaledDuration().add(this.currentSegmentStartTime);
                com.tencent.tav.coremedia.CMTime add3 = this.lastSampleState.getTime().add(this.frameDuration);
                if (add2.bigThan(add3)) {
                    com.tencent.tav.decoder.AudioDecoder audioDecoder2 = this.currentDecoder;
                    java.nio.ByteBuffer emptyAudioBuffer = audioDecoder2 == null ? getEmptyAudioBuffer() : audioDecoder2.outputBuffer();
                    com.tencent.tav.decoder.logger.Logger.v(TAG, "doReadSample: finish && !end");
                    if (emptyAudioBuffer == null) {
                        emptyAudioBuffer = getEmptyAudioBuffer();
                    }
                    return new com.tencent.tav.coremedia.CMSampleBuffer(add3, emptyAudioBuffer);
                }
                if (!nextSegment(true)) {
                    com.tencent.tav.decoder.logger.Logger.v(TAG, "doReadSample: finish && end && next failed");
                    com.tencent.tav.coremedia.CMSampleState fromError2 = com.tencent.tav.coremedia.CMSampleState.fromError(-1L);
                    com.tencent.tav.decoder.AudioDecoder audioDecoder3 = this.currentDecoder;
                    if (audioDecoder3 != null) {
                        byteBuffer = audioDecoder3.outputBuffer();
                    }
                    return new com.tencent.tav.coremedia.CMSampleBuffer(fromError2, byteBuffer);
                }
                decoderTrackSegment = this.segments.get(this.segmentIndex);
            }
        }
    }

    private int findSegmentIndexAt(com.tencent.tav.coremedia.CMTime cMTime, boolean z17) {
        boolean z18;
        com.tencent.tav.coremedia.CMTime cMTime2 = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        java.util.Iterator<com.tencent.tav.decoder.DecoderTrackSegment> it = this.segments.iterator();
        boolean z19 = false;
        int i17 = 0;
        while (true) {
            z18 = true;
            if (!it.hasNext()) {
                break;
            }
            com.tencent.tav.coremedia.CMTime scaledDuration = it.next().getScaledDuration();
            if (cMTime.compare(cMTime2) >= 0 && cMTime.smallThan(cMTime2.add(scaledDuration))) {
                z19 = true;
                break;
            }
            cMTime2 = cMTime2.add(scaledDuration);
            i17++;
        }
        if (z19 || cMTime != cMTime2 || i17 <= 0 || !z17) {
            z18 = z19;
        } else {
            i17--;
        }
        if (z18) {
            return i17;
        }
        return -1;
    }

    private com.tencent.tav.coremedia.CMTime getSegmentStartTime(int i17) {
        com.tencent.tav.coremedia.CMTime cMTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        for (int i18 = 0; i18 < i17; i18++) {
            cMTime = com.tencent.tav.coremedia.CMTime.add(cMTime, this.segments.get(i18).getScaledDuration());
        }
        return cMTime;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isSameExtractor(com.tencent.tav.decoder.DecoderAssetTrack decoderAssetTrack, com.tencent.tav.decoder.DecoderAssetTrack decoderAssetTrack2) {
        java.lang.String str;
        return (decoderAssetTrack == null || decoderAssetTrack2 == null || (str = decoderAssetTrack.assetPath) == null || !str.equals(decoderAssetTrack2.assetPath)) ? false : true;
    }

    private boolean nextSegment(boolean z17) {
        com.tencent.tav.decoder.logger.Logger.d(TAG, "nextSegment:" + z17);
        int i17 = this.segmentIndex + 1;
        this.segmentIndex = i17;
        if (i17 >= this.segments.size()) {
            this.segmentIndex = -1;
            return false;
        }
        com.tencent.tav.coremedia.CMTime segmentStartTime = getSegmentStartTime(this.segmentIndex);
        this.currentSegmentStartTime = segmentStartTime;
        com.tencent.tav.coremedia.CMSampleState cMSampleState = new com.tencent.tav.coremedia.CMSampleState(segmentStartTime);
        this.lastSampleState = cMSampleState;
        if (cMSampleState.getTime().equalsTo(com.tencent.tav.coremedia.CMTime.CMTimeZero)) {
            this.lastSampleState = new com.tencent.tav.coremedia.CMSampleState();
        }
        com.tencent.tav.decoder.DecoderTrackSegment decoderTrackSegment = this.segments.get(this.segmentIndex);
        if (decoderTrackSegment.getVideoAsset() != null) {
            synchronized (this.currentDecoderLock) {
                com.tencent.tav.decoder.AudioDecoder audioDecoder = this.currentDecoder;
                if (audioDecoder != null && audioDecoder.getSourcePath() != null) {
                    new com.tencent.tav.decoder.AudioDecoderTrack.ReleaseDecoderThread(this.currentDecoder).start();
                    this.currentDecoder = null;
                }
            }
            com.tencent.tav.decoder.IDecoder createDecoder = createDecoder(decoderTrackSegment, z17 ? this.segments.get(this.segmentIndex).getDecoderStartTime() : com.tencent.tav.coremedia.CMTime.CMTimeInvalid);
            synchronized (this.currentDecoderLock) {
                this.currentDecoder = (com.tencent.tav.decoder.AudioDecoder) createDecoder;
                com.tencent.tav.decoder.AudioMixer audioMixer = this.audioMixer;
                if (audioMixer != null) {
                    audioMixer.release();
                }
                this.audioMixer = new com.tencent.tav.decoder.AudioMixer();
                com.tencent.tav.decoder.AudioDecoder audioDecoder2 = this.currentDecoder;
                if (audioDecoder2 != null && audioDecoder2.hasTrack() && z17) {
                    this.currentDecoder.seekTo(decoderTrackSegment.getDecoderStartTime());
                }
            }
        } else {
            com.tencent.tav.decoder.logger.Logger.d(TAG, "nextSegment: videoAsset is null");
            synchronized (this.currentDecoderLock) {
                if (this.currentDecoder != null) {
                    new com.tencent.tav.decoder.AudioDecoderTrack.ReleaseDecoderThread(this.currentDecoder).start();
                    this.currentDecoder = null;
                }
            }
        }
        if (decoderTrackSegment.getScaledDuration().getTimeUs() > 0) {
            this._speed = (((float) decoderTrackSegment.getTimeRange().getDurationUs()) * 1.0f) / ((float) decoderTrackSegment.getScaledDuration().getTimeUs());
        }
        java.lang.String str = TAG;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("nextSegment:");
        sb6.append(this.currentDecoder == null);
        sb6.append(" ");
        sb6.append(this._speed);
        com.tencent.tav.decoder.logger.Logger.d(str, sb6.toString());
        return true;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void asyncReadNextSample(com.tencent.tav.coremedia.CMTime cMTime) {
        if (this.decoderThread.pcmFrame == null) {
            synchronized (this.decoderThread) {
                if (this.decoderThread.pcmFrame == null) {
                    this.decoderThread.action();
                }
            }
        }
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void clipRangeAndClearRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        if (cMTimeRange == null || cMTimeRange.getDurationUs() <= 0 || this.segments.size() == 0) {
            return;
        }
        com.tencent.tav.coremedia.CMTime start = cMTimeRange.getStart();
        com.tencent.tav.coremedia.CMTime end = cMTimeRange.getEnd();
        com.tencent.tav.coremedia.CMTime duration = duration();
        clipRangeAndRemoveRange(cMTimeRange);
        if (start.getValue() != 0) {
            this.segments.add(0, new com.tencent.tav.decoder.DecoderTrackSegment(new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, start), (com.tencent.tav.decoder.DecoderAssetTrack) null));
        }
        if (end.getTimeUs() < duration.getTimeUs()) {
            this.segments.add(new com.tencent.tav.decoder.DecoderTrackSegment(new com.tencent.tav.coremedia.CMTimeRange(end, new com.tencent.tav.coremedia.CMTime(duration.getTimeSeconds() - end.getTimeSeconds())), (com.tencent.tav.decoder.DecoderAssetTrack) null));
        }
    }

    public void clipRangeAndRemoveRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        if (cMTimeRange == null || cMTimeRange.getDurationUs() <= 0 || this.segments.size() == 0) {
            return;
        }
        com.tencent.tav.coremedia.CMTime start = cMTimeRange.getStart();
        com.tencent.tav.coremedia.CMTime end = cMTimeRange.getEnd();
        int findSegmentIndexAt = findSegmentIndexAt(start, false);
        if (findSegmentIndexAt == -1) {
            return;
        }
        int findSegmentIndexAt2 = findSegmentIndexAt(end, false);
        if (findSegmentIndexAt2 == -1) {
            findSegmentIndexAt2 = this.segments.size() - 1;
        } else if (getSegmentStartTime(findSegmentIndexAt2) == end) {
            findSegmentIndexAt2--;
        }
        com.tencent.tav.coremedia.CMTime segmentStartTime = getSegmentStartTime(findSegmentIndexAt);
        com.tencent.tav.coremedia.CMTime segmentStartTime2 = getSegmentStartTime(findSegmentIndexAt2);
        com.tencent.tav.decoder.DecoderTrackSegment decoderTrackSegment = this.segments.get(findSegmentIndexAt);
        com.tencent.tav.decoder.DecoderTrackSegment decoderTrackSegment2 = this.segments.get(findSegmentIndexAt2);
        com.tencent.tav.coremedia.CMTime sub = cMTimeRange.getEnd().sub(segmentStartTime2);
        decoderTrackSegment2.setTimeRange(new com.tencent.tav.coremedia.CMTimeRange(decoderTrackSegment2.getTimeRange().getStart(), sub.divide((((float) decoderTrackSegment2.getScaledDuration().getTimeUs()) * 1.0f) / ((float) decoderTrackSegment2.getTimeRange().getDurationUs()))));
        decoderTrackSegment2.setScaledDuration(sub);
        float timeUs = (((float) decoderTrackSegment.getScaledDuration().getTimeUs()) * 1.0f) / ((float) decoderTrackSegment.getTimeRange().getDurationUs());
        com.tencent.tav.coremedia.CMTime sub2 = cMTimeRange.getStart().sub(segmentStartTime);
        com.tencent.tav.coremedia.CMTime divide = sub2.divide(timeUs);
        decoderTrackSegment.setTimeRange(new com.tencent.tav.coremedia.CMTimeRange(decoderTrackSegment.getTimeRange().getStart().add(divide), decoderTrackSegment.getTimeRange().getDuration().sub(divide)));
        decoderTrackSegment.setScaledDuration(decoderTrackSegment.getScaledDuration().sub(sub2));
        for (int size = this.segments.size() - 1; size >= 0; size--) {
            if (size > findSegmentIndexAt2 || size < findSegmentIndexAt) {
                this.segments.remove(size);
            }
        }
    }

    public com.tencent.tav.coremedia.CMTime duration() {
        return getSegmentStartTime(this.segments.size());
    }

    public com.tencent.tav.decoder.AudioInfo getAudioInfo() {
        com.tencent.tav.decoder.AudioDecoder audioDecoder = this.currentDecoder;
        return audioDecoder != null ? audioDecoder.getAudioInfo() : this.audioInfo;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMTime getCurrentSampleTime() {
        return this.lastSampleState.getTime();
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.report.AverageTimeReporter getDecodePerformance() {
        return null;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMTime getDuration() {
        com.tencent.tav.coremedia.CMTime cMTime = this.duration;
        com.tencent.tav.coremedia.CMTime cMTime2 = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        if (cMTime == cMTime2) {
            java.util.Iterator<com.tencent.tav.decoder.DecoderTrackSegment> it = this.segments.iterator();
            while (it.hasNext()) {
                cMTime2 = cMTime2.add(it.next().getScaledDuration());
            }
            this.duration = cMTime2;
        }
        return this.duration;
    }

    public java.nio.ByteBuffer getEmptyAudioBuffer() {
        if (this.emptyAudioBuffer == null) {
            com.tencent.tav.decoder.AudioInfo audioInfo = this.audioInfo;
            long timeUs = ((audioInfo.channelCount * audioInfo.sampleRate) * this.frameDuration.getTimeUs()) / 1000000;
            int i17 = (int) timeUs;
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(i17 * 2);
            this.emptyAudioBuffer = allocate;
            allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            short[] sArr = new short[i17];
            for (int i18 = 0; i18 < timeUs; i18++) {
                sArr[i18] = 0;
            }
            this.emptyAudioBuffer.asShortBuffer().put(sArr, 0, i17);
        }
        this.emptyAudioBuffer.position(0);
        return this.emptyAudioBuffer;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMTime getFrameDuration() {
        return this.frameDuration;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public int getFrameRate() {
        return this.frameRate;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public long getLaggingTime() {
        return 0L;
    }

    public int getTrackID() {
        return this.trackID;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public int getTrackId() {
        return this.trackID;
    }

    public java.nio.ByteBuffer outputBuffer() {
        if (this.isEmptyFrame) {
            return getEmptyAudioBuffer();
        }
        com.tencent.tav.decoder.AudioDecoder audioDecoder = this.currentDecoder;
        if (audioDecoder == null) {
            return null;
        }
        return audioDecoder.outputBuffer();
    }

    public synchronized java.nio.ByteBuffer processFrame(java.nio.ByteBuffer byteBuffer, float f17, float f18, com.tencent.tav.decoder.AudioInfo audioInfo) {
        if (this.audioMixer.getDestAudioChannelCount() != audioInfo.channelCount) {
            this.audioMixer.release();
            this.audioMixer = new com.tencent.tav.decoder.AudioMixer(audioInfo.sampleRate, audioInfo.channelCount);
        }
        return this.audioMixer.processBytes(byteBuffer, f18, f17, 1.0f);
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMSampleBuffer readSample() {
        return readSample(com.tencent.tav.coremedia.CMTime.CMTimeInvalid);
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public synchronized void release() {
        com.tencent.tav.decoder.logger.Logger.d(TAG, "release: start ");
        this.decoderThread.release();
        this.isReleased = true;
        com.tencent.tav.decoder.AudioDecoder audioDecoder = this.currentDecoder;
        if (audioDecoder != null) {
            audioDecoder.release();
            this.currentDecoder = null;
        }
        synchronized (this.nextDecoderLock) {
            com.tencent.tav.decoder.AudioDecoderTrack.DecoderWrapper decoderWrapper = this.nextDecoder;
            if (decoderWrapper != null) {
                decoderWrapper.release();
                this.nextDecoder = null;
            }
        }
        com.tencent.tav.decoder.logger.Logger.d(TAG, "release: finish ");
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMSampleBuffer seekTo(com.tencent.tav.coremedia.CMTime cMTime, boolean z17, boolean z18) {
        com.tencent.tav.decoder.logger.Logger.v(TAG, "seekTo:[time " + cMTime + "] [needRead " + z17 + "] [quickSeek " + z18 + "]");
        if (this.isReleased) {
            com.tencent.tav.decoder.logger.Logger.e(TAG, "seekTo: [failed] has released");
            return new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-1L));
        }
        synchronized (this.decoderThread.nextFrameDecoderLock) {
            this.decoderThread.pcmFrame = null;
        }
        if (!this.started) {
            com.tencent.tav.decoder.logger.Logger.w(TAG, "seekTo: [failed] un started, stack = " + android.util.Log.getStackTraceString(new java.lang.RuntimeException()));
            return null;
        }
        int findSegmentIndexAt = findSegmentIndexAt(cMTime, true);
        if (findSegmentIndexAt == -1) {
            this.segmentIndex = -1;
            com.tencent.tav.decoder.logger.Logger.e(TAG, "seekTo: [failed] segmentIndex = -1");
            return null;
        }
        com.tencent.tav.coremedia.CMTime segmentStartTime = getSegmentStartTime(findSegmentIndexAt);
        if (this.segmentIndex != findSegmentIndexAt || this.currentDecoder == null) {
            this.segmentIndex = findSegmentIndexAt - 1;
            nextSegment(false);
        }
        com.tencent.tav.coremedia.CMTime multi = cMTime.sub(segmentStartTime).multi(this._speed);
        com.tencent.tav.decoder.DecoderTrackSegment decoderTrackSegment = this.segments.get(this.segmentIndex);
        com.tencent.tav.decoder.AudioDecoder audioDecoder = this.currentDecoder;
        if (audioDecoder == null) {
            if (cMTime.bigThan(com.tencent.tav.coremedia.CMTime.CMTimeZero)) {
                this.lastSampleState = new com.tencent.tav.coremedia.CMSampleState(cMTime);
            } else {
                this.lastSampleState = new com.tencent.tav.coremedia.CMSampleState();
            }
            com.tencent.tav.decoder.logger.Logger.d(TAG, "seekTo: [failed] currentDecoder == null ");
            return null;
        }
        audioDecoder.seekTo(decoderTrackSegment.getDecoderStartTime().add(multi));
        if (cMTime.bigThan(this.frameDuration)) {
            this.lastSampleState = new com.tencent.tav.coremedia.CMSampleState(cMTime.sub(this.frameDuration));
        } else {
            this.lastSampleState = new com.tencent.tav.coremedia.CMSampleState(cMTime);
        }
        com.tencent.tav.decoder.logger.Logger.v(TAG, "seekTo: [success] [lastSampleState " + this.lastSampleState + "]");
        return null;
    }

    public void setAudioInfo(com.tencent.tav.decoder.AudioInfo audioInfo) {
        this.audioInfo = audioInfo.m416clone();
        if (this.emptyAudioBuffer != null) {
            this.emptyAudioBuffer = null;
        }
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void setDecodeType(com.tencent.tav.decoder.IDecoder.DecodeType decodeType) {
        this.decodeType = decodeType;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void setFrameRate(int i17) {
        this.frameDuration = this.frameDuration.divide(i17 / this.frameRate);
        this.frameRate = i17;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void setLogger(com.tencent.tav.decoder.logger.WXLogger wXLogger) {
    }

    public void setTrackID(int i17) {
        this.trackID = i17;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void setTrackSegments(java.util.List<com.tencent.tav.decoder.DecoderTrackSegment> list) {
        if (this.segments == null) {
            this.segments = new java.util.ArrayList<>();
        }
        this.segments.clear();
        this.segments.addAll(list);
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void setVolume(float f17) {
        this.volume = f17;
    }

    public float speed() {
        return this._speed;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void start() {
        start(null);
    }

    public AudioDecoderTrack(com.tencent.tav.codec.IDecoderFactory iDecoderFactory) {
        this.preRead = false;
        this.frameDuration = new com.tencent.tav.coremedia.CMTime(92880L, 1000000);
        this.frameRate = 11;
        this.volume = 1.0f;
        this.trackID = -1;
        this.segments = new java.util.ArrayList<>();
        this.decodeType = com.tencent.tav.decoder.IDecoder.DecodeType.Audio;
        this.segmentIndex = -1;
        com.tencent.tav.coremedia.CMTime cMTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        this.currentSegmentStartTime = cMTime;
        this.lastSampleState = new com.tencent.tav.coremedia.CMSampleState();
        this.decoderCreateThread = null;
        this.nextDecoderLock = new java.lang.Object();
        this.currentDecoderLock = new java.lang.Object();
        this.isReleased = false;
        this.decoderThread = new com.tencent.tav.decoder.AudioDecoderTrack.DecoderThread();
        this.audioMixer = new com.tencent.tav.decoder.AudioMixer();
        this.audioInfo = new com.tencent.tav.decoder.AudioInfo();
        this.isEmptyFrame = false;
        this.decodeError = false;
        this.decodeException = null;
        this._speed = 1.0f;
        this.started = false;
        this.duration = cMTime;
        this.decoderFactory = iDecoderFactory;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMSampleBuffer readSample(com.tencent.tav.coremedia.CMTime cMTime) {
        if (this.isReleased) {
            com.tencent.tav.decoder.logger.Logger.e(TAG, "readSample: [error] has released");
            return new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-1L));
        }
        if (this.decodeError) {
            return new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromExportError(-3L, -202, "", this.decodeException));
        }
        synchronized (this.decoderThread.nextFrameDecoderLock) {
            if (this.decoderThread.pcmFrame != null && this.decoderThread.pcmFrame.frameTime == this.lastSampleState.getTime()) {
                com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer = this.decoderThread.pcmFrame.sampleBuffer;
                this.lastSampleState = new com.tencent.tav.coremedia.CMSampleState(this.decoderThread.pcmFrame.frameTime);
                createNextDecoder(this.segmentIndex);
                com.tencent.tav.decoder.logger.Logger.v(TAG, "readSample: [success] hit asyncRead - " + this.lastSampleState);
                return cMSampleBuffer;
            }
            com.tencent.tav.coremedia.CMSampleBuffer doReadSample = doReadSample(cMTime);
            if (doReadSample.getSampleByteBuffer() != null) {
                float f17 = this._speed;
                if (f17 > 0.1f && f17 < 16.0f) {
                    doReadSample.setSampleByteBuffer(processFrame(doReadSample.getSampleByteBuffer(), this.volume, this._speed, getAudioInfo()));
                }
            }
            this.lastSampleState = doReadSample.getState();
            createNextDecoder(this.segmentIndex);
            return doReadSample;
        }
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void start(com.tencent.tav.decoder.IDecoderTrack.SurfaceCreator surfaceCreator) {
        start(surfaceCreator, null);
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void start(com.tencent.tav.decoder.IDecoderTrack.SurfaceCreator surfaceCreator, com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        if (this.segments.size() == 0) {
            release();
            return;
        }
        this.isReleased = false;
        this.decoderThread.start();
        this.started = true;
        this.segmentIndex = -1;
        clipRangeAndRemoveRange(cMTimeRange);
        nextSegment(true);
    }
}
