package org.webrtc.voiceengine;

/* loaded from: classes15.dex */
public class WebRtcAudioTrack {
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_CONTENT_TYPE = 2;
    private static final int DEFAULT_STREAM_TYPE = 3;
    private static final int DEFAULT_USAGE;
    private static final java.lang.String TAG = "WebRtcAudioTrack";
    private static org.webrtc.voiceengine.WebRtcAudioTrack.ErrorCallback errorCallback;
    private static org.webrtc.voiceengine.WebRtcAudioTrack.WebRtcAudioTrackErrorCallback errorCallbackOld;
    private static volatile boolean speakerMute;
    private static int usageAttribute;
    private final android.media.AudioManager audioManager;
    private org.webrtc.voiceengine.WebRtcAudioTrack.AudioTrackThread audioThread;
    private android.media.AudioTrack audioTrack;
    private java.nio.ByteBuffer byteBuffer;
    private byte[] emptyBytes;
    private final long nativeAudioTrack;
    private final org.webrtc.ThreadUtils.ThreadChecker threadChecker;

    /* loaded from: classes6.dex */
    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    /* loaded from: classes15.dex */
    public class AudioTrackThread extends java.lang.Thread {
        private volatile boolean keepAlive;

        public AudioTrackThread(java.lang.String str) {
            super(str);
            this.keepAlive = true;
        }

        private int writeBytes(android.media.AudioTrack audioTrack, java.nio.ByteBuffer byteBuffer, int i17) {
            return audioTrack.write(byteBuffer, i17, 0);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            android.os.Process.setThreadPriority(-19);
            org.webrtc.Logging.d(org.webrtc.voiceengine.WebRtcAudioTrack.TAG, "AudioTrackThread" + org.webrtc.voiceengine.WebRtcAudioUtils.getThreadInfo());
            org.webrtc.voiceengine.WebRtcAudioTrack.assertTrue(org.webrtc.voiceengine.WebRtcAudioTrack.this.audioTrack.getPlayState() == 3);
            int capacity = org.webrtc.voiceengine.WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                org.webrtc.voiceengine.WebRtcAudioTrack webRtcAudioTrack = org.webrtc.voiceengine.WebRtcAudioTrack.this;
                webRtcAudioTrack.nativeGetPlayoutData(capacity, webRtcAudioTrack.nativeAudioTrack);
                org.webrtc.voiceengine.WebRtcAudioTrack.assertTrue(capacity <= org.webrtc.voiceengine.WebRtcAudioTrack.this.byteBuffer.remaining());
                if (org.webrtc.voiceengine.WebRtcAudioTrack.speakerMute) {
                    org.webrtc.voiceengine.WebRtcAudioTrack.this.byteBuffer.clear();
                    org.webrtc.voiceengine.WebRtcAudioTrack.this.byteBuffer.put(org.webrtc.voiceengine.WebRtcAudioTrack.this.emptyBytes);
                    org.webrtc.voiceengine.WebRtcAudioTrack.this.byteBuffer.position(0);
                }
                int writeBytes = writeBytes(org.webrtc.voiceengine.WebRtcAudioTrack.this.audioTrack, org.webrtc.voiceengine.WebRtcAudioTrack.this.byteBuffer, capacity);
                if (writeBytes != capacity) {
                    org.webrtc.Logging.e(org.webrtc.voiceengine.WebRtcAudioTrack.TAG, "AudioTrack.write played invalid number of bytes: " + writeBytes);
                    if (writeBytes < 0) {
                        this.keepAlive = false;
                        org.webrtc.voiceengine.WebRtcAudioTrack.this.reportWebRtcAudioTrackError("AudioTrack.write failed: " + writeBytes);
                    }
                }
                org.webrtc.voiceengine.WebRtcAudioTrack.this.byteBuffer.rewind();
            }
            if (org.webrtc.voiceengine.WebRtcAudioTrack.this.audioTrack != null) {
                org.webrtc.Logging.d(org.webrtc.voiceengine.WebRtcAudioTrack.TAG, "Calling AudioTrack.stop...");
                try {
                    org.webrtc.voiceengine.WebRtcAudioTrack.this.audioTrack.stop();
                    org.webrtc.Logging.d(org.webrtc.voiceengine.WebRtcAudioTrack.TAG, "AudioTrack.stop is done.");
                } catch (java.lang.IllegalStateException e17) {
                    org.webrtc.Logging.e(org.webrtc.voiceengine.WebRtcAudioTrack.TAG, "AudioTrack.stop failed: " + e17.getMessage());
                }
            }
        }

        public void stopThread() {
            org.webrtc.Logging.d(org.webrtc.voiceengine.WebRtcAudioTrack.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    /* loaded from: classes15.dex */
    public interface ErrorCallback {
        void onWebRtcAudioTrackError(java.lang.String str);

        void onWebRtcAudioTrackInitError(java.lang.String str);

        void onWebRtcAudioTrackStartError(org.webrtc.voiceengine.WebRtcAudioTrack.AudioTrackStartErrorCode audioTrackStartErrorCode, java.lang.String str);
    }

    @java.lang.Deprecated
    /* loaded from: classes15.dex */
    public interface WebRtcAudioTrackErrorCallback {
        void onWebRtcAudioTrackError(java.lang.String str);

        void onWebRtcAudioTrackInitError(java.lang.String str);

        void onWebRtcAudioTrackStartError(java.lang.String str);
    }

    static {
        int defaultUsageAttribute = getDefaultUsageAttribute();
        DEFAULT_USAGE = defaultUsageAttribute;
        usageAttribute = defaultUsageAttribute;
    }

    public WebRtcAudioTrack(long j17) {
        org.webrtc.ThreadUtils.ThreadChecker threadChecker = new org.webrtc.ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        threadChecker.checkIsOnValidThread();
        org.webrtc.Logging.d(TAG, "ctor" + org.webrtc.voiceengine.WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioTrack = j17;
        this.audioManager = (android.media.AudioManager) org.webrtc.ContextUtils.getApplicationContext().getSystemService("audio");
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

    private static android.media.AudioTrack createAudioTrackOnLollipopOrHigher(int i17, int i18, int i19) {
        org.webrtc.Logging.d(TAG, "createAudioTrackOnLollipopOrHigher");
        int nativeOutputSampleRate = android.media.AudioTrack.getNativeOutputSampleRate(3);
        org.webrtc.Logging.d(TAG, "nativeOutputSampleRate: " + nativeOutputSampleRate);
        if (i17 != nativeOutputSampleRate) {
            org.webrtc.Logging.w(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
        if (usageAttribute != DEFAULT_USAGE) {
            org.webrtc.Logging.w(TAG, "A non default usage attribute is used: " + usageAttribute);
        }
        return new android.media.AudioTrack(new android.media.AudioAttributes.Builder().setUsage(usageAttribute).setContentType(2).build(), new android.media.AudioFormat.Builder().setEncoding(2).setSampleRate(i17).setChannelMask(i18).build(), i19, 1, 0);
    }

    private static android.media.AudioTrack createAudioTrackOnLowerThanLollipop(int i17, int i18, int i19) {
        return new android.media.AudioTrack(3, i17, i18, 2, i19, 1);
    }

    private int getBufferSizeInFrames() {
        return this.audioTrack.getBufferSizeInFrames();
    }

    private static int getDefaultUsageAttribute() {
        return 1;
    }

    private int getStreamMaxVolume() {
        this.threadChecker.checkIsOnValidThread();
        org.webrtc.Logging.d(TAG, "getStreamMaxVolume");
        assertTrue(this.audioManager != null);
        return this.audioManager.getStreamMaxVolume(3);
    }

    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        org.webrtc.Logging.d(TAG, "getStreamVolume");
        assertTrue(this.audioManager != null);
        return this.audioManager.getStreamVolume(3);
    }

    private int initPlayout(int i17, int i18, double d17) {
        this.threadChecker.checkIsOnValidThread();
        org.webrtc.Logging.d(TAG, "initPlayout(sampleRate=" + i17 + ", channels=" + i18 + ", bufferSizeFactor=" + d17 + ")");
        this.byteBuffer = java.nio.ByteBuffer.allocateDirect(i18 * 2 * (i17 / 100));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("byteBuffer.capacity: ");
        sb6.append(this.byteBuffer.capacity());
        org.webrtc.Logging.d(TAG, sb6.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioTrack);
        int channelCountToConfiguration = channelCountToConfiguration(i18);
        int minBufferSize = (int) (android.media.AudioTrack.getMinBufferSize(i17, channelCountToConfiguration, 2) * d17);
        org.webrtc.Logging.d(TAG, "minBufferSizeInBytes: " + minBufferSize);
        if (minBufferSize < this.byteBuffer.capacity()) {
            reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
            return -1;
        }
        if (this.audioTrack != null) {
            reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
            return -1;
        }
        try {
            android.media.AudioTrack createAudioTrackOnLollipopOrHigher = createAudioTrackOnLollipopOrHigher(i17, channelCountToConfiguration, minBufferSize);
            this.audioTrack = createAudioTrackOnLollipopOrHigher;
            if (createAudioTrackOnLollipopOrHigher == null || createAudioTrackOnLollipopOrHigher.getState() != 1) {
                reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                releaseAudioResources();
                return -1;
            }
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

    private void logUnderrunCount() {
        org.webrtc.Logging.d(TAG, "underrun count: " + this.audioTrack.getUnderrunCount());
    }

    private native void nativeCacheDirectBufferAddress(java.nio.ByteBuffer byteBuffer, long j17);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeGetPlayoutData(int i17, long j17);

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
        org.webrtc.voiceengine.WebRtcAudioUtils.logAudioState(TAG);
        org.webrtc.voiceengine.WebRtcAudioTrack.WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
        org.webrtc.voiceengine.WebRtcAudioTrack.ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(java.lang.String str) {
        org.webrtc.Logging.e(TAG, "Init playout error: " + str);
        org.webrtc.voiceengine.WebRtcAudioUtils.logAudioState(TAG);
        org.webrtc.voiceengine.WebRtcAudioTrack.WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
        org.webrtc.voiceengine.WebRtcAudioTrack.ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(org.webrtc.voiceengine.WebRtcAudioTrack.AudioTrackStartErrorCode audioTrackStartErrorCode, java.lang.String str) {
        org.webrtc.Logging.e(TAG, "Start playout error: " + audioTrackStartErrorCode + ". " + str);
        org.webrtc.voiceengine.WebRtcAudioUtils.logAudioState(TAG);
        org.webrtc.voiceengine.WebRtcAudioTrack.WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackStartError(str);
        }
        org.webrtc.voiceengine.WebRtcAudioTrack.ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    public static synchronized void setAudioTrackUsageAttribute(int i17) {
        synchronized (org.webrtc.voiceengine.WebRtcAudioTrack.class) {
            org.webrtc.Logging.w(TAG, "Default usage attribute is changed from: " + DEFAULT_USAGE + " to " + i17);
            usageAttribute = i17;
        }
    }

    @java.lang.Deprecated
    public static void setErrorCallback(org.webrtc.voiceengine.WebRtcAudioTrack.WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback) {
        org.webrtc.Logging.d(TAG, "Set error callback (deprecated");
        errorCallbackOld = webRtcAudioTrackErrorCallback;
    }

    public static void setSpeakerMute(boolean z17) {
        org.webrtc.Logging.w(TAG, "setSpeakerMute(" + z17 + ")");
        speakerMute = z17;
    }

    private boolean setStreamVolume(int i17) {
        this.threadChecker.checkIsOnValidThread();
        org.webrtc.Logging.d(TAG, "setStreamVolume(" + i17 + ")");
        assertTrue(this.audioManager != null);
        if (isVolumeFixed()) {
            org.webrtc.Logging.e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(3, i17, 0);
        return true;
    }

    private boolean startPlayout() {
        this.threadChecker.checkIsOnValidThread();
        org.webrtc.Logging.d(TAG, "startPlayout");
        assertTrue(this.audioTrack != null);
        assertTrue(this.audioThread == null);
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() == 3) {
                org.webrtc.voiceengine.WebRtcAudioTrack.AudioTrackThread audioTrackThread = new org.webrtc.voiceengine.WebRtcAudioTrack.AudioTrackThread("AudioTrackJavaThread");
                this.audioThread = audioTrackThread;
                audioTrackThread.start();
                return true;
            }
            reportWebRtcAudioTrackStartError(org.webrtc.voiceengine.WebRtcAudioTrack.AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, "AudioTrack.play failed - incorrect state :" + this.audioTrack.getPlayState());
            releaseAudioResources();
            return false;
        } catch (java.lang.IllegalStateException e17) {
            reportWebRtcAudioTrackStartError(org.webrtc.voiceengine.WebRtcAudioTrack.AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, "AudioTrack.play failed: " + e17.getMessage());
            releaseAudioResources();
            return false;
        }
    }

    private boolean stopPlayout() {
        this.threadChecker.checkIsOnValidThread();
        org.webrtc.Logging.d(TAG, "stopPlayout");
        assertTrue(this.audioThread != null);
        logUnderrunCount();
        this.audioThread.stopThread();
        org.webrtc.Logging.d(TAG, "Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!org.webrtc.ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
            org.webrtc.Logging.e(TAG, "Join of AudioTrackThread timed out.");
            org.webrtc.voiceengine.WebRtcAudioUtils.logAudioState(TAG);
        }
        org.webrtc.Logging.d(TAG, "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        releaseAudioResources();
        return true;
    }

    public static void setErrorCallback(org.webrtc.voiceengine.WebRtcAudioTrack.ErrorCallback errorCallback2) {
        org.webrtc.Logging.d(TAG, "Set extended error callback");
        errorCallback = errorCallback2;
    }
}
