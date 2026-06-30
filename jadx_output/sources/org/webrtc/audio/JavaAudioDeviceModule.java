package org.webrtc.audio;

/* loaded from: classes15.dex */
public class JavaAudioDeviceModule implements org.webrtc.audio.AudioDeviceModule {
    private static final java.lang.String TAG = "JavaAudioDeviceModule";
    private final org.webrtc.audio.WebRtcAudioRecord audioInput;
    private final android.media.AudioManager audioManager;
    private final org.webrtc.audio.WebRtcAudioTrack audioOutput;
    private final android.content.Context context;
    private final int inputSampleRate;
    private long nativeAudioDeviceModule;
    private final java.lang.Object nativeLock;
    private final int outputSampleRate;
    private final boolean useStereoInput;
    private final boolean useStereoOutput;

    /* loaded from: classes15.dex */
    public interface AudioRecordErrorCallback {
        void onWebRtcAudioRecordError(java.lang.String str);

        void onWebRtcAudioRecordInitError(java.lang.String str);

        void onWebRtcAudioRecordStartError(org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, java.lang.String str);
    }

    /* loaded from: classes6.dex */
    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    /* loaded from: classes15.dex */
    public interface AudioRecordStateCallback {
        void onWebRtcAudioRecordStart();

        void onWebRtcAudioRecordStop();
    }

    /* loaded from: classes15.dex */
    public static class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        public AudioSamples(int i17, int i18, int i19, byte[] bArr) {
            this.audioFormat = i17;
            this.channelCount = i18;
            this.sampleRate = i19;
            this.data = bArr;
        }

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
    }

    /* loaded from: classes15.dex */
    public interface AudioTrackErrorCallback {
        void onWebRtcAudioTrackError(java.lang.String str);

        void onWebRtcAudioTrackInitError(java.lang.String str);

        void onWebRtcAudioTrackStartError(org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, java.lang.String str);
    }

    /* loaded from: classes6.dex */
    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    /* loaded from: classes15.dex */
    public interface AudioTrackStateCallback {
        void onWebRtcAudioTrackStart();

        void onWebRtcAudioTrackStop();
    }

    /* loaded from: classes15.dex */
    public static class Builder {
        private android.media.AudioAttributes audioAttributes;
        private int audioFormat;
        private final android.media.AudioManager audioManager;
        private org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback;
        private org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback;
        private int audioSource;
        private org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback;
        private org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback;
        private final android.content.Context context;
        private int inputSampleRate;
        private int outputSampleRate;
        private org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback samplesReadyCallback;
        private java.util.concurrent.ScheduledExecutorService scheduler;
        private boolean useHardwareAcousticEchoCanceler;
        private boolean useHardwareNoiseSuppressor;
        private boolean useLowLatency;
        private boolean useStereoInput;
        private boolean useStereoOutput;

        public org.webrtc.audio.JavaAudioDeviceModule createAudioDeviceModule() {
            org.webrtc.Logging.d(org.webrtc.audio.JavaAudioDeviceModule.TAG, "createAudioDeviceModule");
            if (this.useHardwareNoiseSuppressor) {
                org.webrtc.Logging.d(org.webrtc.audio.JavaAudioDeviceModule.TAG, "HW NS will be used.");
            } else {
                if (org.webrtc.audio.JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()) {
                    org.webrtc.Logging.d(org.webrtc.audio.JavaAudioDeviceModule.TAG, "Overriding default behavior; now using WebRTC NS!");
                }
                org.webrtc.Logging.d(org.webrtc.audio.JavaAudioDeviceModule.TAG, "HW NS will not be used.");
            }
            if (this.useHardwareAcousticEchoCanceler) {
                org.webrtc.Logging.d(org.webrtc.audio.JavaAudioDeviceModule.TAG, "HW AEC will be used.");
            } else {
                if (org.webrtc.audio.JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported()) {
                    org.webrtc.Logging.d(org.webrtc.audio.JavaAudioDeviceModule.TAG, "Overriding default behavior; now using WebRTC AEC!");
                }
                org.webrtc.Logging.d(org.webrtc.audio.JavaAudioDeviceModule.TAG, "HW AEC will not be used.");
            }
            if (this.useLowLatency && android.os.Build.VERSION.SDK_INT >= 26) {
                org.webrtc.Logging.d(org.webrtc.audio.JavaAudioDeviceModule.TAG, "Low latency mode will be used.");
            }
            java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.scheduler;
            if (scheduledExecutorService == null) {
                scheduledExecutorService = org.webrtc.audio.WebRtcAudioRecord.newDefaultScheduler();
            }
            return new org.webrtc.audio.JavaAudioDeviceModule(this.context, this.audioManager, new org.webrtc.audio.WebRtcAudioRecord(this.context, scheduledExecutorService, this.audioManager, this.audioSource, this.audioFormat, this.audioRecordErrorCallback, this.audioRecordStateCallback, this.samplesReadyCallback, this.useHardwareAcousticEchoCanceler, this.useHardwareNoiseSuppressor), new org.webrtc.audio.WebRtcAudioTrack(this.context, this.audioManager, this.audioAttributes, this.audioTrackErrorCallback, this.audioTrackStateCallback, this.useLowLatency), this.inputSampleRate, this.outputSampleRate, this.useStereoInput, this.useStereoOutput);
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setAudioAttributes(android.media.AudioAttributes audioAttributes) {
            this.audioAttributes = audioAttributes;
            return this;
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setAudioFormat(int i17) {
            this.audioFormat = i17;
            return this;
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setAudioRecordErrorCallback(org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback) {
            this.audioRecordErrorCallback = audioRecordErrorCallback;
            return this;
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setAudioRecordStateCallback(org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback) {
            this.audioRecordStateCallback = audioRecordStateCallback;
            return this;
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setAudioSource(int i17) {
            this.audioSource = i17;
            return this;
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setAudioTrackErrorCallback(org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback) {
            this.audioTrackErrorCallback = audioTrackErrorCallback;
            return this;
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setAudioTrackStateCallback(org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback) {
            this.audioTrackStateCallback = audioTrackStateCallback;
            return this;
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setInputSampleRate(int i17) {
            org.webrtc.Logging.d(org.webrtc.audio.JavaAudioDeviceModule.TAG, "Input sample rate overridden to: " + i17);
            this.inputSampleRate = i17;
            return this;
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setOutputSampleRate(int i17) {
            org.webrtc.Logging.d(org.webrtc.audio.JavaAudioDeviceModule.TAG, "Output sample rate overridden to: " + i17);
            this.outputSampleRate = i17;
            return this;
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setSampleRate(int i17) {
            org.webrtc.Logging.d(org.webrtc.audio.JavaAudioDeviceModule.TAG, "Input/Output sample rate overridden to: " + i17);
            this.inputSampleRate = i17;
            this.outputSampleRate = i17;
            return this;
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setSamplesReadyCallback(org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback samplesReadyCallback) {
            this.samplesReadyCallback = samplesReadyCallback;
            return this;
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setScheduler(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
            this.scheduler = scheduledExecutorService;
            return this;
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setUseHardwareAcousticEchoCanceler(boolean z17) {
            if (z17 && !org.webrtc.audio.JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported()) {
                org.webrtc.Logging.e(org.webrtc.audio.JavaAudioDeviceModule.TAG, "HW AEC not supported");
                z17 = false;
            }
            this.useHardwareAcousticEchoCanceler = z17;
            return this;
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setUseHardwareNoiseSuppressor(boolean z17) {
            if (z17 && !org.webrtc.audio.JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()) {
                org.webrtc.Logging.e(org.webrtc.audio.JavaAudioDeviceModule.TAG, "HW NS not supported");
                z17 = false;
            }
            this.useHardwareNoiseSuppressor = z17;
            return this;
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setUseLowLatency(boolean z17) {
            this.useLowLatency = z17;
            return this;
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setUseStereoInput(boolean z17) {
            this.useStereoInput = z17;
            return this;
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setUseStereoOutput(boolean z17) {
            this.useStereoOutput = z17;
            return this;
        }

        private Builder(android.content.Context context) {
            this.audioSource = 7;
            this.audioFormat = 2;
            this.useHardwareAcousticEchoCanceler = org.webrtc.audio.JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported();
            this.useHardwareNoiseSuppressor = org.webrtc.audio.JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported();
            this.context = context;
            android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
            this.audioManager = audioManager;
            this.inputSampleRate = org.webrtc.audio.WebRtcAudioManager.getSampleRate(audioManager);
            this.outputSampleRate = org.webrtc.audio.WebRtcAudioManager.getSampleRate(audioManager);
            this.useLowLatency = false;
        }
    }

    /* loaded from: classes15.dex */
    public interface SamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(org.webrtc.audio.JavaAudioDeviceModule.AudioSamples audioSamples);
    }

    public static org.webrtc.audio.JavaAudioDeviceModule.Builder builder(android.content.Context context) {
        return new org.webrtc.audio.JavaAudioDeviceModule.Builder(context);
    }

    public static boolean isBuiltInAcousticEchoCancelerSupported() {
        return org.webrtc.audio.WebRtcAudioEffects.isAcousticEchoCancelerSupported();
    }

    public static boolean isBuiltInNoiseSuppressorSupported() {
        return org.webrtc.audio.WebRtcAudioEffects.isNoiseSuppressorSupported();
    }

    private static native long nativeCreateAudioDeviceModule(android.content.Context context, android.media.AudioManager audioManager, org.webrtc.audio.WebRtcAudioRecord webRtcAudioRecord, org.webrtc.audio.WebRtcAudioTrack webRtcAudioTrack, int i17, int i18, boolean z17, boolean z18);

    @Override // org.webrtc.audio.AudioDeviceModule
    public long getNativeAudioDeviceModulePointer() {
        long j17;
        synchronized (this.nativeLock) {
            if (this.nativeAudioDeviceModule == 0) {
                this.nativeAudioDeviceModule = nativeCreateAudioDeviceModule(this.context, this.audioManager, this.audioInput, this.audioOutput, this.inputSampleRate, this.outputSampleRate, this.useStereoInput, this.useStereoOutput);
            }
            j17 = this.nativeAudioDeviceModule;
        }
        return j17;
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void release() {
        synchronized (this.nativeLock) {
            long j17 = this.nativeAudioDeviceModule;
            if (j17 != 0) {
                org.webrtc.JniCommon.nativeReleaseRef(j17);
                this.nativeAudioDeviceModule = 0L;
            }
        }
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setMicrophoneMute(boolean z17) {
        org.webrtc.Logging.d(TAG, "setMicrophoneMute: " + z17);
        this.audioInput.setMicrophoneMute(z17);
    }

    public void setPreferredInputDevice(android.media.AudioDeviceInfo audioDeviceInfo) {
        org.webrtc.Logging.d(TAG, "setPreferredInputDevice: " + audioDeviceInfo);
        this.audioInput.setPreferredDevice(audioDeviceInfo);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setSpeakerMute(boolean z17) {
        org.webrtc.Logging.d(TAG, "setSpeakerMute: " + z17);
        this.audioOutput.setSpeakerMute(z17);
    }

    private JavaAudioDeviceModule(android.content.Context context, android.media.AudioManager audioManager, org.webrtc.audio.WebRtcAudioRecord webRtcAudioRecord, org.webrtc.audio.WebRtcAudioTrack webRtcAudioTrack, int i17, int i18, boolean z17, boolean z18) {
        this.nativeLock = new java.lang.Object();
        this.context = context;
        this.audioManager = audioManager;
        this.audioInput = webRtcAudioRecord;
        this.audioOutput = webRtcAudioTrack;
        this.inputSampleRate = i17;
        this.outputSampleRate = i18;
        this.useStereoInput = z17;
        this.useStereoOutput = z18;
    }
}
