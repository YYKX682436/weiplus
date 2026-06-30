package org.webrtc;

/* loaded from: classes16.dex */
public interface CameraVideoCapturer extends org.webrtc.VideoCapturer {

    /* loaded from: classes16.dex */
    public interface CameraEventsHandler {
        void onCameraClosed();

        void onCameraDisconnected();

        void onCameraError(java.lang.String str);

        void onCameraFreezed(java.lang.String str);

        void onCameraOpening(java.lang.String str);

        void onFirstFrameAvailable();
    }

    /* loaded from: classes16.dex */
    public static class CameraStatistics {
        private static final int CAMERA_FREEZE_REPORT_TIMOUT_MS = 4000;
        private static final int CAMERA_OBSERVER_PERIOD_MS = 2000;
        private static final java.lang.String TAG = "CameraStatistics";
        private final java.lang.Runnable cameraObserver;
        private final org.webrtc.CameraVideoCapturer.CameraEventsHandler eventsHandler;
        private int frameCount;
        private int freezePeriodCount;
        private final org.webrtc.SurfaceTextureHelper surfaceTextureHelper;

        public CameraStatistics(org.webrtc.SurfaceTextureHelper surfaceTextureHelper, org.webrtc.CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: org.webrtc.CameraVideoCapturer.CameraStatistics.1
                @Override // java.lang.Runnable
                public void run() {
                    org.webrtc.Logging.d(org.webrtc.CameraVideoCapturer.CameraStatistics.TAG, "Camera fps: " + java.lang.Math.round((org.webrtc.CameraVideoCapturer.CameraStatistics.this.frameCount * 1000.0f) / 2000.0f) + ".");
                    if (org.webrtc.CameraVideoCapturer.CameraStatistics.this.frameCount == 0) {
                        org.webrtc.CameraVideoCapturer.CameraStatistics.access$104(org.webrtc.CameraVideoCapturer.CameraStatistics.this);
                        if (org.webrtc.CameraVideoCapturer.CameraStatistics.this.freezePeriodCount * 2000 >= 4000 && org.webrtc.CameraVideoCapturer.CameraStatistics.this.eventsHandler != null) {
                            org.webrtc.Logging.e(org.webrtc.CameraVideoCapturer.CameraStatistics.TAG, "Camera freezed.");
                            if (org.webrtc.CameraVideoCapturer.CameraStatistics.this.surfaceTextureHelper.isTextureInUse()) {
                                org.webrtc.CameraVideoCapturer.CameraStatistics.this.eventsHandler.onCameraFreezed("Camera failure. Client must return video buffers.");
                                return;
                            } else {
                                org.webrtc.CameraVideoCapturer.CameraStatistics.this.eventsHandler.onCameraFreezed("Camera failure.");
                                return;
                            }
                        }
                    } else {
                        org.webrtc.CameraVideoCapturer.CameraStatistics.this.freezePeriodCount = 0;
                    }
                    org.webrtc.CameraVideoCapturer.CameraStatistics.this.frameCount = 0;
                    org.webrtc.CameraVideoCapturer.CameraStatistics.this.surfaceTextureHelper.getHandler().postDelayed(this, 2000L);
                }
            };
            this.cameraObserver = runnable;
            if (surfaceTextureHelper == null) {
                throw new java.lang.IllegalArgumentException("SurfaceTextureHelper is null");
            }
            this.surfaceTextureHelper = surfaceTextureHelper;
            this.eventsHandler = cameraEventsHandler;
            this.frameCount = 0;
            this.freezePeriodCount = 0;
            surfaceTextureHelper.getHandler().postDelayed(runnable, 2000L);
        }

        public static /* synthetic */ int access$104(org.webrtc.CameraVideoCapturer.CameraStatistics cameraStatistics) {
            int i17 = cameraStatistics.freezePeriodCount + 1;
            cameraStatistics.freezePeriodCount = i17;
            return i17;
        }

        private void checkThread() {
            if (java.lang.Thread.currentThread() != this.surfaceTextureHelper.getHandler().getLooper().getThread()) {
                throw new java.lang.IllegalStateException("Wrong thread");
            }
        }

        public void addFrame() {
            checkThread();
            this.frameCount++;
        }

        public void release() {
            this.surfaceTextureHelper.getHandler().removeCallbacks(this.cameraObserver);
        }
    }

    /* loaded from: classes16.dex */
    public interface CameraSwitchHandler {
        void onCameraSwitchDone(boolean z17);

        void onCameraSwitchError(java.lang.String str);
    }

    @java.lang.Deprecated
    /* loaded from: classes6.dex */
    public interface MediaRecorderHandler {
        void onMediaRecorderError(java.lang.String str);

        void onMediaRecorderSuccess();
    }

    @java.lang.Deprecated
    default void addMediaRecorderToCamera(android.media.MediaRecorder mediaRecorder, org.webrtc.CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        throw new java.lang.UnsupportedOperationException("Deprecated and not implemented.");
    }

    @java.lang.Deprecated
    default void removeMediaRecorderFromCamera(org.webrtc.CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        throw new java.lang.UnsupportedOperationException("Deprecated and not implemented.");
    }

    void switchCamera(org.webrtc.CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler);

    void switchCamera(org.webrtc.CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, java.lang.String str);
}
