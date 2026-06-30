package org.webrtc;

/* loaded from: classes16.dex */
abstract class CameraCapturer implements org.webrtc.CameraVideoCapturer {
    private static final int MAX_OPEN_CAMERA_ATTEMPTS = 3;
    private static final int OPEN_CAMERA_DELAY_MS = 500;
    private static final int OPEN_CAMERA_TIMEOUT = 10000;
    private static final java.lang.String TAG = "CameraCapturer";
    private android.content.Context applicationContext;
    private final org.webrtc.CameraEnumerator cameraEnumerator;
    private java.lang.String cameraName;
    private org.webrtc.CameraVideoCapturer.CameraStatistics cameraStatistics;
    private android.os.Handler cameraThreadHandler;
    private org.webrtc.CapturerObserver capturerObserver;
    private org.webrtc.CameraSession currentSession;
    private final org.webrtc.CameraVideoCapturer.CameraEventsHandler eventsHandler;
    private boolean firstFrameObserved;
    private int framerate;
    private int height;
    private int openAttemptsRemaining;
    private java.lang.String pendingCameraName;
    private boolean sessionOpening;
    private org.webrtc.SurfaceTextureHelper surfaceHelper;
    private org.webrtc.CameraVideoCapturer.CameraSwitchHandler switchEventsHandler;
    private final android.os.Handler uiThreadHandler;
    private int width;
    private final org.webrtc.CameraSession.CreateSessionCallback createSessionCallback = new org.webrtc.CameraSession.CreateSessionCallback() { // from class: org.webrtc.CameraCapturer.1
        @Override // org.webrtc.CameraSession.CreateSessionCallback
        public void onDone(org.webrtc.CameraSession cameraSession) {
            org.webrtc.CameraCapturer.this.checkIsOnCameraThread();
            org.webrtc.Logging.d(org.webrtc.CameraCapturer.TAG, "Create session done. Switch state: " + org.webrtc.CameraCapturer.this.switchState);
            org.webrtc.CameraCapturer.this.uiThreadHandler.removeCallbacks(org.webrtc.CameraCapturer.this.openCameraTimeoutRunnable);
            synchronized (org.webrtc.CameraCapturer.this.stateLock) {
                org.webrtc.CameraCapturer.this.capturerObserver.onCapturerStarted(true);
                org.webrtc.CameraCapturer.this.sessionOpening = false;
                org.webrtc.CameraCapturer.this.currentSession = cameraSession;
                org.webrtc.CameraCapturer cameraCapturer = org.webrtc.CameraCapturer.this;
                cameraCapturer.cameraStatistics = new org.webrtc.CameraVideoCapturer.CameraStatistics(cameraCapturer.surfaceHelper, org.webrtc.CameraCapturer.this.eventsHandler);
                org.webrtc.CameraCapturer.this.firstFrameObserved = false;
                org.webrtc.CameraCapturer.this.stateLock.notifyAll();
                if (org.webrtc.CameraCapturer.this.switchState == org.webrtc.CameraCapturer.SwitchState.IN_PROGRESS) {
                    org.webrtc.CameraCapturer.this.switchState = org.webrtc.CameraCapturer.SwitchState.IDLE;
                    if (org.webrtc.CameraCapturer.this.switchEventsHandler != null) {
                        org.webrtc.CameraCapturer.this.switchEventsHandler.onCameraSwitchDone(org.webrtc.CameraCapturer.this.cameraEnumerator.isFrontFacing(org.webrtc.CameraCapturer.this.cameraName));
                        org.webrtc.CameraCapturer.this.switchEventsHandler = null;
                    }
                } else if (org.webrtc.CameraCapturer.this.switchState == org.webrtc.CameraCapturer.SwitchState.PENDING) {
                    java.lang.String str = org.webrtc.CameraCapturer.this.pendingCameraName;
                    org.webrtc.CameraCapturer.this.pendingCameraName = null;
                    org.webrtc.CameraCapturer.this.switchState = org.webrtc.CameraCapturer.SwitchState.IDLE;
                    org.webrtc.CameraCapturer cameraCapturer2 = org.webrtc.CameraCapturer.this;
                    cameraCapturer2.switchCameraInternal(cameraCapturer2.switchEventsHandler, str);
                }
            }
        }

        @Override // org.webrtc.CameraSession.CreateSessionCallback
        public void onFailure(org.webrtc.CameraSession.FailureType failureType, java.lang.String str) {
            org.webrtc.CameraCapturer.this.checkIsOnCameraThread();
            org.webrtc.CameraCapturer.this.uiThreadHandler.removeCallbacks(org.webrtc.CameraCapturer.this.openCameraTimeoutRunnable);
            synchronized (org.webrtc.CameraCapturer.this.stateLock) {
                org.webrtc.CameraCapturer.this.capturerObserver.onCapturerStarted(false);
                org.webrtc.CameraCapturer.access$1710(org.webrtc.CameraCapturer.this);
                if (org.webrtc.CameraCapturer.this.openAttemptsRemaining <= 0) {
                    org.webrtc.Logging.w(org.webrtc.CameraCapturer.TAG, "Opening camera failed, passing: " + str);
                    org.webrtc.CameraCapturer.this.sessionOpening = false;
                    org.webrtc.CameraCapturer.this.stateLock.notifyAll();
                    org.webrtc.CameraCapturer.SwitchState switchState = org.webrtc.CameraCapturer.this.switchState;
                    org.webrtc.CameraCapturer.SwitchState switchState2 = org.webrtc.CameraCapturer.SwitchState.IDLE;
                    if (switchState != switchState2) {
                        if (org.webrtc.CameraCapturer.this.switchEventsHandler != null) {
                            org.webrtc.CameraCapturer.this.switchEventsHandler.onCameraSwitchError(str);
                            org.webrtc.CameraCapturer.this.switchEventsHandler = null;
                        }
                        org.webrtc.CameraCapturer.this.switchState = switchState2;
                    }
                    if (failureType == org.webrtc.CameraSession.FailureType.DISCONNECTED) {
                        org.webrtc.CameraCapturer.this.eventsHandler.onCameraDisconnected();
                    } else {
                        org.webrtc.CameraCapturer.this.eventsHandler.onCameraError(str);
                    }
                } else {
                    org.webrtc.Logging.w(org.webrtc.CameraCapturer.TAG, "Opening camera failed, retry: " + str);
                    org.webrtc.CameraCapturer.this.createSessionInternal(500);
                }
            }
        }
    };
    private final org.webrtc.CameraSession.Events cameraSessionEventsHandler = new org.webrtc.CameraSession.Events() { // from class: org.webrtc.CameraCapturer.2
        @Override // org.webrtc.CameraSession.Events
        public void onCameraClosed(org.webrtc.CameraSession cameraSession) {
            org.webrtc.CameraCapturer.this.checkIsOnCameraThread();
            synchronized (org.webrtc.CameraCapturer.this.stateLock) {
                if (cameraSession == org.webrtc.CameraCapturer.this.currentSession || org.webrtc.CameraCapturer.this.currentSession == null) {
                    org.webrtc.CameraCapturer.this.eventsHandler.onCameraClosed();
                } else {
                    org.webrtc.Logging.d(org.webrtc.CameraCapturer.TAG, "onCameraClosed from another session.");
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraDisconnected(org.webrtc.CameraSession cameraSession) {
            org.webrtc.CameraCapturer.this.checkIsOnCameraThread();
            synchronized (org.webrtc.CameraCapturer.this.stateLock) {
                if (cameraSession != org.webrtc.CameraCapturer.this.currentSession) {
                    org.webrtc.Logging.w(org.webrtc.CameraCapturer.TAG, "onCameraDisconnected from another session.");
                } else {
                    org.webrtc.CameraCapturer.this.eventsHandler.onCameraDisconnected();
                    org.webrtc.CameraCapturer.this.stopCapture();
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraError(org.webrtc.CameraSession cameraSession, java.lang.String str) {
            org.webrtc.CameraCapturer.this.checkIsOnCameraThread();
            synchronized (org.webrtc.CameraCapturer.this.stateLock) {
                if (cameraSession == org.webrtc.CameraCapturer.this.currentSession) {
                    org.webrtc.CameraCapturer.this.eventsHandler.onCameraError(str);
                    org.webrtc.CameraCapturer.this.stopCapture();
                } else {
                    org.webrtc.Logging.w(org.webrtc.CameraCapturer.TAG, "onCameraError from another session: " + str);
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraOpening() {
            org.webrtc.CameraCapturer.this.checkIsOnCameraThread();
            synchronized (org.webrtc.CameraCapturer.this.stateLock) {
                if (org.webrtc.CameraCapturer.this.currentSession != null) {
                    org.webrtc.Logging.w(org.webrtc.CameraCapturer.TAG, "onCameraOpening while session was open.");
                } else {
                    org.webrtc.CameraCapturer.this.eventsHandler.onCameraOpening(org.webrtc.CameraCapturer.this.cameraName);
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onFrameCaptured(org.webrtc.CameraSession cameraSession, org.webrtc.VideoFrame videoFrame) {
            org.webrtc.CameraCapturer.this.checkIsOnCameraThread();
            synchronized (org.webrtc.CameraCapturer.this.stateLock) {
                if (cameraSession != org.webrtc.CameraCapturer.this.currentSession) {
                    org.webrtc.Logging.w(org.webrtc.CameraCapturer.TAG, "onFrameCaptured from another session.");
                    return;
                }
                if (!org.webrtc.CameraCapturer.this.firstFrameObserved) {
                    org.webrtc.CameraCapturer.this.eventsHandler.onFirstFrameAvailable();
                    org.webrtc.CameraCapturer.this.firstFrameObserved = true;
                }
                org.webrtc.CameraCapturer.this.cameraStatistics.addFrame();
                org.webrtc.CameraCapturer.this.capturerObserver.onFrameCaptured(videoFrame);
            }
        }
    };
    private final java.lang.Runnable openCameraTimeoutRunnable = new java.lang.Runnable() { // from class: org.webrtc.CameraCapturer.3
        @Override // java.lang.Runnable
        public void run() {
            org.webrtc.CameraCapturer.this.eventsHandler.onCameraError("Camera failed to start within timeout.");
        }
    };
    private final java.lang.Object stateLock = new java.lang.Object();
    private org.webrtc.CameraCapturer.SwitchState switchState = org.webrtc.CameraCapturer.SwitchState.IDLE;

    /* loaded from: classes16.dex */
    public enum SwitchState {
        IDLE,
        PENDING,
        IN_PROGRESS
    }

    public CameraCapturer(java.lang.String str, org.webrtc.CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, org.webrtc.CameraEnumerator cameraEnumerator) {
        this.eventsHandler = cameraEventsHandler == null ? new org.webrtc.CameraVideoCapturer.CameraEventsHandler() { // from class: org.webrtc.CameraCapturer.4
            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraClosed() {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraDisconnected() {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraError(java.lang.String str2) {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraFreezed(java.lang.String str2) {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraOpening(java.lang.String str2) {
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onFirstFrameAvailable() {
            }
        } : cameraEventsHandler;
        this.cameraEnumerator = cameraEnumerator;
        this.cameraName = str;
        java.util.List asList = java.util.Arrays.asList(cameraEnumerator.getDeviceNames());
        this.uiThreadHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        if (asList.isEmpty()) {
            throw new java.lang.RuntimeException("No cameras attached.");
        }
        if (asList.contains(this.cameraName)) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Camera name " + this.cameraName + " does not match any known camera device.");
    }

    public static /* synthetic */ int access$1710(org.webrtc.CameraCapturer cameraCapturer) {
        int i17 = cameraCapturer.openAttemptsRemaining;
        cameraCapturer.openAttemptsRemaining = i17 - 1;
        return i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkIsOnCameraThread() {
        if (java.lang.Thread.currentThread() == this.cameraThreadHandler.getLooper().getThread()) {
            return;
        }
        org.webrtc.Logging.e(TAG, "Check is on camera thread failed.");
        throw new java.lang.RuntimeException("Not on camera thread.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createSessionInternal(int i17) {
        this.uiThreadHandler.postDelayed(this.openCameraTimeoutRunnable, i17 + 10000);
        this.cameraThreadHandler.postDelayed(new java.lang.Runnable() { // from class: org.webrtc.CameraCapturer.5
            @Override // java.lang.Runnable
            public void run() {
                org.webrtc.CameraCapturer cameraCapturer = org.webrtc.CameraCapturer.this;
                cameraCapturer.createCameraSession(cameraCapturer.createSessionCallback, org.webrtc.CameraCapturer.this.cameraSessionEventsHandler, org.webrtc.CameraCapturer.this.applicationContext, org.webrtc.CameraCapturer.this.surfaceHelper, org.webrtc.CameraCapturer.this.cameraName, org.webrtc.CameraCapturer.this.width, org.webrtc.CameraCapturer.this.height, org.webrtc.CameraCapturer.this.framerate);
            }
        }, i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportCameraSwitchError(java.lang.String str, org.webrtc.CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        org.webrtc.Logging.e(TAG, str);
        if (cameraSwitchHandler != null) {
            cameraSwitchHandler.onCameraSwitchError(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void switchCameraInternal(org.webrtc.CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, java.lang.String str) {
        org.webrtc.Logging.d(TAG, "switchCamera internal");
        if (!java.util.Arrays.asList(this.cameraEnumerator.getDeviceNames()).contains(str)) {
            reportCameraSwitchError("Attempted to switch to unknown camera device " + str, cameraSwitchHandler);
            return;
        }
        synchronized (this.stateLock) {
            if (this.switchState != org.webrtc.CameraCapturer.SwitchState.IDLE) {
                reportCameraSwitchError("Camera switch already in progress.", cameraSwitchHandler);
                return;
            }
            boolean z17 = this.sessionOpening;
            if (!z17 && this.currentSession == null) {
                reportCameraSwitchError("switchCamera: camera is not running.", cameraSwitchHandler);
                return;
            }
            this.switchEventsHandler = cameraSwitchHandler;
            if (z17) {
                this.switchState = org.webrtc.CameraCapturer.SwitchState.PENDING;
                this.pendingCameraName = str;
                return;
            }
            this.switchState = org.webrtc.CameraCapturer.SwitchState.IN_PROGRESS;
            org.webrtc.Logging.d(TAG, "switchCamera: Stopping session");
            this.cameraStatistics.release();
            this.cameraStatistics = null;
            final org.webrtc.CameraSession cameraSession = this.currentSession;
            this.cameraThreadHandler.post(new java.lang.Runnable() { // from class: org.webrtc.CameraCapturer.9
                @Override // java.lang.Runnable
                public void run() {
                    cameraSession.stop();
                }
            });
            this.currentSession = null;
            this.cameraName = str;
            this.sessionOpening = true;
            this.openAttemptsRemaining = 1;
            createSessionInternal(0);
            org.webrtc.Logging.d(TAG, "switchCamera done");
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void changeCaptureFormat(int i17, int i18, int i19) {
        org.webrtc.Logging.d(TAG, "changeCaptureFormat: " + i17 + "x" + i18 + "@" + i19);
        synchronized (this.stateLock) {
            stopCapture();
            startCapture(i17, i18, i19);
        }
    }

    public abstract void createCameraSession(org.webrtc.CameraSession.CreateSessionCallback createSessionCallback, org.webrtc.CameraSession.Events events, android.content.Context context, org.webrtc.SurfaceTextureHelper surfaceTextureHelper, java.lang.String str, int i17, int i18, int i19);

    @Override // org.webrtc.VideoCapturer
    public void dispose() {
        org.webrtc.Logging.d(TAG, "dispose");
        stopCapture();
    }

    public java.lang.String getCameraName() {
        java.lang.String str;
        synchronized (this.stateLock) {
            str = this.cameraName;
        }
        return str;
    }

    @Override // org.webrtc.VideoCapturer
    public void initialize(org.webrtc.SurfaceTextureHelper surfaceTextureHelper, android.content.Context context, org.webrtc.CapturerObserver capturerObserver) {
        this.applicationContext = context;
        this.capturerObserver = capturerObserver;
        this.surfaceHelper = surfaceTextureHelper;
        this.cameraThreadHandler = surfaceTextureHelper.getHandler();
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return false;
    }

    public void printStackTrace() {
        android.os.Handler handler = this.cameraThreadHandler;
        java.lang.Thread thread = handler != null ? handler.getLooper().getThread() : null;
        if (thread != null) {
            java.lang.StackTraceElement[] stackTrace = thread.getStackTrace();
            if (stackTrace.length > 0) {
                org.webrtc.Logging.d(TAG, "CameraCapturer stack trace:");
                for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                    org.webrtc.Logging.d(TAG, stackTraceElement.toString());
                }
            }
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void startCapture(int i17, int i18, int i19) {
        org.webrtc.Logging.d(TAG, "startCapture: " + i17 + "x" + i18 + "@" + i19);
        if (this.applicationContext == null) {
            throw new java.lang.RuntimeException("CameraCapturer must be initialized before calling startCapture.");
        }
        synchronized (this.stateLock) {
            if (!this.sessionOpening && this.currentSession == null) {
                this.width = i17;
                this.height = i18;
                this.framerate = i19;
                this.sessionOpening = true;
                this.openAttemptsRemaining = 3;
                createSessionInternal(0);
                return;
            }
            org.webrtc.Logging.w(TAG, "Session already open");
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void stopCapture() {
        org.webrtc.Logging.d(TAG, "Stop capture");
        synchronized (this.stateLock) {
            while (this.sessionOpening) {
                org.webrtc.Logging.d(TAG, "Stop capture: Waiting for session to open");
                try {
                    this.stateLock.wait();
                } catch (java.lang.InterruptedException unused) {
                    org.webrtc.Logging.w(TAG, "Stop capture interrupted while waiting for the session to open.");
                    java.lang.Thread.currentThread().interrupt();
                    return;
                }
            }
            if (this.currentSession != null) {
                org.webrtc.Logging.d(TAG, "Stop capture: Nulling session");
                this.cameraStatistics.release();
                this.cameraStatistics = null;
                final org.webrtc.CameraSession cameraSession = this.currentSession;
                this.cameraThreadHandler.post(new java.lang.Runnable() { // from class: org.webrtc.CameraCapturer.6
                    @Override // java.lang.Runnable
                    public void run() {
                        cameraSession.stop();
                    }
                });
                this.currentSession = null;
                this.capturerObserver.onCapturerStopped();
            } else {
                org.webrtc.Logging.d(TAG, "Stop capture: No session open");
            }
        }
        org.webrtc.Logging.d(TAG, "Stop capture done");
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void switchCamera(final org.webrtc.CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        org.webrtc.Logging.d(TAG, "switchCamera");
        this.cameraThreadHandler.post(new java.lang.Runnable() { // from class: org.webrtc.CameraCapturer.7
            @Override // java.lang.Runnable
            public void run() {
                java.util.List asList = java.util.Arrays.asList(org.webrtc.CameraCapturer.this.cameraEnumerator.getDeviceNames());
                if (asList.size() < 2) {
                    org.webrtc.CameraCapturer.this.reportCameraSwitchError("No camera to switch to.", cameraSwitchHandler);
                } else {
                    org.webrtc.CameraCapturer.this.switchCameraInternal(cameraSwitchHandler, (java.lang.String) asList.get((asList.indexOf(org.webrtc.CameraCapturer.this.cameraName) + 1) % asList.size()));
                }
            }
        });
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void switchCamera(final org.webrtc.CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, final java.lang.String str) {
        org.webrtc.Logging.d(TAG, "switchCamera");
        this.cameraThreadHandler.post(new java.lang.Runnable() { // from class: org.webrtc.CameraCapturer.8
            @Override // java.lang.Runnable
            public void run() {
                org.webrtc.CameraCapturer.this.switchCameraInternal(cameraSwitchHandler, str);
            }
        });
    }
}
