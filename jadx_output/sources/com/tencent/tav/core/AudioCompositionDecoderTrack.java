package com.tencent.tav.core;

/* loaded from: classes16.dex */
public class AudioCompositionDecoderTrack implements com.tencent.tav.decoder.IDecoderTrack {
    private static final java.lang.String TAG = "AudioCompositionDecoder";
    private com.tencent.tav.coremedia.CMSampleBuffer _lastReadAudioBuffer;
    private java.util.HashMap<java.lang.Integer, com.tencent.tav.core.AudioCompositor> audioCompositorMap;
    private com.tencent.tav.decoder.AudioInfo audioInfo;
    private com.tencent.tav.core.AudioMix audioMix;
    private java.util.List<com.tencent.tav.asset.AssetTrack> audioTracks;
    private com.tencent.tav.codec.IDecoderFactory decoderFactory;
    private boolean decoderStarted;
    private final com.tencent.tav.core.AudioCompositionDecoderTrack.DecoderThread decoderThread;
    private java.util.ArrayList<com.tencent.tav.decoder.AudioDecoderTrack> decoderTrackList;
    public com.tencent.tav.decoder.logger.WXLogger logger;
    private com.tencent.tav.decoder.AudioMixer mAudioMixer;
    private float rate;
    private float volume;

    /* loaded from: classes16.dex */
    public class DecoderThread extends com.tencent.tav.decoder.thread.ReActionHandlerThread {
        private static final java.lang.String NAME = "AudioDecoderThread";
        private final java.lang.Object nextFrameDecoderLock;
        private com.tencent.tav.coremedia.CMSampleBuffer pcmFrame;

        public DecoderThread() {
            super(NAME);
            this.nextFrameDecoderLock = new java.lang.Object();
        }

        @Override // com.tencent.tav.decoder.thread.ReActionHandlerThread
        public void doAction() {
            synchronized (this.nextFrameDecoderLock) {
                com.tencent.tav.decoder.logger.Logger.v(com.tencent.tav.core.AudioCompositionDecoderTrack.TAG, "doAction: start ");
                com.tencent.tav.coremedia.CMSampleBuffer doReadSample = com.tencent.tav.core.AudioCompositionDecoderTrack.this.doReadSample();
                this.pcmFrame = doReadSample;
                if (doReadSample.getSampleByteBuffer() != null) {
                    com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer = this.pcmFrame;
                    cMSampleBuffer.setSampleByteBuffer(com.tencent.tav.core.AudioCompositionDecoderTrack.this.processFrame(cMSampleBuffer.getSampleByteBuffer(), com.tencent.tav.core.AudioCompositionDecoderTrack.this.volume, com.tencent.tav.core.AudioCompositionDecoderTrack.this.rate, com.tencent.tav.core.AudioCompositionDecoderTrack.this.audioInfo));
                }
                com.tencent.tav.decoder.logger.Logger.v(com.tencent.tav.core.AudioCompositionDecoderTrack.TAG, "doAction: finish ");
            }
        }

        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
        }
    }

    public AudioCompositionDecoderTrack(java.util.List<com.tencent.tav.asset.AssetTrack> list, int i17) {
        this(list, i17, null);
    }

    private com.tencent.tav.decoder.DecoderTrackSegment createDecoderTrackSegment(com.tencent.tav.asset.AssetTrack assetTrack, com.tencent.tav.asset.AssetTrackSegment assetTrackSegment) {
        com.tencent.tav.decoder.DecoderAssetTrack decoderAssetTrack;
        if (assetTrackSegment.isEmpty()) {
            decoderAssetTrack = null;
        } else {
            decoderAssetTrack = new com.tencent.tav.decoder.DecoderAssetTrack();
            decoderAssetTrack.assetPath = assetTrack.getSourcePath();
            decoderAssetTrack.trackId = assetTrack.getTrackID();
            decoderAssetTrack.mediaType = assetTrack.getMediaType();
            decoderAssetTrack.size = assetTrack.getNaturalSize();
            decoderAssetTrack.preferredTransform = assetTrack.getPreferredTransform();
            decoderAssetTrack.preferredVolume = assetTrack.getPreferredVolume();
            decoderAssetTrack.frameRate = (int) assetTrack.getNominalFrameRate();
        }
        com.tencent.tav.coremedia.CMTimeRange source = assetTrackSegment.getTimeMapping().getSource();
        com.tencent.tav.decoder.DecoderTrackSegment decoderTrackSegment = new com.tencent.tav.decoder.DecoderTrackSegment(new com.tencent.tav.coremedia.CMTimeRange(source.getStart(), source.getDuration()), decoderAssetTrack);
        decoderTrackSegment.setScaledDuration(assetTrackSegment.getScaleDuration());
        return decoderTrackSegment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized com.tencent.tav.coremedia.CMSampleBuffer doReadSample() {
        com.tencent.tav.coremedia.CMTime cMTime;
        com.tencent.tav.decoder.logger.Logger.v(TAG, "doReadSample: start ");
        if (this.decoderTrackList.isEmpty()) {
            com.tencent.tav.decoder.logger.Logger.e(TAG, "doReadSample:[finish] decoderTrackList.isEmpty ");
            return new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-100L));
        }
        com.tencent.tav.decoder.AudioDecoderTrack audioDecoderTrack = this.decoderTrackList.get(0);
        com.tencent.tav.coremedia.CMSampleBuffer readSample = audioDecoderTrack.readSample();
        if (readSample.getState().getStateCode() < -1) {
            com.tencent.tav.decoder.logger.Logger.e(TAG, "doReadSample:[failed]");
            return readSample;
        }
        this._lastReadAudioBuffer = readSample;
        java.nio.ByteBuffer sampleByteBuffer = readSample.getSampleByteBuffer();
        if (this._lastReadAudioBuffer.getSampleByteBuffer() == null) {
            sampleByteBuffer = audioDecoderTrack.getEmptyAudioBuffer();
        }
        if (sampleByteBuffer != null) {
            sampleByteBuffer.position(0);
        }
        com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer = new com.tencent.tav.coremedia.CMSampleBuffer(this._lastReadAudioBuffer.getTime(), sampleByteBuffer);
        int size = this.decoderTrackList.size() - 1;
        while (true) {
            cMTime = null;
            if (size <= 0) {
                break;
            }
            com.tencent.tav.decoder.AudioDecoderTrack audioDecoderTrack2 = this.decoderTrackList.get(size);
            com.tencent.tav.core.AudioCompositor audioCompositor = this.audioCompositorMap.get(java.lang.Integer.valueOf(audioDecoderTrack2.getTrackID()));
            if (audioCompositor != null) {
                com.tencent.tav.decoder.logger.Logger.v(TAG, "doReadSample: readMergeSample " + size);
                com.tencent.tav.core.AudioMix audioMix = this.audioMix;
                cMSampleBuffer = audioCompositor.readMergeSample(audioDecoderTrack2, audioMix != null ? audioMix.getInputParametersWithTrackID(audioDecoderTrack2.getTrackID()) : null, cMSampleBuffer);
                com.tencent.tav.decoder.logger.Logger.v(TAG, "doReadSample: readMergeSample finish " + size);
                if (cMSampleBuffer != null && cMSampleBuffer.getState().getStateCode() < -1) {
                    break;
                }
            } else {
                com.tencent.tav.decoder.logger.Logger.e(TAG, "doReadSample: audioCompositorMap.get(decoderTrack.getTrackID(), return null!");
            }
            size--;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("doReadSample:[success]  ");
        if (cMSampleBuffer != null) {
            cMTime = cMSampleBuffer.getTime();
        }
        sb6.append(cMTime);
        com.tencent.tav.decoder.logger.Logger.v(TAG, sb6.toString());
        return cMSampleBuffer;
    }

    private void initAudioDecodeTracks(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        if (this.audioTracks == null) {
            return;
        }
        synchronized (this) {
            this.decoderTrackList.clear();
        }
        com.tencent.tav.decoder.AudioDecoderTrack audioDecoderTrack = new com.tencent.tav.decoder.AudioDecoderTrack();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(createDecoderTrackSegment((com.tencent.tav.asset.AssetTrack) null, new com.tencent.tav.asset.CompositionTrackSegment(new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, cMTimeRange == null ? getDuration() : cMTimeRange.getDuration()))));
        audioDecoderTrack.setTrackID(0);
        audioDecoderTrack.setTrackSegments(arrayList);
        audioDecoderTrack.setVolume(0.0f);
        audioDecoderTrack.setDecodeType(com.tencent.tav.decoder.IDecoder.DecodeType.Audio);
        audioDecoderTrack.setAudioInfo(this.audioInfo);
        this.decoderTrackList.add(audioDecoderTrack);
        for (com.tencent.tav.asset.AssetTrack assetTrack : this.audioTracks) {
            if (assetTrack.getMediaType() == 2) {
                com.tencent.tav.decoder.AudioDecoderTrack audioDecoderTrack2 = new com.tencent.tav.decoder.AudioDecoderTrack(this.decoderFactory);
                com.tencent.tav.core.AudioCompositor audioCompositor = new com.tencent.tav.core.AudioCompositor(this.audioInfo);
                java.util.List<com.tencent.tav.asset.AssetTrackSegment> segments = assetTrack.getSegments();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (com.tencent.tav.asset.AssetTrackSegment assetTrackSegment : segments) {
                    if (assetTrackSegment instanceof com.tencent.tav.asset.CompositionTrackSegment) {
                        arrayList2.add(createDecoderTrackSegment(assetTrack, (com.tencent.tav.asset.CompositionTrackSegment) assetTrackSegment));
                    } else {
                        arrayList2.add(createDecoderTrackSegment(assetTrack, assetTrackSegment));
                    }
                }
                audioDecoderTrack2.setTrackID(assetTrack.getTrackID());
                audioDecoderTrack2.setTrackSegments(arrayList2);
                audioDecoderTrack2.setFrameRate((int) assetTrack.getNominalFrameRate());
                audioDecoderTrack2.setVolume(assetTrack.getPreferredVolume());
                audioDecoderTrack2.setDecodeType(com.tencent.tav.decoder.IDecoder.DecodeType.Audio);
                audioDecoderTrack2.setAudioInfo(this.audioInfo);
                if (assetTrack.getTimeRange() != null) {
                    audioDecoderTrack2.clipRangeAndClearRange(new com.tencent.tav.coremedia.CMTimeRange(assetTrack.getTimeRange().getStart(), assetTrack.getTimeRange().getDuration()));
                }
                this.decoderTrackList.add(audioDecoderTrack2);
                this.audioCompositorMap.put(java.lang.Integer.valueOf(assetTrack.getTrackID()), audioCompositor);
            }
        }
    }

    private void initAudioMix() {
        java.util.List<com.tencent.tav.asset.AssetTrack> list = this.audioTracks;
        if (list == null || list.size() <= 0) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.tav.asset.AssetTrack assetTrack : this.audioTracks) {
            if (assetTrack != null) {
                com.tencent.tav.core.MutableAudioMixInputParameters mutableAudioMixInputParameters = new com.tencent.tav.core.MutableAudioMixInputParameters(assetTrack, null);
                mutableAudioMixInputParameters.setVolumeForTimeRange(assetTrack.getPreferredVolume(), assetTrack.getTimeRange());
                arrayList.add(mutableAudioMixInputParameters);
            }
        }
        this.audioMix = new com.tencent.tav.core.AudioMix(arrayList);
    }

    public synchronized void addTrack(com.tencent.tav.asset.AssetTrack assetTrack) {
        this.audioTracks.add(assetTrack);
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void asyncReadNextSample(com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tav.decoder.logger.Logger.v(TAG, "asyncReadNextSample: " + cMTime);
        if (this.decoderThread.pcmFrame == null) {
            synchronized (this.decoderThread.nextFrameDecoderLock) {
                if (this.decoderThread.pcmFrame == null) {
                    this.decoderThread.action();
                }
            }
        }
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void clipRangeAndClearRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMTime getCurrentSampleTime() {
        return this.decoderTrackList.get(0).getCurrentSampleTime();
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.report.AverageTimeReporter getDecodePerformance() {
        return null;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMTime getDuration() {
        com.tencent.tav.coremedia.CMTime cMTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        java.util.Iterator<com.tencent.tav.asset.AssetTrack> it = this.audioTracks.iterator();
        while (it.hasNext()) {
            com.tencent.tav.coremedia.CMTime duration = it.next().getDuration();
            if (duration.bigThan(cMTime)) {
                cMTime = duration;
            }
        }
        return cMTime;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMTime getFrameDuration() {
        return com.tencent.tav.coremedia.CMTime.CMTimeZero;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public int getFrameRate() {
        return 0;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public long getLaggingTime() {
        return 0L;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public int getTrackId() {
        return 0;
    }

    public synchronized java.nio.ByteBuffer processFrame(java.nio.ByteBuffer byteBuffer, float f17, float f18, com.tencent.tav.decoder.AudioInfo audioInfo) {
        this.mAudioMixer.setAudioInfo(audioInfo.sampleRate, audioInfo.channelCount, audioInfo.pcmEncoding);
        return this.mAudioMixer.processBytes(byteBuffer, f18, f17, 1.0f);
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMSampleBuffer readSample() {
        if (this.decoderTrackList.size() == 0) {
            return new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-100L));
        }
        synchronized (this.decoderThread.nextFrameDecoderLock) {
            if (this.decoderThread.pcmFrame != null) {
                com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer = this.decoderThread.pcmFrame;
                this.decoderThread.pcmFrame = null;
                return cMSampleBuffer;
            }
            com.tencent.tav.coremedia.CMSampleBuffer doReadSample = doReadSample();
            if (doReadSample != null && doReadSample.getSampleByteBuffer() != null) {
                doReadSample.setSampleByteBuffer(processFrame(doReadSample.getSampleByteBuffer(), this.volume, this.rate, this.audioInfo));
            }
            return doReadSample;
        }
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public synchronized void release() {
        com.tencent.tav.decoder.logger.Logger.d(TAG, "release: " + this);
        java.util.Iterator<com.tencent.tav.decoder.AudioDecoderTrack> it = this.decoderTrackList.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        this.decoderTrackList.clear();
        this.audioTracks.clear();
        this.decoderThread.release();
        com.tencent.tav.decoder.logger.Logger.d(TAG, "release: finish" + this);
    }

    public synchronized void removeTrack(com.tencent.tav.asset.AssetTrack assetTrack) {
        this.audioTracks.remove(assetTrack);
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMSampleBuffer seekTo(com.tencent.tav.coremedia.CMTime cMTime, boolean z17, boolean z18) {
        com.tencent.tav.decoder.logger.Logger.v(TAG, "seekTo:[timeUs " + cMTime + "] [needRead " + z17 + "] [quickSeek " + z18 + "]");
        synchronized (this.decoderThread.nextFrameDecoderLock) {
            this.decoderThread.pcmFrame = null;
        }
        java.util.Iterator<com.tencent.tav.decoder.AudioDecoderTrack> it = this.decoderTrackList.iterator();
        while (it.hasNext()) {
            com.tencent.tav.decoder.AudioDecoderTrack next = it.next();
            com.tencent.tav.decoder.logger.Logger.v(TAG, "seekTo: " + next);
            next.seekTo(cMTime, false, z18);
        }
        synchronized (this) {
            this._lastReadAudioBuffer = null;
            java.util.Iterator<com.tencent.tav.core.AudioCompositor> it6 = this.audioCompositorMap.values().iterator();
            while (it6.hasNext()) {
                it6.next().clear();
            }
        }
        return null;
    }

    public void setAudioInfo(com.tencent.tav.decoder.AudioInfo audioInfo) {
        this.audioInfo = audioInfo.m416clone();
        this.mAudioMixer = new com.tencent.tav.decoder.AudioMixer(audioInfo.sampleRate, audioInfo.channelCount);
        java.util.Iterator<com.tencent.tav.decoder.AudioDecoderTrack> it = this.decoderTrackList.iterator();
        while (it.hasNext()) {
            it.next().setAudioInfo(audioInfo);
        }
        java.util.Iterator<com.tencent.tav.core.AudioCompositor> it6 = this.audioCompositorMap.values().iterator();
        while (it6.hasNext()) {
            it6.next().setAudioInfo(audioInfo);
        }
    }

    public void setAudioMix(com.tencent.tav.core.AudioMix audioMix) {
        this.audioMix = audioMix;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void setDecodeType(com.tencent.tav.decoder.IDecoder.DecodeType decodeType) {
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void setFrameRate(int i17) {
        java.util.Iterator<com.tencent.tav.decoder.AudioDecoderTrack> it = this.decoderTrackList.iterator();
        while (it.hasNext()) {
            it.next().setFrameRate(i17);
        }
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void setLogger(com.tencent.tav.decoder.logger.WXLogger wXLogger) {
    }

    public void setRate(float f17) {
        this.rate = f17;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void setTrackSegments(java.util.List<com.tencent.tav.decoder.DecoderTrackSegment> list) {
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void setVolume(float f17) {
        java.util.List<com.tencent.tav.core.AudioMixInputParameters> inputParameters;
        com.tencent.tav.decoder.logger.Logger.i(TAG, "setVolume: " + f17);
        com.tencent.tav.core.AudioMix audioMix = this.audioMix;
        if (audioMix != null && (inputParameters = audioMix.getInputParameters()) != null) {
            for (com.tencent.tav.core.AudioMixInputParameters audioMixInputParameters : inputParameters) {
                if (audioMixInputParameters != null && (audioMixInputParameters instanceof com.tencent.tav.core.MutableAudioMixInputParameters)) {
                    ((com.tencent.tav.core.MutableAudioMixInputParameters) audioMixInputParameters).setVolumeForTimeRange(f17);
                }
            }
        }
        this.volume = f17;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void start() {
        start(null);
    }

    public AudioCompositionDecoderTrack(java.util.List<com.tencent.tav.asset.AssetTrack> list, int i17, com.tencent.tav.codec.IDecoderFactory iDecoderFactory) {
        this.audioTracks = new java.util.ArrayList();
        this.decoderTrackList = new java.util.ArrayList<>();
        this.audioCompositorMap = new java.util.HashMap<>();
        this.volume = 1.0f;
        this.rate = 1.0f;
        this.decoderStarted = false;
        this.decoderThread = new com.tencent.tav.core.AudioCompositionDecoderTrack.DecoderThread();
        this.mAudioMixer = new com.tencent.tav.decoder.AudioMixer();
        this.audioInfo = new com.tencent.tav.decoder.AudioInfo();
        this.logger = new com.tencent.tav.decoder.logger.WXLogger();
        this.decoderFactory = iDecoderFactory;
        this.audioTracks = list;
        initAudioDecodeTracks(null);
        initAudioMix();
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void start(com.tencent.tav.decoder.IDecoderTrack.SurfaceCreator surfaceCreator) {
        start(surfaceCreator, null);
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void start(com.tencent.tav.decoder.IDecoderTrack.SurfaceCreator surfaceCreator, com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        int i17;
        com.tencent.tav.decoder.logger.Logger.d(TAG, "start: " + cMTimeRange);
        if (this.decoderStarted) {
            return;
        }
        com.tencent.tav.decoder.logger.Logger.d(TAG, "start: " + this);
        this.decoderThread.start();
        initAudioDecodeTracks(cMTimeRange);
        this.decoderStarted = true;
        com.tencent.tav.coremedia.CMTimeRange cMTimeRange2 = null;
        for (int i18 = 0; i18 < this.decoderTrackList.size(); i18++) {
            if (i18 > 0 && i18 - 1 < this.audioTracks.size()) {
                com.tencent.tav.asset.AssetTrack assetTrack = this.audioTracks.get(i17);
                if (assetTrack != null && assetTrack.getTimeRange() != null) {
                    cMTimeRange2 = new com.tencent.tav.coremedia.CMTimeRange(assetTrack.getTimeRange().getStart(), assetTrack.getTimeRange().getDuration());
                }
            } else {
                cMTimeRange2 = new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, getDuration());
            }
            this.decoderTrackList.get(i18).start(null, cMTimeRange2);
        }
    }

    private com.tencent.tav.decoder.DecoderTrackSegment createDecoderTrackSegment(com.tencent.tav.asset.AssetTrack assetTrack, com.tencent.tav.asset.CompositionTrackSegment compositionTrackSegment) {
        com.tencent.tav.decoder.DecoderAssetTrack decoderAssetTrack;
        if (compositionTrackSegment.isEmpty()) {
            decoderAssetTrack = null;
        } else {
            decoderAssetTrack = new com.tencent.tav.decoder.DecoderAssetTrack();
            decoderAssetTrack.trackId = compositionTrackSegment.getSourceTrackID();
            decoderAssetTrack.mediaType = assetTrack.getMediaType();
            decoderAssetTrack.assetPath = compositionTrackSegment.getSourcePath();
            decoderAssetTrack.preferredTransform = assetTrack.getPreferredTransform();
            decoderAssetTrack.size = assetTrack.getNaturalSize();
            decoderAssetTrack.frameRate = (int) assetTrack.getNominalFrameRate();
            decoderAssetTrack.preferredVolume = assetTrack.getPreferredVolume();
        }
        com.tencent.tav.coremedia.CMTimeRange source = compositionTrackSegment.getTimeMapping().getSource();
        com.tencent.tav.decoder.DecoderTrackSegment decoderTrackSegment = new com.tencent.tav.decoder.DecoderTrackSegment(new com.tencent.tav.coremedia.CMTimeRange(source.getStart(), source.getDuration()), decoderAssetTrack);
        decoderTrackSegment.setScaledDuration(compositionTrackSegment.getScaleDuration());
        return decoderTrackSegment;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMSampleBuffer readSample(com.tencent.tav.coremedia.CMTime cMTime) {
        return readSample();
    }

    public AudioCompositionDecoderTrack(int i17) {
        this(i17, (com.tencent.tav.codec.IDecoderFactory) null);
    }

    public AudioCompositionDecoderTrack(int i17, com.tencent.tav.codec.IDecoderFactory iDecoderFactory) {
        this.audioTracks = new java.util.ArrayList();
        this.decoderTrackList = new java.util.ArrayList<>();
        this.audioCompositorMap = new java.util.HashMap<>();
        this.volume = 1.0f;
        this.rate = 1.0f;
        this.decoderStarted = false;
        this.decoderThread = new com.tencent.tav.core.AudioCompositionDecoderTrack.DecoderThread();
        this.mAudioMixer = new com.tencent.tav.decoder.AudioMixer();
        this.audioInfo = new com.tencent.tav.decoder.AudioInfo();
        this.logger = new com.tencent.tav.decoder.logger.WXLogger();
        this.decoderFactory = iDecoderFactory;
        initAudioDecodeTracks(null);
        initAudioMix();
    }
}
