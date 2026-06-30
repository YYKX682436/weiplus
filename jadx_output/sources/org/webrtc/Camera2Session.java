package org.webrtc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class Camera2Session implements org.webrtc.CameraSession {
    private static final java.lang.String TAG = "Camera2Session";
    private final android.content.Context applicationContext;
    private final org.webrtc.CameraSession.CreateSessionCallback callback;
    private android.hardware.camera2.CameraCharacteristics cameraCharacteristics;
    private android.hardware.camera2.CameraDevice cameraDevice;
    private final java.lang.String cameraId;
    private final android.hardware.camera2.CameraManager cameraManager;
    private int cameraOrientation;
    private final android.os.Handler cameraThreadHandler;
    private org.webrtc.CameraEnumerationAndroid.CaptureFormat captureFormat;
    private android.hardware.camera2.CameraCaptureSession captureSession;
    private final long constructionTimeNs;
    private final org.webrtc.CameraSession.Events events;
    private boolean firstFrameReported;
    private int fpsUnitFactor;
    private final int framerate;
    private final int height;
    private boolean isCameraFrontFacing;
    private org.webrtc.Camera2Session.SessionState state = org.webrtc.Camera2Session.SessionState.RUNNING;
    private android.view.Surface surface;
    private final org.webrtc.SurfaceTextureHelper surfaceTextureHelper;
    private final int width;
    private static final org.webrtc.Histogram camera2StartTimeMsHistogram = org.webrtc.Histogram.createCounts("WebRTC.Android.Camera2.StartTimeMs", 1, 10000, 50);
    private static final org.webrtc.Histogram camera2StopTimeMsHistogram = org.webrtc.Histogram.createCounts("WebRTC.Android.Camera2.StopTimeMs", 1, 10000, 50);
    private static final org.webrtc.Histogram camera2ResolutionHistogram = org.webrtc.Histogram.createEnumeration("WebRTC.Android.Camera2.Resolution", org.webrtc.CameraEnumerationAndroid.COMMON_RESOLUTIONS.size());

    /* loaded from: classes14.dex */
    public static class CameraCaptureCallback extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        private CameraCaptureCallback() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureFailure captureFailure) {
            org.webrtc.Logging.d(org.webrtc.Camera2Session.TAG, "Capture failed: " + captureFailure);
        }
    }

    /* loaded from: classes14.dex */
    public class CameraStateCallback extends android.hardware.camera2.CameraDevice.StateCallback {
        private CameraStateCallback() {
        }

        private java.lang.String getErrorDescription(int i17) {
            if (i17 == 1) {
                return "Camera device is in use already.";
            }
            if (i17 == 2) {
                return "Camera device could not be opened because there are too many other open camera devices.";
            }
            if (i17 == 3) {
                return "Camera device could not be opened due to a device policy.";
            }
            if (i17 == 4) {
                return "Camera device has encountered a fatal error.";
            }
            if (i17 == 5) {
                return "Camera service has encountered a fatal error.";
            }
            return "Unknown camera error: " + i17;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(android.hardware.camera2.CameraDevice cameraDevice) {
            org.webrtc.Camera2Session.this.checkIsOnCameraThread();
            org.webrtc.Logging.d(org.webrtc.Camera2Session.TAG, "Camera device closed.");
            org.webrtc.Camera2Session.this.events.onCameraClosed(org.webrtc.Camera2Session.this);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(android.hardware.camera2.CameraDevice cameraDevice) {
            org.webrtc.Camera2Session.this.checkIsOnCameraThread();
            boolean z17 = org.webrtc.Camera2Session.this.captureSession == null && org.webrtc.Camera2Session.this.state != org.webrtc.Camera2Session.SessionState.STOPPED;
            org.webrtc.Camera2Session.this.state = org.webrtc.Camera2Session.SessionState.STOPPED;
            org.webrtc.Camera2Session.this.stopInternal();
            if (z17) {
                org.webrtc.Camera2Session.this.callback.onFailure(org.webrtc.CameraSession.FailureType.DISCONNECTED, "Camera disconnected / evicted.");
            } else {
                org.webrtc.Camera2Session.this.events.onCameraDisconnected(org.webrtc.Camera2Session.this);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(android.hardware.camera2.CameraDevice cameraDevice, int i17) {
            org.webrtc.Camera2Session.this.checkIsOnCameraThread();
            org.webrtc.Camera2Session.this.reportError(getErrorDescription(i17));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(android.hardware.camera2.CameraDevice cameraDevice) {
            org.webrtc.Camera2Session.this.checkIsOnCameraThread();
            org.webrtc.Logging.d(org.webrtc.Camera2Session.TAG, "Camera opened.");
            org.webrtc.Camera2Session.this.cameraDevice = cameraDevice;
            org.webrtc.Camera2Session.this.surfaceTextureHelper.setTextureSize(org.webrtc.Camera2Session.this.captureFormat.width, org.webrtc.Camera2Session.this.captureFormat.height);
            org.webrtc.Camera2Session.this.surface = new android.view.Surface(org.webrtc.Camera2Session.this.surfaceTextureHelper.getSurfaceTexture());
            try {
                cameraDevice.createCaptureSession(java.util.Arrays.asList(org.webrtc.Camera2Session.this.surface), new org.webrtc.Camera2Session.CaptureSessionCallback(), org.webrtc.Camera2Session.this.cameraThreadHandler);
            } catch (android.hardware.camera2.CameraAccessException e17) {
                org.webrtc.Camera2Session.this.reportError("Failed to create capture session. " + e17);
            }
        }
    }

    /* loaded from: classes14.dex */
    public class CaptureSessionCallback extends android.hardware.camera2.CameraCaptureSession.StateCallback {
        private CaptureSessionCallback() {
        }

        private void chooseFocusMode(android.hardware.camera2.CaptureRequest.Builder builder) {
            for (int i17 : (int[]) org.webrtc.Camera2Session.this.cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES)) {
                if (i17 == 3) {
                    builder.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE, 3);
                    org.webrtc.Logging.d(org.webrtc.Camera2Session.TAG, "Using continuous video auto-focus.");
                    return;
                }
            }
            org.webrtc.Logging.d(org.webrtc.Camera2Session.TAG, "Auto-focus is not available.");
        }

        private void chooseStabilizationMode(android.hardware.camera2.CaptureRequest.Builder builder) {
            int[] iArr = (int[]) org.webrtc.Camera2Session.this.cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
            if (iArr != null) {
                for (int i17 : iArr) {
                    if (i17 == 1) {
                        builder.set(android.hardware.camera2.CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                        builder.set(android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                        org.webrtc.Logging.d(org.webrtc.Camera2Session.TAG, "Using optical stabilization.");
                        return;
                    }
                }
            }
            int[] iArr2 = (int[]) org.webrtc.Camera2Session.this.cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
            if (iArr2 != null) {
                for (int i18 : iArr2) {
                    if (i18 == 1) {
                        builder.set(android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                        builder.set(android.hardware.camera2.CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
                        org.webrtc.Logging.d(org.webrtc.Camera2Session.TAG, "Using video stabilization.");
                        return;
                    }
                }
            }
            org.webrtc.Logging.d(org.webrtc.Camera2Session.TAG, "Stabilization not available.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onConfigured$0(org.webrtc.VideoFrame videoFrame) {
            org.webrtc.Camera2Session.this.checkIsOnCameraThread();
            if (org.webrtc.Camera2Session.this.state != org.webrtc.Camera2Session.SessionState.RUNNING) {
                org.webrtc.Logging.d(org.webrtc.Camera2Session.TAG, "Texture frame captured but camera is no longer running.");
                return;
            }
            if (!org.webrtc.Camera2Session.this.firstFrameReported) {
                org.webrtc.Camera2Session.this.firstFrameReported = true;
                org.webrtc.Camera2Session.camera2StartTimeMsHistogram.addSample((int) java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - org.webrtc.Camera2Session.this.constructionTimeNs));
            }
            org.webrtc.VideoFrame videoFrame2 = new org.webrtc.VideoFrame(org.webrtc.CameraSession.createTextureBufferWithModifiedTransformMatrix((org.webrtc.TextureBufferImpl) videoFrame.getBuffer(), org.webrtc.Camera2Session.this.isCameraFrontFacing, -org.webrtc.Camera2Session.this.cameraOrientation), org.webrtc.Camera2Session.this.getFrameOrientation(), videoFrame.getTimestampNs());
            org.webrtc.Camera2Session.this.events.onFrameCaptured(org.webrtc.Camera2Session.this, videoFrame2);
            videoFrame2.release();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            org.webrtc.Camera2Session.this.checkIsOnCameraThread();
            cameraCaptureSession.close();
            org.webrtc.Camera2Session.this.reportError("Failed to configure capture session.");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
            org.webrtc.Camera2Session.this.checkIsOnCameraThread();
            org.webrtc.Logging.d(org.webrtc.Camera2Session.TAG, "Camera capture session configured.");
            org.webrtc.Camera2Session.this.captureSession = cameraCaptureSession;
            try {
                android.hardware.camera2.CaptureRequest.Builder createCaptureRequest = org.webrtc.Camera2Session.this.cameraDevice.createCaptureRequest(3);
                createCaptureRequest.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new android.util.Range(java.lang.Integer.valueOf(org.webrtc.Camera2Session.this.captureFormat.framerate.min / org.webrtc.Camera2Session.this.fpsUnitFactor), java.lang.Integer.valueOf(org.webrtc.Camera2Session.this.captureFormat.framerate.max / org.webrtc.Camera2Session.this.fpsUnitFactor)));
                createCaptureRequest.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE, 1);
                createCaptureRequest.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_LOCK, java.lang.Boolean.FALSE);
                chooseStabilizationMode(createCaptureRequest);
                chooseFocusMode(createCaptureRequest);
                createCaptureRequest.addTarget(org.webrtc.Camera2Session.this.surface);
                cameraCaptureSession.setRepeatingRequest(createCaptureRequest.build(), new org.webrtc.Camera2Session.CameraCaptureCallback(), org.webrtc.Camera2Session.this.cameraThreadHandler);
                org.webrtc.Camera2Session.this.surfaceTextureHelper.startListening(new org.webrtc.VideoSink() { // from class: org.webrtc.Camera2Session$CaptureSessionCallback$$a
                    @Override // org.webrtc.VideoSink
                    public final void onFrame(org.webrtc.VideoFrame videoFrame) {
                        org.webrtc.Camera2Session.CaptureSessionCallback.this.lambda$onConfigured$0(videoFrame);
                    }
                });
                org.webrtc.Logging.d(org.webrtc.Camera2Session.TAG, "Camera device successfully started.");
                org.webrtc.Camera2Session.this.callback.onDone(org.webrtc.Camera2Session.this);
            } catch (android.hardware.camera2.CameraAccessException e17) {
                org.webrtc.Camera2Session.this.reportError("Failed to start capture request. " + e17);
            }
        }
    }

    /* loaded from: classes6.dex */
    public enum SessionState {
        RUNNING,
        STOPPED
    }

    private Camera2Session(org.webrtc.CameraSession.CreateSessionCallback createSessionCallback, org.webrtc.CameraSession.Events events, android.content.Context context, android.hardware.camera2.CameraManager cameraManager, org.webrtc.SurfaceTextureHelper surfaceTextureHelper, java.lang.String str, int i17, int i18, int i19) {
        org.webrtc.Logging.d(TAG, "Create new camera2 session on camera " + str);
        this.constructionTimeNs = java.lang.System.nanoTime();
        this.cameraThreadHandler = new android.os.Handler();
        this.callback = createSessionCallback;
        this.events = events;
        this.applicationContext = context;
        this.cameraManager = cameraManager;
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.cameraId = str;
        this.width = i17;
        this.height = i18;
        this.framerate = i19;
        start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkIsOnCameraThread() {
        if (java.lang.Thread.currentThread() != this.cameraThreadHandler.getLooper().getThread()) {
            throw new java.lang.IllegalStateException("Wrong thread");
        }
    }

    public static void create(org.webrtc.CameraSession.CreateSessionCallback createSessionCallback, org.webrtc.CameraSession.Events events, android.content.Context context, android.hardware.camera2.CameraManager cameraManager, org.webrtc.SurfaceTextureHelper surfaceTextureHelper, java.lang.String str, int i17, int i18, int i19) {
        new org.webrtc.Camera2Session(createSessionCallback, events, context, cameraManager, surfaceTextureHelper, str, i17, i18, i19);
    }

    private void findCaptureFormat() {
        checkIsOnCameraThread();
        android.util.Range[] rangeArr = (android.util.Range[]) this.cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        int fpsUnitFactor = org.webrtc.Camera2Enumerator.getFpsUnitFactor(rangeArr);
        this.fpsUnitFactor = fpsUnitFactor;
        java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates = org.webrtc.Camera2Enumerator.convertFramerates(rangeArr, fpsUnitFactor);
        java.util.List<org.webrtc.Size> supportedSizes = org.webrtc.Camera2Enumerator.getSupportedSizes(this.cameraCharacteristics);
        org.webrtc.Logging.d(TAG, "Available preview sizes: " + supportedSizes);
        org.webrtc.Logging.d(TAG, "Available fps ranges: " + convertFramerates);
        if (convertFramerates.isEmpty() || supportedSizes.isEmpty()) {
            reportError("No supported capture formats.");
            return;
        }
        org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = org.webrtc.CameraEnumerationAndroid.getClosestSupportedFramerateRange(convertFramerates, this.framerate);
        org.webrtc.Size closestSupportedSize = org.webrtc.CameraEnumerationAndroid.getClosestSupportedSize(supportedSizes, this.width, this.height);
        org.webrtc.CameraEnumerationAndroid.reportCameraResolution(camera2ResolutionHistogram, closestSupportedSize);
        this.captureFormat = new org.webrtc.CameraEnumerationAndroid.CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
        org.webrtc.Logging.d(TAG, "Using capture format: " + this.captureFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getFrameOrientation() {
        int deviceOrientation = org.webrtc.CameraSession.getDeviceOrientation(this.applicationContext);
        if (!this.isCameraFrontFacing) {
            deviceOrientation = 360 - deviceOrientation;
        }
        return (this.cameraOrientation + deviceOrientation) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
    }

    private void openCamera() {
        checkIsOnCameraThread();
        org.webrtc.Logging.d(TAG, "Opening camera " + this.cameraId);
        this.events.onCameraOpening();
        try {
            android.hardware.camera2.CameraManager cameraManager = this.cameraManager;
            java.lang.String str = this.cameraId;
            org.webrtc.Camera2Session.CameraStateCallback cameraStateCallback = new org.webrtc.Camera2Session.CameraStateCallback();
            android.os.Handler handler = this.cameraThreadHandler;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(handler);
            arrayList.add(cameraStateCallback);
            arrayList.add(str);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(cameraManager, arrayList.toArray(), "org/webrtc/Camera2Session", "openCamera", "()V", "android/hardware/camera2/CameraManager", "openCamera", "(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V");
        } catch (android.hardware.camera2.CameraAccessException | java.lang.IllegalArgumentException e17) {
            reportError("Failed to open camera: " + e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportError(java.lang.String str) {
        checkIsOnCameraThread();
        org.webrtc.Logging.e(TAG, "Error: " + str);
        boolean z17 = this.captureSession == null && this.state != org.webrtc.Camera2Session.SessionState.STOPPED;
        this.state = org.webrtc.Camera2Session.SessionState.STOPPED;
        stopInternal();
        if (z17) {
            this.callback.onFailure(org.webrtc.CameraSession.FailureType.ERROR, str);
        } else {
            this.events.onCameraError(this, str);
        }
    }

    private void start() {
        checkIsOnCameraThread();
        org.webrtc.Logging.d(TAG, "start");
        try {
            android.hardware.camera2.CameraCharacteristics cameraCharacteristics = this.cameraManager.getCameraCharacteristics(this.cameraId);
            this.cameraCharacteristics = cameraCharacteristics;
            this.cameraOrientation = ((java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            this.isCameraFrontFacing = ((java.lang.Integer) this.cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 0;
            findCaptureFormat();
            if (this.captureFormat == null) {
                return;
            }
            openCamera();
        } catch (android.hardware.camera2.CameraAccessException | java.lang.IllegalArgumentException e17) {
            reportError("getCameraCharacteristics(): " + e17.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopInternal() {
        org.webrtc.Logging.d(TAG, "Stop internal");
        checkIsOnCameraThread();
        this.surfaceTextureHelper.stopListening();
        android.hardware.camera2.CameraCaptureSession cameraCaptureSession = this.captureSession;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.captureSession = null;
        }
        android.view.Surface surface = this.surface;
        if (surface != null) {
            surface.release();
            this.surface = null;
        }
        android.hardware.camera2.CameraDevice cameraDevice = this.cameraDevice;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.cameraDevice = null;
        }
        org.webrtc.Logging.d(TAG, "Stop done");
    }

    @Override // org.webrtc.CameraSession
    public void stop() {
        org.webrtc.Logging.d(TAG, "Stop camera2 session on camera " + this.cameraId);
        checkIsOnCameraThread();
        org.webrtc.Camera2Session.SessionState sessionState = this.state;
        org.webrtc.Camera2Session.SessionState sessionState2 = org.webrtc.Camera2Session.SessionState.STOPPED;
        if (sessionState != sessionState2) {
            long nanoTime = java.lang.System.nanoTime();
            this.state = sessionState2;
            stopInternal();
            camera2StopTimeMsHistogram.addSample((int) java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - nanoTime));
        }
    }
}
