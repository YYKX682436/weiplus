package org.webrtc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class Camera1Session implements org.webrtc.CameraSession {
    private static final int NUMBER_OF_CAPTURE_BUFFERS = 3;
    private static final java.lang.String TAG = "Camera1Session";
    private final android.content.Context applicationContext;
    private final android.hardware.Camera camera;
    private final int cameraId;
    private final android.os.Handler cameraThreadHandler;
    private final org.webrtc.CameraEnumerationAndroid.CaptureFormat captureFormat;
    private final boolean captureToTexture;
    private final long constructionTimeNs;
    private final org.webrtc.CameraSession.Events events;
    private boolean firstFrameReported;
    private final android.hardware.Camera.CameraInfo info;
    private org.webrtc.Camera1Session.SessionState state;
    private final org.webrtc.SurfaceTextureHelper surfaceTextureHelper;
    private static final org.webrtc.Histogram camera1StartTimeMsHistogram = org.webrtc.Histogram.createCounts("WebRTC.Android.Camera1.StartTimeMs", 1, 10000, 50);
    private static final org.webrtc.Histogram camera1StopTimeMsHistogram = org.webrtc.Histogram.createCounts("WebRTC.Android.Camera1.StopTimeMs", 1, 10000, 50);
    private static final org.webrtc.Histogram camera1ResolutionHistogram = org.webrtc.Histogram.createEnumeration("WebRTC.Android.Camera1.Resolution", org.webrtc.CameraEnumerationAndroid.COMMON_RESOLUTIONS.size());

    /* renamed from: org.webrtc.Camera1Session$2, reason: invalid class name */
    /* loaded from: classes14.dex */
    public class AnonymousClass2 implements android.hardware.Camera.PreviewCallback {
        public AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPreviewFrame$0(byte[] bArr) {
            if (org.webrtc.Camera1Session.this.state == org.webrtc.Camera1Session.SessionState.RUNNING) {
                org.webrtc.Camera1Session.this.camera.addCallbackBuffer(bArr);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPreviewFrame$1(final byte[] bArr) {
            org.webrtc.Camera1Session.this.cameraThreadHandler.post(new java.lang.Runnable() { // from class: org.webrtc.Camera1Session$2$$a
                @Override // java.lang.Runnable
                public final void run() {
                    org.webrtc.Camera1Session.AnonymousClass2.this.lambda$onPreviewFrame$0(bArr);
                }
            });
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(final byte[] bArr, android.hardware.Camera camera) {
            org.webrtc.Camera1Session.this.checkIsOnCameraThread();
            if (camera != org.webrtc.Camera1Session.this.camera) {
                org.webrtc.Logging.e(org.webrtc.Camera1Session.TAG, "Callback from a different camera. This should never happen.");
                return;
            }
            if (org.webrtc.Camera1Session.this.state != org.webrtc.Camera1Session.SessionState.RUNNING) {
                org.webrtc.Logging.d(org.webrtc.Camera1Session.TAG, "Bytebuffer frame captured but camera is no longer running.");
                return;
            }
            long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(android.os.SystemClock.elapsedRealtime());
            if (!org.webrtc.Camera1Session.this.firstFrameReported) {
                org.webrtc.Camera1Session.camera1StartTimeMsHistogram.addSample((int) java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - org.webrtc.Camera1Session.this.constructionTimeNs));
                org.webrtc.Camera1Session.this.firstFrameReported = true;
            }
            org.webrtc.VideoFrame videoFrame = new org.webrtc.VideoFrame(new org.webrtc.NV21Buffer(bArr, org.webrtc.Camera1Session.this.captureFormat.width, org.webrtc.Camera1Session.this.captureFormat.height, new java.lang.Runnable() { // from class: org.webrtc.Camera1Session$2$$b
                @Override // java.lang.Runnable
                public final void run() {
                    org.webrtc.Camera1Session.AnonymousClass2.this.lambda$onPreviewFrame$1(bArr);
                }
            }), org.webrtc.Camera1Session.this.getFrameOrientation(), nanos);
            org.webrtc.Camera1Session.this.events.onFrameCaptured(org.webrtc.Camera1Session.this, videoFrame);
            videoFrame.release();
        }
    }

    /* loaded from: classes6.dex */
    public enum SessionState {
        RUNNING,
        STOPPED
    }

    private Camera1Session(org.webrtc.CameraSession.Events events, boolean z17, android.content.Context context, org.webrtc.SurfaceTextureHelper surfaceTextureHelper, int i17, android.hardware.Camera camera, android.hardware.Camera.CameraInfo cameraInfo, org.webrtc.CameraEnumerationAndroid.CaptureFormat captureFormat, long j17) {
        org.webrtc.Logging.d(TAG, "Create new camera1 session on camera " + i17);
        this.cameraThreadHandler = new android.os.Handler();
        this.events = events;
        this.captureToTexture = z17;
        this.applicationContext = context;
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.cameraId = i17;
        this.camera = camera;
        this.info = cameraInfo;
        this.captureFormat = captureFormat;
        this.constructionTimeNs = j17;
        surfaceTextureHelper.setTextureSize(captureFormat.width, captureFormat.height);
        startCapturing();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkIsOnCameraThread() {
        if (java.lang.Thread.currentThread() != this.cameraThreadHandler.getLooper().getThread()) {
            throw new java.lang.IllegalStateException("Wrong thread");
        }
    }

    public static void create(org.webrtc.CameraSession.CreateSessionCallback createSessionCallback, org.webrtc.CameraSession.Events events, boolean z17, android.content.Context context, org.webrtc.SurfaceTextureHelper surfaceTextureHelper, java.lang.String str, int i17, int i18, int i19) {
        long nanoTime = java.lang.System.nanoTime();
        org.webrtc.Logging.d(TAG, "Open camera " + str);
        events.onCameraOpening();
        try {
            int cameraIndex = org.webrtc.Camera1Enumerator.getCameraIndex(str);
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(cameraIndex));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                android.hardware.Camera camera = (android.hardware.Camera) yj0.a.k(obj, arrayList.toArray(), "org/webrtc/Camera1Session", "create", "(Lorg/webrtc/CameraSession$CreateSessionCallback;Lorg/webrtc/CameraSession$Events;ZLandroid/content/Context;Lorg/webrtc/SurfaceTextureHelper;Ljava/lang/String;III)V", "android/hardware/Camera", "open", "(I)Landroid/hardware/Camera;");
                if (camera == null) {
                    createSessionCallback.onFailure(org.webrtc.CameraSession.FailureType.ERROR, "Camera.open returned null for camera id = " + cameraIndex);
                    return;
                }
                try {
                    camera.setPreviewTexture(surfaceTextureHelper.getSurfaceTexture());
                    android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
                    android.hardware.Camera.getCameraInfo(cameraIndex, cameraInfo);
                    try {
                        android.hardware.Camera.Parameters parameters = camera.getParameters();
                        org.webrtc.CameraEnumerationAndroid.CaptureFormat findClosestCaptureFormat = findClosestCaptureFormat(parameters, i17, i18, i19);
                        updateCameraParameters(camera, parameters, findClosestCaptureFormat, findClosestPictureSize(parameters, i17, i18), z17);
                        if (!z17) {
                            int frameSize = findClosestCaptureFormat.frameSize();
                            for (int i27 = 0; i27 < 3; i27++) {
                                camera.addCallbackBuffer(java.nio.ByteBuffer.allocateDirect(frameSize).array());
                            }
                        }
                        try {
                            camera.setDisplayOrientation(0);
                            createSessionCallback.onDone(new org.webrtc.Camera1Session(events, z17, context, surfaceTextureHelper, cameraIndex, camera, cameraInfo, findClosestCaptureFormat, nanoTime));
                        } catch (java.lang.RuntimeException e17) {
                            yj0.a.j(camera, "org/webrtc/Camera1Session", "create", "(Lorg/webrtc/CameraSession$CreateSessionCallback;Lorg/webrtc/CameraSession$Events;ZLandroid/content/Context;Lorg/webrtc/SurfaceTextureHelper;Ljava/lang/String;III)V", "android/hardware/Camera", "release", "()V");
                            createSessionCallback.onFailure(org.webrtc.CameraSession.FailureType.ERROR, e17.getMessage());
                        }
                    } catch (java.lang.RuntimeException e18) {
                        yj0.a.j(camera, "org/webrtc/Camera1Session", "create", "(Lorg/webrtc/CameraSession$CreateSessionCallback;Lorg/webrtc/CameraSession$Events;ZLandroid/content/Context;Lorg/webrtc/SurfaceTextureHelper;Ljava/lang/String;III)V", "android/hardware/Camera", "release", "()V");
                        createSessionCallback.onFailure(org.webrtc.CameraSession.FailureType.ERROR, e18.getMessage());
                    }
                } catch (java.io.IOException | java.lang.RuntimeException e19) {
                    yj0.a.j(camera, "org/webrtc/Camera1Session", "create", "(Lorg/webrtc/CameraSession$CreateSessionCallback;Lorg/webrtc/CameraSession$Events;ZLandroid/content/Context;Lorg/webrtc/SurfaceTextureHelper;Ljava/lang/String;III)V", "android/hardware/Camera", "release", "()V");
                    createSessionCallback.onFailure(org.webrtc.CameraSession.FailureType.ERROR, e19.getMessage());
                }
            } catch (java.lang.RuntimeException e27) {
                createSessionCallback.onFailure(org.webrtc.CameraSession.FailureType.ERROR, e27.getMessage());
            }
        } catch (java.lang.IllegalArgumentException e28) {
            createSessionCallback.onFailure(org.webrtc.CameraSession.FailureType.ERROR, e28.getMessage());
        }
    }

    private static org.webrtc.CameraEnumerationAndroid.CaptureFormat findClosestCaptureFormat(android.hardware.Camera.Parameters parameters, int i17, int i18, int i19) {
        java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates = org.webrtc.Camera1Enumerator.convertFramerates(parameters.getSupportedPreviewFpsRange());
        org.webrtc.Logging.d(TAG, "Available fps ranges: " + convertFramerates);
        org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = org.webrtc.CameraEnumerationAndroid.getClosestSupportedFramerateRange(convertFramerates, i19);
        org.webrtc.Size closestSupportedSize = org.webrtc.CameraEnumerationAndroid.getClosestSupportedSize(org.webrtc.Camera1Enumerator.convertSizes(parameters.getSupportedPreviewSizes()), i17, i18);
        org.webrtc.CameraEnumerationAndroid.reportCameraResolution(camera1ResolutionHistogram, closestSupportedSize);
        return new org.webrtc.CameraEnumerationAndroid.CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
    }

    private static org.webrtc.Size findClosestPictureSize(android.hardware.Camera.Parameters parameters, int i17, int i18) {
        return org.webrtc.CameraEnumerationAndroid.getClosestSupportedSize(org.webrtc.Camera1Enumerator.convertSizes(parameters.getSupportedPictureSizes()), i17, i18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getFrameOrientation() {
        int deviceOrientation = org.webrtc.CameraSession.getDeviceOrientation(this.applicationContext);
        android.hardware.Camera.CameraInfo cameraInfo = this.info;
        if (cameraInfo.facing == 0) {
            deviceOrientation = 360 - deviceOrientation;
        }
        return (cameraInfo.orientation + deviceOrientation) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$listenForTextureFrames$0(org.webrtc.VideoFrame videoFrame) {
        checkIsOnCameraThread();
        if (this.state != org.webrtc.Camera1Session.SessionState.RUNNING) {
            org.webrtc.Logging.d(TAG, "Texture frame captured but camera is no longer running.");
            return;
        }
        if (!this.firstFrameReported) {
            camera1StartTimeMsHistogram.addSample((int) java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - this.constructionTimeNs));
            this.firstFrameReported = true;
        }
        org.webrtc.VideoFrame videoFrame2 = new org.webrtc.VideoFrame(org.webrtc.CameraSession.createTextureBufferWithModifiedTransformMatrix((org.webrtc.TextureBufferImpl) videoFrame.getBuffer(), this.info.facing == 1, 0), getFrameOrientation(), videoFrame.getTimestampNs());
        this.events.onFrameCaptured(this, videoFrame2);
        videoFrame2.release();
    }

    private void listenForBytebufferFrames() {
        this.camera.setPreviewCallbackWithBuffer(new org.webrtc.Camera1Session.AnonymousClass2());
    }

    private void listenForTextureFrames() {
        this.surfaceTextureHelper.startListening(new org.webrtc.VideoSink() { // from class: org.webrtc.Camera1Session$$a
            @Override // org.webrtc.VideoSink
            public final void onFrame(org.webrtc.VideoFrame videoFrame) {
                org.webrtc.Camera1Session.this.lambda$listenForTextureFrames$0(videoFrame);
            }
        });
    }

    private void startCapturing() {
        org.webrtc.Logging.d(TAG, "Start capturing");
        checkIsOnCameraThread();
        this.state = org.webrtc.Camera1Session.SessionState.RUNNING;
        this.camera.setErrorCallback(new android.hardware.Camera.ErrorCallback() { // from class: org.webrtc.Camera1Session.1
            @Override // android.hardware.Camera.ErrorCallback
            public void onError(int i17, android.hardware.Camera camera) {
                java.lang.String str;
                if (i17 == 100) {
                    str = "Camera server died!";
                } else {
                    str = "Camera error: " + i17;
                }
                org.webrtc.Logging.e(org.webrtc.Camera1Session.TAG, str);
                org.webrtc.Camera1Session.this.stopInternal();
                if (i17 == 2) {
                    org.webrtc.Camera1Session.this.events.onCameraDisconnected(org.webrtc.Camera1Session.this);
                } else {
                    org.webrtc.Camera1Session.this.events.onCameraError(org.webrtc.Camera1Session.this, str);
                }
            }
        });
        if (this.captureToTexture) {
            listenForTextureFrames();
        } else {
            listenForBytebufferFrames();
        }
        try {
            yj0.a.j(this.camera, "org/webrtc/Camera1Session", "startCapturing", "()V", "android/hardware/Camera", "startPreview", "()V");
        } catch (java.lang.RuntimeException e17) {
            stopInternal();
            this.events.onCameraError(this, e17.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopInternal() {
        org.webrtc.Logging.d(TAG, "Stop internal");
        checkIsOnCameraThread();
        org.webrtc.Camera1Session.SessionState sessionState = this.state;
        org.webrtc.Camera1Session.SessionState sessionState2 = org.webrtc.Camera1Session.SessionState.STOPPED;
        if (sessionState == sessionState2) {
            org.webrtc.Logging.d(TAG, "Camera is already stopped");
            return;
        }
        this.state = sessionState2;
        this.surfaceTextureHelper.stopListening();
        this.camera.stopPreview();
        yj0.a.j(this.camera, "org/webrtc/Camera1Session", "stopInternal", "()V", "android/hardware/Camera", "release", "()V");
        this.events.onCameraClosed(this);
        org.webrtc.Logging.d(TAG, "Stop done");
    }

    private static void updateCameraParameters(android.hardware.Camera camera, android.hardware.Camera.Parameters parameters, org.webrtc.CameraEnumerationAndroid.CaptureFormat captureFormat, org.webrtc.Size size, boolean z17) {
        java.util.List<java.lang.String> supportedFocusModes = parameters.getSupportedFocusModes();
        org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange = captureFormat.framerate;
        parameters.setPreviewFpsRange(framerateRange.min, framerateRange.max);
        parameters.setPreviewSize(captureFormat.width, captureFormat.height);
        parameters.setPictureSize(size.width, size.height);
        if (!z17) {
            parameters.setPreviewFormat(17);
        }
        if (parameters.isVideoStabilizationSupported()) {
            parameters.setVideoStabilization(true);
        }
        if (supportedFocusModes != null && supportedFocusModes.contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
        }
        camera.setParameters(parameters);
    }

    @Override // org.webrtc.CameraSession
    public void stop() {
        org.webrtc.Logging.d(TAG, "Stop camera1 session on camera " + this.cameraId);
        checkIsOnCameraThread();
        if (this.state != org.webrtc.Camera1Session.SessionState.STOPPED) {
            long nanoTime = java.lang.System.nanoTime();
            stopInternal();
            camera1StopTimeMsHistogram.addSample((int) java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - nanoTime));
        }
    }
}
