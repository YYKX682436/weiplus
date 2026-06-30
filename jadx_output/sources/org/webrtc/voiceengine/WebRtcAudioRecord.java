package org.webrtc.voiceengine;

/* loaded from: classes15.dex */
public class WebRtcAudioRecord {
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_AUDIO_SOURCE;
    private static final java.lang.String TAG = "WebRtcAudioRecord";
    private static org.webrtc.voiceengine.WebRtcAudioRecord.WebRtcAudioRecordSamplesReadyCallback audioSamplesReadyCallback;
    private static int audioSource;
    private static org.webrtc.voiceengine.WebRtcAudioRecord.WebRtcAudioRecordErrorCallback errorCallback;
    private static volatile boolean microphoneMute;
    private android.media.AudioRecord audioRecord;
    private org.webrtc.voiceengine.WebRtcAudioRecord.AudioRecordThread audioThread;
    private java.nio.ByteBuffer byteBuffer;
    private org.webrtc.voiceengine.WebRtcAudioEffects effects;
    private byte[] emptyBytes;
    private final long nativeAudioRecord;

    /* loaded from: classes6.dex */
    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    /* loaded from: classes15.dex */
    public class AudioRecordThread extends java.lang.Thread {
        private volatile boolean keepAlive;

        public AudioRecordThread(java.lang.String str) {
            super(str);
            this.keepAlive = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            android.os.Process.setThreadPriority(-19);
            org.webrtc.Logging.d(org.webrtc.voiceengine.WebRtcAudioRecord.TAG, "AudioRecordThread" + org.webrtc.voiceengine.WebRtcAudioUtils.getThreadInfo());
            org.webrtc.voiceengine.WebRtcAudioRecord.assertTrue(org.webrtc.voiceengine.WebRtcAudioRecord.this.audioRecord.getRecordingState() == 3);
            java.lang.System.nanoTime();
            while (this.keepAlive) {
                int read = org.webrtc.voiceengine.WebRtcAudioRecord.this.audioRecord.read(org.webrtc.voiceengine.WebRtcAudioRecord.this.byteBuffer, org.webrtc.voiceengine.WebRtcAudioRecord.this.byteBuffer.capacity());
                if (read == org.webrtc.voiceengine.WebRtcAudioRecord.this.byteBuffer.capacity()) {
                    if (org.webrtc.voiceengine.WebRtcAudioRecord.microphoneMute) {
                        org.webrtc.voiceengine.WebRtcAudioRecord.this.byteBuffer.clear();
                        org.webrtc.voiceengine.WebRtcAudioRecord.this.byteBuffer.put(org.webrtc.voiceengine.WebRtcAudioRecord.this.emptyBytes);
                    }
                    if (this.keepAlive) {
                        org.webrtc.voiceengine.WebRtcAudioRecord webRtcAudioRecord = org.webrtc.voiceengine.WebRtcAudioRecord.this;
                        webRtcAudioRecord.nativeDataIsRecorded(read, webRtcAudioRecord.nativeAudioRecord);
                    }
                    if (org.webrtc.voiceengine.WebRtcAudioRecord.audioSamplesReadyCallback != null) {
                        org.webrtc.voiceengine.WebRtcAudioRecord.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new org.webrtc.voiceengine.WebRtcAudioRecord.AudioSamples(org.webrtc.voiceengine.WebRtcAudioRecord.this.audioRecord, java.util.Arrays.copyOf(org.webrtc.voiceengine.WebRtcAudioRecord.this.byteBuffer.array(), org.webrtc.voiceengine.WebRtcAudioRecord.this.byteBuffer.capacity())));
                    }
                } else {
                    java.lang.String str = "AudioRecord.read failed: " + read;
                    org.webrtc.Logging.e(org.webrtc.voiceengine.WebRtcAudioRecord.TAG, str);
                    if (read == -3) {
                        this.keepAlive = false;
                        org.webrtc.voiceengine.WebRtcAudioRecord.this.reportWebRtcAudioRecordError(str);
                    }
                }
            }
            try {
                if (org.webrtc.voiceengine.WebRtcAudioRecord.this.audioRecord != null) {
                    org.webrtc.voiceengine.WebRtcAudioRecord.this.audioRecord.stop();
                }
            } catch (java.lang.IllegalStateException e17) {
                org.webrtc.Logging.e(org.webrtc.voiceengine.WebRtcAudioRecord.TAG, "AudioRecord.stop failed: " + e17.getMessage());
            }
        }

        public void stopThread() {
            org.webrtc.Logging.d(org.webrtc.voiceengine.WebRtcAudioRecord.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    /* loaded from: classes15.dex */
    public static class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }

        private AudioSamples(android.media.AudioRecord audioRecord, byte[] bArr) {
            this.audioFormat = audioRecord.getAudioFormat();
            this.channelCount = audioRecord.getChannelCount();
            this.sampleRate = audioRecord.getSampleRate();
            this.data = bArr;
        }
    }

    /* loaded from: classes15.dex */
    public interface WebRtcAudioRecordErrorCallback {
        void onWebRtcAudioRecordError(java.lang.String str);

        void onWebRtcAudioRecordInitError(java.lang.String str);

        void onWebRtcAudioRecordStartError(org.webrtc.voiceengine.WebRtcAudioRecord.AudioRecordStartErrorCode audioRecordStartErrorCode, java.lang.String str);
    }

    /* loaded from: classes15.dex */
    public interface WebRtcAudioRecordSamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(org.webrtc.voiceengine.WebRtcAudioRecord.AudioSamples audioSamples);
    }

    static {
        int defaultAudioSource = getDefaultAudioSource();
        DEFAULT_AUDIO_SOURCE = defaultAudioSource;
        audioSource = defaultAudioSource;
    }

    public WebRtcAudioRecord(long j17) {
        org.webrtc.Logging.d(TAG, "ctor" + org.webrtc.voiceengine.WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioRecord = j17;
        this.effects = org.webrtc.voiceengine.WebRtcAudioEffects.create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertTrue(boolean z17) {
        if (!z17) {
            throw new java.lang.AssertionError("Expected condition to be true");
        }
    }

    private int channelCountToConfiguration(int i17) {
        return i17 == 1 ? 16 : 12;
    }

    private boolean enableBuiltInAEC(boolean z17) {
        org.webrtc.Logging.d(TAG, "enableBuiltInAEC(" + z17 + ')');
        org.webrtc.voiceengine.WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setAEC(z17);
        }
        org.webrtc.Logging.e(TAG, "Built-in AEC is not supported on this platform");
        return false;
    }

    private boolean enableBuiltInNS(boolean z17) {
        org.webrtc.Logging.d(TAG, "enableBuiltInNS(" + z17 + ')');
        org.webrtc.voiceengine.WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setNS(z17);
        }
        org.webrtc.Logging.e(TAG, "Built-in NS is not supported on this platform");
        return false;
    }

    private static int getDefaultAudioSource() {
        return 7;
    }

    private int initRecording(int i17, int i18) {
        org.webrtc.Logging.d(TAG, "initRecording(sampleRate=" + i17 + ", channels=" + i18 + ")");
        if (this.audioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -1;
        }
        int i19 = i17 / 100;
        this.byteBuffer = java.nio.ByteBuffer.allocateDirect(i18 * 2 * i19);
        org.webrtc.Logging.d(TAG, "byteBuffer.capacity: " + this.byteBuffer.capacity());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioRecord);
        int channelCountToConfiguration = channelCountToConfiguration(i18);
        int minBufferSize = android.media.AudioRecord.getMinBufferSize(i17, channelCountToConfiguration, 2);
        if (minBufferSize == -1 || minBufferSize == -2) {
            reportWebRtcAudioRecordInitError("AudioRecord.getMinBufferSize failed: " + minBufferSize);
            return -1;
        }
        org.webrtc.Logging.d(TAG, "AudioRecord.getMinBufferSize: " + minBufferSize);
        int max = java.lang.Math.max(minBufferSize * 2, this.byteBuffer.capacity());
        org.webrtc.Logging.d(TAG, "bufferSizeInBytes: " + max);
        try {
            android.media.AudioRecord audioRecord = new android.media.AudioRecord(audioSource, i17, channelCountToConfiguration, 2, max);
            this.audioRecord = audioRecord;
            if (audioRecord.getState() != 1) {
                reportWebRtcAudioRecordInitError("Failed to create a new AudioRecord instance");
                releaseAudioResources();
                return -1;
            }
            org.webrtc.voiceengine.WebRtcAudioEffects webRtcAudioEffects = this.effects;
            if (webRtcAudioEffects != null) {
                webRtcAudioEffects.enable(this.audioRecord.getAudioSessionId());
            }
            logMainParameters();
            logMainParametersExtended();
            return i19;
        } catch (java.lang.IllegalArgumentException e17) {
            reportWebRtcAudioRecordInitError("AudioRecord ctor error: " + e17.getMessage());
            releaseAudioResources();
            return -1;
        }
    }

    private void logMainParameters() {
        org.webrtc.Logging.d(TAG, "AudioRecord: session ID: " + this.audioRecord.getAudioSessionId() + ", channels: " + this.audioRecord.getChannelCount() + ", sample rate: " + this.audioRecord.getSampleRate());
    }

    private void logMainParametersExtended() {
        org.webrtc.Logging.d(TAG, "AudioRecord: buffer size in frames: " + this.audioRecord.getBufferSizeInFrames());
    }

    private native void nativeCacheDirectBufferAddress(java.nio.ByteBuffer byteBuffer, long j17);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeDataIsRecorded(int i17, long j17);

    private void releaseAudioResources() {
        org.webrtc.Logging.d(TAG, "releaseAudioResources");
        android.media.AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.release();
            this.audioRecord = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioRecordError(java.lang.String str) {
        org.webrtc.Logging.e(TAG, "Run-time recording error: " + str);
        org.webrtc.voiceengine.WebRtcAudioUtils.logAudioState(TAG);
        org.webrtc.voiceengine.WebRtcAudioRecord.WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordInitError(java.lang.String str) {
        org.webrtc.Logging.e(TAG, "Init recording error: " + str);
        org.webrtc.voiceengine.WebRtcAudioUtils.logAudioState(TAG);
        org.webrtc.voiceengine.WebRtcAudioRecord.WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    private void reportWebRtcAudioRecordStartError(org.webrtc.voiceengine.WebRtcAudioRecord.AudioRecordStartErrorCode audioRecordStartErrorCode, java.lang.String str) {
        org.webrtc.Logging.e(TAG, "Start recording error: " + audioRecordStartErrorCode + ". " + str);
        org.webrtc.voiceengine.WebRtcAudioUtils.logAudioState(TAG);
        org.webrtc.voiceengine.WebRtcAudioRecord.WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    public static synchronized void setAudioSource(int i17) {
        synchronized (org.webrtc.voiceengine.WebRtcAudioRecord.class) {
            org.webrtc.Logging.w(TAG, "Audio source is changed from: " + audioSource + " to " + i17);
            audioSource = i17;
        }
    }

    public static void setErrorCallback(org.webrtc.voiceengine.WebRtcAudioRecord.WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback) {
        org.webrtc.Logging.d(TAG, "Set error callback");
        errorCallback = webRtcAudioRecordErrorCallback;
    }

    public static void setMicrophoneMute(boolean z17) {
        org.webrtc.Logging.w(TAG, "setMicrophoneMute(" + z17 + ")");
        microphoneMute = z17;
    }

    public static void setOnAudioSamplesReady(org.webrtc.voiceengine.WebRtcAudioRecord.WebRtcAudioRecordSamplesReadyCallback webRtcAudioRecordSamplesReadyCallback) {
        audioSamplesReadyCallback = webRtcAudioRecordSamplesReadyCallback;
    }

    private boolean startRecording() {
        org.webrtc.Logging.d(TAG, "startRecording");
        assertTrue(this.audioRecord != null);
        assertTrue(this.audioThread == null);
        try {
            yj0.a.j(this.audioRecord, "org/webrtc/voiceengine/WebRtcAudioRecord", "startRecording", "()Z", "android/media/AudioRecord", "startRecording", "()V");
            if (this.audioRecord.getRecordingState() == 3) {
                org.webrtc.voiceengine.WebRtcAudioRecord.AudioRecordThread audioRecordThread = new org.webrtc.voiceengine.WebRtcAudioRecord.AudioRecordThread("AudioRecordJavaThread");
                this.audioThread = audioRecordThread;
                audioRecordThread.start();
                return true;
            }
            reportWebRtcAudioRecordStartError(org.webrtc.voiceengine.WebRtcAudioRecord.AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, "AudioRecord.startRecording failed - incorrect state :" + this.audioRecord.getRecordingState());
            return false;
        } catch (java.lang.IllegalStateException e17) {
            reportWebRtcAudioRecordStartError(org.webrtc.voiceengine.WebRtcAudioRecord.AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, "AudioRecord.startRecording failed: " + e17.getMessage());
            return false;
        }
    }

    private boolean stopRecording() {
        org.webrtc.Logging.d(TAG, "stopRecording");
        assertTrue(this.audioThread != null);
        this.audioThread.stopThread();
        if (!org.webrtc.ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
            org.webrtc.Logging.e(TAG, "Join of AudioRecordJavaThread timed out");
            org.webrtc.voiceengine.WebRtcAudioUtils.logAudioState(TAG);
        }
        this.audioThread = null;
        org.webrtc.voiceengine.WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            webRtcAudioEffects.release();
        }
        releaseAudioResources();
        return true;
    }
}
