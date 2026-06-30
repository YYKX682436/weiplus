package org.webrtc.audio;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public class WebRtcAudioTrack {
    private static final int AUDIO_TRACK_START = 0;
    private static final int AUDIO_TRACK_STOP = 1;
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final int DEFAULT_USAGE = getDefaultUsageAttribute();
    private static final java.lang.String TAG = "WebRtcAudioTrackExternal";
    private final android.media.AudioAttributes audioAttributes;
    private final android.media.AudioManager audioManager;
    private org.webrtc.audio.WebRtcAudioTrack.AudioTrackThread audioThread;
    private android.media.AudioTrack audioTrack;
    private java.nio.ByteBuffer byteBuffer;
    private final android.content.Context context;
    private byte[] emptyBytes;
    private final org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback errorCallback;
    private int initialBufferSizeInFrames;
    private long nativeAudioTrack;
    private volatile boolean speakerMute;
    private final org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStateCallback stateCallback;
    private final org.webrtc.ThreadUtils.ThreadChecker threadChecker;
    private boolean useLowLatency;
    private final org.webrtc.audio.VolumeLogger volumeLogger;

    /* loaded from: classes15.dex */
    public class AudioTrackThread extends java.lang.Thread {
        private org.webrtc.audio.LowLatencyAudioBufferManager bufferManager;
        private volatile boolean keepAlive;

        public AudioTrackThread(java.lang.String str) {
            super(str);
            this.keepAlive = true;
            this.bufferManager = new org.webrtc.audio.LowLatencyAudioBufferManager();
        }

        private int writeBytes(android.media.AudioTrack audioTrack, java.nio.ByteBuffer byteBuffer, int i17) {
            return audioTrack.write(byteBuffer, i17, 0);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            android.os.Process.setThreadPriority(-19);
            org.webrtc.Logging.d(org.webrtc.audio.WebRtcAudioTrack.TAG, "AudioTrackThread" + org.webrtc.audio.WebRtcAudioUtils.getThreadInfo());
            org.webrtc.audio.WebRtcAudioTrack.assertTrue(org.webrtc.audio.WebRtcAudioTrack.this.audioTrack.getPlayState() == 3);
            org.webrtc.audio.WebRtcAudioTrack.this.doAudioTrackStateCallback(0);
            int capacity = org.webrtc.audio.WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                org.webrtc.audio.WebRtcAudioTrack.nativeGetPlayoutData(org.webrtc.audio.WebRtcAudioTrack.this.nativeAudioTrack, capacity);
                org.webrtc.audio.WebRtcAudioTrack.assertTrue(capacity <= org.webrtc.audio.WebRtcAudioTrack.this.byteBuffer.remaining());
                if (org.webrtc.audio.WebRtcAudioTrack.this.speakerMute) {
                    org.webrtc.audio.WebRtcAudioTrack.this.byteBuffer.clear();
                    org.webrtc.audio.WebRtcAudioTrack.this.byteBuffer.put(org.webrtc.audio.WebRtcAudioTrack.this.emptyBytes);
                    org.webrtc.audio.WebRtcAudioTrack.this.byteBuffer.position(0);
                }
                int writeBytes = writeBytes(org.webrtc.audio.WebRtcAudioTrack.this.audioTrack, org.webrtc.audio.WebRtcAudioTrack.this.byteBuffer, capacity);
                if (writeBytes != capacity) {
                    org.webrtc.Logging.e(org.webrtc.audio.WebRtcAudioTrack.TAG, "AudioTrack.write played invalid number of bytes: " + writeBytes);
                    if (writeBytes < 0) {
                        this.keepAlive = false;
                        org.webrtc.audio.WebRtcAudioTrack.this.reportWebRtcAudioTrackError("AudioTrack.write failed: " + writeBytes);
                    }
                }
                if (org.webrtc.audio.WebRtcAudioTrack.this.useLowLatency) {
                    this.bufferManager.maybeAdjustBufferSize(org.webrtc.audio.WebRtcAudioTrack.this.audioTrack);
                }
                org.webrtc.audio.WebRtcAudioTrack.this.byteBuffer.rewind();
            }
        }

        public void stopThread() {
            org.webrtc.Logging.d(org.webrtc.audio.WebRtcAudioTrack.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    public WebRtcAudioTrack(android.content.Context context, android.media.AudioManager audioManager) {
        this(context, audioManager, null, null, null, false);
    }

    private int GetPlayoutUnderrunCount() {
        android.media.AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            return audioTrack.getUnderrunCount();
        }
        return -1;
    }

    private static android.media.AudioAttributes.Builder applyAttributesOnQOrHigher(android.media.AudioAttributes.Builder builder, android.media.AudioAttributes audioAttributes) {
        return builder.setAllowedCapturePolicy(audioAttributes.getAllowedCapturePolicy());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertTrue(boolean z17) {
        if (!z17) {
            throw new java.lang.AssertionError("Expected condition to be true");
        }
    }

    private int channelCountToConfiguration(int i17) {
        return i17 == 1 ? 4 : 12;
    }

    private static android.media.AudioTrack createAudioTrackOnLollipopOrHigher(int i17, int i18, int i19, android.media.AudioAttributes audioAttributes) {
        org.webrtc.Logging.d(TAG, "createAudioTrackOnLollipopOrHigher");
        logNativeOutputSampleRate(i17);
        return new android.media.AudioTrack(getAudioAttributes(audioAttributes), new android.media.AudioFormat.Builder().setEncoding(2).setSampleRate(i17).setChannelMask(i18).build(), i19, 1, 0);
    }

    private static android.media.AudioTrack createAudioTrackOnLowerThanLollipop(int i17, int i18, int i19) {
        return new android.media.AudioTrack(0, i17, i18, 2, i19, 1);
    }

    private static android.media.AudioTrack createAudioTrackOnOreoOrHigher(int i17, int i18, int i19, android.media.AudioAttributes audioAttributes) {
        org.webrtc.Logging.d(TAG, "createAudioTrackOnOreoOrHigher");
        logNativeOutputSampleRate(i17);
        return new android.media.AudioTrack.Builder().setAudioAttributes(getAudioAttributes(audioAttributes)).setAudioFormat(new android.media.AudioFormat.Builder().setEncoding(2).setSampleRate(i17).setChannelMask(i18).build()).setBufferSizeInBytes(i19).setPerformanceMode(1).setTransferMode(1).setSessionId(0).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doAudioTrackStateCallback(int i17) {
        org.webrtc.Logging.d(TAG, "doAudioTrackStateCallback: " + i17);
        org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback = this.stateCallback;
        if (audioTrackStateCallback != null) {
            if (i17 == 0) {
                audioTrackStateCallback.onWebRtcAudioTrackStart();
            } else if (i17 == 1) {
                audioTrackStateCallback.onWebRtcAudioTrackStop();
            } else {
                org.webrtc.Logging.e(TAG, "Invalid audio state");
            }
        }
    }

    private static android.media.AudioAttributes getAudioAttributes(android.media.AudioAttributes audioAttributes) {
        android.media.AudioAttributes.Builder contentType = new android.media.AudioAttributes.Builder().setUsage(DEFAULT_USAGE).setContentType(1);
        if (audioAttributes != null) {
            if (audioAttributes.getUsage() != 0) {
                contentType.setUsage(audioAttributes.getUsage());
            }
            if (audioAttributes.getContentType() != 0) {
                contentType.setContentType(audioAttributes.getContentType());
            }
            contentType.setFlags(audioAttributes.getFlags());
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                contentType = applyAttributesOnQOrHigher(contentType, audioAttributes);
            }
        }
        return contentType.build();
    }

    private int getBufferSizeInFrames() {
        return this.audioTrack.getBufferSizeInFrames();
    }

    private static int getDefaultUsageAttribute() {
        return 2;
    }

    private int getInitialBufferSizeInFrames() {
        return this.initialBufferSizeInFrames;
    }

    private int getStreamMaxVolume() {
        this.threadChecker.checkIsOnValidThread();
        org.webrtc.Logging.d(TAG, "getStreamMaxVolume");
        return this.audioManager.getStreamMaxVolume(0);
    }

    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        org.webrtc.Logging.d(TAG, "getStreamVolume");
        return this.audioManager.getStreamVolume(0);
    }

    private int initPlayout(int i17, int i18, double d17) {
        this.threadChecker.checkIsOnValidThread();
        org.webrtc.Logging.d(TAG, "initPlayout(sampleRate=" + i17 + ", channels=" + i18 + ", bufferSizeFactor=" + d17 + ")");
        this.byteBuffer = java.nio.ByteBuffer.allocateDirect(i18 * 2 * (i17 / 100));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("byteBuffer.capacity: ");
        sb6.append(this.byteBuffer.capacity());
        org.webrtc.Logging.d(TAG, sb6.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.nativeAudioTrack, this.byteBuffer);
        int channelCountToConfiguration = channelCountToConfiguration(i18);
        int minBufferSize = (int) (android.media.AudioTrack.getMinBufferSize(i17, channelCountToConfiguration, 2) * d17);
        org.webrtc.Logging.d(TAG, "minBufferSizeInBytes: " + minBufferSize);
        if (minBufferSize < this.byteBuffer.capacity()) {
            reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
            return -1;
        }
        if (d17 > 1.0d) {
            this.useLowLatency = false;
        }
        if (this.audioTrack != null) {
            reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
            return -1;
        }
        try {
            if (!this.useLowLatency || android.os.Build.VERSION.SDK_INT < 26) {
                this.audioTrack = createAudioTrackOnLollipopOrHigher(i17, channelCountToConfiguration, minBufferSize, this.audioAttributes);
            } else {
                this.audioTrack = createAudioTrackOnOreoOrHigher(i17, channelCountToConfiguration, minBufferSize, this.audioAttributes);
            }
            android.media.AudioTrack audioTrack = this.audioTrack;
            if (audioTrack == null || audioTrack.getState() != 1) {
                reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                releaseAudioResources();
                return -1;
            }
            this.initialBufferSizeInFrames = this.audioTrack.getBufferSizeInFrames();
            logMainParameters();
            logMainParametersExtended();
            return minBufferSize;
        } catch (java.lang.IllegalArgumentException e17) {
            reportWebRtcAudioTrackInitError(e17.getMessage());
            releaseAudioResources();
            return -1;
        }
    }

    private boolean isVolumeFixed() {
        return this.audioManager.isVolumeFixed();
    }

    private void logBufferCapacityInFrames() {
        org.webrtc.Logging.d(TAG, "AudioTrack: buffer capacity in frames: " + this.audioTrack.getBufferCapacityInFrames());
    }

    private void logBufferSizeInFrames() {
        org.webrtc.Logging.d(TAG, "AudioTrack: buffer size in frames: " + this.audioTrack.getBufferSizeInFrames());
    }

    private void logMainParameters() {
        org.webrtc.Logging.d(TAG, "AudioTrack: session ID: " + this.audioTrack.getAudioSessionId() + ", channels: " + this.audioTrack.getChannelCount() + ", sample rate: " + this.audioTrack.getSampleRate() + ", max gain: " + android.media.AudioTrack.getMaxVolume());
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    private static void logNativeOutputSampleRate(int i17) {
        int nativeOutputSampleRate = android.media.AudioTrack.getNativeOutputSampleRate(0);
        org.webrtc.Logging.d(TAG, "nativeOutputSampleRate: " + nativeOutputSampleRate);
        if (i17 != nativeOutputSampleRate) {
            org.webrtc.Logging.w(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
    }

    private void logUnderrunCount() {
        org.webrtc.Logging.d(TAG, "underrun count: " + this.audioTrack.getUnderrunCount());
    }

    private static native void nativeCacheDirectBufferAddress(long j17, java.nio.ByteBuffer byteBuffer);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeGetPlayoutData(long j17, int i17);

    private void releaseAudioResources() {
        org.webrtc.Logging.d(TAG, "releaseAudioResources");
        android.media.AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioTrackError(java.lang.String str) {
        org.webrtc.Logging.e(TAG, "Run-time playback error: " + str);
        org.webrtc.audio.WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(java.lang.String str) {
        org.webrtc.Logging.e(TAG, "Init playout error: " + str);
        org.webrtc.audio.WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, java.lang.String str) {
        org.webrtc.Logging.e(TAG, "Start playout error: " + audioTrackStartErrorCode + ". " + str);
        org.webrtc.audio.WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    private boolean setStreamVolume(int i17) {
        this.threadChecker.checkIsOnValidThread();
        org.webrtc.Logging.d(TAG, "setStreamVolume(" + i17 + ")");
        if (isVolumeFixed()) {
            org.webrtc.Logging.e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, i17, 0);
        return true;
    }

    private boolean startPlayout() {
        this.threadChecker.checkIsOnValidThread();
        this.volumeLogger.start();
        org.webrtc.Logging.d(TAG, "startPlayout");
        assertTrue(this.audioTrack != null);
        assertTrue(this.audioThread == null);
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() == 3) {
                org.webrtc.audio.WebRtcAudioTrack.AudioTrackThread audioTrackThread = new org.webrtc.audio.WebRtcAudioTrack.AudioTrackThread("AudioTrackJavaThread");
                this.audioThread = audioTrackThread;
                audioTrackThread.start();
                return true;
            }
            reportWebRtcAudioTrackStartError(org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, "AudioTrack.play failed - incorrect state :" + this.audioTrack.getPlayState());
            releaseAudioResources();
            return false;
        } catch (java.lang.IllegalStateException e17) {
            reportWebRtcAudioTrackStartError(org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, "AudioTrack.play failed: " + e17.getMessage());
            releaseAudioResources();
            return false;
        }
    }

    private boolean stopPlayout() {
        this.threadChecker.checkIsOnValidThread();
        this.volumeLogger.stop();
        org.webrtc.Logging.d(TAG, "stopPlayout");
        assertTrue(this.audioThread != null);
        logUnderrunCount();
        this.audioThread.stopThread();
        org.webrtc.Logging.d(TAG, "Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!org.webrtc.ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
            org.webrtc.Logging.e(TAG, "Join of AudioTrackThread timed out.");
            org.webrtc.audio.WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        }
        org.webrtc.Logging.d(TAG, "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        if (this.audioTrack != null) {
            org.webrtc.Logging.d(TAG, "Calling AudioTrack.stop...");
            try {
                this.audioTrack.stop();
                org.webrtc.Logging.d(TAG, "AudioTrack.stop is done.");
                doAudioTrackStateCallback(1);
            } catch (java.lang.IllegalStateException e17) {
                org.webrtc.Logging.e(TAG, "AudioTrack.stop failed: " + e17.getMessage());
            }
        }
        releaseAudioResources();
        return true;
    }

    public void setNativeAudioTrack(long j17) {
        this.nativeAudioTrack = j17;
    }

    public void setSpeakerMute(boolean z17) {
        org.webrtc.Logging.w(TAG, "setSpeakerMute(" + z17 + ")");
        this.speakerMute = z17;
    }

    public WebRtcAudioTrack(android.content.Context context, android.media.AudioManager audioManager, android.media.AudioAttributes audioAttributes, org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback, org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback, boolean z17) {
        org.webrtc.ThreadUtils.ThreadChecker threadChecker = new org.webrtc.ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        threadChecker.detachThread();
        this.context = context;
        this.audioManager = audioManager;
        this.audioAttributes = audioAttributes;
        this.errorCallback = audioTrackErrorCallback;
        this.stateCallback = audioTrackStateCallback;
        this.volumeLogger = new org.webrtc.audio.VolumeLogger(audioManager);
        this.useLowLatency = z17;
        org.webrtc.Logging.d(TAG, "ctor" + org.webrtc.audio.WebRtcAudioUtils.getThreadInfo());
    }
}
