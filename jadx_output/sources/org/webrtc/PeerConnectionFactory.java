package org.webrtc;

/* loaded from: classes15.dex */
public class PeerConnectionFactory {
    private static final java.lang.String TAG = "PeerConnectionFactory";
    public static final java.lang.String TRIAL_ENABLED = "Enabled";
    private static final java.lang.String VIDEO_CAPTURER_THREAD_NAME = "VideoCapturerThread";

    @java.lang.Deprecated
    public static final java.lang.String VIDEO_FRAME_EMIT_TRIAL = "VideoFrameEmit";
    private static volatile boolean internalTracerInitialized;
    private static org.webrtc.PeerConnectionFactory.ThreadInfo staticNetworkThread;
    private static org.webrtc.PeerConnectionFactory.ThreadInfo staticSignalingThread;
    private static org.webrtc.PeerConnectionFactory.ThreadInfo staticWorkerThread;
    private long nativeFactory;
    private volatile org.webrtc.PeerConnectionFactory.ThreadInfo networkThread;
    private volatile org.webrtc.PeerConnectionFactory.ThreadInfo signalingThread;
    private volatile org.webrtc.PeerConnectionFactory.ThreadInfo workerThread;

    /* loaded from: classes15.dex */
    public static class Builder {
        private org.webrtc.AudioDecoderFactoryFactory audioDecoderFactoryFactory;
        private org.webrtc.audio.AudioDeviceModule audioDeviceModule;
        private org.webrtc.AudioEncoderFactoryFactory audioEncoderFactoryFactory;
        private org.webrtc.AudioProcessingFactory audioProcessingFactory;
        private org.webrtc.FecControllerFactoryFactoryInterface fecControllerFactoryFactory;
        private org.webrtc.NetEqFactoryFactory neteqFactoryFactory;
        private org.webrtc.NetworkControllerFactoryFactory networkControllerFactoryFactory;
        private org.webrtc.NetworkStatePredictorFactoryFactory networkStatePredictorFactoryFactory;
        private org.webrtc.PeerConnectionFactory.Options options;
        private org.webrtc.VideoDecoderFactory videoDecoderFactory;
        private org.webrtc.VideoEncoderFactory videoEncoderFactory;

        public org.webrtc.PeerConnectionFactory createPeerConnectionFactory() {
            org.webrtc.PeerConnectionFactory.checkInitializeHasBeenCalled();
            if (this.audioDeviceModule == null) {
                this.audioDeviceModule = org.webrtc.audio.JavaAudioDeviceModule.builder(org.webrtc.ContextUtils.getApplicationContext()).createAudioDeviceModule();
            }
            android.content.Context applicationContext = org.webrtc.ContextUtils.getApplicationContext();
            org.webrtc.PeerConnectionFactory.Options options = this.options;
            long nativeAudioDeviceModulePointer = this.audioDeviceModule.getNativeAudioDeviceModulePointer();
            long createNativeAudioEncoderFactory = this.audioEncoderFactoryFactory.createNativeAudioEncoderFactory();
            long createNativeAudioDecoderFactory = this.audioDecoderFactoryFactory.createNativeAudioDecoderFactory();
            org.webrtc.VideoEncoderFactory videoEncoderFactory = this.videoEncoderFactory;
            org.webrtc.VideoDecoderFactory videoDecoderFactory = this.videoDecoderFactory;
            org.webrtc.AudioProcessingFactory audioProcessingFactory = this.audioProcessingFactory;
            long createNative = audioProcessingFactory == null ? 0L : audioProcessingFactory.createNative();
            org.webrtc.FecControllerFactoryFactoryInterface fecControllerFactoryFactoryInterface = this.fecControllerFactoryFactory;
            long createNative2 = fecControllerFactoryFactoryInterface == null ? 0L : fecControllerFactoryFactoryInterface.createNative();
            org.webrtc.NetworkControllerFactoryFactory networkControllerFactoryFactory = this.networkControllerFactoryFactory;
            long createNativeNetworkControllerFactory = networkControllerFactoryFactory == null ? 0L : networkControllerFactoryFactory.createNativeNetworkControllerFactory();
            org.webrtc.NetworkStatePredictorFactoryFactory networkStatePredictorFactoryFactory = this.networkStatePredictorFactoryFactory;
            long createNativeNetworkStatePredictorFactory = networkStatePredictorFactoryFactory == null ? 0L : networkStatePredictorFactoryFactory.createNativeNetworkStatePredictorFactory();
            org.webrtc.NetEqFactoryFactory netEqFactoryFactory = this.neteqFactoryFactory;
            return org.webrtc.PeerConnectionFactory.nativeCreatePeerConnectionFactory(applicationContext, options, nativeAudioDeviceModulePointer, createNativeAudioEncoderFactory, createNativeAudioDecoderFactory, videoEncoderFactory, videoDecoderFactory, createNative, createNative2, createNativeNetworkControllerFactory, createNativeNetworkStatePredictorFactory, netEqFactoryFactory != null ? netEqFactoryFactory.createNativeNetEqFactory() : 0L);
        }

        public org.webrtc.PeerConnectionFactory.Builder setAudioDecoderFactoryFactory(org.webrtc.AudioDecoderFactoryFactory audioDecoderFactoryFactory) {
            if (audioDecoderFactoryFactory == null) {
                throw new java.lang.IllegalArgumentException("PeerConnectionFactory.Builder does not accept a null AudioDecoderFactoryFactory.");
            }
            this.audioDecoderFactoryFactory = audioDecoderFactoryFactory;
            return this;
        }

        public org.webrtc.PeerConnectionFactory.Builder setAudioDeviceModule(org.webrtc.audio.AudioDeviceModule audioDeviceModule) {
            this.audioDeviceModule = audioDeviceModule;
            return this;
        }

        public org.webrtc.PeerConnectionFactory.Builder setAudioEncoderFactoryFactory(org.webrtc.AudioEncoderFactoryFactory audioEncoderFactoryFactory) {
            if (audioEncoderFactoryFactory == null) {
                throw new java.lang.IllegalArgumentException("PeerConnectionFactory.Builder does not accept a null AudioEncoderFactoryFactory.");
            }
            this.audioEncoderFactoryFactory = audioEncoderFactoryFactory;
            return this;
        }

        public org.webrtc.PeerConnectionFactory.Builder setAudioProcessingFactory(org.webrtc.AudioProcessingFactory audioProcessingFactory) {
            if (audioProcessingFactory == null) {
                throw new java.lang.NullPointerException("PeerConnectionFactory builder does not accept a null AudioProcessingFactory.");
            }
            this.audioProcessingFactory = audioProcessingFactory;
            return this;
        }

        public org.webrtc.PeerConnectionFactory.Builder setFecControllerFactoryFactoryInterface(org.webrtc.FecControllerFactoryFactoryInterface fecControllerFactoryFactoryInterface) {
            this.fecControllerFactoryFactory = fecControllerFactoryFactoryInterface;
            return this;
        }

        public org.webrtc.PeerConnectionFactory.Builder setNetEqFactoryFactory(org.webrtc.NetEqFactoryFactory netEqFactoryFactory) {
            this.neteqFactoryFactory = netEqFactoryFactory;
            return this;
        }

        public org.webrtc.PeerConnectionFactory.Builder setNetworkControllerFactoryFactory(org.webrtc.NetworkControllerFactoryFactory networkControllerFactoryFactory) {
            this.networkControllerFactoryFactory = networkControllerFactoryFactory;
            return this;
        }

        public org.webrtc.PeerConnectionFactory.Builder setNetworkStatePredictorFactoryFactory(org.webrtc.NetworkStatePredictorFactoryFactory networkStatePredictorFactoryFactory) {
            this.networkStatePredictorFactoryFactory = networkStatePredictorFactoryFactory;
            return this;
        }

        public org.webrtc.PeerConnectionFactory.Builder setOptions(org.webrtc.PeerConnectionFactory.Options options) {
            this.options = options;
            return this;
        }

        public org.webrtc.PeerConnectionFactory.Builder setVideoDecoderFactory(org.webrtc.VideoDecoderFactory videoDecoderFactory) {
            this.videoDecoderFactory = videoDecoderFactory;
            return this;
        }

        public org.webrtc.PeerConnectionFactory.Builder setVideoEncoderFactory(org.webrtc.VideoEncoderFactory videoEncoderFactory) {
            this.videoEncoderFactory = videoEncoderFactory;
            return this;
        }

        private Builder() {
            this.audioEncoderFactoryFactory = new org.webrtc.BuiltinAudioEncoderFactoryFactory();
            this.audioDecoderFactoryFactory = new org.webrtc.BuiltinAudioDecoderFactoryFactory();
        }
    }

    /* loaded from: classes15.dex */
    public static class InitializationOptions {
        final android.content.Context applicationContext;
        final boolean enableInternalTracer;
        final java.lang.String fieldTrials;
        org.webrtc.Loggable loggable;
        org.webrtc.Logging.Severity loggableSeverity;
        final org.webrtc.NativeLibraryLoader nativeLibraryLoader;
        final java.lang.String nativeLibraryName;

        /* loaded from: classes15.dex */
        public static class Builder {
            private final android.content.Context applicationContext;
            private boolean enableInternalTracer;
            private org.webrtc.Loggable loggable;
            private org.webrtc.Logging.Severity loggableSeverity;
            private java.lang.String fieldTrials = "";
            private org.webrtc.NativeLibraryLoader nativeLibraryLoader = new org.webrtc.NativeLibrary.DefaultLoader();
            private java.lang.String nativeLibraryName = "jingle_peerconnection_so";

            public Builder(android.content.Context context) {
                this.applicationContext = context;
            }

            public org.webrtc.PeerConnectionFactory.InitializationOptions createInitializationOptions() {
                return new org.webrtc.PeerConnectionFactory.InitializationOptions(this.applicationContext, this.fieldTrials, this.enableInternalTracer, this.nativeLibraryLoader, this.nativeLibraryName, this.loggable, this.loggableSeverity);
            }

            public org.webrtc.PeerConnectionFactory.InitializationOptions.Builder setEnableInternalTracer(boolean z17) {
                this.enableInternalTracer = z17;
                return this;
            }

            public org.webrtc.PeerConnectionFactory.InitializationOptions.Builder setFieldTrials(java.lang.String str) {
                this.fieldTrials = str;
                return this;
            }

            public org.webrtc.PeerConnectionFactory.InitializationOptions.Builder setInjectableLogger(org.webrtc.Loggable loggable, org.webrtc.Logging.Severity severity) {
                this.loggable = loggable;
                this.loggableSeverity = severity;
                return this;
            }

            public org.webrtc.PeerConnectionFactory.InitializationOptions.Builder setNativeLibraryLoader(org.webrtc.NativeLibraryLoader nativeLibraryLoader) {
                this.nativeLibraryLoader = nativeLibraryLoader;
                return this;
            }

            public org.webrtc.PeerConnectionFactory.InitializationOptions.Builder setNativeLibraryName(java.lang.String str) {
                this.nativeLibraryName = str;
                return this;
            }
        }

        public static org.webrtc.PeerConnectionFactory.InitializationOptions.Builder builder(android.content.Context context) {
            return new org.webrtc.PeerConnectionFactory.InitializationOptions.Builder(context);
        }

        private InitializationOptions(android.content.Context context, java.lang.String str, boolean z17, org.webrtc.NativeLibraryLoader nativeLibraryLoader, java.lang.String str2, org.webrtc.Loggable loggable, org.webrtc.Logging.Severity severity) {
            this.applicationContext = context;
            this.fieldTrials = str;
            this.enableInternalTracer = z17;
            this.nativeLibraryLoader = nativeLibraryLoader;
            this.nativeLibraryName = str2;
            this.loggable = loggable;
            this.loggableSeverity = severity;
        }
    }

    /* loaded from: classes6.dex */
    public static class Options {
        static final int ADAPTER_TYPE_ANY = 32;
        static final int ADAPTER_TYPE_CELLULAR = 4;
        static final int ADAPTER_TYPE_ETHERNET = 1;
        static final int ADAPTER_TYPE_LOOPBACK = 16;
        static final int ADAPTER_TYPE_UNKNOWN = 0;
        static final int ADAPTER_TYPE_VPN = 8;
        static final int ADAPTER_TYPE_WIFI = 2;
        public boolean disableEncryption;
        public boolean disableNetworkMonitor;
        public int networkIgnoreMask;

        public boolean getDisableEncryption() {
            return this.disableEncryption;
        }

        public boolean getDisableNetworkMonitor() {
            return this.disableNetworkMonitor;
        }

        public int getNetworkIgnoreMask() {
            return this.networkIgnoreMask;
        }
    }

    /* loaded from: classes15.dex */
    public static class ThreadInfo {
        final java.lang.Thread thread;
        final int tid;

        private ThreadInfo(java.lang.Thread thread, int i17) {
            this.thread = thread;
            this.tid = i17;
        }

        public static org.webrtc.PeerConnectionFactory.ThreadInfo getCurrent() {
            return new org.webrtc.PeerConnectionFactory.ThreadInfo(java.lang.Thread.currentThread(), android.os.Process.myTid());
        }
    }

    public PeerConnectionFactory(long j17) {
        checkInitializeHasBeenCalled();
        if (j17 == 0) {
            throw new java.lang.RuntimeException("Failed to initialize PeerConnectionFactory!");
        }
        this.nativeFactory = j17;
    }

    public static org.webrtc.PeerConnectionFactory.Builder builder() {
        return new org.webrtc.PeerConnectionFactory.Builder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkInitializeHasBeenCalled() {
        if (!org.webrtc.NativeLibrary.isLoaded() || org.webrtc.ContextUtils.getApplicationContext() == null) {
            throw new java.lang.IllegalStateException("PeerConnectionFactory.initialize was not called before creating a PeerConnectionFactory.");
        }
    }

    private void checkPeerConnectionFactoryExists() {
        if (this.nativeFactory == 0) {
            throw new java.lang.IllegalStateException("PeerConnectionFactory has been disposed.");
        }
    }

    public static java.lang.String fieldTrialsFindFullName(java.lang.String str) {
        return org.webrtc.NativeLibrary.isLoaded() ? nativeFindFieldTrialsFullName(str) : "";
    }

    public static void initialize(org.webrtc.PeerConnectionFactory.InitializationOptions initializationOptions) {
        org.webrtc.ContextUtils.initialize(initializationOptions.applicationContext);
        org.webrtc.NativeLibrary.initialize(initializationOptions.nativeLibraryLoader, initializationOptions.nativeLibraryName);
        nativeInitializeAndroidGlobals();
        nativeInitializeFieldTrials(initializationOptions.fieldTrials);
        if (initializationOptions.enableInternalTracer && !internalTracerInitialized) {
            initializeInternalTracer();
        }
        org.webrtc.Loggable loggable = initializationOptions.loggable;
        if (loggable != null) {
            org.webrtc.Logging.injectLoggable(loggable, initializationOptions.loggableSeverity);
            nativeInjectLoggable(new org.webrtc.JNILogging(initializationOptions.loggable), initializationOptions.loggableSeverity.ordinal());
        } else {
            org.webrtc.Logging.d(TAG, "PeerConnectionFactory was initialized without an injected Loggable. Any existing Loggable will be deleted.");
            org.webrtc.Logging.deleteInjectedLoggable();
            nativeDeleteLoggable();
        }
    }

    @java.lang.Deprecated
    public static void initializeFieldTrials(java.lang.String str) {
        nativeInitializeFieldTrials(str);
    }

    private static void initializeInternalTracer() {
        internalTracerInitialized = true;
        nativeInitializeInternalTracer();
    }

    private static native long nativeCreateAudioSource(long j17, org.webrtc.MediaConstraints mediaConstraints);

    private static native long nativeCreateAudioTrack(long j17, java.lang.String str, long j18);

    private static native long nativeCreateLocalMediaStream(long j17, java.lang.String str);

    private static native long nativeCreatePeerConnection(long j17, org.webrtc.PeerConnection.RTCConfiguration rTCConfiguration, org.webrtc.MediaConstraints mediaConstraints, long j18, org.webrtc.SSLCertificateVerifier sSLCertificateVerifier);

    /* JADX INFO: Access modifiers changed from: private */
    public static native org.webrtc.PeerConnectionFactory nativeCreatePeerConnectionFactory(android.content.Context context, org.webrtc.PeerConnectionFactory.Options options, long j17, long j18, long j19, org.webrtc.VideoEncoderFactory videoEncoderFactory, org.webrtc.VideoDecoderFactory videoDecoderFactory, long j27, long j28, long j29, long j37, long j38);

    private static native long nativeCreateVideoSource(long j17, boolean z17, boolean z18);

    private static native long nativeCreateVideoTrack(long j17, java.lang.String str, long j18);

    private static native void nativeDeleteLoggable();

    private static native java.lang.String nativeFindFieldTrialsFullName(java.lang.String str);

    private static native void nativeFreeFactory(long j17);

    private static native long nativeGetNativePeerConnectionFactory(long j17);

    private static native void nativeInitializeAndroidGlobals();

    private static native void nativeInitializeFieldTrials(java.lang.String str);

    private static native void nativeInitializeInternalTracer();

    private static native void nativeInjectLoggable(org.webrtc.JNILogging jNILogging, int i17);

    private static native void nativePrintStackTrace(int i17);

    private static native void nativePrintStackTracesOfRegisteredThreads();

    private static native void nativeShutdownInternalTracer();

    private static native boolean nativeStartAecDump(long j17, int i17, int i18);

    private static native boolean nativeStartInternalTracingCapture(java.lang.String str);

    private static native void nativeStopAecDump(long j17);

    private static native void nativeStopInternalTracingCapture();

    private void onNetworkThreadReady() {
        this.networkThread = org.webrtc.PeerConnectionFactory.ThreadInfo.getCurrent();
        staticNetworkThread = this.networkThread;
        org.webrtc.Logging.d(TAG, "onNetworkThreadReady");
    }

    private void onSignalingThreadReady() {
        this.signalingThread = org.webrtc.PeerConnectionFactory.ThreadInfo.getCurrent();
        staticSignalingThread = this.signalingThread;
        org.webrtc.Logging.d(TAG, "onSignalingThreadReady");
    }

    private void onWorkerThreadReady() {
        this.workerThread = org.webrtc.PeerConnectionFactory.ThreadInfo.getCurrent();
        staticWorkerThread = this.workerThread;
        org.webrtc.Logging.d(TAG, "onWorkerThreadReady");
    }

    private static void printStackTrace(org.webrtc.PeerConnectionFactory.ThreadInfo threadInfo, boolean z17) {
        if (threadInfo == null) {
            return;
        }
        java.lang.String name = threadInfo.thread.getName();
        java.lang.StackTraceElement[] stackTrace = threadInfo.thread.getStackTrace();
        if (stackTrace.length > 0) {
            org.webrtc.Logging.w(TAG, name + " stacktrace:");
            for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                org.webrtc.Logging.w(TAG, stackTraceElement.toString());
            }
        }
        if (z17) {
            org.webrtc.Logging.w(TAG, "*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
            org.webrtc.Logging.w(TAG, "pid: " + android.os.Process.myPid() + ", tid: " + threadInfo.tid + ", name: " + name + "  >>> WebRTC <<<");
            nativePrintStackTrace(threadInfo.tid);
        }
    }

    @java.lang.Deprecated
    public static void printStackTraces() {
        printStackTrace(staticNetworkThread, false);
        printStackTrace(staticWorkerThread, false);
        printStackTrace(staticSignalingThread, false);
    }

    public static void shutdownInternalTracer() {
        internalTracerInitialized = false;
        nativeShutdownInternalTracer();
    }

    public static boolean startInternalTracingCapture(java.lang.String str) {
        return nativeStartInternalTracingCapture(str);
    }

    public static void stopInternalTracingCapture() {
        nativeStopInternalTracingCapture();
    }

    public org.webrtc.AudioSource createAudioSource(org.webrtc.MediaConstraints mediaConstraints) {
        checkPeerConnectionFactoryExists();
        return new org.webrtc.AudioSource(nativeCreateAudioSource(this.nativeFactory, mediaConstraints));
    }

    public org.webrtc.AudioTrack createAudioTrack(java.lang.String str, org.webrtc.AudioSource audioSource) {
        checkPeerConnectionFactoryExists();
        return new org.webrtc.AudioTrack(nativeCreateAudioTrack(this.nativeFactory, str, audioSource.getNativeAudioSource()));
    }

    public org.webrtc.MediaStream createLocalMediaStream(java.lang.String str) {
        checkPeerConnectionFactoryExists();
        return new org.webrtc.MediaStream(nativeCreateLocalMediaStream(this.nativeFactory, str));
    }

    @java.lang.Deprecated
    public org.webrtc.PeerConnection createPeerConnection(org.webrtc.PeerConnection.RTCConfiguration rTCConfiguration, org.webrtc.MediaConstraints mediaConstraints, org.webrtc.PeerConnection.Observer observer) {
        return createPeerConnectionInternal(rTCConfiguration, mediaConstraints, observer, null);
    }

    public org.webrtc.PeerConnection createPeerConnectionInternal(org.webrtc.PeerConnection.RTCConfiguration rTCConfiguration, org.webrtc.MediaConstraints mediaConstraints, org.webrtc.PeerConnection.Observer observer, org.webrtc.SSLCertificateVerifier sSLCertificateVerifier) {
        checkPeerConnectionFactoryExists();
        long createNativePeerConnectionObserver = org.webrtc.PeerConnection.createNativePeerConnectionObserver(observer);
        if (createNativePeerConnectionObserver == 0) {
            return null;
        }
        long nativeCreatePeerConnection = nativeCreatePeerConnection(this.nativeFactory, rTCConfiguration, mediaConstraints, createNativePeerConnectionObserver, sSLCertificateVerifier);
        if (nativeCreatePeerConnection == 0) {
            return null;
        }
        return new org.webrtc.PeerConnection(nativeCreatePeerConnection);
    }

    public org.webrtc.VideoSource createVideoSource(boolean z17, boolean z18) {
        checkPeerConnectionFactoryExists();
        return new org.webrtc.VideoSource(nativeCreateVideoSource(this.nativeFactory, z17, z18));
    }

    public org.webrtc.VideoTrack createVideoTrack(java.lang.String str, org.webrtc.VideoSource videoSource) {
        checkPeerConnectionFactoryExists();
        return new org.webrtc.VideoTrack(nativeCreateVideoTrack(this.nativeFactory, str, videoSource.getNativeVideoTrackSource()));
    }

    public void dispose() {
        checkPeerConnectionFactoryExists();
        nativeFreeFactory(this.nativeFactory);
        this.networkThread = null;
        this.workerThread = null;
        this.signalingThread = null;
        this.nativeFactory = 0L;
    }

    public long getNativeOwnedFactoryAndThreads() {
        checkPeerConnectionFactoryExists();
        return this.nativeFactory;
    }

    public long getNativePeerConnectionFactory() {
        checkPeerConnectionFactoryExists();
        return nativeGetNativePeerConnectionFactory(this.nativeFactory);
    }

    public void printInternalStackTraces(boolean z17) {
        printStackTrace(this.signalingThread, z17);
        printStackTrace(this.workerThread, z17);
        printStackTrace(this.networkThread, z17);
        if (z17) {
            nativePrintStackTracesOfRegisteredThreads();
        }
    }

    public boolean startAecDump(int i17, int i18) {
        checkPeerConnectionFactoryExists();
        return nativeStartAecDump(this.nativeFactory, i17, i18);
    }

    public void stopAecDump() {
        checkPeerConnectionFactoryExists();
        nativeStopAecDump(this.nativeFactory);
    }

    @java.lang.Deprecated
    public org.webrtc.PeerConnection createPeerConnection(java.util.List<org.webrtc.PeerConnection.IceServer> list, org.webrtc.MediaConstraints mediaConstraints, org.webrtc.PeerConnection.Observer observer) {
        return createPeerConnection(new org.webrtc.PeerConnection.RTCConfiguration(list), mediaConstraints, observer);
    }

    public org.webrtc.VideoSource createVideoSource(boolean z17) {
        return createVideoSource(z17, true);
    }

    public org.webrtc.PeerConnection createPeerConnection(java.util.List<org.webrtc.PeerConnection.IceServer> list, org.webrtc.PeerConnection.Observer observer) {
        return createPeerConnection(new org.webrtc.PeerConnection.RTCConfiguration(list), observer);
    }

    public org.webrtc.PeerConnection createPeerConnection(org.webrtc.PeerConnection.RTCConfiguration rTCConfiguration, org.webrtc.PeerConnection.Observer observer) {
        return createPeerConnection(rTCConfiguration, (org.webrtc.MediaConstraints) null, observer);
    }

    public org.webrtc.PeerConnection createPeerConnection(org.webrtc.PeerConnection.RTCConfiguration rTCConfiguration, org.webrtc.PeerConnectionDependencies peerConnectionDependencies) {
        return createPeerConnectionInternal(rTCConfiguration, null, peerConnectionDependencies.getObserver(), peerConnectionDependencies.getSSLCertificateVerifier());
    }
}
