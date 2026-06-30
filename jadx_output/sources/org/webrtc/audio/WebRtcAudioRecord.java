package org.webrtc.audio;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public class WebRtcAudioRecord {
    private static final int AUDIO_RECORD_START = 0;
    private static final int AUDIO_RECORD_STOP = 1;
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final int CHECK_REC_STATUS_DELAY_MS = 100;
    public static final int DEFAULT_AUDIO_FORMAT = 2;
    public static final int DEFAULT_AUDIO_SOURCE = 7;
    private static final java.lang.String TAG = "WebRtcAudioRecordExternal";
    private static final java.util.concurrent.atomic.AtomicInteger nextSchedulerId = new java.util.concurrent.atomic.AtomicInteger(0);
    private final int audioFormat;
    private final android.media.AudioManager audioManager;
    private android.media.AudioRecord audioRecord;
    private final org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback audioSamplesReadyCallback;
    private final int audioSource;
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> audioSourceMatchesRecordingSessionRef;
    private org.webrtc.audio.WebRtcAudioRecord.AudioRecordThread audioThread;
    private java.nio.ByteBuffer byteBuffer;
    private final android.content.Context context;
    private final org.webrtc.audio.WebRtcAudioEffects effects;
    private byte[] emptyBytes;
    private final org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback errorCallback;
    private final java.util.concurrent.ScheduledExecutorService executor;
    private java.util.concurrent.ScheduledFuture<java.lang.String> future;
    private final boolean isAcousticEchoCancelerSupported;
    private final boolean isNoiseSuppressorSupported;
    private volatile boolean microphoneMute;
    private long nativeAudioRecord;
    private android.media.AudioDeviceInfo preferredDevice;
    private final org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStateCallback stateCallback;

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
            org.webrtc.Logging.d(org.webrtc.audio.WebRtcAudioRecord.TAG, "AudioRecordThread" + org.webrtc.audio.WebRtcAudioUtils.getThreadInfo());
            org.webrtc.audio.WebRtcAudioRecord.assertTrue(org.webrtc.audio.WebRtcAudioRecord.this.audioRecord.getRecordingState() == 3);
            org.webrtc.audio.WebRtcAudioRecord.this.doAudioRecordStateCallback(0);
            java.lang.System.nanoTime();
            while (this.keepAlive) {
                int read = org.webrtc.audio.WebRtcAudioRecord.this.audioRecord.read(org.webrtc.audio.WebRtcAudioRecord.this.byteBuffer, org.webrtc.audio.WebRtcAudioRecord.this.byteBuffer.capacity());
                if (read == org.webrtc.audio.WebRtcAudioRecord.this.byteBuffer.capacity()) {
                    if (org.webrtc.audio.WebRtcAudioRecord.this.microphoneMute) {
                        org.webrtc.audio.WebRtcAudioRecord.this.byteBuffer.clear();
                        org.webrtc.audio.WebRtcAudioRecord.this.byteBuffer.put(org.webrtc.audio.WebRtcAudioRecord.this.emptyBytes);
                    }
                    if (this.keepAlive) {
                        org.webrtc.audio.WebRtcAudioRecord webRtcAudioRecord = org.webrtc.audio.WebRtcAudioRecord.this;
                        webRtcAudioRecord.nativeDataIsRecorded(webRtcAudioRecord.nativeAudioRecord, read);
                    }
                    if (org.webrtc.audio.WebRtcAudioRecord.this.audioSamplesReadyCallback != null) {
                        org.webrtc.audio.WebRtcAudioRecord.this.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new org.webrtc.audio.JavaAudioDeviceModule.AudioSamples(org.webrtc.audio.WebRtcAudioRecord.this.audioRecord.getAudioFormat(), org.webrtc.audio.WebRtcAudioRecord.this.audioRecord.getChannelCount(), org.webrtc.audio.WebRtcAudioRecord.this.audioRecord.getSampleRate(), java.util.Arrays.copyOfRange(org.webrtc.audio.WebRtcAudioRecord.this.byteBuffer.array(), org.webrtc.audio.WebRtcAudioRecord.this.byteBuffer.arrayOffset(), org.webrtc.audio.WebRtcAudioRecord.this.byteBuffer.capacity() + org.webrtc.audio.WebRtcAudioRecord.this.byteBuffer.arrayOffset())));
                    }
                } else {
                    java.lang.String str = "AudioRecord.read failed: " + read;
                    org.webrtc.Logging.e(org.webrtc.audio.WebRtcAudioRecord.TAG, str);
                    if (read == -3) {
                        this.keepAlive = false;
                        org.webrtc.audio.WebRtcAudioRecord.this.reportWebRtcAudioRecordError(str);
                    }
                }
            }
            try {
                if (org.webrtc.audio.WebRtcAudioRecord.this.audioRecord != null) {
                    org.webrtc.audio.WebRtcAudioRecord.this.audioRecord.stop();
                    org.webrtc.audio.WebRtcAudioRecord.this.doAudioRecordStateCallback(1);
                }
            } catch (java.lang.IllegalStateException e17) {
                org.webrtc.Logging.e(org.webrtc.audio.WebRtcAudioRecord.TAG, "AudioRecord.stop failed: " + e17.getMessage());
            }
        }

        public void stopThread() {
            org.webrtc.Logging.d(org.webrtc.audio.WebRtcAudioRecord.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    public WebRtcAudioRecord(android.content.Context context, android.media.AudioManager audioManager) {
        this(context, newDefaultScheduler(), audioManager, 7, 2, null, null, null, org.webrtc.audio.WebRtcAudioEffects.isAcousticEchoCancelerSupported(), org.webrtc.audio.WebRtcAudioEffects.isNoiseSuppressorSupported());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertTrue(boolean z17) {
        if (!z17) {
            throw new java.lang.AssertionError("Expected condition to be true");
        }
    }

    private static java.lang.String audioStateToString(int i17) {
        return i17 != 0 ? i17 != 1 ? "INVALID" : "STOP" : "START";
    }

    private int channelCountToConfiguration(int i17) {
        return i17 == 1 ? 16 : 12;
    }

    private static boolean checkDeviceMatch(android.media.AudioDeviceInfo audioDeviceInfo, android.media.AudioDeviceInfo audioDeviceInfo2) {
        return audioDeviceInfo.getId() == audioDeviceInfo2.getId() && audioDeviceInfo.getType() == audioDeviceInfo2.getType();
    }

    private static android.media.AudioRecord createAudioRecordOnLowerThanM(int i17, int i18, int i19, int i27, int i28) {
        org.webrtc.Logging.d(TAG, "createAudioRecordOnLowerThanM");
        return new android.media.AudioRecord(i17, i18, i19, i27, i28);
    }

    private static android.media.AudioRecord createAudioRecordOnMOrHigher(int i17, int i18, int i19, int i27, int i28) {
        org.webrtc.Logging.d(TAG, "createAudioRecordOnMOrHigher");
        return new android.media.AudioRecord.Builder().setAudioSource(i17).setAudioFormat(new android.media.AudioFormat.Builder().setEncoding(i27).setSampleRate(i18).setChannelMask(i19).build()).setBufferSizeInBytes(i28).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doAudioRecordStateCallback(int i17) {
        org.webrtc.Logging.d(TAG, "doAudioRecordStateCallback: " + audioStateToString(i17));
        org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback = this.stateCallback;
        if (audioRecordStateCallback != null) {
            if (i17 == 0) {
                audioRecordStateCallback.onWebRtcAudioRecordStart();
            } else if (i17 == 1) {
                audioRecordStateCallback.onWebRtcAudioRecordStop();
            } else {
                org.webrtc.Logging.e(TAG, "Invalid audio state");
            }
        }
    }

    private boolean enableBuiltInAEC(boolean z17) {
        org.webrtc.Logging.d(TAG, "enableBuiltInAEC(" + z17 + ")");
        return this.effects.setAEC(z17);
    }

    private boolean enableBuiltInNS(boolean z17) {
        org.webrtc.Logging.d(TAG, "enableBuiltInNS(" + z17 + ")");
        return this.effects.setNS(z17);
    }

    private static int getBytesPerSample(int i17) {
        int i18 = 1;
        if (i17 != 1 && i17 != 2) {
            if (i17 != 3) {
                i18 = 4;
                if (i17 != 4) {
                    if (i17 != 13) {
                        throw new java.lang.IllegalArgumentException("Bad audio format " + i17);
                    }
                }
            }
            return i18;
        }
        return 2;
    }

    private int initRecording(int i17, int i18) {
        org.webrtc.Logging.d(TAG, "initRecording(sampleRate=" + i17 + ", channels=" + i18 + ")");
        if (this.audioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -1;
        }
        int i19 = i17 / 100;
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(getBytesPerSample(this.audioFormat) * i18 * i19);
        this.byteBuffer = allocateDirect;
        if (!allocateDirect.hasArray()) {
            reportWebRtcAudioRecordInitError("ByteBuffer does not have backing array.");
            return -1;
        }
        org.webrtc.Logging.d(TAG, "byteBuffer.capacity: " + this.byteBuffer.capacity());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.nativeAudioRecord, this.byteBuffer);
        int channelCountToConfiguration = channelCountToConfiguration(i18);
        int minBufferSize = android.media.AudioRecord.getMinBufferSize(i17, channelCountToConfiguration, this.audioFormat);
        if (minBufferSize == -1 || minBufferSize == -2) {
            reportWebRtcAudioRecordInitError("AudioRecord.getMinBufferSize failed: " + minBufferSize);
            return -1;
        }
        org.webrtc.Logging.d(TAG, "AudioRecord.getMinBufferSize: " + minBufferSize);
        int max = java.lang.Math.max(minBufferSize * 2, this.byteBuffer.capacity());
        org.webrtc.Logging.d(TAG, "bufferSizeInBytes: " + max);
        try {
            this.audioRecord = createAudioRecordOnMOrHigher(this.audioSource, i17, channelCountToConfiguration, this.audioFormat, max);
            this.audioSourceMatchesRecordingSessionRef.set(null);
            android.media.AudioDeviceInfo audioDeviceInfo = this.preferredDevice;
            if (audioDeviceInfo != null) {
                setPreferredDevice(audioDeviceInfo);
            }
            android.media.AudioRecord audioRecord = this.audioRecord;
            if (audioRecord == null || audioRecord.getState() != 1) {
                reportWebRtcAudioRecordInitError("Creation or initialization of audio recorder failed.");
                releaseAudioResources();
                return -1;
            }
            this.effects.enable(this.audioRecord.getAudioSessionId());
            logMainParameters();
            logMainParametersExtended();
            int logRecordingConfigurations = logRecordingConfigurations(this.audioRecord, false);
            if (logRecordingConfigurations != 0) {
                org.webrtc.Logging.w(TAG, "Potential microphone conflict. Active sessions: " + logRecordingConfigurations);
            }
            return i19;
        } catch (java.lang.IllegalArgumentException | java.lang.UnsupportedOperationException e17) {
            reportWebRtcAudioRecordInitError(e17.getMessage());
            releaseAudioResources();
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.String lambda$scheduleLogRecordingConfigurationsTask$0(android.media.AudioRecord audioRecord) {
        if (this.audioRecord == audioRecord) {
            logRecordingConfigurations(audioRecord, true);
            return "Scheduled task is done";
        }
        org.webrtc.Logging.d(TAG, "audio record has changed");
        return "Scheduled task is done";
    }

    private static boolean logActiveRecordingConfigs(int i17, java.util.List<android.media.AudioRecordingConfiguration> list) {
        assertTrue(!list.isEmpty());
        org.webrtc.Logging.d(TAG, "AudioRecordingConfigurations: ");
        for (android.media.AudioRecordingConfiguration audioRecordingConfiguration : list) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("  client audio source=");
            sb6.append(org.webrtc.audio.WebRtcAudioUtils.audioSourceToString(audioRecordingConfiguration.getClientAudioSource()));
            sb6.append(", client session id=");
            sb6.append(audioRecordingConfiguration.getClientAudioSessionId());
            sb6.append(" (");
            sb6.append(i17);
            sb6.append(")\n  Device AudioFormat: channel count=");
            android.media.AudioFormat format = audioRecordingConfiguration.getFormat();
            sb6.append(format.getChannelCount());
            sb6.append(", channel index mask=");
            sb6.append(format.getChannelIndexMask());
            sb6.append(", channel mask=");
            sb6.append(org.webrtc.audio.WebRtcAudioUtils.channelMaskToString(format.getChannelMask()));
            sb6.append(", encoding=");
            sb6.append(org.webrtc.audio.WebRtcAudioUtils.audioEncodingToString(format.getEncoding()));
            sb6.append(", sample rate=");
            sb6.append(format.getSampleRate());
            sb6.append("\n  Client AudioFormat: channel count=");
            android.media.AudioFormat clientFormat = audioRecordingConfiguration.getClientFormat();
            sb6.append(clientFormat.getChannelCount());
            sb6.append(", channel index mask=");
            sb6.append(clientFormat.getChannelIndexMask());
            sb6.append(", channel mask=");
            sb6.append(org.webrtc.audio.WebRtcAudioUtils.channelMaskToString(clientFormat.getChannelMask()));
            sb6.append(", encoding=");
            sb6.append(org.webrtc.audio.WebRtcAudioUtils.audioEncodingToString(clientFormat.getEncoding()));
            sb6.append(", sample rate=");
            sb6.append(clientFormat.getSampleRate());
            sb6.append("\n");
            android.media.AudioDeviceInfo audioDevice = audioRecordingConfiguration.getAudioDevice();
            if (audioDevice != null) {
                assertTrue(audioDevice.isSource());
                sb6.append("  AudioDevice: type=");
                sb6.append(org.webrtc.audio.WebRtcAudioUtils.deviceTypeToString(audioDevice.getType()));
                sb6.append(", id=");
                sb6.append(audioDevice.getId());
            }
            org.webrtc.Logging.d(TAG, sb6.toString());
        }
        return true;
    }

    private void logMainParameters() {
        org.webrtc.Logging.d(TAG, "AudioRecord: session ID: " + this.audioRecord.getAudioSessionId() + ", channels: " + this.audioRecord.getChannelCount() + ", sample rate: " + this.audioRecord.getSampleRate());
    }

    private void logMainParametersExtended() {
        org.webrtc.Logging.d(TAG, "AudioRecord: buffer size in frames: " + this.audioRecord.getBufferSizeInFrames());
    }

    private int logRecordingConfigurations(android.media.AudioRecord audioRecord, boolean z17) {
        if (audioRecord == null) {
            return 0;
        }
        java.util.List<android.media.AudioRecordingConfiguration> activeRecordingConfigurations = this.audioManager.getActiveRecordingConfigurations();
        int size = activeRecordingConfigurations.size();
        org.webrtc.Logging.d(TAG, "Number of active recording sessions: " + size);
        if (size > 0) {
            logActiveRecordingConfigs(audioRecord.getAudioSessionId(), activeRecordingConfigurations);
            if (z17) {
                this.audioSourceMatchesRecordingSessionRef.set(java.lang.Boolean.valueOf(verifyAudioConfig(audioRecord.getAudioSource(), audioRecord.getAudioSessionId(), audioRecord.getFormat(), audioRecord.getRoutedDevice(), activeRecordingConfigurations)));
            }
        }
        return size;
    }

    private native void nativeCacheDirectBufferAddress(long j17, java.nio.ByteBuffer byteBuffer);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeDataIsRecorded(long j17, int i17);

    public static java.util.concurrent.ScheduledExecutorService newDefaultScheduler() {
        final java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        return java.util.concurrent.Executors.newScheduledThreadPool(0, new java.util.concurrent.ThreadFactory() { // from class: org.webrtc.audio.WebRtcAudioRecord.1
            @Override // java.util.concurrent.ThreadFactory
            public java.lang.Thread newThread(java.lang.Runnable runnable) {
                java.lang.Thread newThread = java.util.concurrent.Executors.defaultThreadFactory().newThread(runnable);
                newThread.setName(java.lang.String.format("WebRtcAudioRecordScheduler-%s-%s", java.lang.Integer.valueOf(org.webrtc.audio.WebRtcAudioRecord.nextSchedulerId.getAndIncrement()), java.lang.Integer.valueOf(atomicInteger.getAndIncrement())));
                return newThread;
            }
        });
    }

    private void releaseAudioResources() {
        org.webrtc.Logging.d(TAG, "releaseAudioResources");
        android.media.AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.release();
            this.audioRecord = null;
        }
        this.audioSourceMatchesRecordingSessionRef.set(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioRecordError(java.lang.String str) {
        org.webrtc.Logging.e(TAG, "Run-time recording error: " + str);
        org.webrtc.audio.WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordInitError(java.lang.String str) {
        org.webrtc.Logging.e(TAG, "Init recording error: " + str);
        org.webrtc.audio.WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        logRecordingConfigurations(this.audioRecord, false);
        org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    private void reportWebRtcAudioRecordStartError(org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, java.lang.String str) {
        org.webrtc.Logging.e(TAG, "Start recording error: " + audioRecordStartErrorCode + ". " + str);
        org.webrtc.audio.WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        logRecordingConfigurations(this.audioRecord, false);
        org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    private void scheduleLogRecordingConfigurationsTask(final android.media.AudioRecord audioRecord) {
        org.webrtc.Logging.d(TAG, "scheduleLogRecordingConfigurationsTask");
        java.util.concurrent.Callable callable = new java.util.concurrent.Callable() { // from class: org.webrtc.audio.WebRtcAudioRecord$$a
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                java.lang.String lambda$scheduleLogRecordingConfigurationsTask$0;
                lambda$scheduleLogRecordingConfigurationsTask$0 = org.webrtc.audio.WebRtcAudioRecord.this.lambda$scheduleLogRecordingConfigurationsTask$0(audioRecord);
                return lambda$scheduleLogRecordingConfigurationsTask$0;
            }
        };
        java.util.concurrent.ScheduledFuture<java.lang.String> scheduledFuture = this.future;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.future.cancel(true);
        }
        this.future = this.executor.schedule(callable, 100L, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    private boolean startRecording() {
        org.webrtc.Logging.d(TAG, "startRecording");
        assertTrue(this.audioRecord != null);
        assertTrue(this.audioThread == null);
        try {
            yj0.a.j(this.audioRecord, "org/webrtc/audio/WebRtcAudioRecord", "startRecording", "()Z", "android/media/AudioRecord", "startRecording", "()V");
            if (this.audioRecord.getRecordingState() != 3) {
                reportWebRtcAudioRecordStartError(org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, "AudioRecord.startRecording failed - incorrect state: " + this.audioRecord.getRecordingState());
                return false;
            }
            org.webrtc.audio.WebRtcAudioRecord.AudioRecordThread audioRecordThread = new org.webrtc.audio.WebRtcAudioRecord.AudioRecordThread("AudioRecordJavaThread");
            this.audioThread = audioRecordThread;
            audioRecordThread.start();
            scheduleLogRecordingConfigurationsTask(this.audioRecord);
            return true;
        } catch (java.lang.IllegalStateException e17) {
            reportWebRtcAudioRecordStartError(org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, "AudioRecord.startRecording failed: " + e17.getMessage());
            return false;
        }
    }

    private boolean stopRecording() {
        org.webrtc.Logging.d(TAG, "stopRecording");
        assertTrue(this.audioThread != null);
        java.util.concurrent.ScheduledFuture<java.lang.String> scheduledFuture = this.future;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isDone()) {
                this.future.cancel(true);
            }
            this.future = null;
        }
        this.audioThread.stopThread();
        if (!org.webrtc.ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
            org.webrtc.Logging.e(TAG, "Join of AudioRecordJavaThread timed out");
            org.webrtc.audio.WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        }
        this.audioThread = null;
        this.effects.release();
        releaseAudioResources();
        return true;
    }

    private static boolean verifyAudioConfig(int i17, int i18, android.media.AudioFormat audioFormat, android.media.AudioDeviceInfo audioDeviceInfo, java.util.List<android.media.AudioRecordingConfiguration> list) {
        assertTrue(!list.isEmpty());
        for (android.media.AudioRecordingConfiguration audioRecordingConfiguration : list) {
            android.media.AudioDeviceInfo audioDevice = audioRecordingConfiguration.getAudioDevice();
            if (audioDevice != null && audioRecordingConfiguration.getClientAudioSource() == i17 && audioRecordingConfiguration.getClientAudioSessionId() == i18 && audioRecordingConfiguration.getClientFormat().getEncoding() == audioFormat.getEncoding() && audioRecordingConfiguration.getClientFormat().getSampleRate() == audioFormat.getSampleRate() && audioRecordingConfiguration.getClientFormat().getChannelMask() == audioFormat.getChannelMask() && audioRecordingConfiguration.getClientFormat().getChannelIndexMask() == audioFormat.getChannelIndexMask() && audioRecordingConfiguration.getFormat().getEncoding() != 0 && audioRecordingConfiguration.getFormat().getSampleRate() > 0 && (audioRecordingConfiguration.getFormat().getChannelMask() != 0 || audioRecordingConfiguration.getFormat().getChannelIndexMask() != 0)) {
                if (checkDeviceMatch(audioDevice, audioDeviceInfo)) {
                    org.webrtc.Logging.d(TAG, "verifyAudioConfig: PASS");
                    return true;
                }
            }
        }
        org.webrtc.Logging.e(TAG, "verifyAudioConfig: FAILED");
        return false;
    }

    public boolean isAcousticEchoCancelerSupported() {
        return this.isAcousticEchoCancelerSupported;
    }

    public boolean isAudioConfigVerified() {
        return this.audioSourceMatchesRecordingSessionRef.get() != null;
    }

    public boolean isAudioSourceMatchingRecordingSession() {
        java.lang.Boolean bool = this.audioSourceMatchesRecordingSessionRef.get();
        if (bool != null) {
            return bool.booleanValue();
        }
        org.webrtc.Logging.w(TAG, "Audio configuration has not yet been verified");
        return false;
    }

    public boolean isNoiseSuppressorSupported() {
        return this.isNoiseSuppressorSupported;
    }

    public void setMicrophoneMute(boolean z17) {
        org.webrtc.Logging.w(TAG, "setMicrophoneMute(" + z17 + ")");
        this.microphoneMute = z17;
    }

    public void setNativeAudioRecord(long j17) {
        this.nativeAudioRecord = j17;
    }

    public void setPreferredDevice(android.media.AudioDeviceInfo audioDeviceInfo) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setPreferredDevice ");
        sb6.append(audioDeviceInfo != null ? java.lang.Integer.valueOf(audioDeviceInfo.getId()) : null);
        org.webrtc.Logging.d(TAG, sb6.toString());
        this.preferredDevice = audioDeviceInfo;
        android.media.AudioRecord audioRecord = this.audioRecord;
        if (audioRecord == null || audioRecord.setPreferredDevice(audioDeviceInfo)) {
            return;
        }
        org.webrtc.Logging.e(TAG, "setPreferredDevice failed");
    }

    public WebRtcAudioRecord(android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, android.media.AudioManager audioManager, int i17, int i18, org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback, org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback, org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback samplesReadyCallback, boolean z17, boolean z18) {
        this.effects = new org.webrtc.audio.WebRtcAudioEffects();
        this.audioSourceMatchesRecordingSessionRef = new java.util.concurrent.atomic.AtomicReference<>();
        if (z17 && !org.webrtc.audio.WebRtcAudioEffects.isAcousticEchoCancelerSupported()) {
            throw new java.lang.IllegalArgumentException("HW AEC not supported");
        }
        if (z18 && !org.webrtc.audio.WebRtcAudioEffects.isNoiseSuppressorSupported()) {
            throw new java.lang.IllegalArgumentException("HW NS not supported");
        }
        this.context = context;
        this.executor = scheduledExecutorService;
        this.audioManager = audioManager;
        this.audioSource = i17;
        this.audioFormat = i18;
        this.errorCallback = audioRecordErrorCallback;
        this.stateCallback = audioRecordStateCallback;
        this.audioSamplesReadyCallback = samplesReadyCallback;
        this.isAcousticEchoCancelerSupported = z17;
        this.isNoiseSuppressorSupported = z18;
        org.webrtc.Logging.d(TAG, "ctor" + org.webrtc.audio.WebRtcAudioUtils.getThreadInfo());
    }
}
